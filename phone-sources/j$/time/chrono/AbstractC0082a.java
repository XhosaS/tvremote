package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0082a implements m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m i(m mVar, String str) {
        String strP;
        m mVar2 = (m) a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strP = mVar.p()) != null) {
            b.putIfAbsent(strP, mVar);
        }
        return mVar2;
    }

    @Override // j$.time.chrono.m
    public InterfaceC0086e F(j$.time.temporal.k kVar) {
        try {
            return B(kVar).E(j$.time.i.M(kVar));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(kVar.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return h().compareTo(((m) obj).h());
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0082a) && h().compareTo(((AbstractC0082a) obj).h()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ h().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.j] */
    @Override // j$.time.chrono.m
    public InterfaceC0091j r(j$.time.temporal.k kVar) {
        try {
            ZoneId zoneIdK = ZoneId.K(kVar);
            try {
                kVar = H(Instant.L(kVar), zoneIdK);
                return kVar;
            } catch (j$.time.b unused) {
                return l.K(zoneIdK, null, C0088g.K(this, F(kVar)));
            }
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(kVar.getClass())), e);
        }
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return h();
    }
}
