import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class BaseCount {
    private String m;
    BaseCount(String m)
    {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");

        String expression = m;
        //System.out.println(expression);

        try {
            String result = String.valueOf(scriptEngine.eval(expression));
            System.out.println(result);
        } catch (ScriptException e) {

        }

    }
}