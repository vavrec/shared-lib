import cz.vavrecka.Variables

def call() {
    echo  Variables.SLACK_MESSAGE;
    echo  Variables.testMap.size();
    echo "konec";
    Variables.testMap.put("age","ssss");
    echo  Variables.testMap.size();
}