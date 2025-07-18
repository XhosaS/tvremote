package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahbb {
    public final Object a;
    public final ahao b;
    public final agvc c;
    public final Object d;
    public final Throwable e;

    public ahbb(Object obj, ahao ahaoVar, agvc agvcVar, Throwable th) {
        this.a = obj;
        this.b = ahaoVar;
        this.c = agvcVar;
        this.d = null;
        this.e = th;
    }

    public static /* synthetic */ ahbb b(ahbb ahbbVar, ahao ahaoVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? ahbbVar.a : null;
        if ((i & 2) != 0) {
            ahaoVar = ahbbVar.b;
        }
        agvc agvcVar = (i & 4) != 0 ? ahbbVar.c : null;
        if ((i & 8) != 0) {
            Object obj2 = ahbbVar.d;
        }
        if ((i & 16) != 0) {
            th = ahbbVar.e;
        }
        return new ahbb(obj, ahaoVar, agvcVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahbb)) {
            return false;
        }
        ahbb ahbbVar = (ahbb) obj;
        if (!agvy.c(this.a, ahbbVar.a) || !agvy.c(this.b, ahbbVar.b) || !agvy.c(this.c, ahbbVar.c)) {
            return false;
        }
        Object obj2 = ahbbVar.d;
        return agvy.c(null, null) && agvy.c(this.e, ahbbVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        ahao ahaoVar = this.b;
        int iHashCode2 = ahaoVar == null ? 0 : ahaoVar.hashCode();
        int i = iHashCode * 31;
        agvc agvcVar = this.c;
        int iHashCode3 = agvcVar == null ? 0 : agvcVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }

    public /* synthetic */ ahbb(Object obj, ahao ahaoVar, agvc agvcVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : ahaoVar, (i & 4) != 0 ? null : agvcVar, (i & 16) != 0 ? null : th);
    }
}
