
var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec'),
    utils = require('cordova/utils');

var echo = {


    say:function( successCB, errorCB, message) {
        if (!message) {
            errorCB && errorCB('No mesage to echo');
        } else {
            exec(successCB, errorCB, "Echo", "say", [message]);
        }
    },
    fail:function( successCB, errorCB, message) {
        if (!message) {
            errorCB && errorCB('No mesage to echo');
        } else {
            exec(successCB, errorCB, "Echo", "fail", [message]);
        }
    }

};

module.exports = echo;
