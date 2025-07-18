package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cha {
    public final cgs a;

    public cha() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof cha) && yks.e(this.a, ((cha) obj).a) && yks.e(null, null) && yks.e(null, null) && yks.e(null, null);
    }

    public final int hashCode() {
        cgs cgsVar = this.a;
        return (cgsVar != null ? cgsVar.hashCode() : 0) * 29791;
    }

    public /* synthetic */ cha(cgs cgsVar, int i) {
        this.a = 1 == (i & 1) ? null : cgsVar;
    }
}
