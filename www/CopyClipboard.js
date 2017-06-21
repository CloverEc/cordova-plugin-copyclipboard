module.exports = {
  sayHello: function(name, successCallback, errorCallback) {
    // 第1引数: 成功時に呼び出す関数
    // 第2引数: エラー時に呼び出す関数
    // 第3引数: プラグインの名前（plugin.xmlのfeatureのnameに設定したもの）
    // 第4引数: HelloWorld.javaの第1引数に渡る名前
    // 第5引数: HelloWorld.javaの第2引数に渡る値
    cordova.exec(successCallback, errorCallback, "copyclipboard", "copy", [name]);
  }
};
