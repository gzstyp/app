package com.fwtai.boot;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018-05-31 16:42
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
 */
public class Menu{

    private int id;

    private String name;

    private int parentId;

    private int level;

    public Menu(int id,String name,int parentId,int level){
        super();
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.level = level;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getParentId(){
        return parentId;
    }

    public void setParentId(int parentId){
        this.parentId = parentId;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    @Override
    public String toString(){
        return "Location [id=" + id + ", name=" + name + ", parentId=" + parentId + ", level=" + level + "]";
    }
}