import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class BaseCount {
    String m;
    public String Count()
    {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");

        String expression = m;
        //System.out.println(expression);

        try {
            String result = String.valueOf(scriptEngine.eval(expression));
            return result;
        } catch (ScriptException e) {
            return "";
        }


    }
    BaseCount(String n)
    {
        m=n;
    }
}