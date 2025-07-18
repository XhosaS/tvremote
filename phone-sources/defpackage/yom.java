package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yom {
    public final Object a;
    public final yod b;
    public final yka c;
    public final Object d;
    public final Throwable e;

    public yom(Object obj, yod yodVar, yka ykaVar, Throwable th) {
        this.a = obj;
        this.b = yodVar;
        this.c = ykaVar;
        this.d = null;
        this.e = th;
    }

    public static /* synthetic */ yom b(yom yomVar, yod yodVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? yomVar.a : null;
        if ((i & 2) != 0) {
            yodVar = yomVar.b;
        }
        yka ykaVar = (i & 4) != 0 ? yomVar.c : null;
        if ((i & 8) != 0) {
            Object obj2 = yomVar.d;
        }
        if ((i & 16) != 0) {
            th = yomVar.e;
        }
        return new yom(obj, yodVar, ykaVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yom)) {
            return false;
        }
        yom yomVar = (yom) obj;
        if (!yks.e(this.a, yomVar.a) || !yks.e(this.b, yomVar.b) || !yks.e(this.c, yomVar.c)) {
            return false;
        }
        Object obj2 = yomVar.d;
        return yks.e(null, null) && yks.e(this.e, yomVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        yod yodVar = this.b;
        int iHashCode2 = yodVar == null ? 0 : yodVar.hashCode();
        int i = iHashCode * 31;
        yka ykaVar = this.c;
        int iHashCode3 = ykaVar == null ? 0 : ykaVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }

    public /* synthetic */ yom(Object obj, yod yodVar, yka ykaVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : yodVar, (i & 4) != 0 ? null : ykaVar, (i & 16) != 0 ? null : th);
    }
}
