package org.example;


import java.util.*;


public class MyList extends ArrayList<ValueContainer>
{
    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c)
    {
        super(c);
    }

    public int sum()
    {
        int sum = 0;
        for(ValueContainer c : this)
            for(int i : c)
                sum += i;
        return sum;
    }
}