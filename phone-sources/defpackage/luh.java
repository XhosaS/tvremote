package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luh {
    private final tst a;

    public luh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luh) {
            return this.a.equals(((luh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "UpdateUserSentimentsResponse{updateToken=Optional.absent()}";
    }

    public luh(tst tstVar) {
        this.a = tstVar;
    }
}
