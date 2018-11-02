package us.matt;

public enum Priority {
    HIGH("High"), MEDIUM("Medium"), LOW("Low");

    private final String name;
    private Priority(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }

    }
