package voronoiaoc.byg.common.world.feature.features.overworld.trees.enchanted.green;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ModifiableTestableWorld;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;

public class GreenEnchantedTree1 extends BYGAbstractTreeFeature<DefaultFeatureConfig> {

    public GreenEnchantedTree1(Codec<DefaultFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, StructureWorldAccess worldIn, Random rand, BlockPos pos, BlockBox boundsIn, boolean isSapling) {
        int randTreeHeight = 19 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getDimensionHeight()) {

            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {
                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    this.treeLog(changedBlocks, worldIn, mainmutable, boundsIn);

                    mainmutable.move(Direction.UP);
                }
                mainmutable.set(pos);

                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 16, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 15, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 15, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 15, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 14, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 14, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 13, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 13, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 12, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 12, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 11, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 11, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 11, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 10, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 9, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 9, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 9, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 8, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 8, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 8, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 8, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 7, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 7, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 6, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 6, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 5, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 5, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 4, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 3, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 16, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 16, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 16, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 16, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 15, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 15, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 15, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 15, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 15, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 15, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 15, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 15, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 15, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 15, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 15, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 15, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 15, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 14, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 14, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 14, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 13, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 12, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, randTreeHeight - 12, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 12, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 12, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 12, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 12, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 11, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 11, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 11, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 11, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 11, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 10, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 10, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 9, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, randTreeHeight - 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 9, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5, randTreeHeight - 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, randTreeHeight - 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 9, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 9, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 9, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 9, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 9, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 9, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 8, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 8, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 8, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 8, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 8, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 8, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 8, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 8, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 8, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 8, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, randTreeHeight - 8, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 8, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 8, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 7, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 7, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 7, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 7, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 6, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 6, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 6, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 6, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 5, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 5, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 5, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 5, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 4, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, randTreeHeight - 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 4, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5, randTreeHeight - 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, randTreeHeight - 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4, randTreeHeight - 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3, randTreeHeight - 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 1, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight - 1, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, randTreeHeight - 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, randTreeHeight, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, randTreeHeight, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, randTreeHeight + 1, 0), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, StructureWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.GREEN_ENCHANTED_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, StructureWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.GREEN_ENCHANTED_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, StructureWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        BlockPos.Mutable blockpos = new BlockPos.Mutable().set(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos, BYGBlockList.GREEN_ENCHANTED_LEAVES.getDefaultState(), boundingBox);
        }
    }


    private boolean doesTreeFit(ModifiableTestableWorld reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canLogPlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}