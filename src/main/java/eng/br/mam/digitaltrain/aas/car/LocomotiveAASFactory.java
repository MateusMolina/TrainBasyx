package eng.br.mam.digitaltrain.aas.factory.car;

import eng.br.mam.digitaltrain.aas.factory.device.CompressorAASFactory;
import eng.br.mam.digitaltrain.aas.factory.device.EngineAASFactory;
import eng.br.mam.digitaltrain.aas.map.car.LocomotiveAAS;
import eng.br.mam.digitaltrain.submodel.map.car.LocomotiveSM;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;

public class LocomotiveAASFactory extends CarAASFactory {
	private LocomotiveSM locomotiveSM;
		
	public LocomotiveAASFactory(ServiceSM locomotiveServiceSM, ServiceSM compressorServiceSM, ServiceSM engineServiceSM) {
		super(locomotiveServiceSM);
		this.locomotiveSM = new LocomotiveSM(new CompressorAASFactory(compressorServiceSM).build(),
										new EngineAASFactory(engineServiceSM).build()); 
		
	}	
	
	public LocomotiveAAS build() {
		LocomotiveAAS locomotiveAAS = new LocomotiveAAS(getServiceSM(),
												getStatusSM(),
												getMaintenanceSM(),
												getStateSM(),
												getLocomotiveSM());
		return locomotiveAAS;
	}
	
	public LocomotiveSM getLocomotiveSM() {
		return this.locomotiveSM;
	}
}
