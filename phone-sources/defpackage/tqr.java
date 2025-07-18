package defpackage;

import android.util.DisplayMetrics;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqr {
    public final int a;
    public final int b;
    public final int c;

    public tqr(int i) {
        this.b = 1;
        this.c = 1;
        this.a = i;
    }

    public tqr(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public tqr(int i, int i2, int i3, byte[] bArr) {
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    public tqr(int i, int i2, int i3, char[] cArr) {
        this.b = i;
        this.a = i2;
        this.c = i3;
    }

    public tqr(hox hoxVar) {
        int i = true != hoxVar.b.isLowRamDevice() ? 4194304 : 2097152;
        this.a = i;
        int iRound = Math.round(r2.getMemoryClass() * 1048576 * (true != hoxVar.b.isLowRamDevice() ? 0.4f : 0.33f));
        float f = ((DisplayMetrics) hoxVar.d.a).widthPixels * ((DisplayMetrics) hoxVar.d.a).heightPixels * 4;
        int iRound2 = Math.round(hoxVar.c * f);
        int iRound3 = Math.round(f + f);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.c = iRound3;
            this.b = iRound2;
        } else {
            float f2 = i2 / (hoxVar.c + 2.0f);
            this.c = Math.round(f2 + f2);
            this.b = Math.round(f2 * hoxVar.c);
        }
    }
}
