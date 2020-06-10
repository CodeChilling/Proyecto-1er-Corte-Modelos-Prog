/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factoryMethod.concreteEntities;

import factoryMethod.abstractEntities.Animal;
import factoryMethod.abstractEntities.Researcher;

/**
 *
 * @author jackl
 */
public class Guide implements Researcher{

    @Override
    public Animal accessToAnimalData(int index) {
        switch(index){
            case 0:
                return new AntilopeGemsbok();  
            case 1:
                return new CebraDeGrant();  
            case 2:
                return new CondorAndino();
            case 3:
                return new CotorraSerranaOccidental();
            case 4:
                return new GorilaDeTierrasBajas();  
            case 5:
                return new Hipopotamo();
            case 6:
                return new LinceRojo();
            case 7:
                return new Orangutan();
            case 8:
                return new OsoDeAntifaz();  
            case 9:
                return new OsoPolar();
            case 10:
                return new PinguinoDeHumboldt();
            case 11:
                return new TigreDeSumatra();
            default:
                return null;
        }
    }
    
}
