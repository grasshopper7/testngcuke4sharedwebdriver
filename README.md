Refer to this for more details - https://grasshopper.tech/732/

Cucumber-JVM 4 supports parallel execution across threads out of the box and also with JUnit and TestNG. The easiest way to integrate Selenium with Cucumber in parallel mode is to use Before and After hooks to create and close the driver respectively. But this is expensive and time consuming.

This will look at allocating a driver to a specific thread and using it for all the scenarios assigned to the thread. The driver will only be closed at the end of the test execution. The drivers will be stored in a ThreadLocal object. Cucumber implementation of PicoContainer will be used for creating and sharing objects.
