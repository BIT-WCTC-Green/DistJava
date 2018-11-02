package us.matt;

import java.util.List;

public class ListWrapper {
    private List list;

    // JavaBean accessors for first name
    public ListWrapper(List list) {
        this.list = list;
    }
    public List getList() {
        return list;
    }
    public int getSize() {
        return list.size();
    }
}
