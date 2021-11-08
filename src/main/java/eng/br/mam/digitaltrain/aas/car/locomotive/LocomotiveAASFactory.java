package eng.br.mam.digitaltrain.aas.car.locomotive;

import eng.br.mam.digitaltrain.aas.car.CarAASFactory;
import eng.br.mam.digitaltrain.aas.device.compressor.CompressorAASFactory;
import eng.br.mam.digitaltrain.aas.device.engine.EngineAASFactory;
import eng.br.mam.digitaltrain.submodel.car.locomotive.LocomotiveSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;

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
