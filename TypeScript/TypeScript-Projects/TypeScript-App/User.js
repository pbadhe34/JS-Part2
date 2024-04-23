//"use strict";
 
 
    function User(id, name, income) {
        this.num = id;
        this.salary = income;
        this.userName = name;
    }
    User.prototype.update = function (newName) {
        return true;
    };
    User.prototype.work = function (newName) {
        return 'workDone';
    };
    User.prototype.derivedWork = function (newName) {
        return 'derived';
    };
    User.prototype.getNewData = function (id) {
        return 1234;
    };
     
