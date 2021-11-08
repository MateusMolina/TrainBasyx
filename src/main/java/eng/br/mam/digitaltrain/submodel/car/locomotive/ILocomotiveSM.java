package eng.br.mam.digitaltrain.submodel.car.locomotive;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;

import eng.br.mam.digitaltrain.aas.device.compressor.ICompressorAAS;
import eng.br.mam.digitaltrain.aas.device.engine.IEngineAAS;

public interface ILocomotiveSM extends ISubmodel{
	
	public ICompressorAAS getCompressor();
	public IEngineAAS getEngine();

}
