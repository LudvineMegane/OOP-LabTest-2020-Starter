package ie.tudublin;

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


    public String getName()
    {
        return this.name;
    }

    public int getStart()
    {
        return this.start;
    }

    public int getEnd()
    {
        return this.end;
    }


}
