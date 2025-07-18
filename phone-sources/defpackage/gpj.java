package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpj extends gli {
    public final gox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpj() {
        super(null);
        gox goxVar = gox.a;
        this.a = goxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gpj) obj).a);
    }

    public final int hashCode() {
        return 3179391 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
