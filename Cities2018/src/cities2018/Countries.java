
package cities2018;

import java.util.HashMap;
import java.util.Map;


public class Countries 
{
    private Map<String, String> countries=new HashMap();

    public Countries() 
    {
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        countries.put("Russia", "Moscow");
        countries.put("Great Britain", "London");
        countries.put("France", "Paris");
        countries.put("Spain", "Madrid");
    }
    @Override
    public String toString()
    {
        return countries.toString();
    }
    public static void main(String[] args) 
    {
        Countries c=new Countries();
        System.out.println(c);
    }
    
    
}
