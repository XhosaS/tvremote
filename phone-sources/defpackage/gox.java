package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gox {
    public static final gox a = gli.y(new LinkedHashMap());
    public final Map b;

    public gox(gox goxVar) {
        goxVar.getClass();
        this.b = new HashMap(goxVar.b);
    }

    public final String a(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final byte[] c(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                bil bilVar = new bil(obj, 5);
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = ((Number) bilVar.a(Integer.valueOf(i))).byteValue();
                }
                return bArr;
            }
        }
        return null;
    }

    public final boolean d(String str) {
        Object obj = this.b.get(str);
        return ((Boolean) (true == (obj instanceof Boolean) ? obj : false)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto L65
            java.lang.Class r2 = r8.getClass()
            java.lang.Class r3 = r9.getClass()
            boolean r2 = defpackage.yks.e(r2, r3)
            if (r2 != 0) goto L16
            goto L65
        L16:
            gox r9 = (defpackage.gox) r9
            java.util.Map r2 = r8.b
            java.util.Map r9 = r9.b
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = defpackage.yks.e(r3, r4)
            if (r4 != 0) goto L2b
            return r1
        L2b:
            java.util.Iterator r3 = r3.iterator()
        L2f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r4 = r9.get(r4)
            if (r5 == 0) goto L61
            if (r4 != 0) goto L48
            goto L61
        L48:
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L5a
            r6 = r5
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            boolean r7 = r4 instanceof java.lang.Object[]
            if (r7 == 0) goto L5a
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r4 = defpackage.yfm.aB(r6, r4)
            goto L5e
        L5a:
            boolean r4 = defpackage.yks.e(r5, r4)
        L5e:
            if (r4 != 0) goto L2f
            goto L63
        L61:
            if (r5 == r4) goto L2f
        L63:
            return r1
        L64:
            return r0
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gox.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return "Data {" + yfm.ax(this.b.entrySet(), null, null, null, new fyh(19), 31) + "}";
    }

    public gox(Map map) {
        this.b = new HashMap(map);
    }
}
