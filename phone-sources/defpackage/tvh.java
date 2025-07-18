package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tvh implements tur {
    private final tur a;
    private final Object b;

    public tvh(tur turVar, Object obj) {
        turVar.getClass();
        this.a = turVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tvh)) {
            return false;
        }
        tvh tvhVar = (tvh) obj;
        return this.a.equals(tvhVar.a) && this.b.equals(tvhVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return obj.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
