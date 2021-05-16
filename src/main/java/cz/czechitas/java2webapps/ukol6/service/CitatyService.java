package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CitatyService {

    private final NahodneCisloService nahodneCisloService;
    private final CitatyRepository citatyRepository;

    @Autowired
    public CitatyService(NahodneCisloService nahodneCisloService, CitatyRepository citatyRepository) {
        this.nahodneCisloService = nahodneCisloService;
        this.citatyRepository = citatyRepository;
    }

    public String nahodnyCitat() {
        int cislo = nahodneCisloService.dejNahodneCislo(citatyRepository.pocet());
        String vybranyCitat = citatyRepository.citat(cislo);
        return vybranyCitat;
    }

}

   //Controller bude přímo používat službu CitatyService. V té bude jedna metoda (v případě bonusového úkolu dvě metody).
   //Metoda nahodnyCitat() bude vracet String – text náhodného citátu. V kódu této metody se použijí dvě následující služby.