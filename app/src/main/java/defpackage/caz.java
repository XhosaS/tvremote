package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caz {
    public static final caw a = new caw();
    public static final caz b = cav.a(new LinkedHashMap());
    public final Map c;

    public caz(caz cazVar) {
        cazVar.getClass();
        this.c = new HashMap(cazVar.c);
    }

    public final String a(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map b() {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(this.c);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final boolean c(String str, Class cls) {
        Object obj = this.c.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final boolean d(String str) {
        Object obj = this.c.get(str);
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
            boolean r2 = defpackage.agvy.c(r2, r3)
            if (r2 != 0) goto L16
            goto L65
        L16:
            caz r9 = (defpackage.caz) r9
            java.util.Map r2 = r8.c
            java.util.Map r9 = r9.c
            java.util.Set r3 = r2.keySet()
            java.util.Set r4 = r9.keySet()
            boolean r4 = defpackage.agvy.c(r3, r4)
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
            boolean r4 = defpackage.agqj.b(r6, r4)
            goto L5e
        L5a:
            boolean r4 = defpackage.agvy.c(r5, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.c.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return "Data {" + agqq.G(this.c.entrySet(), null, null, null, new agux() { // from class: cau
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                caw cawVar = caz.a;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            }
        }, 31) + "}";
    }

    public caz(Map map) {
        this.c = new HashMap(map);
    }
}
