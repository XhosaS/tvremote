package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyz extends dab {
    private final byte d;
    static final dam c = new cyy(cyz.class);
    public static final cyz a = new cyz((byte) 0);
    public static final cyz b = new cyz((byte) -1);

    private cyz(byte b2) {
        this.d = b2;
    }

    static cyz b(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b2 = bArr[0];
        return b2 != -1 ? b2 != 0 ? new cyz(b2) : a : b;
    }

    public static cyz f(Object obj) {
        if (obj == null || (obj instanceof cyz)) {
            return (cyz) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (cyz) c.c((byte[]) obj);
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public static cyz g(boolean z) {
        return z ? b : a;
    }

    public static cyz i(dal dalVar) {
        return (cyz) c.d(dalVar, false);
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, 1);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.m(z, 1);
        czzVar.h(1);
        czzVar.f(this.d);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        return (dabVar instanceof cyz) && h() == ((cyz) dabVar).h();
    }

    @Override // defpackage.dab
    public final boolean e() {
        return false;
    }

    public final boolean h() {
        return this.d != 0;
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return h() ? 1 : 0;
    }

    @Override // defpackage.dab
    public final dab k() {
        return h() ? b : a;
    }

    public final String toString() {
        return true != h() ? "FALSE" : "TRUE";
    }
}
