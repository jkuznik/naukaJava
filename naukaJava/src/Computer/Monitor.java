package Computer;

public class Monitor {
    private int width = 3840;
    private int height = 1920;

    public void setLowResolution() {
        width = 800;
        height = 600;
    }

    public void setHeightResolution() {
        width = 3840;
        height = 1920;
    }

    public String getResolution() {
        return width + "x" + height;
    }
}
