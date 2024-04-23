"use strict";
/// <reference path='TestModule.ts' />
var exportedClassInstance = new mymod.ExportedClass();
exportedClassInstance.testUpdate();
var ExportedClass = mymod.ExportedClass;
var newInstance = new ExportedClass();
newInstance.testUpdate();
var obj = new mymod.TestClass();
