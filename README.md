# Reproducing kaocha.repl/run error

To reproduce,

```clojure
$ clj -A:dev
Clojure 1.12.0
user=> (require 'kaocha.repl)
nil
user=> (kaocha.repl/run 'repro-test)
```

Expected: runs tests in repro-test.

Actual: crash.

```
user=> (kaocha.repl/run 'repro-test)
[E]
Randomized with --seed 767566900

ERROR in bb (ns.clj:9)
Failed loading tests:
Exception: clojure.lang.Compiler$CompilerException: Syntax error macroexpanding at (script_test.clj:1:1).
#:clojure.error{:phase :execution, :line 1, :column 1, :source "script_test.clj"}
 at clojure.lang.Compiler.load (Compiler.java:8177)
    ...
(Rest of stacktrace elided)
Caused by: java.io.FileNotFoundException: Could not locate script__init.class, script.clj or script.cljc on classpath.
 at clojure.lang.RT.load (RT.java:482)
    ...
    script_test$eval4681$loading__6812__auto____4682.invoke (script_test.clj:1)
    script_test$eval4681.invokeStatic (script_test.clj:1)
    script_test$eval4681.invoke (script_test.clj:1)
    ...
(Rest of stacktrace elided)
1 tests, 1 assertions, 1 errors, 0 failures.
#:kaocha.result{:count 1, :pass 0, :error 1, :fail 0, :pending 0}
```
