

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven Pineda
 */
import java.util.Arrays;
import java.util.List;


public class main {


    public static void main(String[] args) {
        Pais Colombia = new Pais("Colombia");
        Departamento Ama = new Departamento("Amazonas");
        Departamento Ant = new Departamento("Antioquia");
        Departamento Ara = new Departamento("Arauca");
        Departamento Atl = new Departamento("Atlantico");
        Departamento Bol = new Departamento("Bolivar");
        Departamento Boy = new Departamento("Boyaca");
        Departamento Cal = new Departamento("Caldas");
        Departamento Caq = new Departamento("Caqueta");
        Departamento Cas = new Departamento("Casanare");
        Departamento Cau = new Departamento("Cauca");
        Departamento Ces = new Departamento("Cesar");
        Departamento Cho = new Departamento("Choco");
        Departamento Cor = new Departamento("Cordoba");
        Departamento Cun = new Departamento("Cundinamarca");
        Departamento Guai = new Departamento("Guainia");
        Departamento Guav = new Departamento("Guaviare");
        Departamento Guaj = new Departamento("Guajira");
        Departamento Hui = new Departamento("Huila");
        Departamento Mag = new Departamento("Magdalena");
        Departamento Met = new Departamento("Meta");
        Departamento Nar = new Departamento("Nariño");
        Departamento Nor = new Departamento("Norte de Santander");
        Departamento Put = new Departamento("Putumayo");
        Departamento Qui = new Departamento("Quindio");
        Departamento Ris = new Departamento("Risaralda");
        Departamento San = new Departamento("Santander");
        Departamento Suc = new Departamento("Sucre");
        Departamento Tol = new Departamento("Tolima");
        Departamento Val = new Departamento("Valle");
        Departamento Vau = new Departamento("Vaupes");
        Departamento Vic = new Departamento("Vichada");
        Ama.setVecinos(Arrays.asList(Put,Caq,Vau));
        Ant.setVecinos(Arrays.asList(Cor,Bol,San,Boy,Cal,Ris,Cho));
        Ara.setVecinos(Arrays.asList(Boy,Cas,Vic));
        Atl.setVecinos(Arrays.asList(Mag,Bol));
        Bol.setVecinos(Arrays.asList(Mag,Atl,Ces,San,Ant,Suc,Cor));
        Boy.setVecinos(Arrays.asList(Ant,San,Ara,Cas,Cun,Nor));
        Cal.setVecinos(Arrays.asList(Ris,Ant,Cun,Tol));
        Caq.setVecinos(Arrays.asList(Put,Cau,Hui,Met,Guav,Vau,Ama));
        Cas.setVecinos(Arrays.asList(Boy,Ara,Vic,Met));
        Cau.setVecinos(Arrays.asList(Nar,Put,Caq,Hui,Tol,Val));
        Ces.setVecinos(Arrays.asList(Guaj,Mag,Bol,San,Nor));
        Cho.setVecinos(Arrays.asList(Ant,Ris,Val));
        Cor.setVecinos(Arrays.asList(Suc,Ant,Bol));
        Cun.setVecinos(Arrays.asList(Cal,Boy,Met,Tol,Hui));
        Guai.setVecinos(Arrays.asList(Vic,Guav,Vau));
        Guav.setVecinos(Arrays.asList(Caq,Vic,Vau,Guai,Met));
        Guaj.setVecinos(Arrays.asList(Mag,Ces));
        Hui.setVecinos(Arrays.asList(Tol,Cun,Met,Caq,Cau));
        Mag.setVecinos(Arrays.asList(Atl,Bol,Ces,Guaj));
        Met.setVecinos(Arrays.asList(Hui,Cun,Cas,Vic,Guav,Caq));
        Nar.setVecinos(Arrays.asList(Cau,Put));
        Nor.setVecinos(Arrays.asList(Ces,San,Boy));
        Put.setVecinos(Arrays.asList(Nar,Cau,Caq,Ama));
        Qui.setVecinos(Arrays.asList(Ris,Val,Tol));
        Ris.setVecinos(Arrays.asList(Cho,Ant,Cal,Tol,Qui,Val));
        San.setVecinos(Arrays.asList(Ant,Bol,Ces,Nor,Boy));
        Suc.setVecinos(Arrays.asList(Bol,Cor));
        Tol.setVecinos(Arrays.asList(Val,Qui,Ris,Cal,Cun,Hui,Cau));
        Val.setVecinos(Arrays.asList(Cho,Ris,Qui,Tol,Cau));
        Vau.setVecinos(Arrays.asList(Guai,Guav,Caq,Ama));
        Vic.setVecinos(Arrays.asList(Ara,Cas,Met,Guav,Guai));

        Colombia.setDptos(Arrays.asList(Ama,Ant,Ara,Atl,Bol,Boy,Cal,Caq,Cas,Cau,Ces,Cho,Cor,Cun,Guai,Guav,Guaj,Hui,Mag,Met,Nar,Nor,Put,Qui,Ris,San,Suc,Tol,Val,Vau,Vic));
        Colombia.asignarColores();        
        Colombia.imprimirDptos();


    }

}
