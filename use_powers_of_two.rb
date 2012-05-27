require 'rubygems'
require 'java'

# Require the clojure jars 
require 'powers_of_two/lib/clojure-1.4.0.jar'
require 'powers_of_two/lib/clojure-contrib-1.2.0.jar'

# Require the project jar that we want to use
require 'powers_of_two/powers_of_two-1.0.0-SNAPSHOT.jar'


# Require the jrclj gem that lets us interact with clojure code
require 'jrclj'

# Create a JRClj context.  We can then import clojure namespaces which will make the functions available
clj = JRClj.new
clj._import "powers_of_two.core"

puts "2**500 == " + clj.nth(clj.powers_of_two, 500).to_s


# puts "Let's try to print out every power of two to infinity"
# puts clj.powers_of_two.to_s
