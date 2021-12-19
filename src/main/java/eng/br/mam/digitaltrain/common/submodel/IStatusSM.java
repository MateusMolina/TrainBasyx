package eng.br.mam.digitaltrain.common.submodel;

public interface IStatusSM {
	
	enum Status {
		IDLE,
		OPERATING,
		FAILED
	}
	
	public void setStatus(Status status);
	
	public String getStatus();
}
