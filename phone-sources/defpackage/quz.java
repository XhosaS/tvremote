package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class quz {
    public final dvk a;
    public final tst b;
    public final tst c;

    public quz(dvk dvkVar, tst tstVar, tst tstVar2) {
        this.a = dvkVar;
        this.b = tstVar;
        this.c = tstVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quz)) {
            return false;
        }
        quz quzVar = (quz) obj;
        return yks.e(this.a, quzVar.a) && yks.e(this.b, quzVar.b) && yks.e(this.c, quzVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 2040732332) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ObservableAccountInformation(lifecycleOwner=" + this.a + ", countDecorationGenerator=" + this.b + ", criticalAlertFeature=" + this.c + ")";
    }
}
