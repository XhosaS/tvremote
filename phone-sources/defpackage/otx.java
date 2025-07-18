package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otx {
    public otw a;
    public final int b;
    public final int c;
    private final byte[] d;

    public otx(byte[] bArr, int i, int i2, otw otwVar) {
        otwVar.getClass();
        this.d = bArr;
        this.b = i;
        this.c = i2;
        this.a = otwVar;
    }

    public final void a(otw otwVar) {
        otwVar.getClass();
        this.a = otwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otx)) {
            return false;
        }
        otx otxVar = (otx) obj;
        return yks.e(osk.f(this.d), osk.f(otxVar.d)) && this.b == otxVar.b && this.c == otxVar.c && this.a == otxVar.a;
    }

    public final int hashCode() {
        return Objects.hash(osk.f(this.d), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        byte[] bArr = this.d;
        return ylh.t(getClass().getSimpleName() + " (\n      |id=" + osk.f(bArr) + ",\n      |format=" + vxr.e(this.b) + ",\n      |dynamicRange=" + qtl.aD(this.c) + ",\n      |status=" + this.a.name() + ")");
    }
}
