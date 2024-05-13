package com.example.model;

public class Item
{
    private int id;
    private String name;
    private boolean isBought;

    public Item(int id, String name)
    {
        this.id = id;
        this.name = name;
        isBought = false;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public boolean getIsBought()
    {
        return isBought;
    }

    public void setIsBought()
    {
        isBought = !isBought;
    }
}