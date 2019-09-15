package com.design.simplefactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 15:15
 * @Description:工厂类；生成实例化对象
 */
public class FruitFactory {

    /*/**
     * @Description  ：获取Apple对象实例
     * @author       : chuan
     * @param        : []
     * @return       : com.design.simplefactory.Fruit
     * @exception    :
     */
    public static  Fruit getApple(){
        return  new Apple();
    }

    /*/**
     * @Description  ：获取Banana实例对象
     * @author       : chuan
     * @param        : []
     * @return       : com.design.simplefactory.Fruit
     * @exception    :
     */
    public static Fruit getBanana(){
        return  new Banana();
    }

    /*/**
     * @Description  ：通过type获取产品对象，且type的校验不区分大小写
     * @author       : chuan
     * @param        : [type]
     * @return       : com.design.simplefactory.Fruit
     * @exception    :
     */
    public static Fruit getFruitIgnoreCase(String type){
        if (type.equalsIgnoreCase("apple")){
            return  new Apple();
        }else if(type.equalsIgnoreCase("banana")){
            return  new Banana();
        }
        return null;
    }

    /*/**
     * @Description  ：通过type获取产品对象实例，但是type不区分大小写
     * @author       : chuan
     * @param        : [type]
     * @return       : com.design.simplefactory.Fruit
     * @exception    :
     */
    public static  Fruit getFruit(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

            Class obj =  Class.forName(type);
            return  (Fruit) obj.newInstance();
    }

}