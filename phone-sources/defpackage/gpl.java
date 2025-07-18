package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpl extends gli {
    public final gox a;

    public gpl(gox goxVar) {
        super(null);
        this.a = goxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gpl) obj).a);
    }

    public final int hashCode() {
        return 3179453 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public gpl() {
        this(gox.a);
    }
}
