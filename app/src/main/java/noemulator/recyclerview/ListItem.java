package noemulator.recyclerview;

/**
 * Created by Alvan on 9/10/2017.
 */

public class ListItem {

    private String head;
    private String desc;
    private String image;

    public ListItem(String head,String desc){

        this.head = head;
        this.desc = desc;

    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage() {
        return image;
    }
}
