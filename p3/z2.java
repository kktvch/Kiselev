package p3;
class DoubleWrapper {
    public static void main(String[] args) {

        // 1. Создание объекта Double с использованием valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.71");

        // 2. Преобразование значения типа String к типу double
        String strNumber = "5.67";
        double parsedValue = Double.parseDouble(strNumber);

        // 3. Преобразование объекта Double к примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        int intValue = doubleObj1.intValue();
        float floatValue = doubleObj1.floatValue();
        long longValue = doubleObj1.longValue();

        // 4. Вывод значения объекта Double на консоль
        System.out.println("Значение doubleObj1: " + doubleObj1);

        // 5. Преобразование литерала типа double к строке
        String d = Double.toString(3.14);
        System.out.println("Преобразованная строка: " + d);

        // Дополнительно — вывод всех примитивных представлений
        System.out.println("intValue: " + intValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("longValue: " + longValue);
        System.out.println("parsedValue из строки: " + parsedValue);
    }
}
