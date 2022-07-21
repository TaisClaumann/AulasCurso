package br.com.agendamentodentista.core.entity;

public class ConsultaEntity {
	
	
	PacienteEntity paciente;
	DentistaEntity dentista;
	private String data, hora;
	
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public PacienteEntity getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteEntity paciente) {
		this.paciente = paciente;
	}

	public DentistaEntity getDentista() {
		return dentista;
	}

	public void setDentista(DentistaEntity dentista) {
		this.dentista = dentista;
	}
	
	

	
}
