package twilightforest.world.components.feature.trees.growers;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import twilightforest.world.registration.features.TFTreeFeatures;

import java.util.Random;

public class TransformationTree extends AbstractTreeGrower {

	@Override
	public Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random rand, boolean largeHive) {
		return TFTreeFeatures.TRANSFORMATION_TREE;
	}
}
