package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owd extends owe {
    private final ovy c;

    public owd(ovy ovyVar) {
        super(ovyVar, owl.b);
        this.c = ovyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owd) && yks.e(this.c, ((owd) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "TvodQoeAnalyticsParams(tvodBasicParams=" + this.c + ")";
    }
}
