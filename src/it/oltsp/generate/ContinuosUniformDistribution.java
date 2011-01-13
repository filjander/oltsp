package it.oltsp.generate;

import java.util.Random;

public class ContinuosUniformDistribution implements
		ProbabilityDistributionFunction<Float> {

	@Override
	public Float getGeneratedReleaseTime(Float maxTime) {
		Random random = new Random();
		return random.nextFloat()*maxTime;
	}
}
