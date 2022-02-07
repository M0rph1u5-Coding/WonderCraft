package com.valorantjay.wondercraft.client.ter;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.valorantjay.wondercraft.common.te.DisplayCaseTileEntity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class DisplayCaseTileEntityRenderer extends TileEntityRenderer<DisplayCaseTileEntity> {

	private Minecraft mc = Minecraft.getInstance();

	public DisplayCaseTileEntityRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(DisplayCaseTileEntity te, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		if (te.getItem().equals(ItemStack.EMPTY)) {
			return;
		}
		ClientPlayerEntity player = mc.player;
		int lightLevel = getLightLevel(te.getWorld(), te.getPos());

		renderItem(te.getItem(), new double[] { 0.5d, 0d, 0.5d },
				Vector3f.YP.rotationDegrees(180f - player.rotationYaw), matrixStackIn, bufferIn, partialTicks,
				combinedOverlayIn, lightLevel, 0.8f);
	}

	private void renderItem(ItemStack stack, double[] translation, Quaternion rotation, MatrixStack matrixStack,
			IRenderTypeBuffer buffer, float partialTicks, int combinedOverlay, int lightLevel, float scale) {
		matrixStack.push();
		matrixStack.translate(translation[0], translation[1], translation[2]);
		matrixStack.rotate(rotation);
		matrixStack.scale(scale, scale, scale);

		IBakedModel model = mc.getItemRenderer().getItemModelWithOverrides(stack, null, null);
		mc.getItemRenderer().renderItem(stack, ItemCameraTransforms.TransformType.GROUND, true, matrixStack, buffer,
				lightLevel, combinedOverlay, model);
		matrixStack.pop();
	}

	private int getLightLevel(World world, BlockPos pos) {
		int bLight = world.getLightFor(LightType.BLOCK, pos);
		int sLight = world.getLightFor(LightType.SKY, pos);
		return LightTexture.packLight(bLight, sLight);
	}

}