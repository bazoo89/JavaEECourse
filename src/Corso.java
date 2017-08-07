import java.util.Date;

public class Corso {

	private String docente = null;
	private String[] allievi = null;
	private String materia = null;
	private String aula = null;
	private Date dataInizioCorso = null;

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public String[] getAllievi() {
		return allievi;
	}

	public void setAllievi(String[] allievi) {
		this.allievi = allievi;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public Date getDataInizioCorso() {
		return dataInizioCorso;
	}

	public void setDataInizioCorso(Date dataInizioCorso) {
		this.dataInizioCorso = dataInizioCorso;
	}

}
