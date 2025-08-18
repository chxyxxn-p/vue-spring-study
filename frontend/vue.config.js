const { defineConfig } = require('@vue/cli-service');

module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {  //개발 서버에서만 적용
    port: 3000,  //vue 개발 서버 포트
  }
})
