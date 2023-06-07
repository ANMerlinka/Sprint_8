public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if ( name.length() >= 3 && name.length() <= 19 )
            if ( name.split(" ").length - 1 == 1 )
                if ( !name.startsWith(" ") && !name.endsWith(" "))
                    return true;
                else
                    return false;
            else
                return false;
        else
            return false;

    }

}