# Technical Test

## Content

* [Prerequisites](#prerequisites)
* [Evaluation](#eval)
    * [Criteria](#criteria)
    * [Technical part](#technical)
        * [Code quality](#code)
        * [Commit quality](#commit)
        * [Production ready](#prod)
* [Exercises](#exercises)
    * [Exercise 1](#exercise1)
    * [Exercise 2](#exercise2)
    * [Exercise 3](#exercise3)
    * [Exercise 4](#exercise4)
    * [Exercise 5](#exercise5)
    * [Exercise 6](#exercise6)

## <a name="prerequisites"></a>Prerequisites

List of prerequisites to realize the test:
* On your PC, you must have :
   * _Maven_ installed (Version __3.x__)
   * _Git_ Installed (Version __2.x__) 
   * _JAVA JDK_ installed (Version __11__)
   * _JAVA IDE_ installed (__Eclipse__ / __IntelliJ IDEA__ / …)
   * _REST Client tool_ to make HTTP Requests 
     * _Chrome_ Extension (Postman - REST Client shortcut / Sense (Beta))
     * Postman
     * CLI (curl / httpie)
     * …

## <a name="eval"></a>Evaluation
### <a name="criteria"></a>Criteria

The aim of this evaluation is to check if you have the skills to integrate a development team.
For that, we will take into account the following elements : 

* Your analysis
* Your code
* Your way of working

### <a name="technical"></a>Technical Part

Your hard skills will be evaluated according to the following criteria.

#### <a name="code"></a>Code quality

* Comment
* Complexity
* Duplication
* Maintainable
* Performance
* Readable

#### <a name="commit"></a>Commit quality

* Atomic commits
* Relevant commit message

#### <a name="prod"></a>Production ready

* Rules compliance
* Tested
* Work

## <a name="exercises"></a>Exercises

### <a name="exercise1"></a>Exercise 1

Install and run the project on your computer

1. Retrieve the __GITHUB__ project : [__Fork the repository__](https://help.github.com/articles/fork-a-repo/)
2. Mount the project on your development IDE (Eclipse / Intellij …)
3. Compile the project (Java and Maven compilation)
4. Launch the project (Launch the Main class of the project : StartBoot)

### <a name="exercise2"></a>Exercise 2

Understand the project and make several tests on its current state

1. Understand the project (This project simulates a bank __REST__ server)
    * __SAAS__ project (Software as a service)
    * __REST__ server (Representational state transfer)
        * __Host__ : http://localhost:8080/
    * __Bank service__
        * __Account__ Management
        * __Transaction__ Management

2. Try to retrieve all accounts (Launch a REST request with these parameters)
    * __Verb__ : _GET_
    * __URL__ : /accounts

3. Try to retrieve the detail of an account (Replace the __YOUR_ID__ by your account ID)
    * __Verb__ : _GET_
    * __URL__ : /accounts/__YOUR_ID__

4. Try to execute the JUnit tests in __AccountTest__ and __TransactionTest__

### <a name="exercise3"></a>Exercise 3

Currently, you can retrieve the transaction list related to an account with the application.

For the next sprint, the client wants to add a new admin feature:
* Remove a transaction

You must implement this new feature and add the according tests.

Send a merge request.

### <a name="exercise4"></a>Exercise 4

For the next sprint, the client wants to add 2 new admin features:
* Add a new transaction to an account
* Update an existing transaction

You must implement those new features and add the according tests.

Make sure that the existing JUnit tests (__AdminTransactionTest__) are OK.

Send a merge request.

### <a name="exercise5"></a>Exercise 5

Currently, the application stores the accounts and the transactions directly in the JAVA services. 
This situation is no longer acceptable and the application must be refactored with a real database service.

Here, you must implement a memory database (h2) in the application and refactor the services.

Make sure that all the JUnit tests are OK.

Send a merge request.

### <a name="exercise6"></a>Exercise 6

Currently, some services can be used by passing a pageable object in parameter.

However, this object is never used. 
Use it to sort and order the list, furthermore add the according tests.

Send a merge request.
