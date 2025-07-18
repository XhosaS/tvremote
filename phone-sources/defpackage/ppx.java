package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ppx {
    public final cji a;
    public final int b;

    public ppx(cji cjiVar) {
        cjiVar.getClass();
        this.a = cjiVar;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppx)) {
            return false;
        }
        ppx ppxVar = (ppx) obj;
        if (!yks.e(this.a, ppxVar.a)) {
            return false;
        }
        int i = ppxVar.b;
        return a.r(0, 0);
    }

    public final int hashCode() {
        return this.a.h * 31;
    }

    public final String toString() {
        return "GoogleSansConfig(weight=" + this.a + ", style=" + cje.a(0) + ")";
    }
}
