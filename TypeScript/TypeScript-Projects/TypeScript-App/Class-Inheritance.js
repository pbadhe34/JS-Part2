"use strict";
/// <reference path='usage.ts' />
class Sedan extends Car {
    constructor(carColor, model) {
        super(true, carColor);
        this.model = model;
    }
}
