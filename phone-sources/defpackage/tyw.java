package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tyw extends tyy implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public tyw(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.tyy
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        sij.y(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.tyy
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.tyy
    public final boolean c(tyy tyyVar) {
        int length = tyyVar.e().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == tyyVar.e()[i];
        }
        return z;
    }

    @Override // defpackage.tyy
    public final byte[] d() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.tyy
    public final byte[] e() {
        return this.a;
    }
}
