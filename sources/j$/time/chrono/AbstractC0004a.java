package j$.time.chrono;

import j$.time.C0003b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0004a implements m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m i(m mVar, String str) {
        String strN;
        m mVar2 = (m) a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strN = mVar.n()) != null) {
            b.putIfAbsent(strN, mVar);
        }
        return mVar2;
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
        return (obj instanceof AbstractC0004a) && h().compareTo(((AbstractC0004a) obj).h()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ h().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return h();
    }

    @Override // j$.time.chrono.m
    public InterfaceC0008e v(j$.time.h hVar) {
        try {
            return u(hVar).z(j$.time.j.F(hVar));
        } catch (C0003b e) {
            throw new C0003b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(j$.time.h.class)), e);
        }
    }
}
