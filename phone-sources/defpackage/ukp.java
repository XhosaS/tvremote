package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukp {
    public final boolean a;
    private final ulb b;

    public ukp(ulb ulbVar, boolean z) {
        this.b = ulbVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ukp) {
            ukp ukpVar = (ukp) obj;
            if (ukpVar.b.equals(this.b) && ukpVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
    }
}
