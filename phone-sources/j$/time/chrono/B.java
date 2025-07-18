package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class B extends AbstractC0082a implements Serializable {
    public static final B c = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0083b B(j$.time.temporal.k kVar) {
        return kVar instanceof D ? (D) kVar : new D(LocalDate.M(kVar));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0091j H(Instant instant, ZoneId zoneId) {
        return l.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final String p() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q v(j$.time.temporal.a aVar) {
        int i = A.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.d;
            return j$.time.temporal.q.f(qVar.a - 22932, qVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.d;
            return j$.time.temporal.q.g(qVar2.d - 1911, (-qVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.d;
        }
        j$.time.temporal.q qVar3 = j$.time.temporal.a.YEAR.d;
        return j$.time.temporal.q.f(qVar3.a - 1911, qVar3.d - 1911);
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final n x(int i) {
        if (i == 0) {
            return E.BEFORE_ROC;
        }
        if (i == 1) {
            return E.ROC;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
