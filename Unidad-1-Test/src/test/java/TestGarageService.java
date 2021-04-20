import garage.DBFacker;
import garage.GarageDB;
import garage.GarageService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.STRICT_STUBS)
public class TestGarageService {

    private static final Logger logger = LoggerFactory.getLogger(TestGarageService.class);


    @Mock GarageDB garage;
    @DisplayName("Garage test Mock ok")
    @Test
    void garage()  {
        String patente="AEI123";
        Mockito.lenient().when(garage.save(1,patente)).thenReturn(patente);
        GarageService garageService = new GarageService(garage);
        String result = garageService.park(1,patente);
        assertEquals(result, patente);
    }





    @DisplayName("Garage test not ok")
    @Test
    void garageError(){
        String patente="AEI123";
        Mockito.lenient().when(garage.save(1,patente)).thenReturn(patente);
        GarageService garageService = new GarageService(garage);
        String result = garageService.park(1,patente);
        assertEquals(result, patente);
    }

    @DisplayName("Garage test Exception")
    @Test
    void garageException() {
        String patente="AEI123";
        Mockito.lenient().when(garage.save(1,patente)).thenThrow(new RuntimeException("Ouch!"));

        RuntimeException e = Assertions.assertThrows(RuntimeException.class, () -> {
            GarageService garageService = new GarageService(garage);
            String result = garageService.park(1,patente);
            assertEquals(result, patente);
        });
        assertEquals(e.getMessage(),"Ouch!");
    }

}
