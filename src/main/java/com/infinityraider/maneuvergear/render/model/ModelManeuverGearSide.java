package com.infinityraider.maneuvergear.render.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelManeuverGearSide extends ModelBase {
    private ResourceLocation texture = new ResourceLocation("3d_maneuver_gear:textures/models/3d_gear_side.png");

    ModelRenderer BladeHolderBack;
    ModelRenderer BladeHolderBottom;
    ModelRenderer BladeHolderTop;
    ModelRenderer BladeHolderPanel1;
    ModelRenderer BladeHolderPanel2;
    ModelRenderer BladeHolderPanel3;
    ModelRenderer BladeHolderPanel4;
    ModelRenderer BladeHolderPanel5;
    ModelRenderer GasFlask;
    ModelRenderer GasFlaskNozzle;
    ModelRenderer GasFlaskValve;
    ModelRenderer Binding1Top;
    ModelRenderer Binding1Bottom;
    ModelRenderer Binding1Left;
    ModelRenderer Binding1Right;
    ModelRenderer Binding2Top;
    ModelRenderer Binding2Left;
    ModelRenderer Binding2Right;
    ModelRenderer Binding2Bottom;
    ModelRenderer Binding3Top;
    ModelRenderer Binding3Left;
    ModelRenderer Binding3Right;
    ModelRenderer Binding3Bottom;
    ModelRenderer DecalLeft1;
    ModelRenderer DecalLeft2;
    ModelRenderer DecalRight1;
    ModelRenderer DecalRight2;
    ModelRenderer DecalBottom;

    public ModelManeuverGearSide()  {
        textureWidth = 256;
        textureHeight = 256;
        BladeHolderBack = new ModelRenderer(this, 0, 0);
        BladeHolderBack.addBox(0F, 0F, 0F, 18, 26, 2);
        BladeHolderBack.setRotationPoint(-9F, -2F, 60F);
        BladeHolderBack.setTextureSize(256, 256);
        BladeHolderBack.mirror = true;
        setRotation(BladeHolderBack, 0F, 0F, 0F);
        BladeHolderBottom = new ModelRenderer(this, 0, 0);
        BladeHolderBottom.addBox(0F, 0F, 0F, 18, 2, 80);
        BladeHolderBottom.setRotationPoint(-9F, 22F, -20F);
        BladeHolderBottom.setTextureSize(256, 256);
        BladeHolderBottom.mirror = true;
        setRotation(BladeHolderBottom, 0F, 0F, 0F);
        BladeHolderTop = new ModelRenderer(this, 0, 0);
        BladeHolderTop.addBox(0F, 0F, 0F, 18, 2, 80);
        BladeHolderTop.setRotationPoint(-9F, -2F, -20F);
        BladeHolderTop.setTextureSize(256, 256);
        BladeHolderTop.mirror = true;
        setRotation(BladeHolderTop, 0F, 0F, 0F);
        BladeHolderPanel1 = new ModelRenderer(this, 0, 0);
        BladeHolderPanel1.addBox(0F, 0F, 0F, 2, 22, 80);
        BladeHolderPanel1.setRotationPoint(-9F, 0F, -20F);
        BladeHolderPanel1.setTextureSize(256, 256);
        BladeHolderPanel1.mirror = true;
        setRotation(BladeHolderPanel1, 0F, 0F, 0F);
        BladeHolderPanel2 = new ModelRenderer(this, 0, 0);
        BladeHolderPanel2.addBox(0F, 0F, 0F, 2, 22, 80);
        BladeHolderPanel2.setRotationPoint(-5F, 0F, -20F);
        BladeHolderPanel2.setTextureSize(256, 256);
        BladeHolderPanel2.mirror = true;
        setRotation(BladeHolderPanel2, 0F, 0F, 0F);
        BladeHolderPanel3 = new ModelRenderer(this, 0, 0);
        BladeHolderPanel3.addBox(0F, 0F, 0F, 2, 22, 80);
        BladeHolderPanel3.setRotationPoint(-1F, 0F, -20F);
        BladeHolderPanel3.setTextureSize(256, 256);
        BladeHolderPanel3.mirror = true;
        setRotation(BladeHolderPanel3, 0F, 0F, 0F);
        BladeHolderPanel4 = new ModelRenderer(this, 0, 0);
        BladeHolderPanel4.addBox(0F, 0F, 0F, 2, 22, 80);
        BladeHolderPanel4.setRotationPoint(3F, 0F, -20F);
        BladeHolderPanel4.setTextureSize(256, 256);
        BladeHolderPanel4.mirror = true;
        setRotation(BladeHolderPanel4, 0F, 0F, 0F);
        BladeHolderPanel5 = new ModelRenderer(this, 0, 0);
        BladeHolderPanel5.addBox(0F, 0F, 0F, 2, 22, 80);
        BladeHolderPanel5.setRotationPoint(7F, 0F, -20F);
        BladeHolderPanel5.setTextureSize(256, 256);
        BladeHolderPanel5.mirror = true;
        setRotation(BladeHolderPanel4, 0F, 0F, 0F);
        GasFlask = new ModelRenderer(this, 0, 104);
        GasFlask.addBox(0F, 0F, 0F, 10, 6, 74);
        GasFlask.setRotationPoint(-5F, -8F, -12F);
        GasFlask.setTextureSize(256, 256);
        GasFlask.mirror = true;
        setRotation(GasFlask, 0F, 0F, 0F);
        GasFlaskNozzle = new ModelRenderer(this, 120, 0);
        GasFlaskNozzle.addBox(0F, 0F, 0F, 2, 2, 2);
        GasFlaskNozzle.setRotationPoint(-1F, -6F, -14F);
        GasFlaskNozzle.setTextureSize(256, 256);
        GasFlaskNozzle.mirror = true;
        setRotation(GasFlaskNozzle, 0F, 0F, 0F);
        GasFlaskValve = new ModelRenderer(this, 120, 6);
        GasFlaskValve.addBox(0F, 0F, 0F, 7, 2, 2);
        GasFlaskValve.setRotationPoint(-3.5F, -6F, -16F);
        GasFlaskValve.setTextureSize(256, 256);
        GasFlaskValve.mirror = true;
        setRotation(GasFlaskValve, 0F, 0F, 0F);
        Binding1Top = new ModelRenderer(this, 0, 32);
        Binding1Top.addBox(0F, 0F, 0F, 18, 1, 4);
        Binding1Top.setRotationPoint(-9F, -3F, -17F);
        Binding1Top.setTextureSize(256, 256);
        Binding1Top.mirror = true;
        setRotation(Binding1Top, 0F, 0F, 0F);
        Binding1Bottom = new ModelRenderer(this, 0, 32);
        Binding1Bottom.addBox(0F, 0F, 0F, 18, 1, 4);
        Binding1Bottom.setRotationPoint(-9F, 24F, -17F);
        Binding1Bottom.setTextureSize(256, 256);
        Binding1Bottom.mirror = true;
        setRotation(Binding1Bottom, 0F, 0F, 0F);
        Binding1Left = new ModelRenderer(this, 46, 0);
        Binding1Left.addBox(0F, 0F, 0F, 1, 28, 4);
        Binding1Left.setRotationPoint(-10F, -3F, -17F);
        Binding1Left.setTextureSize(256, 256);
        Binding1Left.mirror = true;
        setRotation(Binding1Left, 0F, 0F, 0F);
        Binding1Right = new ModelRenderer(this, 46, 0);
        Binding1Right.addBox(0F, 0F, 0F, 1, 28, 4);
        Binding1Right.setRotationPoint(9F, -3F, -17F);
        Binding1Right.setTextureSize(256, 256);
        Binding1Right.mirror = true;
        setRotation(Binding1Right, 0F, 0F, 0F);
        Binding2Top = new ModelRenderer(this, 0, 50);
        Binding2Top.addBox(0F, 0F, 0F, 20, 7, 4);
        Binding2Top.setRotationPoint(-10F, -9F, 4F);
        Binding2Top.setTextureSize(256, 256);
        Binding2Top.mirror = true;
        setRotation(Binding2Top, 0F, 0F, 0F);
        Binding2Left = new ModelRenderer(this, 59, 0);
        Binding2Left.addBox(0F, 0F, 0F, 1, 27, 4);
        Binding2Left.setRotationPoint(-10F, -2F, 4F);
        Binding2Left.setTextureSize(256, 256);
        Binding2Left.mirror = true;
        setRotation(Binding2Left, 0F, 0F, 0F);
        Binding2Right = new ModelRenderer(this, 59, 0);
        Binding2Right.addBox(0F, 0F, 0F, 1, 27, 4);
        Binding2Right.setRotationPoint(9F, -2F, 4F);
        Binding2Right.setTextureSize(256, 256);
        Binding2Right.mirror = true;
        setRotation(Binding2Right, 0F, 0F, 0F);
        Binding2Bottom = new ModelRenderer(this, 0, 32);
        Binding2Bottom.addBox(0F, 0F, 0F, 18, 1, 4);
        Binding2Bottom.setRotationPoint(-9F, 24F, 4F);
        Binding2Bottom.setTextureSize(256, 256);
        Binding2Bottom.mirror = true;
        setRotation(Binding2Bottom, 0F, 0F, 0F);
        Binding3Top = new ModelRenderer(this, 0, 50);
        Binding3Top.addBox(0F, 0F, 0F, 20, 7, 4);
        Binding3Top.setRotationPoint(-10F, -9F, 50F);
        Binding3Top.setTextureSize(256, 256);
        Binding3Top.mirror = true;
        setRotation(Binding3Top, 0F, 0F, 0F);
        Binding3Left = new ModelRenderer(this, 59, 0);
        Binding3Left.addBox(0F, 0F, 0F, 1, 27, 4);
        Binding3Left.setRotationPoint(-10F, -2F, 50F);
        Binding3Left.setTextureSize(256, 256);
        Binding3Left.mirror = true;
        setRotation(Binding3Left, 0F, 0F, 0F);
        Binding3Right = new ModelRenderer(this, 59, 0);
        Binding3Right.addBox(0F, 0F, 0F, 1, 27, 4);
        Binding3Right.setRotationPoint(9F, -2F, 50F);
        Binding3Right.setTextureSize(256, 256);
        Binding3Right.mirror = true;
        setRotation(Binding3Right, 0F, 0F, 0F);
        Binding3Bottom = new ModelRenderer(this, 0, 32);
        Binding3Bottom.addBox(0F, 0F, 0F, 18, 1, 4);
        Binding3Bottom.setRotationPoint(-9F, 24F, 50F);
        Binding3Bottom.setTextureSize(256, 256);
        Binding3Bottom.mirror = true;
        setRotation(Binding3Bottom, 0F, 0F, 0F);
        DecalLeft1 = new ModelRenderer(this, 39, 53);
        DecalLeft1.addBox(0F, 0F, 0F, 1, 4, 12);
        DecalLeft1.setRotationPoint(-10F, 11F, -13F);
        DecalLeft1.setTextureSize(256, 256);
        DecalLeft1.mirror = true;
        setRotation(DecalLeft1, 0F, 0F, 0F);
        DecalLeft2 = new ModelRenderer(this, 59, 38);
        DecalLeft2.addBox(0F, 0F, 0F, 1, 15, 4);
        DecalLeft2.setRotationPoint(-10F, 10F, -1F);
        DecalLeft2.setTextureSize(256, 256);
        DecalLeft2.mirror = true;
        setRotation(DecalLeft2, 0F, 0F, 0F);
        DecalRight1 = new ModelRenderer(this, 39, 53);
        DecalRight1.addBox(0F, 0F, 0F, 1, 4, 12);
        DecalRight1.setRotationPoint(9F, 11F, -13F);
        DecalRight1.setTextureSize(256, 256);
        DecalRight1.mirror = true;
        setRotation(DecalRight1, 0F, 0F, 0F);
        DecalRight2 = new ModelRenderer(this, 59, 38);
        DecalRight2.addBox(0F, 0F, 0F, 1, 15, 4);
        DecalRight2.setRotationPoint(9F, 10F, -1F);
        DecalRight2.setTextureSize(256, 256);
        DecalRight2.mirror = true;
        setRotation(DecalRight2, 0F, 0F, 0F);
        DecalBottom = new ModelRenderer(this, 0, 40);
        DecalBottom.addBox(0F, 0F, 0F, 18, 1, 4);
        DecalBottom.setRotationPoint(-9F, 24F, -1F);
        DecalBottom.setTextureSize(256, 256);
        DecalBottom.mirror = true;
        setRotation(DecalBottom, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        Minecraft.getMinecraft().renderEngine.bindTexture(this.texture);
        setRotationAngles(entity, f, f1, f2, f3, f4, f5);
        BladeHolderBack.render(f5);
        BladeHolderBottom.render(f5);
        BladeHolderTop.render(f5);
        BladeHolderPanel1.render(f5);
        BladeHolderPanel2.render(f5);
        BladeHolderPanel3.render(f5);
        BladeHolderPanel4.render(f5);
        BladeHolderPanel5.render(f5);
        GasFlask.render(f5);
        GasFlaskNozzle.render(f5);
        GasFlaskValve.render(f5);
        Binding1Top.render(f5);
        Binding1Bottom.render(f5);
        Binding1Left.render(f5);
        Binding1Right.render(f5);
        Binding2Top.render(f5);
        Binding2Left.render(f5);
        Binding2Right.render(f5);
        Binding2Bottom.render(f5);
        Binding3Top.render(f5);
        Binding3Left.render(f5);
        Binding3Right.render(f5);
        Binding3Bottom.render(f5);
        DecalLeft1.render(f5);
        DecalLeft2.render(f5);
        DecalRight1.render(f5);
        DecalRight2.render(f5);
        DecalBottom.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}


