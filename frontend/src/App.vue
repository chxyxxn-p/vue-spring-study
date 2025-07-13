<template>
  <div>
    <form @submit.prevent="toBack">
      <div class="d-flex">
          <div class="flex-grow-2 mr-2">
              <input
                  class="form-control"
                  type="text"
                  placeholder=" 홍길동"
                  v-model="name"
              >
          </div>
          <div class="flex-grow-2 mr-2">
            <input
                  class="form-control"
                  type="tel"
                  pattern="[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}"
                  placeholder=" 010-0000-0000"
                  v-model="phone"
              >
          </div>
          <div class="flex-grow-2 mr-2">
            <input
                  class="form-control"
                  type="date"
                  placeholder=" 1997-02-10"
                  v-model="birth"
              >
          </div>
          <div class="flex-grow-2 mr-2">
            <button 
            class="btn btn-primary"
            type="submit"
            >
            계산
          </button>
        </div>
      </div>
    </form>
    <div v-show="hasError" style="color: red">
        모든 항목을 입력하세요!
      </div>
  </div>
</template>

<script>
import { ref } from 'vue';
import axios from 'axios';

export default {
  setup(){

    const name = ref('');
    const phone = ref('');
    const birth = ref('');

    const hasError = ref(false);

    const toBack = () => {
      if(name.value === '' || phone.value === '' || birth.value === ''){
        hasError.value = true;
      } else {
        hasError.value = false;

        axios.post('http://localhost:8080/api/send', {
          name: name.value,
          phone: phone.value,
          birth: birth.value        
        })
        .then(res => {
          console.log('성공', res.data);
        })
        .catch(err => {
          console.log('에러', err);
        })
      }
    }

    return {
      name,
      phone,
      birth,
      hasError,
      toBack,
    }
  }
}
</script>

<style>

</style>