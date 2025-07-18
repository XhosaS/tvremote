package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dre implements dtn {
    public final float[] a = new float[4];
    final int[] b = new int[4];
    final int[] c = new int[4];
    PathEffect d;

    public static int b(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                if (i2 == 4) {
                    return 0;
                }
                if (i2 != 5) {
                    throw new IllegalArgumentException("Given unsupported edge ".concat(enz.a(i)));
                }
            }
        }
        return i3;
    }

    public static void c(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        if (i3 == 6) {
            iArr[0] = i2;
            iArr[2] = i2;
        } else if (i3 == 7) {
            iArr[1] = i2;
            iArr[3] = i2;
        } else {
            if (i3 != 8) {
                iArr[b(i)] = i2;
                return;
            }
            for (int i4 = 0; i4 < 4; i4++) {
                iArr[i4] = i2;
            }
        }
    }

    @Override // defpackage.dtn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        dre dreVar = (dre) obj;
        if (this == dreVar) {
            return true;
        }
        return dreVar != null && Arrays.equals(this.a, dreVar.a) && Arrays.equals(this.b, dreVar.b) && Arrays.equals(this.c, dreVar.c);
    }
}
