package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NahodneCisloService {
    
    private final Random randomGenerator = new Random();

    public NahodneCisloService() {
    }

    public int dejNahodneCislo(int horniMez) {
        int nahodneCislo = randomGenerator.nextInt(horniMez);
        return nahodneCislo;
    }

}
