package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjv {
    public final Object a;
    public final vvd b;

    public pjv(vvd vvdVar, Object obj) {
        this.b = vvdVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pjv) {
            pjv pjvVar = (pjv) obj;
            if (this.b.equals(pjvVar.b) && this.a.equals(pjvVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
