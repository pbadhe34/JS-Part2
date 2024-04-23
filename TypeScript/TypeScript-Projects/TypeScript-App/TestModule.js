"use strict";
var mymod;
(function (mymod) {
    function doWork() {
        // this function can be accessed from outside the module
    }
    mymod.doWork = doWork;
    class ExportedClass {
        // this class can be accessed from outside the module
        testUpdate() {
            return 1213;
        }
    }
    mymod.ExportedClass = ExportedClass;
    class TestClass {
    }
})(mymod || (mymod = {}));
