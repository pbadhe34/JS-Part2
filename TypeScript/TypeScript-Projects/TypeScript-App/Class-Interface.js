"use strict";
class ErrorHandler {
    constructor(settings) {
        this.logAllExceptions = settings.logAllExceptions;
    }
    logException(message, id) {
        this.exceptions.push({ message, id });
    }
}
