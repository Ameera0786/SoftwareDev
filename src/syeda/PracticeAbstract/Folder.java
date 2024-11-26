package syeda.PracticeAbstract;

import java.util.ArrayList;
import java.util.List;

public class Folder extends DesktopItem implements Group {
    private List<DesktopItem> items;
    public Folder(String name){
        super(name);
        items = new ArrayList<>();
    }

    public boolean add(DesktopItem item){
        return items.add(item);
    }

    @Override
    public void open(){
        for (DesktopItem item : items){
            System.out.println(item.getName());
            item.open();
        }
    }

    @Override
    public int size(){
        int totalSize = super.size();
        for (DesktopItem item : items){
            totalSize += item.size();
        }
        return totalSize;
    }

}
