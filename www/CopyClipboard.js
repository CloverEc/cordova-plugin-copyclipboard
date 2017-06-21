var exec = require('cordova/exec');

module.exports = function(name, successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "helloworld", "sayHello", [name]);
}
