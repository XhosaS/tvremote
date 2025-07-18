package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chd implements cfu {
    public final String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chd) && yks.e(this.a, ((chd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }
}
