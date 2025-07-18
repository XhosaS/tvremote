package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zif extends zjh {
    private final byte d;
    static final zjs c = new zie(zif.class);
    public static final zif a = new zif((byte) 0);
    public static final zif b = new zif((byte) -1);

    private zif(byte b2) {
        this.d = b2;
    }

    static zif b(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        return b2 != -1 ? b2 != 0 ? new zif(b2) : a : b;
    }

    public static zif f(Object obj) {
        if (obj == null || (obj instanceof zif)) {
            return (zif) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (zif) c.c((byte[]) obj);
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public static zif g(boolean z) {
        return z ? b : a;
    }

    public static zif i(zjr zjrVar) {
        return (zif) c.d(zjrVar, false);
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, 1);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.m(z, 1);
        zjfVar.h(1);
        zjfVar.f(this.d);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        return (zjhVar instanceof zif) && h() == ((zif) zjhVar).h();
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    public final boolean h() {
        return this.d != 0;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return h() ? 1 : 0;
    }

    @Override // defpackage.zjh
    public final zjh k() {
        return h() ? b : a;
    }

    public final String toString() {
        return true != h() ? "FALSE" : "TRUE";
    }
}
