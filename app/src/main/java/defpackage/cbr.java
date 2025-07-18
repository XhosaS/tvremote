package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbr extends cbu {
    public final caz a;

    public cbr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((cbr) obj).a);
    }

    public final int hashCode() {
        return 3047021 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public cbr(caz cazVar) {
        this.a = cazVar;
    }
}
