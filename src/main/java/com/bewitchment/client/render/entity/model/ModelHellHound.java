package com.bewitchment.client.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * hellhound - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelHellHound extends ModelBase {
	public ModelRenderer lFrontLeg;
	public ModelRenderer body;
	public ModelRenderer lHindLeg;
	public ModelRenderer rHindLeg;
	public ModelRenderer rFrontLeg;
	public ModelRenderer head;
	public ModelRenderer mane;
	public ModelRenderer tailWolf;
	public ModelRenderer neck;
	public ModelRenderer mane02;
	public ModelRenderer tailThin01;
	public ModelRenderer tailThin02;
	public ModelRenderer tailThin03;
	public ModelRenderer tailThin04;
	public ModelRenderer tailThin05;
	public ModelRenderer mane01;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer muzzle;
	public ModelRenderer lowerJaw;
	public ModelRenderer lHorn01a;
	public ModelRenderer rHorn01a;
	public ModelRenderer lHorn01b;
	public ModelRenderer lHorn01c;
	public ModelRenderer lHorn01d;
	public ModelRenderer lHorn02a;
	public ModelRenderer lHorn02b;
	public ModelRenderer lHorn02c;
	public ModelRenderer lHorn02d;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn04;
	public ModelRenderer lHorn05;
	public ModelRenderer lHorn06;
	public ModelRenderer lHorn07;
	public ModelRenderer lHorn08;
	public ModelRenderer rHorn01b;
	public ModelRenderer rHorn01c;
	public ModelRenderer rHorn01d;
	public ModelRenderer rHorn02a;
	public ModelRenderer rHorn02b;
	public ModelRenderer rHorn02c;
	public ModelRenderer rHorn02d;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn04;
	public ModelRenderer rHorn05;
	public ModelRenderer rHorn06;
	public ModelRenderer rHorn07;
	public ModelRenderer rHorn08;

	public ModelHellHound() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.lHorn03d = new ModelRenderer(this, 56, 0);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.8F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.tailThin01 = new ModelRenderer(this, 20, 33);
		this.tailThin01.setRotationPoint(0.0F, 1.3F, 0.4F);
		this.tailThin01.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F);
		this.lHorn03c = new ModelRenderer(this, 56, 0);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.2F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.rHorn01d = new ModelRenderer(this, 56, 0);
		this.rHorn01d.mirror = true;
		this.rHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01d.addBox(-0.8F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.rHorn02d = new ModelRenderer(this, 56, 0);
		this.rHorn02d.mirror = true;
		this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02d.addBox(-0.8F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.lFrontLeg = new ModelRenderer(this, 0, 18);
		this.lFrontLeg.setRotationPoint(1.5F, 16.0F, -3.0F);
		this.lFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lHindLeg = new ModelRenderer(this, 0, 18);
		this.lHindLeg.setRotationPoint(1.5F, 16.0F, 7.0F);
		this.lHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lHorn02c = new ModelRenderer(this, 56, 0);
		this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02c.addBox(-0.2F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.rHorn03a = new ModelRenderer(this, 56, 0);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, 0.0F, 1.7F);
		this.rHorn03a.addBox(-0.2F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rHorn03a, -0.20943951023931953F, -0.10471975511965977F, 0.0F);
		this.rHorn02b = new ModelRenderer(this, 56, 0);
		this.rHorn02b.mirror = true;
		this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02b.addBox(-0.8F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.body = new ModelRenderer(this, 18, 14);
		this.body.setRotationPoint(0.0F, 14.0F, 2.0F);
		this.body.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
		this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
		this.lEar = new ModelRenderer(this, 16, 14);
		this.lEar.setRotationPoint(2.0F, -3.0F, -2.0F);
		this.lEar.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.lHorn01d = new ModelRenderer(this, 56, 0);
		this.lHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01d.addBox(-0.8F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.tailThin02 = new ModelRenderer(this, 26, 33);
		this.tailThin02.setRotationPoint(0.0F, 3.3F, 0.0F);
		this.tailThin02.addBox(-0.5F, -0.1F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(tailThin02, 0.20943951023931953F, 0.0F, 0.0F);
		this.rHorn01c = new ModelRenderer(this, 56, 0);
		this.rHorn01c.mirror = true;
		this.rHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01c.addBox(-0.2F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.lHorn08 = new ModelRenderer(this, 46, 0);
		this.lHorn08.setRotationPoint(0.0F, -0.1F, 2.6F);
		this.lHorn08.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lHorn08, -0.5235987755982988F, 0.20943951023931953F, -0.20943951023931953F);
		this.lHorn01b = new ModelRenderer(this, 56, 0);
		this.lHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01b.addBox(-0.8F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.rHorn03b = new ModelRenderer(this, 56, 0);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.8F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.rHorn02c = new ModelRenderer(this, 56, 0);
		this.rHorn02c.mirror = true;
		this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02c.addBox(-0.2F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.tailWolf = new ModelRenderer(this, 9, 18);
		this.tailWolf.setRotationPoint(0.0F, 5.7F, 2.0F);
		this.tailWolf.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
		this.setRotateAngle(tailWolf, -0.8726646259971648F, 0.0F, 0.0F);
		this.rHorn05 = new ModelRenderer(this, 56, 0);
		this.rHorn05.mirror = true;
		this.rHorn05.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.rHorn05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rHorn05, -0.5235987755982988F, -0.20943951023931953F, 0.0F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, 13.5F, -7.0F);
		this.head.addBox(-3.0F, -3.0F, -4.0F, 6, 6, 4, 0.0F);
		this.setRotateAngle(head, 0.091106186954104F, 0.0F, 0.0F);
		this.tailThin04 = new ModelRenderer(this, 37, 33);
		this.tailThin04.setRotationPoint(0.0F, 4.3F, 0.0F);
		this.tailThin04.addBox(-1.0F, -0.1F, -0.5F, 2, 2, 1, 0.0F);
		this.setRotateAngle(tailThin04, 0.20943951023931953F, 0.0F, 0.0F);
		this.rHorn02a = new ModelRenderer(this, 56, 0);
		this.rHorn02a.mirror = true;
		this.rHorn02a.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.rHorn02a.addBox(-0.2F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rHorn02a, -0.20943951023931953F, -0.2792526803190927F, 0.0F);
		this.rHorn07 = new ModelRenderer(this, 46, 0);
		this.rHorn07.mirror = true;
		this.rHorn07.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.rHorn07.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rHorn07, -0.6829473363053812F, -0.20943951023931953F, 0.41887902047863906F);
		this.rHorn03d = new ModelRenderer(this, 56, 0);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.8F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.lHorn03b = new ModelRenderer(this, 56, 0);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.8F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.rEar = new ModelRenderer(this, 16, 14);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.0F, -3.0F, -2.0F);
		this.rEar.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.lHorn02d = new ModelRenderer(this, 56, 0);
		this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02d.addBox(-0.8F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.tailThin05 = new ModelRenderer(this, 44, 33);
		this.tailThin05.setRotationPoint(0.0F, 1.3F, 0.1F);
		this.tailThin05.addBox(-0.5F, -0.5F, -0.59F, 2, 2, 1, 0.0F);
		this.setRotateAngle(tailThin05, 0.0F, 0.0F, 0.7853981633974483F);
		this.lHorn01a = new ModelRenderer(this, 56, 0);
		this.lHorn01a.setRotationPoint(0.5F, -2.2F, -2.0F);
		this.lHorn01a.addBox(-0.2F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lHorn01a, 0.5235987755982988F, 0.5235987755982988F, 0.0F);
		this.rHorn08 = new ModelRenderer(this, 46, 0);
		this.rHorn08.mirror = true;
		this.rHorn08.setRotationPoint(0.0F, -0.1F, 2.6F);
		this.rHorn08.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(rHorn08, -0.5235987755982988F, -0.20943951023931953F, 0.20943951023931953F);
		this.lHorn01c = new ModelRenderer(this, 56, 0);
		this.lHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01c.addBox(-0.2F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.neck = new ModelRenderer(this, 0, 32);
		this.neck.setRotationPoint(0.0F, -5.4F, 0.5F);
		this.neck.addBox(-2.5F, -2.5F, -4.0F, 5, 5, 4, 0.0F);
		this.setRotateAngle(neck, -1.5707963267948966F, 0.0F, 0.0F);
		this.mane = new ModelRenderer(this, 21, 0);
		this.mane.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.mane.addBox(-4.0F, -3.5F, -3.01F, 8, 7, 7, 0.0F);
		this.tailThin03 = new ModelRenderer(this, 32, 33);
		this.tailThin03.setRotationPoint(0.0F, 4.3F, 0.0F);
		this.tailThin03.addBox(-0.5F, -0.1F, -0.5F, 1, 5, 1, 0.0F);
		this.setRotateAngle(tailThin03, 0.20943951023931953F, 0.0F, 0.0F);
		this.lHorn02a = new ModelRenderer(this, 56, 0);
		this.lHorn02a.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.lHorn02a.addBox(-0.2F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lHorn02a, -0.20943951023931953F, 0.2792526803190927F, 0.0F);
		this.lHorn03a = new ModelRenderer(this, 56, 0);
		this.lHorn03a.setRotationPoint(0.0F, 0.0F, 1.7F);
		this.lHorn03a.addBox(-0.2F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lHorn03a, -0.20943951023931953F, 0.10471975511965977F, 0.0F);
		this.lHorn05 = new ModelRenderer(this, 56, 0);
		this.lHorn05.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.lHorn05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lHorn05, -0.5235987755982988F, 0.20943951023931953F, 0.0F);
		this.muzzle = new ModelRenderer(this, 0, 10);
		this.muzzle.setRotationPoint(0.0F, 0.7F, -3.9F);
		this.muzzle.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F);
		this.lHorn04 = new ModelRenderer(this, 56, 0);
		this.lHorn04.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.lHorn04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lHorn04, -0.5235987755982988F, 0.0F, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 56, 0);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.2F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
		this.rHorn01a = new ModelRenderer(this, 56, 0);
		this.rHorn01a.mirror = true;
		this.rHorn01a.setRotationPoint(-0.5F, -2.2F, -2.0F);
		this.rHorn01a.addBox(-0.2F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rHorn01a, 0.5235987755982988F, -0.5235987755982988F, 0.0F);
		this.lHorn06 = new ModelRenderer(this, 56, 0);
		this.lHorn06.setRotationPoint(0.0F, 0.0F, 1.7F);
		this.lHorn06.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(lHorn06, -0.5235987755982988F, 0.20943951023931953F, -0.2792526803190927F);
		this.mane02 = new ModelRenderer(this, 28, 48);
		this.mane02.setRotationPoint(0.0F, -1.0F, 2.7F);
		this.mane02.addBox(-3.5F, -1.0F, 0.0F, 7, 2, 7, 0.0F);
		this.setRotateAngle(mane02, -1.2915436464758039F, 0.0F, 0.0F);
		this.rFrontLeg = new ModelRenderer(this, 0, 18);
		this.rFrontLeg.mirror = true;
		this.rFrontLeg.setRotationPoint(-1.5F, 16.0F, -3.0F);
		this.rFrontLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.lHorn02b = new ModelRenderer(this, 56, 0);
		this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02b.addBox(-0.8F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.rHindLeg = new ModelRenderer(this, 0, 18);
		this.rHindLeg.mirror = true;
		this.rHindLeg.setRotationPoint(-1.5F, 16.0F, 7.0F);
		this.rHindLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.rHorn01b = new ModelRenderer(this, 56, 0);
		this.rHorn01b.mirror = true;
		this.rHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01b.addBox(-0.8F, -0.8F, 0.0F, 1, 1, 2, 0.0F);
		this.lowerJaw = new ModelRenderer(this, 0, 43);
		this.lowerJaw.setRotationPoint(0.0F, 2.0F, -3.8F);
		this.lowerJaw.addBox(-1.5F, -0.4F, -3.0F, 3, 1, 3, 0.0F);
		this.mane01 = new ModelRenderer(this, 0, 48);
		this.mane01.setRotationPoint(0.0F, -1.8F, -3.0F);
		this.mane01.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 7, 0.0F);
		this.setRotateAngle(mane01, 0.4363323129985824F, 0.0F, 0.0F);
		this.rHorn04 = new ModelRenderer(this, 56, 0);
		this.rHorn04.mirror = true;
		this.rHorn04.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.rHorn04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rHorn04, -0.5235987755982988F, 0.0F, 0.0F);
		this.lHorn07 = new ModelRenderer(this, 46, 0);
		this.lHorn07.setRotationPoint(0.0F, -0.1F, 1.7F);
		this.lHorn07.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(lHorn07, -0.6829473363053812F, 0.20943951023931953F, -0.41887902047863906F);
		this.rHorn06 = new ModelRenderer(this, 56, 0);
		this.rHorn06.mirror = true;
		this.rHorn06.setRotationPoint(0.0F, 0.0F, 1.7F);
		this.rHorn06.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(rHorn06, -0.5235987755982988F, -0.20943951023931953F, 0.2792526803190927F);
		this.lHorn03a.addChild(this.lHorn03d);
		this.tailWolf.addChild(this.tailThin01);
		this.lHorn03a.addChild(this.lHorn03c);
		this.rHorn01a.addChild(this.rHorn01d);
		this.rHorn02a.addChild(this.rHorn02d);
		this.lHorn02a.addChild(this.lHorn02c);
		this.rHorn02a.addChild(this.rHorn03a);
		this.rHorn02a.addChild(this.rHorn02b);
		this.head.addChild(this.lEar);
		this.lHorn01a.addChild(this.lHorn01d);
		this.tailThin01.addChild(this.tailThin02);
		this.rHorn01a.addChild(this.rHorn01c);
		this.lHorn07.addChild(this.lHorn08);
		this.lHorn01a.addChild(this.lHorn01b);
		this.rHorn03a.addChild(this.rHorn03b);
		this.rHorn02a.addChild(this.rHorn02c);
		this.body.addChild(this.tailWolf);
		this.rHorn04.addChild(this.rHorn05);
		this.tailThin03.addChild(this.tailThin04);
		this.rHorn01a.addChild(this.rHorn02a);
		this.rHorn06.addChild(this.rHorn07);
		this.rHorn03a.addChild(this.rHorn03d);
		this.lHorn03a.addChild(this.lHorn03b);
		this.head.addChild(this.rEar);
		this.lHorn02a.addChild(this.lHorn02d);
		this.tailThin04.addChild(this.tailThin05);
		this.head.addChild(this.lHorn01a);
		this.rHorn07.addChild(this.rHorn08);
		this.lHorn01a.addChild(this.lHorn01c);
		this.body.addChild(this.neck);
		this.body.addChild(this.mane);
		this.tailThin02.addChild(this.tailThin03);
		this.lHorn01a.addChild(this.lHorn02a);
		this.lHorn02a.addChild(this.lHorn03a);
		this.lHorn04.addChild(this.lHorn05);
		this.head.addChild(this.muzzle);
		this.lHorn03a.addChild(this.lHorn04);
		this.rHorn03a.addChild(this.rHorn03c);
		this.head.addChild(this.rHorn01a);
		this.lHorn05.addChild(this.lHorn06);
		this.mane.addChild(this.mane02);
		this.lHorn02a.addChild(this.lHorn02b);
		this.rHorn01a.addChild(this.rHorn01b);
		this.head.addChild(this.lowerJaw);
		this.neck.addChild(this.mane01);
		this.rHorn03a.addChild(this.rHorn04);
		this.lHorn06.addChild(this.lHorn07);
		this.rHorn05.addChild(this.rHorn06);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.lFrontLeg.render(f5);
		this.lHindLeg.render(f5);
		this.body.render(f5);
		this.head.render(f5);
		this.rFrontLeg.render(f5);
		this.rHindLeg.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
