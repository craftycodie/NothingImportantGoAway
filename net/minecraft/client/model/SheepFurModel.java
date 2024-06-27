package net.minecraft.client.model;

public class SheepFurModel extends QuadrupedModel {
   public SheepFurModel() {
      super(12, 0.0F);
      this.head = new Cube(0, 0);
      this.head.addBox(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
      this.head.setPos(0.0F, 6.0F, -8.0F);
      this.body = new Cube(28, 8);
      this.body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
      this.body.setPos(0.0F, 5.0F, 2.0F);
      float g = 0.5F;
      this.leg0 = new Cube(0, 16);
      this.leg0.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, g);
      this.leg0.setPos(-3.0F, 12.0F, 7.0F);
      this.leg1 = new Cube(0, 16);
      this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, g);
      this.leg1.setPos(3.0F, 12.0F, 7.0F);
      this.leg2 = new Cube(0, 16);
      this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, g);
      this.leg2.setPos(-3.0F, 12.0F, -5.0F);
      this.leg3 = new Cube(0, 16);
      this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, g);
      this.leg3.setPos(3.0F, 12.0F, -5.0F);
   }
}
