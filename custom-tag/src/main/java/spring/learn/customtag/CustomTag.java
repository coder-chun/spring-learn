package spring.learn.customtag;

/**
 * @Corp Created By sytown
 * @Author Chun
 * @Date 2018/5/25
 * @Time 16:22
 * @Description
 */
public class CustomTag {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean[name="+name+"]";
    }
}
