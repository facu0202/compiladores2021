import garage.DBFacker;
import garage.GarageDB;
import garage.GarageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDBFacker {

    @DisplayName("Garage test Mock ok")
    @Test
    void save()  {
        DBFacker dbFacker = new DBFacker();
        Object o = dbFacker.save(1,"a");
        assertEquals(o.toString(),"a");

    }

    @DisplayName("Garage test Mock dos autos ok")
    @Test
    void saveTwoCars()  {
        DBFacker dbFacker = new DBFacker();
        Object o = dbFacker.save(1,"a");
        assertEquals(o.toString(),"a");

        RuntimeException e = Assertions.assertThrows(RuntimeException.class, () -> {
            Object o2 = dbFacker.save(1,"aa");
        });
        assertEquals(e.getMessage(),"ya existe un auto en esa posicion");

    }

    @DisplayName("Garage test Mock not ok")
    @Test
    void saveWithError()  {

        RuntimeException e = Assertions.assertThrows(RuntimeException.class, () -> {
            DBFacker dbFacker = new DBFacker();
            Object o = dbFacker.save(125,"a");
        });
        assertEquals(e.getMessage(),"No existe esa posicion");

    }


}
