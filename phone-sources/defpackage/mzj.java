package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzj implements lhf {
    public final mzl a;

    public mzj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzj) {
            return this.a.equals(((mzj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OpenSeasonPickerDialogEvent{seasonPickerViewModel=" + this.a.toString() + "}";
    }

    public mzj(mzl mzlVar) {
        if (mzlVar == null) {
            throw new NullPointerException("Null seasonPickerViewModel");
        }
        this.a = mzlVar;
    }
}
