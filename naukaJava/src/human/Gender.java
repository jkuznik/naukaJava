package human;

public enum Gender {
    MALE(1, "m"),
    FEMALE(2, "f"),
    UNSPECIFIED(3, "u"){
        @Override
        public String comment(){
            return "To be decided later";
        }
    };

    private final int index;
    private final String description;

    Gender(int index, String description){
        this.index = index;
        this.description = description;
    }

    public int getIndex(){
        return index;
    }

    public String getDescription(){
        return description;
    }

    public String comment(){
        return index + ":" + description;
    }
}
