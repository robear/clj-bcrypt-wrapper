# clj-bcrypt-wrapper

A very simple wrapper around the org.mindrot.jbcrypt library.

I previously pulled my code off of GitHub but I have brought it back for posterity.

I have updated to the last available version of jBcrypt.

## Usage

```clojure

;;deps.edn
robear/clj-bcrypt-wrapper {:mvn/version "0.3.0"}

;;project.clj:
[clj-bcrypt-wrapper "0.3.0"]


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

Copyright © 2013-2025

Distributed under the Eclipse Public License, the same as Clojure.
