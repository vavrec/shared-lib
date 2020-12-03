import cz.vavrecka.Variables

def call() {
    echo  Variables.SLACK_MESSAGE;
     println( Variables.testMap.size());
    echo "konec";
    Variables.testMap.put("age","ssss");
     println( Variables.testMap.size());
     test2();
     println( Variables.testMap.size());
}