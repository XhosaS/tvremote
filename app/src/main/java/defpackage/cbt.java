package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbt extends cbu {
    public final caz a;

    public cbt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cbt) obj).a);
    }

    public final int hashCode() {
        return 3047083 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public cbt(caz cazVar) {
        this.a = cazVar;
    }
}
