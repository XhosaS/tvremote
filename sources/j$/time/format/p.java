package j$.time.format;

import j$.time.Instant;
import j$.time.chrono.InterfaceC0005b;

/* loaded from: classes2.dex */
public final class p implements j$.time.temporal.m {
    public final /* synthetic */ InterfaceC0005b a;
    public final /* synthetic */ Instant b;
    public final /* synthetic */ j$.time.chrono.m c;
    public final /* synthetic */ j$.time.w d;

    public p(InterfaceC0005b interfaceC0005b, Instant instant, j$.time.chrono.m mVar, j$.time.w wVar) {
        this.a = interfaceC0005b;
        this.b = instant;
        this.c = mVar;
        this.d = wVar;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        InterfaceC0005b interfaceC0005b = this.a;
        return (interfaceC0005b == null || !pVar.isDateBased()) ? this.b.e(pVar) : interfaceC0005b.e(pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        InterfaceC0005b interfaceC0005b = this.a;
        return (interfaceC0005b == null || !pVar.isDateBased()) ? j$.time.temporal.q.d(this.b, pVar) : interfaceC0005b.k(pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(b bVar) {
        return bVar == j$.time.temporal.q.b ? this.c : bVar == j$.time.temporal.q.a ? this.d : bVar == j$.time.temporal.q.c ? this.b.l(bVar) : bVar.a(this);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        j$.time.chrono.m mVar = this.c;
        String strConcat = mVar != null ? " with chronology ".concat(String.valueOf(mVar)) : "";
        j$.time.w wVar = this.d;
        return strValueOf + strConcat + (wVar != null ? " with zone ".concat(String.valueOf(wVar)) : "");
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        InterfaceC0005b interfaceC0005b = this.a;
        return (interfaceC0005b == null || !pVar.isDateBased()) ? this.b.x(pVar) : interfaceC0005b.x(pVar);
    }
}
