import cz.vavrecka.Variables

def call() {
    //Variables.variables["name"] == "david"
    Variables.testMap.put("test2","ssss");
    echo "test2";
    println( Variables.testMap.size());
}