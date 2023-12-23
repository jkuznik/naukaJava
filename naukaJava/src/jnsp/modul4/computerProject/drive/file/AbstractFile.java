package jnsp.modul4.computerProject.drive.file;

public abstract class AbstractFile implements File{
    protected String name;
    protected int size;

    public AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }


}
