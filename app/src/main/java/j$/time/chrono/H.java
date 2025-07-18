package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class H extends AbstractC0047a implements Serializable {
    public static final H c = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private H() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final int B(n nVar, int i) {
        if (nVar instanceof K) {
            return nVar == K.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b G(j$.time.temporal.k kVar) {
        return kVar instanceof J ? (J) kVar : new J(j$.time.h.X(kVar));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b N(int i, int i2, int i3) {
        return new J(j$.time.h.h0(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0047a, j$.time.chrono.m
    public final InterfaceC0048b P(Map map, j$.time.format.E e) {
        return (J) super.P(map, e);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0056j Q(Instant instant, ZoneId zoneId) {
        return l.W(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final boolean T(long j) {
        return t.c.T(j - 543);
    }

    @Override // j$.time.chrono.m
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b h(long j) {
        return new J(j$.time.h.i0(j));
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final InterfaceC0048b l() {
        return new J(j$.time.h.X(j$.time.h.g0(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b r(int i, int i2) {
        return new J(j$.time.h.j0(i - 543, i2));
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q w(j$.time.temporal.a aVar) {
        int i = G.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.d;
            return j$.time.temporal.q.f(qVar.a + 6516, qVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.d;
            return j$.time.temporal.q.g(1L, (-(qVar2.a + 543)) + 1, qVar2.d + 543);
        }
        if (i != 3) {
            return aVar.d;
        }
        j$.time.temporal.q qVar3 = j$.time.temporal.a.YEAR.d;
        return j$.time.temporal.q.f(qVar3.a + 543, qVar3.d + 543);
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final List y() {
        return j$.desugar.sun.nio.fs.g.C(K.values());
    }

    @Override // j$.time.chrono.m
    public final n z(int i) {
        if (i == 0) {
            return K.BEFORE_BE;
        }
        if (i == 1) {
            return K.BE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
