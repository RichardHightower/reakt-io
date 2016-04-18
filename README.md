## Reakt IO

Reakt IO provides common interface for doing reactive IO in Java.

You can implement these interfaces with Jetty, Netty, Vert.x, Undertow,
 Conekt, etc.

Reakt IO provides a common set of IO interface API that are IO 
non-blocking and reactive (streams, callbacks, and promises). 

Reakt IO uses Reakt Callbacks, Promises and Streams. 

QBit 2.0 will use Nektwork which can be backed by Vert.x, Conekt, and
other Reakt IO implementations.


Also libraries like QBit, Elekt, Lokate can use 
Reakt IO so that they will work well in whatever environment they are 
deployed without deploying yet another set of large dependencies. 

Reakt IO will have drivers written in Netty, Vert.x, Conekt and Undertow.


