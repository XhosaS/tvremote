package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqp {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public final boolean c;
    public final boolean d;

    public fqp(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqp)) {
            return false;
        }
        fqp fqpVar = (fqp) obj;
        return this.c == fqpVar.c && this.d == fqpVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
