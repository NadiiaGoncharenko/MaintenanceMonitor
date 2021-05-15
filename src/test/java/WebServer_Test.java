import at.huber.swlcm.maintenancemonitor.controllers.MaintenanceMonitorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static at.huber.swlcm.maintenancemonitor.controllers.MaintenanceMonitorController.status;

public class WebServer_Test {
    @Test
    public void testDefaultOnStartup(){
        MaintenanceMonitorController mcDefault = new MaintenanceMonitorController();

        // arrange
        mcDefault.setStatus("-");
        String expected = ("-");

        // act
        Response actual = mcDefault.getStatus();

        // assert
        Assertions.assertEquals(expected, actual.getEntity().toString());
    }

    //POST-Test
    @Test
    public void test_Given_WeWantToSetAMessage_When_CallingFunctionSetMessage_Then_SetMessageShouldHaveReplacedThePreviousMessage() {
        //arrange

        //act
        String actual = MaintenanceMonitorController.setStatus("Error");

        //assert
        Assertions.assertEquals("Error", actual);
    }

    //DELETE-Test
    @Test
    public void test_Given_WantToResetAMessage_When_WeReset_Then_WeExpectTheDefaultMessageToBeSet() {
        //arrange
        status = "asdf";
        //act
        String actual = MaintenanceMonitorController.reset();

        //assert
        Assertions.assertEquals("-", actual);
    }
}
