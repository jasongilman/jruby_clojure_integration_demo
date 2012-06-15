jruby_clojure_integration_demo
==============================

Demonstrates integration of JRuby and Clojure using jrclj gem.  See https://github.com/kyleburton/jrclj.

See my blog post http://www.element84.com/ruby-clojure-integration.html


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
* Try it out in the repl
 * ./jrepl

```
		clj.powers_of_two
		=> #<Java::ClojureLang::LazySeq:0x1558473e>
		clj.take( 10, clj.powers_of_two).map(&:to_i)
		=> [1, 2, 4, 8, 16, 32, 64, 128, 256, 512]
		clj.powers_of_two.find_index {|n| n.to_i > 100_000_000 }
		=> 27
```
 