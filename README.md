# graphql-java-http-example

An example of using graphql-java in a HTTP application.

It demonstrates the use of `graphql IDL` to define a schema in a textual way.
 
It also shows how to use `data loader` to ensure that most efficient way to load
inside a graphql query

Finally it shows how to combine graphql-java `Instrumentation` to create performance tracing
and data loader effectiveness statistics.

To build the code type

    ./gradlew build
    
To run the code type    
    
    ./gradlew run
    
Point your browser at 

    http://localhost:3000/    


Some example graphql queries might be

     {
       hero {
         name
         friends {
           name
           friends {
             id
             name
           }
           
         }
       }
     }


or maybe

    {
      luke: human(id: "1000") {
        ...HumanFragment
      }
      leia: human(id: "1003") {
        ...HumanFragment
      }
    }
    
    fragment HumanFragment on Human {
      name
      homePlanet
      friends {
        name
        __typename
      }
    }


