package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahbs extends agsq {
    public static final ahbr a = new ahbr();
    public final String b;

    public ahbs(String str) {
        super(a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahbs) && agvy.c(this.b, ((ahbs) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.b + ")";
    }
}
