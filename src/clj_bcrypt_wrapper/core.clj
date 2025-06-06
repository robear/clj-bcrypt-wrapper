(ns clj-bcrypt-wrapper.core
	(:import (org.mindrot.jbcrypt BCrypt)))

(defn gensalt
  "Generate a salt of an optional size."
  ([] (BCrypt/gensalt))
  ([size]	(BCrypt/gensalt size)))

(defn encrypt
  "Encrypt a plain text string with an auto-generated or supplied salt."
  ([plain-text] (encrypt (gensalt) plain-text))
  ([salt plain-text] (BCrypt/hashpw plain-text salt)))

(defn check-password
  "Check a plain text string against an encrypted string."
  [plain-text encrypted] (BCrypt/checkpw plain-text encrypted))
