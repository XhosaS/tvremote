package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0083b;
import j$.util.Objects;

/* loaded from: classes4.dex */
public final class o {
    public final j$.time.temporal.k a;
    public final DateTimeFormatter b;
    public int c;

    public o(j$.time.temporal.k kVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVar = dateTimeFormatter.d;
        if (mVar != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) kVar.J(j$.time.temporal.o.b);
            ZoneId zoneId = (ZoneId) kVar.J(j$.time.temporal.o.a);
            InterfaceC0083b interfaceC0083bB = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            Objects.equals(null, zoneId);
            if (mVar != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (mVar != null) {
                    if (kVar.d(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC0083bB = mVar3.B(kVar);
                    } else if (mVar != j$.time.chrono.t.c || mVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && kVar.d(aVar)) {
                                throw new j$.time.b("Unable to apply override chronology '" + String.valueOf(mVar) + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + String.valueOf(kVar));
                            }
                        }
                    }
                }
                kVar = new n(interfaceC0083bB, kVar, mVar3, zoneId);
            }
        }
        this.a = kVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.n nVar) {
        int i = this.c;
        j$.time.temporal.k kVar = this.a;
        if (i <= 0 || kVar.d(nVar)) {
            return Long.valueOf(kVar.C(nVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
