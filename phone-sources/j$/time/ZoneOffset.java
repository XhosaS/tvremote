package j$.time;

import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.k, j$.time.temporal.l, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int a;
    public final transient String b;
    public static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = S(0);
    public static final ZoneOffset e = S(-64800);
    public static final ZoneOffset f = S(64800);

    public ZoneOffset(int i) {
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

    public static ZoneOffset P(Temporal temporal) {
        Objects.a(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.J(j$.time.temporal.o.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new b("Unable to obtain ZoneOffset from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.ZoneOffset Q(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.a(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.d
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
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
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r6, r2)
            int r2 = T(r7, r5, r2)
            goto L85
        L37:
            j$.time.b r0 = new j$.time.b
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r1, r3)
            int r2 = T(r7, r4, r3)
            goto L85
        L50:
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r6, r2)
        L58:
            r2 = 0
            goto L85
        L5a:
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r1, r3)
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
            int r0 = T(r7, r2, r3)
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
            j$.time.ZoneOffset r7 = R(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = R(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.Q(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset R(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new b("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new b("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new b("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return S((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset S(int i) {
        if (i < -64800 || i > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = c;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        d.putIfAbsent(zoneOffset2.b, zoneOffset2);
        return zoneOffset2;
    }

    public static int T(String str, int i, boolean z) {
        if (z && str.charAt(i - 1) != ':') {
            throw new b("Invalid ID for ZoneOffset, colon not found when expected: ".concat(str));
        }
        char cCharAt = str.charAt(i);
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
            throw new b("Invalid ID for ZoneOffset, non numeric characters found: ".concat(str));
        }
        return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
    }

    public static ZoneOffset U(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        return b == Byte.MAX_VALUE ? S(objectInput.readInt()) : S(b * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return nVar.m(this);
    }

    @Override // j$.time.temporal.k
    public final Object J(j$.desugar.sun.nio.fs.n nVar) {
        return (nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.e) ? this : j$.time.temporal.o.c(this, nVar);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.e L() {
        return new j$.time.zone.e(this);
    }

    @Override // j$.time.ZoneId
    public final void O(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        V(objectOutput);
    }

    public final void V(DataOutput dataOutput) throws IOException {
        int i = this.a;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.a - this.a;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.OFFSET_SECONDS : nVar != null && nVar.i(this);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.a == ((ZoneOffset) obj).a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final String h() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    public final int i(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.a;
        }
        if (nVar != null) {
            throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return j$.time.temporal.o.d(this, nVar).a(C(nVar), nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q m(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal t(Temporal temporal) {
        return temporal.a(this.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.b;
    }
}
