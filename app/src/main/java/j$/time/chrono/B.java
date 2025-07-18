package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class B extends AbstractC0047a implements Serializable {
    public static final B c = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final int B(n nVar, int i) {
        if (nVar instanceof E) {
            return nVar == E.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b G(j$.time.temporal.k kVar) {
        return kVar instanceof D ? (D) kVar : new D(j$.time.h.X(kVar));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b N(int i, int i2, int i3) {
        return new D(j$.time.h.h0(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0047a, j$.time.chrono.m
    public final InterfaceC0048b P(Map map, j$.time.format.E e) {
        return (D) super.P(map, e);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0056j Q(Instant instant, ZoneId zoneId) {
        return l.W(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final boolean T(long j) {
        return t.c.T(j + 1911);
    }

    @Override // j$.time.chrono.m
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b h(long j) {
        return new D(j$.time.h.i0(j));
    }

    @Override // j$.time.chrono.AbstractC0047a
    public final InterfaceC0048b l() {
        return new D(j$.time.h.X(j$.time.h.g0(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0048b r(int i, int i2) {
        return new D(j$.time.h.j0(i + 1911, i2));
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q w(j$.time.temporal.a aVar) {
        int i = A.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.q qVar = j$.time.temporal.a.PROLEPTIC_MONTH.d;
            return j$.time.temporal.q.f(qVar.a - 22932, qVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.q qVar2 = j$.time.temporal.a.YEAR.d;
            return j$.time.temporal.q.g(1L, qVar2.d - 1911, (-qVar2.a) + 1912);
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
    public final List y() {
        return j$.desugar.sun.nio.fs.g.C(E.values());
    }

    @Override // j$.time.chrono.m
    public final n z(int i) {
        if (i == 0) {
            return E.BEFORE_ROC;
        }
        if (i == 1) {
            return E.ROC;
        }
        throw new j$.time.b("Invalid era: " + i);
    }
}
