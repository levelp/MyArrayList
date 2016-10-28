public class MyArrayList {

    private String[] data = new String[10];
    private int size = 0; // Размер массива

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
        return size;
    }

    private void add(String s) {
        // Добавляем в массив строк
        size++;
        if (data.length < size) {
            String[] newData = new String[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size - 1] = s;
    }
}
