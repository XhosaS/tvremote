package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyc {
    public final qyk a;
    public final cuh b;
    public final yjv c;
    public final qyn d;

    public qyc(qyn qynVar, qyk qykVar, cuh cuhVar, yjv yjvVar) {
        qynVar.getClass();
        this.d = qynVar;
        this.a = qykVar;
        this.b = cuhVar;
        this.c = yjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyc)) {
            return false;
        }
        qyc qycVar = (qyc) obj;
        return yks.e(this.d, qycVar.d) && yks.e(this.a, qycVar.a) && yks.e(this.b, qycVar.b) && yks.e(this.c, qycVar.c);
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "FragmentScopedData(appStateData=" + this.d + ", viewModelData=" + this.a + ", customDialogConsumer=" + this.b + ", handleWithFragment=" + this.c + ")";
    }
}
