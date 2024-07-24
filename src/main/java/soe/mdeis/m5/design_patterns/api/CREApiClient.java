package soe.mdeis.m5.design_patterns.api;

import soe.mdeis.m5.design_patterns.model.CREUser;

import java.util.HashMap;
import java.util.Map;

public class CREApiClient {

    public Map<Integer, CREUser> getCREUsersMap(){
        Map<Integer, CREUser> map = new HashMap<>();
        map.put(152, new CREUser("Daniel Nogales", "Calle las Palmas nro 123", 205d));
        map.put(158, new CREUser("Marcos Soliz", "Avenida Independencia nro 665", 315.6d));
        map.put(102, new CREUser("Juan Arispe", "Calle Sucre nro 1156", 105.9d));
        return map;
    }
}
