package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ztb extends zsy {
    public short[][][] c;
    public byte[] d;
    public short[][][] e;
    public short[][][] f;
    public short[][][] g;
    public short[][][] h;
    public short[][][] i;

    public ztb(zsz zszVar, byte[] bArr) {
        super(false, zszVar);
        int i = zszVar.k;
        int i2 = zszVar.j;
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
        this.d = vxr.bh(bArr, 0, 32);
        int i7 = zszVar.h;
        int i8 = zszVar.g;
        int i9 = zszVar.i;
        this.e = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i8, i9);
        this.f = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i7);
        this.g = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i7, i9);
        this.h = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i7, i9, i9);
        this.i = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i9, i9, i9);
        int iZ = wef.z(this.e, bArr, 32, false) + 32;
        int iZ2 = iZ + wef.z(this.f, bArr, iZ, true);
        int iZ3 = iZ2 + wef.z(this.g, bArr, iZ2, false);
        int iZ4 = iZ3 + wef.z(this.h, bArr, iZ3, true);
        if (iZ4 + wef.z(this.i, bArr, iZ4, true) != bArr.length) {
            throw new IllegalArgumentException("unparsed data in key encoding");
        }
    }
}
