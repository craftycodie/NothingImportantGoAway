package net.minecraft.world.level.levelgen.feature;

import java.util.Random;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.tile.Tile;

public class HellPortalFeature extends Feature {
   public boolean place(Level var1, Random var2, int var3, int var4, int var5) {
      if (!var1.isEmptyTile(var3, var4, var5)) {
         return false;
      } else if (var1.getTile(var3, var4 + 1, var5) != Tile.hellRock.id) {
         return false;
      } else {
         var1.setTile(var3, var4, var5, Tile.lightGem.id);

         for(int var6 = 0; var6 < 1500; ++var6) {
            int var7 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var8 = var4 - var2.nextInt(12);
            int var9 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if (var1.getTile(var7, var8, var9) == 0) {
               int var10 = 0;

               for(int var11 = 0; var11 < 6; ++var11) {
                  int var12 = 0;
                  if (var11 == 0) {
                     var12 = var1.getTile(var7 - 1, var8, var9);
                  }

                  if (var11 == 1) {
                     var12 = var1.getTile(var7 + 1, var8, var9);
                  }

                  if (var11 == 2) {
                     var12 = var1.getTile(var7, var8 - 1, var9);
                  }

                  if (var11 == 3) {
                     var12 = var1.getTile(var7, var8 + 1, var9);
                  }

                  if (var11 == 4) {
                     var12 = var1.getTile(var7, var8, var9 - 1);
                  }

                  if (var11 == 5) {
                     var12 = var1.getTile(var7, var8, var9 + 1);
                  }

                  if (var12 == Tile.lightGem.id) {
                     ++var10;
                  }
               }

               if (var10 == 1) {
                  var1.setTile(var7, var8, var9, Tile.lightGem.id);
               }
            }
         }

         return true;
      }
   }
}
