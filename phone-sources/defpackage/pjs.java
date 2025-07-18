package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjs {
    public final Object a;
    public final vvd b;

    public pjs(vvd vvdVar, Object obj) {
        boolean z = false;
        if (vvdVar.a() >= 200000000 && vvdVar.a() < 300000000) {
            z = true;
        }
        a.H(z);
        this.b = vvdVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pjs) {
            pjs pjsVar = (pjs) obj;
            if (this.b.equals(pjsVar.b) && this.a.equals(pjsVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
