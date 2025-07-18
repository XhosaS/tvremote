package j$.time.chrono;

import j$.time.C0003b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class B extends AbstractC0004a implements Serializable {
    public static final B c = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.t q(j$.time.temporal.a aVar) {
        int i = A.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.t.f(tVar.a - 22932, tVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.t.g(tVar2.d - 1911, (-tVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.f(tVar3.a - 1911, tVar3.d - 1911);
    }

    @Override // j$.time.chrono.m
    public final n r(int i) {
        if (i == 0) {
            return E.BEFORE_ROC;
        }
        if (i == 1) {
            return E.ROC;
        }
        throw new C0003b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0005b u(j$.time.temporal.m mVar) {
        return mVar instanceof D ? (D) mVar : new D(j$.time.f.F(mVar));
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
