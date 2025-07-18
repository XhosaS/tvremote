package j$.time.chrono;

import j$.time.C0003b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class H extends AbstractC0004a implements Serializable {
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
    public final String h() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t q(j$.time.temporal.a aVar) {
        int i = G.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.t.f(tVar.a + 6516, tVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.t.g((-(tVar2.a + 543)) + 1, tVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.f(tVar3.a + 543, tVar3.d + 543);
    }

    @Override // j$.time.chrono.m
    public final n r(int i) {
        if (i == 0) {
            return K.BEFORE_BE;
        }
        if (i == 1) {
            return K.BE;
        }
        throw new C0003b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0005b u(j$.time.temporal.m mVar) {
        return mVar instanceof J ? (J) mVar : new J(j$.time.f.F(mVar));
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
