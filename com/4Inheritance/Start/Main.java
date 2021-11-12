
public class Main {
  public static void main(String[] args) {
    var textBox = new TextBox();
    textBox.disable();

    var control2 = textBox;
    // System.out.println(control.hashCode()); // 1229416514 <- Hash code of the
    // address for this object in memory
    // System.out.println(control2.hashCode()); // 1229416514
    // System.out.println(control.equals(control2)); // true <- Check objects for
    // eqality based on hash code
    // System.out.println(control.toString()); // TextBox@49476842 <- [Full name of
    // the class]@[hash code in hex]
    // System.out.println(control.isEnabled()); // False

    textBox.setText("Hello World");
    System.out.println(textBox.toString()); // Hello World

    // var control = new UIControl(true);
    // show(control);
    show(textBox);

    var point1 = new Point(1, 2);
    var point2 = new Point(1, 2);
    System.out.println(point1 == point2); // False;
    System.out.println(point1.equals(point2)); // False
    System.out.println(point1.hashCode());
    System.out.println(point2.hashCode());

    UIControl[] controls = { new TextBox(), new CheckBox() };

    for (var control : controls) {
      // Procedural
      // if control is TextBox
      // renderTextBox
      // else if control is a CheckBox
      // renderCheckBox

      // Polymorphic
      control.render();
    }
  }

  public static void show(UIControl control) {
    if (control instanceof TextBox) {
      var textBox = (TextBox) control;
      textBox.setText("Hello Worlds");
    }
    System.out.println(control);
  }
}
