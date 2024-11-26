package syeda.PracticeAbstract;

public abstract class DesktopItem {
    private String name;

    public DesktopItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void open();

    public void rename(String name){
        this.name = name;
    }

    public int size(){
        return 2 * name.length();
    }
}
