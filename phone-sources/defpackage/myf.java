package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myf implements lhf {
    public final myj a;

    public myf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myf) {
            return this.a.equals(((myf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FamilyLibraryShareDialogConfirmEvent{statusUpdate=" + this.a.toString() + "}";
    }

    public myf(myj myjVar) {
        if (myjVar == null) {
            throw new NullPointerException("Null statusUpdate");
        }
        this.a = myjVar;
    }
}
