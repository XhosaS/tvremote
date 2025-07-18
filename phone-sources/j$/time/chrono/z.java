package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class z implements n, Serializable {
    public static final z d;
    public static final z[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        z zVar = new z(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = zVar;
        e = new z[]{zVar, new z(0, LocalDate.of(1912, 7, 30), "Taisho"), new z(1, LocalDate.of(1926, 12, 25), "Showa"), new z(2, LocalDate.of(1989, 1, 8), "Heisei"), new z(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public z(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static z c(LocalDate localDate) {
        if (localDate.R(y.d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (localDate.compareTo(zVar.b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    public static z h(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            z[] zVarArr = e;
            if (i2 < zVarArr.length) {
                return zVarArr[i2];
            }
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ long C(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.j(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.p(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ boolean d(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.l(this, nVar);
    }

    public final z f() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return h(this.a + 1);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int i(j$.time.temporal.n nVar) {
        return j$.desugar.sun.nio.fs.g.i(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return nVar == aVar ? w.c.v(aVar) : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    public final String toString() {
        return this.c;
    }
}
