package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dit {
    public final duf a;
    public final duf b;

    public dit(duf dufVar, duf dufVar2) {
        this.a = dufVar;
        this.b = dufVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dit ditVar = (dit) obj;
        return yks.e(this.a, ditVar.a) && yks.e(this.b, ditVar.b);
    }

    public final int hashCode() {
        return (((dum) this.a).a * 31) + ((dum) this.b).a;
    }
}
