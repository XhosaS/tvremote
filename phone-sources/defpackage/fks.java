package defpackage;

import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fks {
    public boolean b;
    public boolean c;
    public int[] d;
    public int e;
    public int f;
    public Rect g;
    public final int[] a = new int[4];
    public int h = -1;
    public int i = -1;

    public static int a(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    public static int b(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    public final void c(edh edhVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int iWidth = rect.width();
        int i4 = i3 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int iD = 0;
                for (int i6 = 1; iD < i6 && i6 <= 64; i6 <<= 2) {
                    if (edhVar.a() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    iD = (iD << 4) | edhVar.d(4);
                }
                i = iD & 3;
                i2 = iD < 4 ? iWidth : iD >> 2;
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.a[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            edhVar.h();
        }
    }
}
