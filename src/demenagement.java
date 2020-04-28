
public class demenagement {
	public static void main(String[] args) {
		int ancien_locaux = 34;
		int camion = 0;
		int camion_max = 9;
		int nouveaux_locaux = 0;
		
		while(ancien_locaux > 0) {
			while (camion < camion_max && ancien_locaux > 0) {
				camion++;
				ancien_locaux--;
				
			}
			 System.out.println("Un voyage de " +camion+ " cartons");
			 nouveaux_locaux += camion;
			 System.out.println("Il y a maintenant "+ nouveaux_locaux + " cartons dans les nouveaux locaux. Et il en reste "+ ancien_locaux + " dans les anciens locaux");
			 camion = 0;
			 
		}
	}
}
