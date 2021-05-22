## Set up
install the latest node js
Once you have downloaded or cloned the repo you need to install the dependencies for the API. We do this using `npm`.

```cli
npm install
```

## Run the test suite

```cli
if OS is mac
npm test
```

## Run individual test
Individual tests can be run from cli by supplying the required params to the api test. e.g. below command will execute `Validate Api Key` test (first test from e2eTest.js). 
```cli
npx mocha specs/e2eTest.js -g 'Validate Api Key' --reporter mochawesome
```
Similar to above if we want to `Add New Gift Card` we can run the follwing command

```cli
token='eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOjE2MjEzMDc2NTgxODYsImlhdCI6MTYyMTMyMjY1OX0.JOist0Jx8wVxp5ubkNTH7vkjHXrOcxpbBXT7DIoZNUM' npx mocha specs/e2eTest.js -g 'Add New Gift Card' --reporter mochawesome	
```

## Report
After execution of tests `mochawesome` report is generated and it can located in the `mochawesome-report\mochawesome.html` folder

## logs
Test Execution logs request/response of api's are logged in the `logs\api.log`


