package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwj {
    private static final mwj b = new mwj(ock.a);
    public final byte[] a;

    public mwj(byte[] bArr) {
        this.a = bArr;
    }

    public static mwj a(oex oexVar) {
        try {
            abvt abvtVarQ = abvt.Q(oexVar.c.duplicate());
            if (abvtVarQ.C()) {
                return b;
            }
            abvtVarQ.m();
            return new mwj(abvtVarQ.F());
        } catch (IOException e) {
            throw new ocp("Error reading extension from model", e);
        }
    }

    public final oex b(int i) {
        int i2 = i << 3;
        int iH = abvz.H(i2);
        byte[] bArr = this.a;
        int length = bArr.length;
        int iH2 = iH + abvz.H(length) + length;
        byte[] bArr2 = new byte[iH2];
        abvw abvwVar = new abvw(bArr2, 0, iH2);
        try {
            abvwVar.x(i2 | 2);
            abvwVar.A(bArr, length);
            abvwVar.K();
            return oex.a(bArr2);
        } catch (IOException e) {
            throw new ocp("Error adding extension to model", e);
        }
    }
}
