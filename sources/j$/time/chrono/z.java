package j$.time.chrono;

import j$.time.C0003b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class z implements n, Serializable {
    public static final z d;
    public static final z[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient j$.time.f b;
    public final transient String c;

    static {
        z zVar = new z(-1, j$.time.f.L(1868, 1, 1), "Meiji");
        d = zVar;
        e = new z[]{zVar, new z(0, j$.time.f.L(1912, 7, 30), "Taisho"), new z(1, j$.time.f.L(1926, 12, 25), "Showa"), new z(2, j$.time.f.L(1989, 1, 8), "Heisei"), new z(3, j$.time.f.L(2019, 5, 1), "Reiwa")};
    }

    public z(int i, j$.time.f fVar, String str) {
        this.a = i;
        this.b = fVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.chrono.z h(j$.time.f r6) {
        /*
            j$.time.f r0 = j$.time.chrono.y.d
            boolean r1 = j$.time.x.a(r0)
            r2 = 1
            if (r1 == 0) goto L13
            r6.getClass()
            int r0 = r6.D(r0)
            if (r0 >= 0) goto L21
            goto L1f
        L13:
            long r3 = r6.y()
            long r0 = r0.y()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L21
        L1f:
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L3a
            j$.time.chrono.z[] r0 = j$.time.chrono.z.e
            int r1 = r0.length
            int r1 = r1 - r2
        L28:
            if (r1 < 0) goto L38
            r2 = r0[r1]
            j$.time.f r3 = r2.b
            int r3 = r6.compareTo(r3)
            if (r3 < 0) goto L35
            return r2
        L35:
            int r1 = r1 + (-1)
            goto L28
        L38:
            r6 = 0
            return r6
        L3a:
            j$.time.b r6 = new j$.time.b
            java.lang.String r0 = "JapaneseDate before Meiji 6 are not supported"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.z.h(j$.time.f):j$.time.chrono.z");
    }

    public static z q(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            z[] zVarArr = e;
            if (i2 < zVarArr.length) {
                return zVarArr[i2];
            }
        }
        throw new C0003b("Invalid era: " + i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.p(this, pVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.k(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return pVar == aVar ? w.c.q(aVar) : j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.t(this, bVar);
    }

    public final z n() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return q(this.a + 1);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), j$.time.temporal.a.ERA);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ long x(j$.time.temporal.p pVar) {
        return j$.nio.file.attribute.a.m(this, pVar);
    }
}
