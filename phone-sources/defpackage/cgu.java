package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cgu implements cfu {
    public final String a = "g.co/yourfamily";

    public final boolean equals(Object obj) {
        return (obj instanceof cgu) && yks.e(this.a, ((cgu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}
