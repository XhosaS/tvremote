package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0083b;

/* loaded from: classes4.dex */
public final class n implements j$.time.temporal.k {
    public final /* synthetic */ InterfaceC0083b a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ j$.time.chrono.m c;
    public final /* synthetic */ ZoneId d;

    public n(InterfaceC0083b interfaceC0083b, j$.time.temporal.k kVar, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.a = interfaceC0083b;
        this.b = kVar;
        this.c = mVar;
        this.d = zoneId;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        InterfaceC0083b interfaceC0083b = this.a;
        return (interfaceC0083b == null || !nVar.isDateBased()) ? this.b.C(nVar) : interfaceC0083b.C(nVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.b ? this.c : nVar == j$.time.temporal.o.a ? this.d : nVar == j$.time.temporal.o.c ? this.b.J(nVar) : nVar.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        InterfaceC0083b interfaceC0083b = this.a;
        return (interfaceC0083b == null || !nVar.isDateBased()) ? this.b.d(nVar) : interfaceC0083b.d(nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        InterfaceC0083b interfaceC0083b = this.a;
        return (interfaceC0083b == null || !nVar.isDateBased()) ? this.b.m(nVar) : interfaceC0083b.m(nVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        j$.time.chrono.m mVar = this.c;
        String strConcat = mVar != null ? " with chronology ".concat(String.valueOf(mVar)) : "";
        ZoneId zoneId = this.d;
        return strValueOf + strConcat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }
}
