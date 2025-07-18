package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class e implements Serializable {
    public static final long[] i = new long[0];
    public static final d[] j = new d[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public e(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeO = LocalDateTime.O(jArr2[i2], 0, zoneOffset);
                int i4 = zoneOffset.a;
                if (zoneOffset2.a > i4) {
                    arrayList.add(localDateTimeO);
                    arrayList.add(localDateTimeO.Q(zoneOffset2.a - i4));
                } else {
                    arrayList.add(localDateTimeO.Q(r3 - i4));
                    arrayList.add(localDateTimeO);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(j$.time.LocalDateTime r6, j$.time.zone.b r7) {
        /*
            j$.time.LocalDateTime r0 = r7.b
            j$.time.LocalDateTime r1 = r7.b
            j$.time.ZoneOffset r2 = r7.d
            j$.time.ZoneOffset r3 = r7.c
            boolean r4 = r7.i()
            if (r4 == 0) goto L26
            boolean r0 = r6.M(r0)
            if (r0 == 0) goto L15
            goto L3d
        L15:
            int r0 = r2.a
            int r3 = r3.a
            int r0 = r0 - r3
            long r3 = (long) r0
            j$.time.LocalDateTime r0 = r1.Q(r3)
            boolean r6 = r6.M(r0)
            if (r6 == 0) goto L2c
            goto L3e
        L26:
            boolean r0 = r6.M(r0)
            if (r0 != 0) goto L2d
        L2c:
            return r2
        L2d:
            int r0 = r2.a
            int r2 = r3.a
            int r0 = r0 - r2
            long r4 = (long) r0
            j$.time.LocalDateTime r0 = r1.Q(r4)
            boolean r6 = r6.M(r0)
            if (r6 == 0) goto L3e
        L3d:
            return r3
        L3e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.a(j$.time.LocalDateTime, j$.time.zone.b):java.lang.Object");
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.V(j$.desugar.sun.nio.fs.g.z(j2 + zoneOffset.a, 86400)).a;
    }

    public static ZoneOffset g(int i2) {
        return ZoneOffset.S(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.zone.b[] b(int r25) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.b(int):j$.time.zone.b[]");
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r10.K(r1) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r10.b.V() <= r1.b.V()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.LocalDateTime r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Objects.equals(this.g, eVar.g) && Arrays.equals(this.a, eVar.a) && Arrays.equals(this.b, eVar.b) && Arrays.equals(this.c, eVar.c) && Arrays.equals(this.e, eVar.e) && Arrays.equals(this.f, eVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.i() ? Collections.EMPTY_LIST : j$.desugar.sun.nio.fs.g.B(new Object[]{bVar.c, bVar.d});
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + String.valueOf(this.b[r1.length - 1]) + "]";
    }

    public e(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public e(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
