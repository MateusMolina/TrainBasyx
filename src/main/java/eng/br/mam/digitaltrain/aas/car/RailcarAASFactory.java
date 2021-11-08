package eng.br.mam.digitaltrain.aas.car;

import eng.br.mam.digitaltrain.aas.device.PneumaticBrakeAASFactory;
import eng.br.mam.digitaltrain.submodel.car.RailcarSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;

public class RailcarAASFactory extends CarAASFactory {
	private RailcarSM railcarSM;
		
	public RailcarAASFactory(ServiceSM railcarServiceSM, ServiceSM pneumaticBrakeServiceSM) {
		super(railcarServiceSM);
		this.railcarSM = new RailcarSM(new PneumaticBrakeAASFactory(pneumaticBrakeServiceSM).build()); 
		
	}	
	
	public RailcarAAS build() {
		RailcarAAS railcarAAS = new RailcarAAS(getServiceSM(),
												getStatusSM(),
												getMaintenanceSM(),
												getStateSM(),
												getRailcarSM());
		return railcarAAS;
	}
	
	public RailcarSM getRailcarSM() {
		return this.railcarSM;
	}
}
