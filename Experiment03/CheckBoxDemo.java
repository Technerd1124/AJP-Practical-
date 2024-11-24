import java.awt.*;

public class CheckBoxDemo extends Frame {
    private static final long serialVersionUID = 1L;

    // Component Declaration
    CheckboxGroup cbg = new CheckboxGroup();
    String languages[] = { "Java", "C++", "C", "Python", "HTML", "JS" };
    String years[] = { "FY", "SY", "TY" };
    Checkbox cb;

    CheckBoxDemo() {
        // Setting Layouts
        setLayout(new GridLayout(10, 1));
        // Create RadioButtons
        add(new Label("Radio Buttons"));
        for (String year : years) {
            cb = new Checkbox(year, cbg, false);
            add(cb);
        }
        // Create Checkboxes
        add(new Label("Checkboxes"));
        for (String language : languages) {
            Checkbox cb = new Checkbox(language);
            add(cb);
        }
        setLayout(new GridLayout(20, 1));
        setVisible(true);
        setSize(500, 500);
        setTitle("CheckBox Demo");
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
