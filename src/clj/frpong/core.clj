(ns frpong.core)

(defmacro go-loop [& body]
  `(cljs.core.async.macros/go
     (while true
       ~@body)))
