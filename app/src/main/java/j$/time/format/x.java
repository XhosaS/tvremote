package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0048b;

/* loaded from: classes3.dex */
public final class x implements j$.time.temporal.k {
    public final /* synthetic */ InterfaceC0048b a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ j$.time.chrono.m c;
    public final /* synthetic */ ZoneId d;

    public x(InterfaceC0048b interfaceC0048b, j$.time.temporal.k kVar, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.a = interfaceC0048b;
        this.b = kVar;
        this.c = mVar;
        this.d = zoneId;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final long H(j$.time.temporal.n nVar) {
        InterfaceC0048b interfaceC0048b = this.a;
        return (interfaceC0048b == null || !nVar.isDateBased()) ? this.b.H(nVar) : interfaceC0048b.H(nVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final Object U(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.b ? this.c : nVar == j$.time.temporal.o.a ? this.d : nVar == j$.time.temporal.o.c ? this.b.U(nVar) : nVar.c(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        InterfaceC0048b interfaceC0048b = this.a;
        return (interfaceC0048b == null || !nVar.isDateBased()) ? this.b.d(nVar) : interfaceC0048b.d(nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.k, java.lang.Object] */
    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        InterfaceC0048b interfaceC0048b = this.a;
        return (interfaceC0048b == null || !nVar.isDateBased()) ? this.b.m(nVar) : interfaceC0048b.m(nVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        j$.time.chrono.m mVar = this.c;
        String strConcat = mVar != null ? " with chronology ".concat(String.valueOf(mVar)) : "";
        ZoneId zoneId = this.d;
        return strValueOf + strConcat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }
}
