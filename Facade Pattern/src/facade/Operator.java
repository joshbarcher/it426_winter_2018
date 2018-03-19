package facade;

import strings.StringOperations;

public class Operator
{
    private String[] data;

    public Operator(String[] data)
    {
        this.data = data;
    }

    public Operator removeDuplicates()
    {
        this.data = StringOperations.removeDuplicates(data);

        return this;
    }

    public Operator resize(int newLength)
    {
        this.data = StringOperations.resize(data, newLength);

        return this;
    }

    public Operator filter(String search)
    {
        this.data = StringOperations.filter(data, search);

        return this;
    }

    public String[] getData()
    {
        return data;
    }
}









