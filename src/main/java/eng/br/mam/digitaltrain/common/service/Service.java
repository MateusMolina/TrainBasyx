package eng.br.mam.digitaltrain.common.service;

import org.eclipse.basyx.submodel.metamodel.map.qualifier.LangStrings;

public abstract class Service implements IService {

	private String serverAASId;
	
	private String idShort;
	

	private LangStrings description;
	
	public Service(String serverAASId) {
		this.serverAASId = serverAASId;
	}

	public Service(String serverAASId, String idShort, LangStrings description) {
		this.serverAASId = serverAASId;
		setIdShort(idShort);
		setDescription(description);
	}
	
	@Override
	public String getServerAASId() {
		return serverAASId;
	}
	
	@Override
	public String getIdShort() {
		return idShort;
	}

	@Override
	public LangStrings getDescription() {
		return description;
	}

	public void setIdShort(String idShort) {
		this.idShort = idShort;
	}
	public void setDescription(LangStrings description) {
		this.description = description;
	}

}
