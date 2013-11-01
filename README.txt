Demonstration of Gradle test error when worker process dies unexpectedly.

Just run `./gradlew test`, you should get an exception from Gradle that looks like:

Unexpected exception thrown.
org.gradle.messaging.remote.internal.MessageIOException: Could not read message from '/0:0:0:0:0:0:0:1:51571'.
	at org.gradle.messaging.remote.internal.inet.SocketConnection.receive(SocketConnection.java:88)
	at org.gradle.messaging.remote.internal.hub.MessageHub$ConnectionReceive.run(MessageHub.java:230)
	at org.gradle.internal.concurrent.DefaultExecutorFactory$StoppableExecutorImpl$1.run(DefaultExecutorFactory.java:66)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:744)
Caused by: com.esotericsoftware.kryo.KryoException: Buffer underflow.
	at com.esotericsoftware.kryo.io.Input.require(Input.java:162)
	at com.esotericsoftware.kryo.io.Input.readByte(Input.java:255)
	at org.gradle.messaging.remote.internal.hub.InterHubMessageSerializer$MessageReader.read(InterHubMessageSerializer.java:64)
	at org.gradle.messaging.remote.internal.hub.InterHubMessageSerializer$MessageReader.read(InterHubMessageSerializer.java:53)
	at org.gradle.messaging.remote.internal.inet.SocketConnection.receive(SocketConnection.java:83)
	... 5 more

