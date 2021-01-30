public class Task1 {
    public static void main(String[] args) {
        //http://megagenerator.ru/namefio/   генератор рандомных имен) Спас мозг от взрыва)
        // телефоны получается проще в String хранить?
        // System.out.println(employee1.employeeInfo());
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Каменских Ираклий Казимирович", "Директор", "kairka@mail.com", "8999888777", 500000, 50);
        persArray[1] = new Employee("Кустова Розалия Кондратьевна", "Секретарша", "Kuroku@mail.com", "8999888666", 100000, 25);
        persArray[2] = new Employee("Каменских Константин Ираклиевич", "Сын директора", "chikoel@mail.com", "8999888555", 200000, 20);
        persArray[3] = new Employee("Брынских Алексей Андреевич", "Руководитель проекта", "bralan@mail.com", "8999888444", 500000, 41);
        persArray[4] = new Employee("Железнов Венедикт Саввевич", "Несчастный программист", "gevesa@mail.com", "8999888333", 500000, 25);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println("Сотрудник старше 40: " + persArray[i].employeeInfo());
            }
        }
    }
}
