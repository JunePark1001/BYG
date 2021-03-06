package voronoiaoc.byg.common.properties.blocks.grassblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowerFeature;
import voronoiaoc.byg.common.properties.blocks.spreadablesnowyblocks.SpreadableSnowyMeadowDirtBlock;

import java.util.List;
import java.util.Random;

public class BYGMeadowGrassBlock extends SpreadableSnowyMeadowDirtBlock implements Fertilizable {
    public BYGMeadowGrassBlock(Settings properties) {
        super(properties);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return world.getBlockState(pos.up()).isAir();
    }

    public void grow(ServerWorld world, Random rand, BlockPos blockPos, BlockState state) {
        BlockPos blockpos = blockPos.up();
        BlockState blockstate = Blocks.GRASS.getDefaultState();

        for (int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockpos;
            int j = 0;

            while (true) {
                if (j >= i / 16) {
                    BlockState blockstate2 = world.getBlockState(blockpos1);
                    if (blockstate2.getBlock() == blockstate.getBlock() && rand.nextInt(10) == 0) {
                        ((Fertilizable) blockstate.getBlock()).grow(world, rand, blockpos1, blockstate2);
                    }

                    if (!blockstate2.isAir()) {
                        break;
                    }

                    BlockState blockstate1;
                    if (rand.nextInt(8) == 0) {
                        List<ConfiguredFeature<?, ?>> list = world.getBiome(blockpos1).getGenerationSettings().getFlowerFeatures();
                        if (list.isEmpty()) {
                            break;
                        }

                        ConfiguredFeature<?, ?> configuredFeature = ((DecoratedFeatureConfig) list.get(0).config).feature.get();
                        blockstate1 = ((FlowerFeature) configuredFeature.feature).getFlowerState(rand, blockpos1, configuredFeature.config);
                    } else {
                        blockstate1 = blockstate;
                    }

                    if (blockstate1.canPlaceAt(world, blockpos1)) {
                        world.setBlockState(blockpos1, blockstate1, 3);
                    }
                    break;
                }

                blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);
                if (world.getBlockState(blockpos1.down()).getBlock() != this || world.getBlockState(blockpos1).isFullCube(world, blockpos1)) {
                    break;
                }

                ++j;
            }
        }

    }
}