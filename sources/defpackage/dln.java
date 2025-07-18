package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dln {
    public final int a;
    public final Object b;

    public dln(int i) {
        this.b = null;
        this.a = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.a) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return b(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [deh, java.lang.Object] */
    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.a;
        byte[] bArrO = dnx.o(j, i2);
        int length = bArrO.length;
        ?? r2 = this.b;
        r2.e(bArrO, 0, length);
        r2.e(bArr, 0, bArr.length);
        r2.e(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (r2 instanceof des) {
            ((des) r2).l(bArr3, 0, i2);
            return bArr3;
        }
        r2.a(bArr3, 0);
        return bArr3;
    }

    public dln(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public dln(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public dln(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public dln(String str, int i) {
        this.b = str;
        this.a = i;
    }

    protected dln(czv czvVar, int i) {
        this.b = dlk.b(czvVar);
        this.a = i;
    }
}
