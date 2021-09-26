package Java_Advanced_Practice5;

import java.lang.reflect.Field;

public class CarValidator {
    private Car car;

    public void validate(Car car) {
       Field [] fields = car.getClass().getDeclaredFields();
        for (Field f: fields) {
            try {
                if (f.equals(car.getClass().getDeclaredField("model")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (car.getModel() == null || car.getModel().isEmpty()) {
                        System.out.println("Validation error: Car has empty model field");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            try {
                if (f.equals(car.getClass().getDeclaredField("power")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (car.getPower() == null) {
                        System.out.println("Validation error: Car has empty power field");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            try {
                if (f.equals(car.getClass().getDeclaredField("dateOfCreation")) && f.isAnnotationPresent(NotEmpty.class)) {
                    if (car.getDateOfCreation() == null) {
                        System.out.println("Validation error: Car has empty date field");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }


    }
}
