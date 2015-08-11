//var runnable = new java.lang.Runnable({
//    run: function() { console.log('running'); }
//});
//var executor = java.util.concurrent.Executors.newCachedThreadPool();
//executor.submit(runnable);

var mainPackages = JavaImporter(Packages.com.example);

function Toto(){
    this.say = function(content){
        print(content)
    }
}

new Toto().say("hoge");

//object sharing
var sharing = mainPackages.ObjectSharing.getInstance();
sharing.setContent("sharing between js and java !");