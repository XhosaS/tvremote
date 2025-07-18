package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0048b;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class y {
    public final j$.time.temporal.k a;
    public final DateTimeFormatter b;
    public int c;

    public y(j$.time.temporal.k kVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVar = dateTimeFormatter.e;
        if (mVar != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) kVar.U(j$.time.temporal.o.b);
            ZoneId zoneId = (ZoneId) kVar.U(j$.time.temporal.o.a);
            InterfaceC0048b interfaceC0048bG = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            Objects.equals(null, zoneId);
            if (mVar != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (mVar != null) {
                    if (kVar.d(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC0048bG = mVar3.G(kVar);
                    } else if (mVar != j$.time.chrono.t.c || mVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && kVar.d(aVar)) {
                                throw new j$.time.b(j$.time.e.a("Unable to apply override chronology '", String.valueOf(mVar), "' because the temporal object being formatted contains date fields but does not represent a whole date: ", String.valueOf(kVar)));
                            }
                        }
                    }
                }
                kVar = new x(interfaceC0048bG, kVar, mVar3, zoneId);
            }
        }
        this.a = kVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.n nVar) {
        int i = this.c;
        j$.time.temporal.k kVar = this.a;
        if (i <= 0 || kVar.d(nVar)) {
            return Long.valueOf(kVar.H(nVar));
        }
        return null;
    }

    public final Object b(j$.desugar.sun.nio.fs.n nVar) {
        j$.time.temporal.k kVar = this.a;
        Object objU = kVar.U(nVar);
        if (objU == null && this.c == 0) {
            throw new j$.time.b(j$.time.e.a("Unable to extract ", String.valueOf(nVar), " from temporal ", String.valueOf(kVar)));
        }
        return objU;
    }

    public final String toString() {
        return this.a.toString();
    }
}
