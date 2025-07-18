package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqi {
    public static final String a(Collection collection) {
        return !collection.isEmpty() ? agyv.c(agqq.G(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final String b(bqf bqfVar) {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(bqfVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(a(agqq.w(bqfVar.b.values(), new bqg())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(a(bqfVar.c));
        sb.append("\n            |    indices = {");
        Set set = bqfVar.d;
        sb.append(a(set != null ? agqq.w(set, new bqh()) : agrd.a));
        sb.append("\n            |}\n        ");
        return agyv.d(sb.toString());
    }

    public static final void c(Collection collection) {
        agyv.c(agqq.G(collection, ",", null, null, null, 62));
        agyv.c(" }");
    }

    public static final void d(Collection collection) {
        agyv.c(agqq.G(collection, ",", null, null, null, 62));
        agyv.c("},");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = defpackage.agvy.c(r8, r9)
            r1 = 1
            if (r0 != 0) goto L5c
            int r0 = r8.length()
            r2 = 0
            if (r0 == 0) goto L5b
            r0 = r2
            r3 = r0
            r4 = r3
        L11:
            int r5 = r8.length()
            if (r0 >= r5) goto L3f
            char r5 = r8.charAt(r0)
            int r6 = r4 + 1
            r7 = 40
            if (r4 != 0) goto L25
            if (r5 != r7) goto L5b
            r4 = r2
            r5 = r7
        L25:
            if (r5 == r7) goto L39
            r7 = 41
            if (r5 == r7) goto L2c
            goto L3b
        L2c:
            int r3 = r3 + (-1)
            if (r3 != 0) goto L3b
            int r5 = r8.length()
            int r5 = r5 + (-1)
            if (r4 == r5) goto L3b
            goto L5b
        L39:
            int r3 = r3 + 1
        L3b:
            int r0 = r0 + 1
            r4 = r6
            goto L11
        L3f:
            if (r3 != 0) goto L5b
            int r0 = r8.length()
            int r0 = r0 + (-1)
            java.lang.String r8 = r8.substring(r1, r0)
            r8.getClass()
            java.lang.CharSequence r8 = defpackage.agyv.i(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.agvy.c(r8, r9)
            return r8
        L5b:
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqi.e(java.lang.String, java.lang.String):boolean");
    }

    public static final boolean f(bqf bqfVar, Object obj) {
        Set set;
        if (bqfVar == obj) {
            return true;
        }
        if (!(obj instanceof bqf)) {
            return false;
        }
        bqf bqfVar2 = (bqf) obj;
        if (!agvy.c(bqfVar.a, bqfVar2.a) || !agvy.c(bqfVar.b, bqfVar2.b) || !agvy.c(bqfVar.c, bqfVar2.c)) {
            return false;
        }
        Set set2 = bqfVar.d;
        if (set2 == null || (set = bqfVar2.d) == null) {
            return true;
        }
        return agvy.c(set2, set);
    }
}
