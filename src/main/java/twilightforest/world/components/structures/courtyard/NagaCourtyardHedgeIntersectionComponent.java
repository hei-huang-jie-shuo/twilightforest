package twilightforest.world.components.structures.courtyard;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import twilightforest.TwilightForestMod;
import twilightforest.world.registration.TFFeature;

public class NagaCourtyardHedgeIntersectionComponent extends NagaCourtyardHedgeAbstractComponent {
    public NagaCourtyardHedgeIntersectionComponent(StructurePieceSerializationContext ctx, CompoundTag nbt) {
        super(ctx, NagaCourtyardPieces.TFNCIs, nbt, new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_intersection"), new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_intersection_big"));
    }

    public NagaCourtyardHedgeIntersectionComponent(TFFeature feature, int i, int x, int y, int z, Rotation rotation) {
        super(NagaCourtyardPieces.TFNCIs, feature, i, x, y, z, rotation, new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_intersection"), new ResourceLocation(TwilightForestMod.ID, "courtyard/hedge_intersection_big"));
    }
}
