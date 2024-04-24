package jenkins;
class Output {
    static def hello(steps, string name){
        steps.echo ("Hello ${name}")
    } 
}
