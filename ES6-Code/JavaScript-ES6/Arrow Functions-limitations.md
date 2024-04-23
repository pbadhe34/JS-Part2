Gotchas and Pitfalls of Arrow Functions
The new arrow functions bring a helpful function syntax to ECMAScript, but as with any new feature, they come with their own pitfalls and gotchas.

All those function and return statements might make it easier to read multiple nested functions or just function expressions in general.

Developer opinions vary on just about everything, including arrow functions. For the sake of brevity, here are a couple things you need to watch out for when using arrow functions.

More about this
As was mentioned previously, the this keyword works differently in arrow functions. The methods call(), apply(), and bind() will not change the value of this in arrow functions. (In fact, the value of this inside of a function simply can’t be changed–it will be the same value as when the function was called.) If you need to bind to a different value, you’ll need to use a function expression.

Constructors
Arrow functions cannot be used as constructors as other functions can. Don’t use them to create similar objects as you would with other functions. If you attempt to use new with an arrow function, it will throw an error. Arrow functions, like built-in functions (aka methods), don’t have a prototype property or other internal methods. Because constructors are generally used to create classlike objects in JavaScript, you should use the new ES6 classes instead.

Generators
Arrow functions are designed to be lightweight and cannot be used as generators. Using the yield keyword in ES6 will throw an error. Use ES6 generators instead.

Arguments object
Arrow functions do not have the local variable arguments as do other functions. The arguments object is an array-like object that allows developers to dynamically discover and access a function’s arguments. This is helpful because JavaScript functions can take an unlimited number of arguments. Arrow functions do not have this object.

How Much Use Is There for Arrow Functions?
Arrow functions have been called one of the quickest wins with ES6. Developer Lars Schöning lays out how his team decided where to use arrow functions:

Use function in the global scope and for Object.prototype properties.
Use class for object constructors.
Use => everywhere else.
Arrow functions, like let and const, will likely become the default functions unless function expressions or declarations are necessary. To get a sense for how much arrow functions can be used, Kevin Smith, counted function expressions in various popular libraries/frameworks and found that roughly 55% of function expressions would be candidates for arrow functions.

Arrow functions are here (c’mon Safari!)–they are powerful, concise, and developers love them. Perhaps it’s time for you to start using them!