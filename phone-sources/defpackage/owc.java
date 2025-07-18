package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owc extends owe {
    private final ovy c;

    public owc(ovy ovyVar) {
        super(ovyVar, owl.c);
        this.c = ovyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owc) && yks.e(this.c, ((owc) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "TrailerQoeAnalyticsParams(trailerBasicParams=" + this.c + ")";
    }
}
