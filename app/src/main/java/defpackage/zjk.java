package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjk extends zjm implements Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public zjk(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.zjm
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        yqw.P(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.zjm
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.zjm
    public final boolean c(zjm zjmVar) {
        int length = zjmVar.e().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == zjmVar.e()[i];
        }
        return z;
    }

    @Override // defpackage.zjm
    public final byte[] d() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.zjm
    public final byte[] e() {
        return this.a;
    }
}
