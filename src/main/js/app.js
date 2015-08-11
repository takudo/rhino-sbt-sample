//var runnable = new java.lang.Runnable({
//    run: function() { console.log('running'); }
//});
//var executor = java.util.concurrent.Executors.newCachedThreadPool();
//executor.submit(runnable);

//importPackage(com.example.JsExecuteContext);

function Toto(){
    this.say = function(content){
        print(content)
    }
}

new Toto().say("hoge");