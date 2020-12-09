import constants.PleateauConstants;
import org.junit.Test;



import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlateauCoordinatesTest {
    @Test
    public void moveRoverTest(){
        assertThat(PlateauCoordinates
                .moveRover("LMLMLMLMM", 1,2, PleateauConstants.North,5,5), is("1 3 N"));
        assertThat(PlateauCoordinates
                .moveRover("MMRMMRMRRM", 3,3, PleateauConstants.East,5,5), is("5 1 E"));

        //Turning Tests
        assertThat(PlateauCoordinates
                .moveRover("R", 0,0, PleateauConstants.North,5,5), is("0 0 E"));
        assertThat(PlateauCoordinates
                .moveRover("L", 0,0, PleateauConstants.North,5,5), is("0 0 W"));
        assertThat(PlateauCoordinates
                .moveRover("R", 0,0, PleateauConstants.South,5,5), is("0 0 W"));
        assertThat(PlateauCoordinates
                .moveRover("L", 0,0, PleateauConstants.South,5,5), is("0 0 E"));
        assertThat(PlateauCoordinates
                .moveRover("R", 0,0, PleateauConstants.West,5,5), is("0 0 N"));
        assertThat(PlateauCoordinates
                .moveRover("L", 0,0, PleateauConstants.West,5,5), is("0 0 S"));
        assertThat(PlateauCoordinates
                .moveRover("R", 0,0, PleateauConstants.East,5,5), is("0 0 S"));
        assertThat(PlateauCoordinates
                .moveRover("L", 0,0, PleateauConstants.East,5,5), is("0 0 N"));

        //Turning same way more than once
        assertThat(PlateauCoordinates
                .moveRover("LLL", 0,0, PleateauConstants.North,5,5), is("0 0 E"));
        assertThat(PlateauCoordinates
                .moveRover("RRRR", 0,0, PleateauConstants.North,5,5), is("0 0 N"));

        //Mixed Diections
        assertThat(PlateauCoordinates
                .moveRover("RRL", 0,0, PleateauConstants.North,5,5), is("0 0 E"));
        assertThat(PlateauCoordinates
                .moveRover("LRL", 0,0, PleateauConstants.North,5,5), is("0 0 W"));
        //Moving
        assertThat(PlateauCoordinates
                .moveRover("M", 0,0, PleateauConstants.North,5,5), is("0 1 N"));
        assertThat(PlateauCoordinates
                .moveRover("MMM", 0,0, PleateauConstants.North,5,5), is("0 3 N"));
        assertThat(PlateauCoordinates
                .moveRover("MMMMMMMMMM", 0,0, PleateauConstants.North,5,5), is("0 5 N"));
        assertThat(PlateauCoordinates
                .moveRover("RM", 0,0, PleateauConstants.North,5,5), is("1 0 E"));
        assertThat(PlateauCoordinates
                .moveRover("RMMMMM", 0,0, PleateauConstants.North,5,5), is("5 0 E"));
        assertThat(PlateauCoordinates
                .moveRover("RMMMMMMMMMM", 0,0, PleateauConstants.North,5,5), is("5 0 E"));
        assertThat(PlateauCoordinates
                .moveRover("LM", 0,0, PleateauConstants.North,5,5), is("1 0 W"));
        assertThat(PlateauCoordinates
                .moveRover("LMMMMM", 0,0, PleateauConstants.North,5,5), is("5 0 W"));
        assertThat(PlateauCoordinates
                .moveRover("LMMMMMMMMMMM", 0,0, PleateauConstants.North,5,5), is("5 0 W"));
        assertThat(PlateauCoordinates
                .moveRover("LMMMMMMMM", 0,0, PleateauConstants.North,5,5), is("5 0 W"));
        assertThat(PlateauCoordinates
                .moveRover("LLM", 0,0, PleateauConstants.North,5,5), is("0 1 S"));
        assertThat(PlateauCoordinates
                .moveRover("LLMMMMM", 0,0, PleateauConstants.North,5,5), is("0 5 S"));
        assertThat(PlateauCoordinates
                .moveRover("LMM", 3,4, PleateauConstants.West,5,5), is("3 2 S"));
        assertThat(PlateauCoordinates
                .moveRover("LMMMMMMM", 0,0, PleateauConstants.North,10,10), is("7 0 W"));

        assertThat(PlateauCoordinates
                .moveRover("LMMMMMMMMMMMM", 0,0, PleateauConstants.North,10,10), is("10 0 W"));
    }
}
