package homework_nr_14;

public abstract class NumberGenericClass<T extends Number> {

    T value;

    public NumberGenericClass(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NumberGenericClass{" +
                "value=" + value +
                '}';
    }
}

