package wang.side.bean;

public class Description {
    private String format;
    private String value;

    public Description() {
    }

    public Description(String format, String value) {
        this.format = format;
        this.value = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Description{" +
                "format='" + format + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
