package ie.tudublin;
import processing.data.TableRow;

public class Task
{
    private String name;
    private int start;
    private int end;

    public Task(String name, int start, int end)
    {
        
        this.name = name;
        this.start = start;
        this.end = end;
    }
    
    public Task(TableRow row)
    {
        name = row.getString("Task");
        start = row.getInt("Start");
        end = row.getInt("End");
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setStart(int start)
    {
        this.start = start;
    }

    public int getStart()
    {
        return this.start;
    }

    public void setEnd(int end)
    {
        this.end = end;
    }

    public int getEnd()
    {
        return this.end;
    }
    
    public String toString()
    {
        
        return this.name + ","+ this.start + "," + this.end  ;
    }


}
