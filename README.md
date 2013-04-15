si-hello-world
==============

A coupla "Hello, World" examples using Spring Integration adapted from the book Spring Integration in Action by Fisher et. al.

In the first (com.erj.practice.helloworld.channel.HelloWorldExample) the greeting is sent to standard out by the MyHelloService.  

In the second (com.erj.practice.helloworld.gateway.HelloWorldExample) the greeting is the return value of the service and sent to standard out in the main method.

Overall, this example differs very little from a standard Spring "Hello, World" example.  Create some POJO's, whip up a context file, load the context file in a main method, and call a method on one of the beans.
 

