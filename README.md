jruby_clojure_integration_demo
==============================

Demonstrates integration of JRuby and Clojure using jrclj gem.  See https://github.com/kyleburton/jrclj.


Directions to try it out:
* ```git clone git://github.com/jasongilman/jruby_clojure_integration_demo.git```
* If you use rvm 
  * ```cd jruby_clojure_integration_demo``` The .rvmrc will install jruby and the jrclj gem.
* If you don't use rvm
  * Install [JRuby](http://jruby.org/download)
  * ```gem install jrclj```
* Install Leiningen, a build tool for clojure.
  * ```brew install leiningen``` or see https://github.com/technomancy/leiningen#installation
* Compile and jar the powers_of_two Clojure project
  * ```cd jruby_clojure_integration_demo/powers_of_two```
  * ```lein jar``` - Downloads the Clojure jar files, compiles the example project, and creates a jar file of example code.
* Run it
  * ```jruby use_powers_of_two.rb```