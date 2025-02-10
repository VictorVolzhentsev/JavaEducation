package lr5;

public class task1 {

    private char ch;

    public void set(char newValue) {
        ch = newValue;
    }

    public int getCode() {
        return (int) ch;
    }

    public void description() {
        System.out.printf("Буква: %c (код: %d)", ch, getCode());
        // В данном случае символы %d обозначают спецификатор, вместо которого подставляет один из аргументов.
        // Спецификаторов и соответствующих им аргументов может быть множество. В данном случае у нас только два аргумента,
        // поэтому вместо первого %d подставляет значение переменной x, а вместо второго - значение переменной y.

        // Сама буква d означает, что данный спецификатор будет использоваться для вывода целочисленных значений

        // Кроме спецификатора %d мы можем использовать еще ряд спецификаторов для других типов данных
        // %x для вывода шестнадцатеричных чисел
        // %f для вывода чисел с плавающей точкой
        // %e для вывода чисел в экспоненциальной форме
        // %c для вывода одиночного символа
        // %s для вывода строковых значений
    }

    public static void main(String[] args) {
        task1 one = new task1();
        one.set('6');
        one.description();
    }

}
