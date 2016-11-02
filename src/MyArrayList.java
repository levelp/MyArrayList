public class MyArrayList {

    // Массив для хранения элементов
    private String[] data = new String[10];
    private int size = 0; // Размер массива

    // Тестирование работы нашего класса
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        // TDD: Test Driven Development
        // Добавление элемента в конец и по индексу
        list.add("Первая строка");
        System.out.println("list.data[0] = " + list.data[0]);
        list.add("Вторая строка");
        System.out.println("list.data[1] = " + list.data[1]);
        // Вывод текущего количества элементов
        System.out.println("list.size() = " + list.size());
        list.add("Третья строка");
        // Вывод всех строк
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " +
                    list.get(i));
        }
    }

    // Метод для получения элемента по индексу
    String get(int i) {
        return data[i];
    }

    // Получение размера массива извне
    int size() {
        return size;
    }

    // Добавление нового элемента (новой строки)
    void add(String s) {
        size++; // Увеличиваем количество элементов
        // Если массив меньше, чем количество элементов
        if (data.length < size) {
            // Создаём новый массив большего размера
            String[] newData = new String[2 * data.length];
            // Копируем элементы из старого массива в новый
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            // Заменяем старый массив на новый
            data = newData;
        }
        // Записываем новый элемент в нужную позицию
        data[size - 1] = s;
    }
}
