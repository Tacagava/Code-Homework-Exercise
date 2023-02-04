### Javascript Test

Just a quick test to test your javascript understanding.

###### 1- What is ES6?

*** in short, it is the newest version of Javascript ***

###### 2- Name 3 examples of ES6 features which you learnt.

*** -Arrow Functions -Template Literals -Promises ***

###### 3- What is the difference between let and const?

*** that the Let variant can have a dynamic value, while const has to have a constant value ***

###### 4- How do you access object values? Give 3 examples

*** ejemplo["palabra"] ***
*** ejemplo.palabra ***
*** const {palabra} = ejemplo ***

###### 5- What does setInterval and setTimeout do?

*** setTimeout allows a function to start after the chosen time, but it only works once, on the other hand, setInterval, does the same, but this action is repeated several times in the chosen time ***

What will be the output of the following ?

# FIRST
```
 for (var i = 0 ; i < 5 ; i++) {
       setTimeout(() => {
       console.log(i);
}, 0);
}
```
*** the first number will always change ***
*** 10777 ***
# SECOND
```
 for (let i = 0 ; i < 5 ; i++) {
       setTimeout(() => {
       console.log(i);
}, 0);
}
```
*** 9814 ***
*** 0 ***
*** 1 ***
*** 2 ***
*** 3 ***
*** 4 ***
*** the first number will always change ***


###### 6- What are promises?

*** is used when you want a process to always have both a success and error response ***

###### 7- Convert this async function to async/await

```js
getQuote().then((quote) => {
  console.log(quote);
}).catch(function(err) {
  console.log(err);
});

// after this line,

getQuote().await((quote) => {
  console.log(quote);
})

```
*** ***

###### 8- Convert this code to arrow function.

```js
function greeting(firstname, lastname) {
  return `Hello ${firstname} ${lastname}`;
}
// after this line,

let greeting = (firstname, lastname) => ("hello" + firstname + lastname);

```

###### 9- Explain what a callback function is.

*** is a function that is not executed unless the previous function was successful or completed. ***

###### 10- What does the functions pop and push do to an array? And what do they return ?

*** The pop function removes something at the end of the array, while the push function adds something to the end of the array. ***

###### 11- What is the expected answer to this code?

```js
let string = "";
let object = { a: 1, b: 2, c: 3 };

for (let key in object) {
  string += object[key];
}

console.log(string);
```
*** 123 and undefined***

###### 12- What data type would Array.map() and Array.filter() return?

*** both return the same Array data type  ***



Additionally what will be the output of this ?

```
let array = [1,2,3, 0, 4,10, 0];
let output = array.filter((item) => item); 
```
*** undefined ***

###### 13- What data type would Array.includes() and Array.some() return?

*** Booleans ***



###### 14- Write down the 4 main methods of rest api

*** delete ***
*** put ***
*** get ***
*** post ***


###### 15- What is the difference between JSON and a JavaScript object?

*** that JSON objects can´t sontain functions***


#### 16 - Use this endpoint and fetch the output using FETCH API and print them on the console. Use both .then and catch and try and catch block as well.

```
https://www.boredapi.com/api/activity
```
```
The above API returns what to do when you are bored.
```

```js 

fetch('https://www.boredapi.com/api/activity').then((response) => {
    return response.json();
}).catch((error) => {
    console.log("Error");
})
try{
    //i'm not sure :(
}catch(error){
    console.log(error);
}


