package constants;

public enum CardinalCompass {
    NORTH("N", "W", "E"),
    EAST("E", "N", "S"),
    WEST("W", "S", "N"),
    SOUTH("S", "E", "W");

    private String direction;
    private String leftDirection;
    private String rightDirection;

    CardinalCompass(String direction, String leftDirection, String rightDirection){
        this.direction = direction;
        this.leftDirection = leftDirection;
        this.rightDirection = rightDirection;
    }
    public String getRight(String direction){
        for(CardinalCompass cardinalCompass : values()){
            if(cardinalCompass.direction.equals(direction)){
                return cardinalCompass.rightDirection;
            }
        }
        return direction;
    }

    public String getLeft(String direction){
        for(CardinalCompass cardinalCompass : values()){
            if(cardinalCompass.direction.equals(direction)){
                return cardinalCompass.leftDirection;
            }
        }
        return direction;
    }

}
