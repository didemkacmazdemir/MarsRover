import constants.PleateauConstants;

public class PlateauCoordinates {


    public static String moveRover(String command, int x, int y, String facing, int gridSizeX, int gridSizeY){
        StringBuffer bf = new StringBuffer();

        if(command == null){
            System.out.println("There should be a direction command");
            return "";
        }
        for(char c : command.toCharArray()){
            if(c == PleateauConstants.Right){
                facing = turnRight(facing); //spin 90 degrees right, change direction with the next cardinal compass point.

            }else if(c == PleateauConstants.Left){
                facing = turnLeft(facing); //spin 90 degrees left, change direction with the next cardinal compass point.

            // Move one grid point determined direction, if the direction is in the negative plane, extract one grid point
            // also adding control of not going beyond the determined terrain, if terrain's upper point is 5, rover can not go beyond 5. The max space must be 5.
            }else if(c == PleateauConstants.Move){
                if(facing.equals(PleateauConstants.North) && y < gridSizeY){
                    y += 1;
                }else if(facing.equals(PleateauConstants.East) && x < gridSizeX){
                    x += 1;
                }else if(facing.equals(PleateauConstants.West) && Math.abs(x) < gridSizeX){ //there can be option that rover can go opposite direction so i used abs method to avoid negative value.
                    x -= 1;
                }else if(facing.equals(PleateauConstants.South) && Math.abs(y)  < gridSizeY){
                    y -= 1;
                }
            }
        }
        //concat result
        bf.append(Math.abs(x));
        bf.append(" ");
        bf.append(Math.abs(y));
        bf.append(" ");
        bf.append(facing);

        return bf.toString();
    }

    public static String turnRight(String direction){
        if(direction.equals(PleateauConstants.North)){
            return PleateauConstants.East;
        }else if(direction.equals(PleateauConstants.East)){
            return PleateauConstants.South;
        }else if(direction.equals(PleateauConstants.South)){
            return PleateauConstants.West;
        }else{
            return PleateauConstants.North;
        }
    }

    public static String turnLeft(String direction){
        if(direction.equals(PleateauConstants.North)){
            return PleateauConstants.West;
        }else if(direction.equals(PleateauConstants.West)){
            return PleateauConstants.South;
        }else if(direction.equals(PleateauConstants.South)){
            return PleateauConstants.East;
        }else{
            return PleateauConstants.North;
        }
    }

    public static void main(String[] args) {
        PlateauCoordinates
                .moveRover("LM", 0,0, PleateauConstants.North,5,5);
    }
}
