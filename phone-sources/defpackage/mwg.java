package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwg implements lhf {
    public final mwf a;

    public mwg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwg) {
            return this.a.equals(((mwg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "WelcomeCardActionClickEvent{action=" + this.a.toString() + "}";
    }

    public mwg(mwf mwfVar) {
        this.a = mwfVar;
    }
}
