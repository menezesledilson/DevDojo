package javaCore.ZZHpadroesProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonLazy {
    private static AirCraftSingletonLazy INSTANCE ;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AirCraftSingletonLazy getINSTANCE(){
        if(INSTANCE == null) {
            INSTANCE = new AirCraftSingletonLazy("787-900");
        }
        return INSTANCE;
    }
    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public Set<String> getAvailableSeats() {
        return availableSeats;
    }

    public String getName() {
        return name;
    }


}
