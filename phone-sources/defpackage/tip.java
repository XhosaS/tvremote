package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tip extends tiu {
    public final tiq a;
    public final int b;

    public tip(tiq tiqVar, int i) {
        super(5);
        this.a = tiqVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tip)) {
            return false;
        }
        tip tipVar = (tip) obj;
        return Objects.equals(this.a, tipVar.a) && this.b == tipVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    @Override // defpackage.tiu
    public final String toString() {
        return "[" + ((Object) sip.k(this.d)) + " encoding=" + this.a + ", client_role=" + ((Object) sip.l(this.b)) + "]";
    }
}
