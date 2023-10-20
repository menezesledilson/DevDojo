package javaCore.ZZHpadroesProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonEager {
    private static  final  AirCraftSingletonEager INSTANCE = new AirCraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AirCraftSingletonEager getINSTANCE(){
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
