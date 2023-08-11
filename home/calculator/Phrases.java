package home.calculator;

public interface Phrases {

    public static String REQUEST_EXPRESSION = "Меню программы:\n" + 
        "1 справка по проведению вычислений;\n" +
        "2 произвести расчет арифметического выражения;\n" +
        "3 вывести на экран лог-файл вычислений;\n" +
        "4 завершить работу и выйти из программы.\n" +
        "Введите соответствующий номер пункта > ";
        
    public static String HELP = "Пока ничего нет (\n";
        
    public static String LOG = "Чтобы вернуться в меню нажмите <Enter>\n";
        
    public static String END = "Работа программы завершена!\n" +
        "нажмите клавишу <Enter> ";

    public static String REQUEST_OPERATION = "Введите выражение:\n";
    
    public static String ALERT_NOT_NUMBER = "Вы ввели неверное значение" +
        " или пустую строку.\n" +
        LOG;
    
    public static String ALERT_ILLEGAL_NUMBER = "Такого пункта меню не " +
        "существует\n" +
        LOG;
    


}
