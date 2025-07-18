package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjt {
    public final Object a;
    public final vvd b;

    public pjt(vvd vvdVar, Object obj) {
        boolean z = false;
        if (vvdVar.a() >= 100000000 && vvdVar.a() < 200000000) {
            z = true;
        }
        a.H(z);
        this.b = vvdVar;
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pjt) {
            pjt pjtVar = (pjt) obj;
            if (this.b.equals(pjtVar.b) && this.a.equals(pjtVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
