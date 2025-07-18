package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slr extends sma {
    public final slf a;

    public slr() {
        throw null;
    }

    @Override // defpackage.sma
    public final String a() {
        return "signal";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof slr) {
            return this.a.equals(((slr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SignallingConfig{service=" + this.a.toString() + "}";
    }

    public slr(slf slfVar) {
        this.a = slfVar;
    }
}
