import constants.CardinalCompass;
import constants.PleateauConstants;
import exception.EmptyInputException;


public class PlateauCoordinates {


    public static String moveRover(String command, int x, int y, String facing, int gridSizeX, int gridSizeY) throws EmptyInputException {
        StringBuilder sb = new StringBuilder();
        CardinalCompass cardinalCompass = CardinalCompass.NORTH;

        if(command == null || command.equals("")){
            throw new EmptyInputException("You did not determine any command");

        }else if(facing == null || facing.equals("")){
            throw new EmptyInputException("You did not determine any facing point");

        } else{
            //in case of lower string input.
            command = command.toUpperCase();
            facing = facing.toUpperCase();

            //remove whitespaces
            command = command.replaceAll("\\s", "");

            for(char c : command.toCharArray()){
                if(c == PleateauConstants.Right){
                    facing = cardinalCompass.getRight(facing); //turning right

                }else if(c == PleateauConstants.Left){
                    facing = cardinalCompass.getLeft(facing);

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
            sb.append(Math.abs(x));
            sb.append(" ");
            sb.append(Math.abs(y));
            sb.append(" ");
            sb.append(facing);

            return sb.toString();
        }
    }


    public static void main(String[] args) {

    }
}
