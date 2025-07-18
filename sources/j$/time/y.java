package j$.time;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class y extends w implements j$.time.temporal.m, j$.time.temporal.n, Comparable {
    public static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final y e = J(0);
    public static final y f = J(-64800);
    public static final y g = J(64800);
    private static final long serialVersionUID = 2357656521762053153L;
    public final int a;
    public final transient String b;

    public y(int i) {
        String string;
        this.a = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.b = string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.y H(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.a(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.y.d
            java.lang.Object r0 = r0.get(r7)
            j$.time.y r0 = (j$.time.y) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = K(r7, r2, r3)
            int r1 = K(r7, r6, r2)
            int r2 = K(r7, r5, r2)
            goto L85
        L37:
            j$.time.b r0 = new j$.time.b
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = K(r7, r2, r3)
            int r1 = K(r7, r1, r3)
            int r2 = K(r7, r4, r3)
            goto L85
        L50:
            int r0 = K(r7, r2, r3)
            int r1 = K(r7, r6, r2)
        L58:
            r2 = 0
            goto L85
        L5a:
            int r0 = K(r7, r2, r3)
            int r1 = K(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = K(r7, r2, r3)
            r1 = 0
            goto L58
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.b r0 = new j$.time.b
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.y r7 = I(r7, r0, r1)
            return r7
        La8:
            j$.time.y r7 = I(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.y.H(java.lang.String):j$.time.y");
    }

    public static y I(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C0003b("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C0003b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C0003b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C0003b("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C0003b("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C0003b("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new C0003b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return J((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y J(int i) {
        if (i < -64800 || i > 64800) {
            throw new C0003b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new y(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = c;
        y yVar = (y) concurrentHashMap.get(numValueOf);
        if (yVar != null) {
            return yVar;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new y(i));
        y yVar2 = (y) concurrentHashMap.get(numValueOf);
        d.putIfAbsent(yVar2.b, yVar2);
        return yVar2;
    }

    public static int K(String str, int i, boolean z) {
        if (z && str.charAt(i - 1) != ':') {
            throw new C0003b("Invalid ID for ZoneOffset, colon not found when expected: ".concat(str));
        }
        char cCharAt = str.charAt(i);
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            throw new C0003b("Invalid ID for ZoneOffset, non numeric characters found: ".concat(str));
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static y L(ObjectInput objectInput) {
        byte b = objectInput.readByte();
        return b == Byte.MAX_VALUE ? J(objectInput.readInt()) : J(b * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 8, this);
    }

    @Override // j$.time.w
    public final j$.time.zone.e D() {
        return new j$.time.zone.e(this);
    }

    @Override // j$.time.w
    public final void G(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        M(objectOutput);
    }

    public final void M(DataOutput dataOutput) {
        int i = this.a;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((y) obj).a - this.a;
    }

    @Override // j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.i(this);
    }

    @Override // j$.time.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            if (this.a == ((y) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.w
    public final String h() {
        return this.b;
    }

    @Override // j$.time.w
    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final int i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (x.a(pVar)) {
            throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        return j$.time.temporal.q.d(this, pVar).a(x(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Object l(j$.time.format.b bVar) {
        return (bVar == j$.time.temporal.q.d || bVar == j$.time.temporal.q.e) ? this : j$.time.temporal.q.c(this, bVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l o(j$.time.temporal.l lVar) {
        return lVar.c(this.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.w
    public final String toString() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final long x(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s("Unsupported field: ".concat(String.valueOf(pVar)));
        }
        return pVar.l(this);
    }
}
