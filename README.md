#  Cucumber Base
This repo contains *geckodriver* in `src/test/resources`. Change driver if it doesn't run with your browser version.

**Notice**: I recommend to use **IntellijIDEA** for this base

## FAQ 
### Undefined Step
You'll have *Undefined step* message in your feature file when you try to use expressions. You have to install **Cucumber to Java** plugin to solve this. 
### * However, the gherkin step has 0 arguments *
If you add more parameters to read in your Example table in feature file, you haven't forget follow this format:
~~~Java
@When("^sarasa text (.*) more sarasa text")
~~~


