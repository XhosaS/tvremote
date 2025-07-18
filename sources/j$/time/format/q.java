package j$.time.format;

import j$.time.C0003b;
import j$.time.Instant;
import j$.time.chrono.InterfaceC0005b;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class q {
    public final j$.time.temporal.m a;
    public final a b;
    public int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.time.format.p] */
    public q(Instant instant, a aVar) {
        j$.time.chrono.m mVar = aVar.d;
        if (mVar != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) instant.l(j$.time.temporal.q.b);
            j$.time.w wVar = (j$.time.w) instant.l(j$.time.temporal.q.a);
            InterfaceC0005b interfaceC0005bU = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            Objects.equals(null, wVar);
            if (mVar != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (mVar != null) {
                    if (instant.e(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC0005bU = mVar3.u(instant);
                    } else if (mVar != j$.time.chrono.t.c || mVar2 != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.isDateBased() && instant.e(aVar2)) {
                                throw new C0003b("Unable to apply override chronology '" + String.valueOf(mVar) + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + String.valueOf(instant));
                            }
                        }
                    }
                }
                instant = new p(interfaceC0005bU, instant, mVar3, wVar);
            }
        }
        this.a = instant;
        this.b = aVar;
    }

    public final Long a(j$.time.temporal.p pVar) {
        int i = this.c;
        j$.time.temporal.m mVar = this.a;
        if (i <= 0 || mVar.e(pVar)) {
            return Long.valueOf(mVar.x(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
