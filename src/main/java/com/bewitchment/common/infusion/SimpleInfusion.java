package com.bewitchment.common.infusion;

import com.bewitchment.api.capability.IInfusion;
import com.bewitchment.common.lib.LibMod;

import net.minecraft.util.ResourceLocation;

public class SimpleInfusion implements IInfusion {

	ResourceLocation rl, texture;
	int dimension;

	public SimpleInfusion(String name, int dim) {
		dimension = dim;
		setRegistryName(new ResourceLocation(LibMod.MOD_ID, "infusion_" + name));
	}

	@Override
	public IInfusion setRegistryName(ResourceLocation name) {
		rl = name;
		texture = new ResourceLocation(name.getResourceDomain(), "textures/gui/energy_" + name.getResourcePath() + ".png");
		return this;
	}

	@Override
	public ResourceLocation getRegistryName() {
		return rl;
	}

	@Override
	public Class<IInfusion> getRegistryType() {
		return IInfusion.class;
	}

	@Override
	public int getDimensionAffinity() {
		return dimension;
	}

	@Override
	public ResourceLocation getTexture() {
		return texture;
	}

}