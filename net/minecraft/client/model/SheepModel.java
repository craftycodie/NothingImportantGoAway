package net.minecraft.client.model;

public class SheepModel extends QuadrupedModel {
   public SheepModel() {
      super(12, 0.0F);
      this.head = new Cube(0, 0);
      this.head.addBox(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
      this.head.setPos(0.0F, 6.0F, -8.0F);
      this.body = new Cube(28, 8);
      this.body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
      this.body.setPos(0.0F, 5.0F, 2.0F);
   }
}
