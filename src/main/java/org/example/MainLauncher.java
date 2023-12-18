package org.example;

public class MainLauncher {
    public static void main(String[] args) {
        Main main = new Main();

        // Создание курса
        main.insertCourse();

        // Получение курса
        Course course = main.getCourse(1L);
        System.out.println(course);

        // Обновление курса
        course.setTitle("Updated Title");
        main.updateCourse(course);

        // Получение обновленного курса
        Course updatedCourse = main.getCourse(1L);
        System.out.println(updatedCourse);

        // Удаление курса
        main.deleteCourse(1L);

        // Попытка получить удаленный курс
        Course deletedCourse = main.getCourse(1L);
        System.out.println(deletedCourse); // null

    }
}
