package com.hclt.demo.pojo.chapter1;

/**
 * @author GTsung
 * @date 2020/9/17
 */
//@Component
public class BusinessPerson implements Person {

    // @Qualifier与@Autowired同时使用表示按照name注入
//    @Autowired
//    @Qualifier(value = "dog")
    private Animal animal;

    // 构造方法注入
//    public BusinessPerson(@Autowired @Qualifier(value = "dog")Animal animal) {
//        this.animal = animal;
//    }

    @Override
    public void service() {
        animal.use();
    }

    @Override
//    @Autowired
//    @Qualifier(value = "dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟创建依赖");
        this.animal = animal;
    }
}
