package com.fwtai.boot;
/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2018-05-31 16:43
 * @QQ号码 444141300
 * @官网 http://www.fwtai.com
 */

import java.util.ArrayList;
import java.util.List;

public class Test{

    // 查询数据库菜单表中所有数据(这里模拟一个菜单表的所有数据)
    static int times = 0;

    static List<Menu> data = new ArrayList<Menu>();
    static{
        Menu l = new Menu(1,"北京市",0,1);
        Menu l2 = new Menu(3,"朝阳区",1,2);
        Menu l4 = new Menu(5,"大郊亭中街",3,3);
        Menu l11 = new Menu(12,"二号院",5,4);
        Menu l12 = new Menu(13,"三号楼",12,5);
        Menu l13 = new Menu(14,"四号楼",12,5);
        Menu l5 = new Menu(6,"大望路",3,3);
        Menu l6 = new Menu(7,"南磨房路",3,3);
        Menu l3 = new Menu(4,"海淀区",1,2);
        Menu l7 = new Menu(8,"唐家岭路",4,3);
        Menu l8 = new Menu(9,"上地路",4,3);
        Menu l1 = new Menu(2,"天津市",0,1);
        Menu l9 = new Menu(10,"红桥区",2,2);
        Menu l10 = new Menu(11,"北辰区",2,2);
        data.add(l2);
        data.add(l);
        data.add(l1);
        data.add(l3);
        data.add(l10);
        data.add(l9);
        data.add(l5);
        data.add(l4);
        data.add(l7);
        data.add(l6);
        data.add(l8);
        data.add(l12);
        data.add(l11);
        data.add(l13);
    }
    public static void main(String[] args){
        List<Menu> resultList = new ArrayList<>();
        System.out.println("查询前集合大小:" + data.size());
        long start = System.currentTimeMillis();
        for(Menu testEntity : data){
            times++;
            if(testEntity.getParentId() == 0){//父级菜单开始添加
                resultList.add(testEntity);
                if(ifChilds(data,testEntity.getId())){//存在子集
                    List<Menu> childs = new ArrayList<>();
                    childs = getChildList(data,testEntity.getId(),childs);
                    resultList.addAll(childs);
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("查询后集合大小:" + resultList.size());
        System.out.println("resultList-->" + resultList);
        System.out.println("查询次数:" + times + "次");
        System.out.println("查询耗时:" + (end - start) + "毫秒");
        for(Menu testEntity : resultList){
            String s = "";
            for(int i = 1; i < testEntity.getLevel(); i++){
                s = s + "\t";
            }
            System.out.println(s + "I____" + testEntity.getName());
        }
    }

    //获取父id下的子集合
    private static List<Menu> getChildList(List<Menu> list,int pId,List<Menu> reList){
        for(Menu testEntity : list){
            times++;
            if(testEntity.getParentId() == pId){//查询下级菜单
                reList.add(testEntity);
                if(ifChilds(list,testEntity.getId())){
                    getChildList(list,testEntity.getId(),reList);
                }
            }
        }
        return reList;
    }

    //判断是否存在子集
    private static boolean ifChilds(List<Menu> list,int pId){
        boolean flag = false;
        for(Menu testEntity : list){
            times++;
            if(testEntity.getParentId() == pId){
                flag = true;
                break;
            }
        }
        return flag;
    }
}