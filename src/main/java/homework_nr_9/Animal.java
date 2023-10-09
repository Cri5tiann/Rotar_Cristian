package homework_nr_9;

public interface Animal {

    void Moving();

    void Eating();

    default void Sleeping(){
        System.out.println("The animal is sleeping");
    }

    static void Hunting(){
        System.out.println("The animal is hunting");
    }


}
