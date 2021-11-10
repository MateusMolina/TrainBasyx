package eng.br.mam.digitaltrain.car.submodel.locomotive;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;

import eng.br.mam.digitaltrain.component.aas.compressor.ICompressorAAS;
import eng.br.mam.digitaltrain.component.aas.engine.IEngineAAS;

public interface ILocomotiveSM extends ISubmodel{
	
	public ICompressorAAS getCompressor();
	public IEngineAAS getEngine();

}