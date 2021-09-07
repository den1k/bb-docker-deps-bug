## Docker deps bug?

### build
docker build . --tag bb:deps-bug

### run
docker run -it bb:deps-bug

```shell
➜  docker-bb-with-deps git:(master) ✗ docker run -it bb:deps-bug sh
Exception in thread "main" java.lang.Exception: Couldn't find 'java'. Please set JAVA_HOME.
	at borkdude.deps$_main.invokeStatic(deps.clj:430)
	at borkdude.deps$_main.doInvoke(deps.clj:419)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:667)
	at babashka.impl.deps$add_deps$fn__31831$fn__31832.invoke(deps.clj:73)
	at babashka.impl.deps$add_deps$fn__31831.invoke(deps.clj:73)
	at babashka.impl.deps$add_deps.invokeStatic(deps.clj:73)
	at babashka.main$exec.invokeStatic(main.clj:699)
	at babashka.main$main.invokeStatic(main.clj:880)
	at babashka.main$main.doInvoke(main.clj:867)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:667)
	at babashka.main$_main.invokeStatic(main.clj:914)
	at babashka.main$_main.doInvoke(main.clj:906)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at babashka.main.main(Unknown Source)
```