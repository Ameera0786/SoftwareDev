package syeda.PracticeAbstract;

public class TextFile extends DesktopItem {
    private String contents;

    public TextFile(String name) {
        super(name);
    }

    public void add(String contents){
        this.contents += contents;
    }

    @Override
    public void open(){
        System.out.println(contents);
    }

    public void replace(String contents){
        this.contents = contents;
    }

    public int size(){
        return 2 * contents.length() + super.size();
    }
}