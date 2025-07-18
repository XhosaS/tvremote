package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djs extends djp {
    public short[][][] c;
    public byte[] d;
    public short[][][] e;
    public short[][][] f;
    public short[][][] g;
    public short[][][] h;
    public short[][][] i;

    public djs(djq djqVar, byte[] bArr) {
        super(false, djqVar);
        int i = djqVar.k;
        int i2 = djqVar.j;
        if (this.b.m == 1) {
            this.c = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i; i6++) {
                        if (i4 > i5) {
                            this.c[i6][i4][i5] = 0;
                        } else {
                            this.c[i6][i4][i5] = (short) (bArr[i3] & 255);
                            i3++;
                        }
                    }
                }
            }
            return;
        }
        this.d = dos.t(bArr, 0, 32);
        int i7 = djqVar.h;
        int i8 = djqVar.g;
        int i9 = djqVar.i;
        this.e = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i8, i9);
        this.f = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i7);
        this.g = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i9);
        this.h = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i9, i9);
        this.i = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i9, i9, i9);
        int iW = dnx.w(this.e, bArr, 32, false) + 32;
        int iW2 = iW + dnx.w(this.f, bArr, iW, true);
        int iW3 = iW2 + dnx.w(this.g, bArr, iW2, false);
        int iW4 = iW3 + dnx.w(this.h, bArr, iW3, true);
        if (iW4 + dnx.w(this.i, bArr, iW4, true) != bArr.length) {
            throw new IllegalArgumentException("unparsed data in key encoding");
        }
    }
}
