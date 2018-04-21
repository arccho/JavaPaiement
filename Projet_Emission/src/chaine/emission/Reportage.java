package chaine.emission;

public class Reportage extends Emission implements TypeReportage {
	
	protected Documentaire Theme;
	
	public Reportage(String nom, Documentaire theme) {
		super(nom);
		Theme = theme;
	}

	public Documentaire getTheme() {
		return Theme;
	}

	public void setTheme(Documentaire theme) {
		Theme = theme;
	}
	
	public void SetInfosPlannification(PlannificationReportage infosPlannification) {
		InfosPlannification = infosPlannification;
	}
}
