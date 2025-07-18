package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfr extends cfs implements Serializable {
    private static final long serialVersionUID = 0;
    public final byte[] a;

    public cfr(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.cfs
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        bdq.l(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.cfs
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.cfs
    public final boolean c(cfs cfsVar) {
        int length = cfsVar.d().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == cfsVar.d()[i];
        }
        return z;
    }

    @Override // defpackage.cfs
    public final byte[] d() {
        return this.a;
    }
}
