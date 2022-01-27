package com.SimplilearnSynchronization;

public class Test {
	
	Sender sender=new Sender(); // object want to share between multiple threads
	
	User user1=new User("Naveen", "Hiiiii........", sender);
	User user2=new User("Jashwanth", "Bye...." , sender);
	
	user1.start();
	user2.start();
}



