package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class w extends AbstractC0082a implements Serializable {
    public static final w c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    private w() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0083b B(j$.time.temporal.k kVar) {
        return kVar instanceof y ? (y) kVar : new y(LocalDate.M(kVar));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0091j H(Instant instant, ZoneId zoneId) {
        return l.L(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String p() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.q v(j$.time.temporal.a aVar) {
        switch (v.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(aVar)));
            case 5:
                z[] zVarArr = z.e;
                int i = zVarArr[zVarArr.length - 1].b.a;
                int iMin = 1000000000 - zVarArr[zVarArr.length - 1].b.a;
                int i2 = zVarArr[0].b.a;
                for (int i3 = 1; i3 < zVarArr.length; i3++) {
                    z zVar = zVarArr[i3];
                    iMin = Math.min(iMin, (zVar.b.a - i2) + 1);
                    i2 = zVar.b.a;
                }
                return j$.time.temporal.q.g(iMin, 999999999 - i);
            case 6:
                z zVar2 = z.d;
                long jMin = j$.time.temporal.a.DAY_OF_YEAR.d.c;
                for (z zVar3 : z.e) {
                    jMin = Math.min(jMin, ((zVar3.b.S() ? 366 : 365) - zVar3.b.P()) + 1);
                    if (zVar3.f() != null) {
                        jMin = Math.min(jMin, zVar3.f().b.P() - 1);
                    }
                }
                return j$.time.temporal.q.g(jMin, j$.time.temporal.a.DAY_OF_YEAR.d.d);
            case 7:
                return j$.time.temporal.q.f(y.d.a, 999999999L);
            case 8:
                long j = z.d.a;
                z[] zVarArr2 = z.e;
                return j$.time.temporal.q.f(j, zVarArr2[zVarArr2.length - 1].a);
            default:
                return aVar.d;
        }
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final n x(int i) {
        return z.h(i);
    }
}
