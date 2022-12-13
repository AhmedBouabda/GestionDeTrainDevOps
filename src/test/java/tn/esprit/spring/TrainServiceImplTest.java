package tn.esprit.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;

import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.repository.TrainRepository;
import tn.esprit.spring.repository.VoyageRepository;
import tn.esprit.spring.repository.VoyageurRepository;
import tn.esprit.spring.services.TrainServiceImpl;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static tn.esprit.spring.entities.Ville.RADES;
import static tn.esprit.spring.entities.Ville.SOUSSE;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.services.VoyageurServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TrainServiceImplTest {
    @Mock
    private VoyageurRepository VoyageurRepository;

    @Mock
    private TrainRepository trainRepository;

    @Mock
    private VoyageRepository voyageRepository;

    @InjectMocks
    private TrainServiceImpl trainService;

    @Test
    public void testAjouterTrain() {
        // création d'un objet mock train
        Train t = new Train();
        //faire l'appelle a la méthode ajouter du service
        trainService.ajouterTrain(t);
        //vérification de la méthode save du trainRepository été appelé correctment par l object mock Train
        verify(trainRepository, times(1)).save(t);
    }

    /*  @Test
      public void testTrainsEnGare() {
          // Configuration du mock voyageRepository pour retourner une liste de voyages.
          List<Voyage> voyages = new ArrayList<>();
          Voyage voyage1 = new Voyage();
          voyage1.setDateArrivee(new Date(System.currentTimeMillis() - 1000)); // arrived 1 second ago
          Voyage voyage2 = new Voyage();
          voyage2.setDateArrivee(new Date(System.currentTimeMillis() + 1000)); // will arrive in 1 second
          voyages.add(voyage1);
          voyages.add(voyage2);
          when(voyageRepository.findAll()).thenReturn(voyages);
          Train t = new Train();
          //faire l'appelle a la méthode ajouter du service
          trainService.ajouterTrain(t);

          // Capture the output that's printed by the method
          ByteArrayOutputStream outContent = new ByteArrayOutputStream();
          System.setOut(new PrintStream(outContent));

  // Call the method being tested


  // Compare the expected output with the actual output
          assertEquals("taille2\nIn Schedular After Try\nles trains sont " + voyage1.getTrain().getCodeTrain() + "\n", outContent.toString());


          // Vérifier que  la méthode print les informations correctes pour le premier voyage.
          verify(System.out).println("taille" + voyages.size());
          verify(System.out).println("In Schedular After Try");
          verify(System.out).println("les trains sont " + voyage1.getTrain().getCodeTrain());

          // Vérifiez que la méthode n'print rien pour le deuxième voyage.
          verify(System.out, never()).println("les trains sont " + voyage2.getTrain().getCodeTrain());
          //Autrement
         // verify(voyage1, times(1)).getTrain().getCodeTrain();
          //verify(voyage2, times(0)).getTrain().getCodeTrain()
      }*/
   /* @Test
    public void testAffecterTrainAVoyageur() {
        // setup test data
        Long idVoyageur = 1L;
        Ville nomGareDepart = RADES;
        Ville nomGareArrivee = SOUSSE;
        double heureDepart = 12.00;
        Voyageur expectedVoyageur = new Voyageur();
        Voyage expectedVoyage = new Voyage();
        expectedVoyage.getMesVoyageurs().add(expectedVoyageur);
        expectedVoyage.getTrain().setNbPlaceLibre(expectedVoyage.getTrain().getNbPlaceLibre() - 1);


        // call method under test
        trainService.affecterTainAVoyageur(idVoyageur, nomGareDepart, nomGareArrivee, heureDepart);

        // verify that the expected voyage has been saved to the repository
        verify(voyageRepository, times(1)).save(expectedVoyage);
    }*/
}
//test Jenkins webhook
