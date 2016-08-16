# clj-bcrypt-wrapper

A very simple wrapper around the org.mindrot.jbcrypt library.


## Usage

```clojure
;;In your project.clj:
[clj-bcrypt-wrapper "0.2.0"]


;; In your ns statement:
(ns my.ns
  (:require [clj-bcrypt-wrapper.core :refer :all]))
```

### Encrypting
```clojure
;;default salt
(encrypt "some password")

;;supply a salt
(encrypt (gensalt 10) "some password")
```

### Checking
```clojure
(check-password "some password" hashed-password)
```

## License

Copyright © 2013

Distributed under the Eclipse Public License, the same as Clojure.
