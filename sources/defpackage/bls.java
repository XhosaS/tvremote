package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bls extends blx {
    public final blt a;
    public final int b;

    public bls(blt bltVar, int i) {
        super(5);
        this.a = bltVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bls)) {
            return false;
        }
        bls blsVar = (bls) obj;
        return Objects.equals(this.a, blsVar.a) && this.b == blsVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    @Override // defpackage.blx
    public final String toString() {
        return "[" + ((Object) aju.g(this.d)) + " encoding=" + this.a + ", client_role=" + ((Object) aju.h(this.b)) + "]";
    }
}
