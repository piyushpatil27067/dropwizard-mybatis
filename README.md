# postman call-
http://localhost:8080/products/insert


# JSON object-
{
    "id": 25,
    "name": "hello",
    "description": "hello"
}


# Response-
{
    "code": 500,
    "message": "There was an error processing your request. It has been logged (ID 794d95f552c92fc4)."
}


# console output-

INFO  [2023-03-03 12:36:53,628] org.eclipse.jetty.setuid.SetUIDListener: Opened application@3fde2209{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
INFO  [2023-03-03 12:36:53,628] org.eclipse.jetty.setuid.SetUIDListener: Opened admin@1f916219{HTTP/1.1,[http/1.1]}{0.0.0.0:8081}
INFO  [2023-03-03 12:36:53,636] org.eclipse.jetty.server.Server: jetty-9.4.11.v20180605; built: 2018-06-05T18:24:03.829Z; git: d5fc0523cfa96bfebfbda19606cad384d772f04c; jvm 11.0.15+8-LTS-149
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
INFO  [2023-03-03 12:36:57,579] io.dropwizard.jersey.DropwizardResourceConfig: The following paths were found for the configured resources:

    POST    /products/insert (com.trainingcenter.resources.ProductResource)

INFO  [2023-03-03 12:36:57,584] org.eclipse.jetty.server.handler.ContextHandler: Started i.d.j.MutableServletContextHandler@4a6facb0{/,null,AVAILABLE}
INFO  [2023-03-03 12:36:57,601] io.dropwizard.setup.AdminEnvironment: tasks = 

    POST    /tasks/log-level (io.dropwizard.servlets.tasks.LogConfigurationTask)
    POST    /tasks/gc (io.dropwizard.servlets.tasks.GarbageCollectionTask)

INFO  [2023-03-03 12:36:57,622] org.eclipse.jetty.server.handler.ContextHandler: Started i.d.j.MutableServletContextHandler@729d6ee2{/,null,AVAILABLE}
INFO  [2023-03-03 12:36:57,681] org.eclipse.jetty.server.AbstractConnector: Started application@3fde2209{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
INFO  [2023-03-03 12:36:57,687] org.eclipse.jetty.server.AbstractConnector: Started admin@1f916219{HTTP/1.1,[http/1.1]}{0.0.0.0:8081}
INFO  [2023-03-03 12:36:57,687] org.eclipse.jetty.server.Server: Started @8678ms
ERROR [2023-03-03 12:37:33,501] io.dropwizard.jersey.errors.LoggingExceptionMapper: Error handling a request: 326d9765f605e373
! java.io.IOException: Could not find resource jdbc.properties
! at org.apache.ibatis.io.Resources.getResourceAsStream(Resources.java:110)
! at org.apache.ibatis.io.Resources.getResourceAsStream(Resources.java:97)
! at org.apache.ibatis.io.Resources.getResourceAsProperties(Resources.java:123)
! at org.apache.ibatis.builder.xml.XMLConfigBuilder.propertiesElement(XMLConfigBuilder.java:176)
! at org.apache.ibatis.builder.xml.XMLConfigBuilder.parseConfiguration(XMLConfigBuilder.java:98)
! ... 63 common frames omitted
! Causing: org.apache.ibatis.builder.BuilderException: Error parsing SQL Mapper Configuration. Cause: java.io.IOException: Could not find resource jdbc.properties
! at org.apache.ibatis.builder.xml.XMLConfigBuilder.parseConfiguration(XMLConfigBuilder.java:109)
! at org.apache.ibatis.builder.xml.XMLConfigBuilder.parse(XMLConfigBuilder.java:92)
! at org.apache.ibatis.session.SqlSessionFactoryBuilder.build(SqlSessionFactoryBuilder.java:52)
! ... 61 common frames omitted
! Causing: org.apache.ibatis.exceptions.PersistenceException: 
! ### Error building SqlSession.
! ### The error may exist in SQL Mapper Configuration
! ### Cause: org.apache.ibatis.builder.BuilderException: Error parsing SQL Mapper Configuration. Cause: java.io.IOException: Could not find resource jdbc.properties
! at org.apache.ibatis.exceptions.ExceptionFactory.wrapException(ExceptionFactory.java:26)
! at org.apache.ibatis.session.SqlSessionFactoryBuilder.build(SqlSessionFactoryBuilder.java:54)
! at org.apache.ibatis.session.SqlSessionFactoryBuilder.build(SqlSessionFactoryBuilder.java:38)
! at com.trainingcenter.utils.MyBatisUtil.<clinit>(MyBatisUtil.java:24)
! ... 59 common frames omitted
! Causing: java.lang.ExceptionInInitializerError: null
! at com.trainingcenter.resources.ProductResource.createProduct(ProductResource.java:46)
! at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
! at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
! at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
! at java.base/java.lang.reflect.Method.invoke(Method.java:566)
! at org.glassfish.jersey.server.model.internal.ResourceMethodInvocationHandlerFactory$1.invoke(ResourceMethodInvocationHandlerFactory.java:81)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher$1.run(AbstractJavaResourceMethodDispatcher.java:144)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.invoke(AbstractJavaResourceMethodDispatcher.java:161)
! at org.glassfish.jersey.server.model.internal.JavaResourceMethodDispatcherProvider$ResponseOutInvoker.doDispatch(JavaResourceMethodDispatcherProvider.java:160)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.dispatch(AbstractJavaResourceMethodDispatcher.java:99)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:389)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:347)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:102)
! at org.glassfish.jersey.server.ServerRuntime$2.run(ServerRuntime.java:326)
! at org.glassfish.jersey.internal.Errors$1.call(Errors.java:271)
! at org.glassfish.jersey.internal.Errors$1.call(Errors.java:267)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:315)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:297)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:267)
! at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:317)
! at org.glassfish.jersey.server.ServerRuntime.process(ServerRuntime.java:305)
! at org.glassfish.jersey.server.ApplicationHandler.handle(ApplicationHandler.java:1154)
! at org.glassfish.jersey.servlet.WebComponent.serviceImpl(WebComponent.java:473)
! at org.glassfish.jersey.servlet.WebComponent.service(WebComponent.java:427)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:388)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:341)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:228)
! at io.dropwizard.jetty.NonblockingServletHolder.handle(NonblockingServletHolder.java:49)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1655)
! at io.dropwizard.servlets.ThreadNameFilter.doFilter(ThreadNameFilter.java:35)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1642)
! at io.dropwizard.jersey.filter.AllowedMethodsFilter.handle(AllowedMethodsFilter.java:45)
! at io.dropwizard.jersey.filter.AllowedMethodsFilter.doFilter(AllowedMethodsFilter.java:39)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1642)
! at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:533)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:255)
! at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1317)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:203)
! at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:473)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:201)
! at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1219)
! at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:144)
! at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
! at com.codahale.metrics.jetty9.InstrumentedHandler.handle(InstrumentedHandler.java:239)
! at io.dropwizard.jetty.RoutingHandler.handle(RoutingHandler.java:52)
! at org.eclipse.jetty.server.handler.gzip.GzipHandler.handle(GzipHandler.java:674)
! at io.dropwizard.jetty.BiDiGzipHandler.handle(BiDiGzipHandler.java:67)
! at org.eclipse.jetty.server.handler.RequestLogHandler.handle(RequestLogHandler.java:56)
! at org.eclipse.jetty.server.handler.StatisticsHandler.handle(StatisticsHandler.java:169)
! at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
! at org.eclipse.jetty.server.Server.handle(Server.java:531)
! at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:352)
! at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:260)
! at org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:281)
! at org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:102)
! at org.eclipse.jetty.io.ChannelEndPoint$2.run(ChannelEndPoint.java:118)
! at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:762)
! at org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:680)
! at java.base/java.lang.Thread.run(Thread.java:834)
0:0:0:0:0:0:0:1 - - [03/Mar/2023:12:37:33 +0000] "POST /products/insert HTTP/1.1" 500 110 "-" "PostmanRuntime/7.30.1" 460
ERROR [2023-03-03 12:40:57,118] io.dropwizard.jersey.errors.LoggingExceptionMapper: Error handling a request: 3f52cfb07959bf25
! java.lang.NoClassDefFoundError: Could not initialize class com.trainingcenter.utils.MyBatisUtil
! at com.trainingcenter.resources.ProductResource.createProduct(ProductResource.java:46)
! at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
! at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
! at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
! at java.base/java.lang.reflect.Method.invoke(Method.java:566)
! at org.glassfish.jersey.server.model.internal.ResourceMethodInvocationHandlerFactory$1.invoke(ResourceMethodInvocationHandlerFactory.java:81)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher$1.run(AbstractJavaResourceMethodDispatcher.java:144)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.invoke(AbstractJavaResourceMethodDispatcher.java:161)
! at org.glassfish.jersey.server.model.internal.JavaResourceMethodDispatcherProvider$ResponseOutInvoker.doDispatch(JavaResourceMethodDispatcherProvider.java:160)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.dispatch(AbstractJavaResourceMethodDispatcher.java:99)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:389)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:347)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:102)
! at org.glassfish.jersey.server.ServerRuntime$2.run(ServerRuntime.java:326)
! at org.glassfish.jersey.internal.Errors$1.call(Errors.java:271)
! at org.glassfish.jersey.internal.Errors$1.call(Errors.java:267)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:315)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:297)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:267)
! at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:317)
! at org.glassfish.jersey.server.ServerRuntime.process(ServerRuntime.java:305)
! at org.glassfish.jersey.server.ApplicationHandler.handle(ApplicationHandler.java:1154)
! at org.glassfish.jersey.servlet.WebComponent.serviceImpl(WebComponent.java:473)
! at org.glassfish.jersey.servlet.WebComponent.service(WebComponent.java:427)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:388)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:341)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:228)
! at io.dropwizard.jetty.NonblockingServletHolder.handle(NonblockingServletHolder.java:49)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1655)
! at io.dropwizard.servlets.ThreadNameFilter.doFilter(ThreadNameFilter.java:35)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1642)
! at io.dropwizard.jersey.filter.AllowedMethodsFilter.handle(AllowedMethodsFilter.java:45)
! at io.dropwizard.jersey.filter.AllowedMethodsFilter.doFilter(AllowedMethodsFilter.java:39)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1642)
! at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:533)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:255)
! at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1317)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:203)
! at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:473)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:201)
! at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1219)
! at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:144)
! at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
! at com.codahale.metrics.jetty9.InstrumentedHandler.handle(InstrumentedHandler.java:239)
! at io.dropwizard.jetty.RoutingHandler.handle(RoutingHandler.java:52)
! at org.eclipse.jetty.server.handler.gzip.GzipHandler.handle(GzipHandler.java:674)
! at io.dropwizard.jetty.BiDiGzipHandler.handle(BiDiGzipHandler.java:67)
! at org.eclipse.jetty.server.handler.RequestLogHandler.handle(RequestLogHandler.java:56)
! at org.eclipse.jetty.server.handler.StatisticsHandler.handle(StatisticsHandler.java:169)
! at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
! at org.eclipse.jetty.server.Server.handle(Server.java:531)
! at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:352)
! at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:260)
! at org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:281)
! at org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:102)
! at org.eclipse.jetty.io.ChannelEndPoint$2.run(ChannelEndPoint.java:118)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.runTask(EatWhatYouKill.java:333)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:310)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:168)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:132)
! at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:762)
! at org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:680)
! at java.base/java.lang.Thread.run(Thread.java:834)
0:0:0:0:0:0:0:1 - - [03/Mar/2023:12:40:57 +0000] "POST /products/insert HTTP/1.1" 500 110 "-" "PostmanRuntime/7.30.1" 14
ERROR [2023-03-03 12:44:44,444] io.dropwizard.jersey.errors.LoggingExceptionMapper: Error handling a request: 794d95f552c92fc4
! java.lang.NoClassDefFoundError: Could not initialize class com.trainingcenter.utils.MyBatisUtil
! at com.trainingcenter.resources.ProductResource.createProduct(ProductResource.java:46)
! at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
! at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
! at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
! at java.base/java.lang.reflect.Method.invoke(Method.java:566)
! at org.glassfish.jersey.server.model.internal.ResourceMethodInvocationHandlerFactory$1.invoke(ResourceMethodInvocationHandlerFactory.java:81)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher$1.run(AbstractJavaResourceMethodDispatcher.java:144)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.invoke(AbstractJavaResourceMethodDispatcher.java:161)
! at org.glassfish.jersey.server.model.internal.JavaResourceMethodDispatcherProvider$ResponseOutInvoker.doDispatch(JavaResourceMethodDispatcherProvider.java:160)
! at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.dispatch(AbstractJavaResourceMethodDispatcher.java:99)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:389)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:347)
! at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:102)
! at org.glassfish.jersey.server.ServerRuntime$2.run(ServerRuntime.java:326)
! at org.glassfish.jersey.internal.Errors$1.call(Errors.java:271)
! at org.glassfish.jersey.internal.Errors$1.call(Errors.java:267)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:315)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:297)
! at org.glassfish.jersey.internal.Errors.process(Errors.java:267)
! at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:317)
! at org.glassfish.jersey.server.ServerRuntime.process(ServerRuntime.java:305)
! at org.glassfish.jersey.server.ApplicationHandler.handle(ApplicationHandler.java:1154)
! at org.glassfish.jersey.servlet.WebComponent.serviceImpl(WebComponent.java:473)
! at org.glassfish.jersey.servlet.WebComponent.service(WebComponent.java:427)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:388)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:341)
! at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:228)
! at io.dropwizard.jetty.NonblockingServletHolder.handle(NonblockingServletHolder.java:49)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1655)
! at io.dropwizard.servlets.ThreadNameFilter.doFilter(ThreadNameFilter.java:35)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1642)
! at io.dropwizard.jersey.filter.AllowedMethodsFilter.handle(AllowedMethodsFilter.java:45)
! at io.dropwizard.jersey.filter.AllowedMethodsFilter.doFilter(AllowedMethodsFilter.java:39)
! at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1642)
! at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:533)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:255)
! at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1317)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:203)
! at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:473)
! at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:201)
! at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1219)
! at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:144)
! at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
! at com.codahale.metrics.jetty9.InstrumentedHandler.handle(InstrumentedHandler.java:239)
! at io.dropwizard.jetty.RoutingHandler.handle(RoutingHandler.java:52)
! at org.eclipse.jetty.server.handler.gzip.GzipHandler.handle(GzipHandler.java:674)
! at io.dropwizard.jetty.BiDiGzipHandler.handle(BiDiGzipHandler.java:67)
! at org.eclipse.jetty.server.handler.RequestLogHandler.handle(RequestLogHandler.java:56)
! at org.eclipse.jetty.server.handler.StatisticsHandler.handle(StatisticsHandler.java:169)
! at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
! at org.eclipse.jetty.server.Server.handle(Server.java:531)
! at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:352)
! at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:260)
! at org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:281)
! at org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:102)
! at org.eclipse.jetty.io.ChannelEndPoint$2.run(ChannelEndPoint.java:118)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.runTask(EatWhatYouKill.java:333)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:310)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:168)
! at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.run(EatWhatYouKill.java:126)
! at org.eclipse.jetty.util.thread.ReservedThreadExecutor$ReservedThread.run(ReservedThreadExecutor.java:366)
! at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:762)
! at org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:680)
! at java.base/java.lang.Thread.run(Thread.java:834)
0:0:0:0:0:0:0:1 - - [03/Mar/2023:12:44:44 +0000] "POST /products/insert HTTP/1.1" 500 110 "-" "PostmanRuntime/7.30.1" 177817
