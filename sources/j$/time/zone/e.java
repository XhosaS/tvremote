package j$.time.zone;

import j$.time.Instant;
import j$.time.y;
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

/* loaded from: classes2.dex */
public final class e implements Serializable {
    public static final long[] i = new long[0];
    public static final d[] j = new d[0];
    public static final j$.time.h[] k = new j$.time.h[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final y[] b;
    public final long[] c;
    public final j$.time.h[] d;
    public final y[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public e(long[] jArr, y[] yVarArr, long[] jArr2, y[] yVarArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = yVarArr;
        this.c = jArr2;
        this.e = yVarArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                y yVar = yVarArr2[i2];
                int i3 = i2 + 1;
                y yVar2 = yVarArr2[i3];
                j$.time.h hVarH = j$.time.h.H(jArr2[i2], 0, yVar);
                int i4 = yVar.a;
                if (yVar2.a > i4) {
                    arrayList.add(hVarH);
                    arrayList.add(hVarH.J(yVar2.a - i4));
                } else {
                    arrayList.add(hVarH.J(r3 - i4));
                    arrayList.add(hVarH);
                }
                i2 = i3;
            }
            this.d = (j$.time.h[]) arrayList.toArray(new j$.time.h[arrayList.size()]);
        }
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(j$.time.h r6, j$.time.zone.b r7) {
        /*
            j$.time.h r0 = r7.b
            j$.time.h r1 = r7.b
            j$.time.y r2 = r7.d
            j$.time.y r3 = r7.c
            int r4 = r2.a
            int r5 = r3.a
            if (r4 <= r5) goto L26
            boolean r0 = r6.F(r0)
            if (r0 == 0) goto L15
            goto L3d
        L15:
            int r0 = r2.a
            int r3 = r3.a
            int r0 = r0 - r3
            long r3 = (long) r0
            j$.time.h r0 = r1.J(r3)
            boolean r6 = r6.F(r0)
            if (r6 == 0) goto L2c
            goto L3e
        L26:
            boolean r0 = r6.F(r0)
            if (r0 != 0) goto L2d
        L2c:
            return r2
        L2d:
            int r0 = r2.a
            int r2 = r3.a
            int r0 = r0 - r2
            long r4 = (long) r0
            j$.time.h r0 = r1.J(r4)
            boolean r6 = r6.F(r0)
            if (r6 == 0) goto L3e
        L3d:
            return r3
        L3e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.a(j$.time.h, j$.time.zone.b):java.lang.Object");
    }

    public static int c(long j2, y yVar) {
        return j$.time.f.M(j$.nio.file.attribute.a.D(j2 + yVar.a, 86400)).a;
    }

    public static y g(int i2) {
        return y.J(i2 / 1000);
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

    public final y d(Instant instant) {
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
        y[] yVarArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return yVarArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, yVarArr[yVarArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r10.D(r1) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r10.b.O() <= r1.b.O()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.h r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.e.e(j$.time.h):java.lang.Object");
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

    public final List f(j$.time.h hVar) {
        Object objE = e(hVar);
        if (!(objE instanceof b)) {
            return Collections.singletonList((y) objE);
        }
        b bVar = (b) objE;
        y yVar = bVar.d;
        int i2 = yVar.a;
        y yVar2 = bVar.c;
        if (i2 > yVar2.a) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {yVar2, yVar};
        ArrayList arrayList = new ArrayList(2);
        for (int i3 = 0; i3 < 2; i3++) {
            Object obj = objArr[i3];
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
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

    public e(y yVar) {
        y[] yVarArr = {yVar};
        this.b = yVarArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = yVarArr;
        this.f = j;
        this.g = null;
    }

    public e(TimeZone timeZone) {
        y[] yVarArr = {g(timeZone.getRawOffset())};
        this.b = yVarArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = yVarArr;
        this.f = j;
        this.g = timeZone;
    }
}
