import cz.vavrecka.Variables

def call() {
    echo  Variables.SLACK_MESSAGE;
     println( Variables.testMap.size());
    Variables.testMap.put("age","ssss");
     println( Variables.testMap.size());
      echo "konec";
}