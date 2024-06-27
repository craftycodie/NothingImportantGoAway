package net.minecraft.client.renderer.ptexture;

import net.minecraft.world.level.tile.Tile;

public class FireTexture extends DynamicTexture {
   protected float[] current = new float[320];
   protected float[] next = new float[320];

   public FireTexture(int id) {
      super(Tile.fire.tex + id * 16);
   }

   public void tick() {
      int i;
      float pp;
      int r;
      int g;
      for(int x = 0; x < 16; ++x) {
         for(i = 0; i < 20; ++i) {
            int count = 18;
            pp = this.current[x + (i + 1) % 20 * 16] * (float)count;

            for(r = x - 1; r <= x + 1; ++r) {
               for(g = i; g <= i + 1; ++g) {
                  if (r >= 0 && g >= 0 && r < 16 && g < 20) {
                     pp += this.current[r + g * 16];
                  }

                  ++count;
               }
            }

            this.next[x + i * 16] = pp / ((float)count * 1.06F);
            if (i >= 19) {
               this.next[x + i * 16] = (float)(Math.random() * Math.random() * Math.random() * 4.0D + Math.random() * 0.10000000149011612D + 0.20000000298023224D);
            }
         }
      }

      float[] tmp = this.next;
      this.next = this.current;
      this.current = tmp;

      for(i = 0; i < 256; ++i) {
         float pow = this.current[i] * 1.8F;
         if (pow > 1.0F) {
            pow = 1.0F;
         }

         if (pow < 0.0F) {
            pow = 0.0F;
         }

         r = (int)(pow * 155.0F + 100.0F);
         g = (int)(pow * pow * 255.0F);
         int b = (int)(pow * pow * pow * pow * pow * pow * pow * pow * pow * pow * 255.0F);
         int a = 255;
         if (pow < 0.5F) {
            a = 0;
         }

         pp = (pow - 0.5F) * 2.0F;
         if (this.anaglyph3d) {
            int rr = (r * 30 + g * 59 + b * 11) / 100;
            int gg = (r * 30 + g * 70) / 100;
            int bb = (r * 30 + b * 70) / 100;
            r = rr;
            g = gg;
            b = bb;
         }

         this.pixels[i * 4 + 0] = (byte)r;
         this.pixels[i * 4 + 1] = (byte)g;
         this.pixels[i * 4 + 2] = (byte)b;
         this.pixels[i * 4 + 3] = (byte)a;
      }

   }
}
