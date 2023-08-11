package home.calculator;

/** Интерфейс хранит текстовые сообщения в виде констант */
public interface Phrases {

    public static String REQUEST_EXPRESSION = "Меню программы:\n" + 
        "1 справка по проведению вычислений;\n" +
        "2 произвести расчет арифметического выражения;\n" +
        "3 вывести на экран лог-файл вычислений;\n" +
        "4 завершить работу и выйти из программы.\n" +
        "Введите соответствующий номер пункта > ";
        
    public static String HELP = "\t\tПОМОЩЬ\n\n" +
        "В калькуляторе нужно вводить выражения целиком.\n" +
        "Допускается разделение элементов пробелами.\n" +
        "Например:\n\t\t3.0-1.5\n\t\t8.4 / 2\n" +
        "Внимание: целая часть отделяется от дробной ТОЧКОЙ!\n" +
        "В данной версии программы можно вычислить\n" +
        "только выражения из двух чисел\n\n" +
        "После ввода выражения нажать <Enter>";

    public static String LOG = "Здесь пока ничего нет (\n";
        
    public static String PRESS_ENT = "Чтобы вернуться в меню нажмите <Enter>\n";
        
    public static String END = "Работа программы завершена!\n" +
        "нажмите клавишу <Enter> ";

    public static String REQUEST_OPERATION = "Введите выражение:\n";
    
    public static String ALERT_NOT_NUMBER = "Вы ввели неверное значение" +
        " или пустую строку.\n" +
        PRESS_ENT;
    
    public static String ALERT_ILLEGAL_NUMBER = "Такого пункта меню не " +
        "существует\n" +
        PRESS_ENT;
        
    public static String ALERT_DIV_BY_ZERO = "Делить на 0 нельзя!\n" +
        PRESS_ENT;
    
    public static String RESULT = " = ";
    
    public static String ALERT_LOOSE_OPERAND = "Не достаточно данных!\n" +
        PRESS_ENT;

}
