package eng.br.mam.digitaltrain.car.aas.railcar;

import eng.br.mam.digitaltrain.car.aas.CarAASFactory;
import eng.br.mam.digitaltrain.car.submodel.railcar.RailcarSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.device.aas.pneumaticbrake.PneumaticBrakeAASFactory;

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
