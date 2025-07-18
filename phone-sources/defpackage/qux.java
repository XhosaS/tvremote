package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qux {
    public final tst a;
    public final qtl b;

    public qux(tst tstVar, qtl qtlVar) {
        tstVar.getClass();
        this.a = tstVar;
        this.b = qtlVar;
    }

    public static final reb a() {
        reb rebVar = new reb((byte[]) null);
        rebVar.a = new qtl();
        return rebVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qux)) {
            return false;
        }
        qux quxVar = (qux) obj;
        return yks.e(this.a, quxVar.a) && yks.e(this.b, quxVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AdditionalAccountInformation(observableAccountInformation=" + this.a + ", accountCapabilitiesRetriever=" + this.b + ")";
    }
}
