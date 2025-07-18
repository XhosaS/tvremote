package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzk implements lhf {
    public final mzm a;

    public mzk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzk) {
            return this.a.equals(((mzk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SeasonSelectedEvent{selectedSeason=" + this.a.toString() + "}";
    }

    public mzk(mzm mzmVar) {
        if (mzmVar == null) {
            throw new NullPointerException("Null selectedSeason");
        }
        this.a = mzmVar;
    }
}
