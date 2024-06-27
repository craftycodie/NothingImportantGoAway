package net.minecraft.world.level.levelgen.synth;

public class Emboss extends Synth {
   private Synth synth;

   public Emboss(Synth var1) {
      this.synth = var1;
   }

   public double getValue(double var1, double var3) {
      return this.synth.getValue(var1, var3) - this.synth.getValue(var1 + 1.0D, var3 + 1.0D);
   }
}
