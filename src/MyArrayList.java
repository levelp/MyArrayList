public class MyArrayList {

    private String[] data = {};

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

    private String get(int i) {
        return data[i];
    }

    private int size() {
        return data.length;
    }

    private void add(String s) {
        // Добавляем в массив строк
        String[] newData = new String[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        newData[data.length] = s;
        data = newData;
    }
}
