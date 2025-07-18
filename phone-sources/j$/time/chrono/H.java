package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class H extends AbstractC0082a implements Serializable {
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
    public final InterfaceC0083b B(j$.time.temporal.k kVar) {
        return kVar instanceof J ? (J) kVar : new J(LocalDate.M(kVar));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0091j H(Instant instant, ZoneId zoneId) {
        return l.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String p() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q v(j$.time.temporal.a aVar) {
        int i = G.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.d;
            return j$.time.temporal.q.f(qVar.a + 6516, qVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.d;
            return j$.time.temporal.q.g((-(qVar2.a + 543)) + 1, qVar2.d + 543);
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
    public final n x(int i) {
        if (i == 0) {
            return K.BEFORE_BE;
        }
        if (i == 1) {
            return K.BE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
