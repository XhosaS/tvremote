package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.os.Build;
import android.view.View;
import com.google.android.videos.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public /* synthetic */ class gez {
    public gez() {
    }

    public static String A(Collection collection) {
        return !collection.isEmpty() ? ylh.q(yfm.ax(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},") : " }";
    }

    public static String B(ggw ggwVar) {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(ggwVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(A(yfm.aj(ggwVar.b.values(), new fab(7))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(A(ggwVar.c));
        sb.append("\n            |    indices = {");
        Set set = ggwVar.d;
        sb.append(A(set != null ? yfm.aj(set, new fab(8)) : yhb.a));
        sb.append("\n            |}\n        ");
        return ylh.t(sb.toString());
    }

    public static void C(Collection collection) {
        ylh.q(yfm.ax(collection, ",", null, null, null, 62), "    ");
        ylh.q(" }", "    ");
    }

    public static void D(Collection collection) {
        ylh.q(yfm.ax(collection, ",", null, null, null, 62), "    ");
        ylh.q("},", "    ");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean E(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = defpackage.yks.e(r8, r9)
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
            java.lang.CharSequence r8 = defpackage.ylh.E(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.yks.e(r8, r9)
            return r8
        L5b:
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gez.E(java.lang.String, java.lang.String):boolean");
    }

    public static boolean F(ggw ggwVar, Object obj) {
        Set set;
        if (ggwVar == obj) {
            return true;
        }
        if (!(obj instanceof ggw)) {
            return false;
        }
        ggw ggwVar2 = (ggw) obj;
        if (!yks.e(ggwVar.a, ggwVar2.a) || !yks.e(ggwVar.b, ggwVar2.b) || !yks.e(ggwVar.c, ggwVar2.c)) {
            return false;
        }
        Set set2 = ggwVar.d;
        if (set2 == null || (set = ggwVar2.d) == null) {
            return true;
        }
        return yks.e(set2, set);
    }

    public static void G(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static int H(ghi ghiVar, String str) {
        int I = I(ghiVar, str);
        if (I >= 0) {
            return I;
        }
        int I2 = I(ghiVar, "`" + str + '`');
        if (I2 >= 0) {
            return I2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int iA = ghiVar.a();
        String str2 = "." + str;
        String str3 = "." + str + '`';
        for (int i = 0; i < iA; i++) {
            String strC = ghiVar.c(i);
            if (strC.length() >= str.length() + 2 && (ylh.R(strC, str2) || (strC.charAt(0) == '`' && ylh.R(strC, str3)))) {
                return i;
            }
        }
        return -1;
    }

    public static int I(ghi ghiVar, String str) {
        int iA = ghiVar.a();
        for (int i = 0; i < iA; i++) {
            if (yks.e(str, ghiVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int J(ghi ghiVar, String str) throws IOException {
        int iH = H(ghiVar, str);
        if (iH >= 0) {
            return iH;
        }
        int iA = ghiVar.a();
        ArrayList arrayList = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            arrayList.add(ghiVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + yfm.ax(arrayList, null, null, null, null, 63) + ']');
    }

    public static int K(gic gicVar) throws Exception {
        gicVar.getClass();
        ghi ghiVarA = gicVar.a("SELECT changes()");
        try {
            ghiVarA.l();
            int iB = (int) ghiVarA.b(0);
            wef.r(ghiVarA, null);
            return iB;
        } finally {
        }
    }

    public static long L(gic gicVar) throws Exception {
        if (K(gicVar) == 0) {
            return -1L;
        }
        ghi ghiVarA = gicVar.a("SELECT last_insert_rowid()");
        try {
            ghiVarA.l();
            long jB = ghiVarA.b(0);
            wef.r(ghiVarA, null);
            return jB;
        } finally {
        }
    }

    public static void M(ir irVar, yjv yjvVar) {
        ir irVar2 = new ir(999);
        int i = irVar.d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            irVar2.put(irVar.d(i2), irVar.g(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                yjvVar.a(irVar2);
                irVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            yjvVar.a(irVar2);
        }
    }

    public static Object N(Class cls) throws ClassNotFoundException {
        String name;
        String str;
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            canonicalName.getClass();
        }
        String strConcat = ylh.X(canonicalName, '.', '_').concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    private static Object O(gex gexVar, yjz yjzVar, yih yihVar) {
        yof yofVar = new yof(wcq.S(yihVar), 1);
        yofVar.v();
        try {
            Executor executor = gexVar.d;
            if (executor == null) {
                yks.c("internalTransactionExecutor");
                executor = null;
            }
            executor.execute(new bd((yoe) yofVar, gexVar, yjzVar, 9));
        } catch (RejectedExecutionException e) {
            yofVar.e(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objI = yofVar.i();
        if (objI == yio.a) {
            yihVar.getClass();
        }
        return objI;
    }

    public static Object b(gex gexVar, yjv yjvVar, yih yihVar) {
        return (gexVar.s() && gexVar.u() && gexVar.t()) ? yjvVar.a(yihVar) : yihVar.getContext().get(yrh.b) == null ? yjvVar.a(yihVar) : c(gexVar, yjvVar, yihVar);
    }

    public static Object c(gex gexVar, yjv yjvVar, yih yihVar) {
        daz dazVar = new daz(yjvVar, (yih) null, 6);
        gfi gfiVar = (gfi) yihVar.getContext().get(gfi.b);
        yii yiiVar = gfiVar != null ? gfiVar.a : null;
        return yiiVar != null ? ykr.l(yiiVar, dazVar, yihVar) : O(gexVar, dazVar, yihVar);
    }

    public static gev d(Context context, Class cls, String str) {
        context.getClass();
        if (ylh.L(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (yks.e(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new gev(context, cls, str);
    }

    public static ysx e(yjz yjzVar) {
        return vyf.M(new ysq(new daz(yjzVar, (yih) null, 5, (short[]) null)), -2);
    }

    public static gbn f() {
        gbn gbnVar = gbn.a;
        gbnVar.getClass();
        return gbnVar;
    }

    public static String g(ggr ggrVar) {
        return ylh.t("\n            |FtsTableInfo {\n            |   name = '" + ggrVar.a + "',\n            |   columns = {" + A(yfm.ai(ggrVar.b)) + "\n            |   options = {" + A(yfm.ai(ggrVar.c)) + "\n            |}\n        ");
    }

    public static boolean h(ggr ggrVar, Object obj) {
        if (ggrVar == obj) {
            return true;
        }
        if (!(obj instanceof ggr)) {
            return false;
        }
        ggr ggrVar2 = (ggr) obj;
        if (yks.e(ggrVar.a, ggrVar2.a) && yks.e(ggrVar.b, ggrVar2.b)) {
            return yks.e(ggrVar.c, ggrVar2.c);
        }
        return false;
    }

    public static Object i(gex gexVar, boolean z, yih yihVar) {
        gfi gfiVar = (gfi) yihVar.getContext().get(gfi.b);
        yil yilVar = gfiVar != null ? gfiVar.a : null;
        if (!gexVar.s()) {
            yil yilVarK = gexVar.k();
            if (yilVar == null) {
                yilVar = yim.a;
            }
            return yilVarK.plus(yilVar);
        }
        if (yilVar != null) {
            return gexVar.k().plus(yilVar);
        }
        if (!z) {
            return gexVar.k();
        }
        yil yilVar2 = gexVar.b;
        if (yilVar2 != null) {
            return yilVar2;
        }
        yks.c("transactionContext");
        return null;
    }

    public static Object j(gex gexVar, boolean z, boolean z2, yjv yjvVar) {
        gexVar.m();
        gexVar.n();
        yil yilVar = (yil) gexVar.g.get();
        if (yilVar == null) {
            yilVar = yim.a;
        }
        return o(new ggl(yilVar, gexVar, z2, z, yjvVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object k(defpackage.gex r11, defpackage.yjv r12, defpackage.yih r13) throws java.lang.Throwable {
        /*
            boolean r1 = r13 instanceof defpackage.ggm
            if (r1 == 0) goto L13
            r1 = r13
            ggm r1 = (defpackage.ggm) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.d = r2
            goto L18
        L13:
            ggm r1 = new ggm
            r1.<init>(r13)
        L18:
            r6 = r1
            java.lang.Object r0 = r6.c
            yio r7 = defpackage.yio.a
            int r1 = r6.d
            r2 = 4
            r3 = 3
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L4d
            if (r1 == r9) goto L49
            if (r1 == r8) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            defpackage.ybn.f(r0)
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.Object r1 = r6.b
            java.lang.Object r3 = r6.a
            defpackage.ybn.f(r0)
            r10 = r3
            r3 = r0
            r0 = r1
            r1 = r10
            goto L9f
        L45:
            defpackage.ybn.f(r0)
            return r0
        L49:
            defpackage.ybn.f(r0)
            return r0
        L4d:
            defpackage.ybn.f(r0)
            boolean r0 = r11.s()
            if (r0 == 0) goto L6a
            ahk r0 = new ahk
            r4 = 6
            r5 = 0
            r3 = 0
            r1 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r9
            java.lang.Object r0 = c(r11, r0, r6)
            if (r0 != r7) goto L69
            goto Lb7
        L69:
            return r0
        L6a:
            boolean r0 = r11.s()
            if (r0 == 0) goto L90
            boolean r0 = r11.u()
            if (r0 == 0) goto L90
            boolean r0 = r11.t()
            if (r0 == 0) goto L90
            ayg r0 = new ayg
            r4 = 3
            r5 = 0
            r2 = 0
            r1 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r8
            java.lang.Object r0 = r11.x(r0, r6)
            if (r0 != r7) goto L8f
            goto Lb7
        L8f:
            return r0
        L90:
            r6.a = r11
            r6.b = r12
            r6.d = r3
            java.lang.Object r3 = i(r11, r9, r6)
            if (r3 != r7) goto L9d
            goto Lb7
        L9d:
            r1 = r11
            r0 = r12
        L9f:
            yil r3 = (defpackage.yil) r3
            dbv r4 = new dbv
            gex r1 = (defpackage.gex) r1
            r5 = 14
            r8 = 0
            r4.<init>(r8, r1, r0, r5)
            r6.a = r8
            r6.b = r8
            r6.d = r2
            java.lang.Object r0 = defpackage.ykr.l(r3, r4, r6)
            if (r0 != r7) goto Lb8
        Lb7:
            return r7
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gez.k(gex, yjv, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object l(defpackage.gex r16, boolean r17, boolean r18, defpackage.yjv r19, defpackage.yih r20) throws java.lang.Throwable {
        /*
            r0 = r20
            boolean r1 = r0 instanceof defpackage.ggo
            if (r1 == 0) goto L15
            r1 = r0
            ggo r1 = (defpackage.ggo) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            ggo r1 = new ggo
            r1.<init>(r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.e
            yio r8 = defpackage.yio.a
            int r1 = r7.f
            r2 = 3
            r3 = 2
            r9 = 1
            if (r1 == 0) goto L4d
            if (r1 == r9) goto L49
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            defpackage.ybn.f(r0)
            return r0
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            boolean r1 = r7.d
            boolean r3 = r7.c
            java.lang.Object r4 = r7.b
            java.lang.Object r5 = r7.a
            defpackage.ybn.f(r0)
            r12 = r3
            r14 = r4
            r3 = r0
            r0 = r5
        L47:
            r13 = r1
            goto L99
        L49:
            defpackage.ybn.f(r0)
            return r0
        L4d:
            defpackage.ybn.f(r0)
            boolean r0 = r16.s()
            if (r0 == 0) goto L7d
            boolean r0 = r16.u()
            if (r0 == 0) goto L7d
            boolean r0 = r16.t()
            if (r0 == 0) goto L7d
            ggp r0 = new ggp
            r4 = 0
            r6 = 0
            r3 = r16
            r2 = r17
            r1 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r0
            r0 = r3
            r7.f = r9
            java.lang.Object r0 = r0.x(r1, r7)
            if (r0 != r8) goto L7c
            goto Lb2
        L7c:
            return r0
        L7d:
            r0 = r16
            r1 = r18
            r7.a = r0
            r5 = r19
            r7.b = r5
            r4 = r17
            r7.c = r4
            r7.d = r1
            r7.f = r3
            java.lang.Object r3 = i(r0, r1, r7)
            if (r3 != r8) goto L96
            goto Lb2
        L96:
            r12 = r4
            r14 = r5
            goto L47
        L99:
            yil r3 = (defpackage.yil) r3
            ggn r9 = new ggn
            r11 = r0
            gex r11 = (defpackage.gex) r11
            r15 = 0
            r10 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = 0
            r7.a = r0
            r7.b = r0
            r7.f = r2
            java.lang.Object r0 = defpackage.ykr.l(r3, r9, r7)
            if (r0 != r8) goto Lb3
        Lb2:
            return r8
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gez.l(gex, boolean, boolean, yjv, yih):java.lang.Object");
    }

    public static void m(gic gicVar) throws Exception {
        yhp yhpVar = new yhp((byte[]) null);
        ghi ghiVarA = gicVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (ghiVarA.l()) {
            try {
                yhpVar.add(ghiVarA.d(0));
            } finally {
            }
        }
        wef.r(ghiVarA, null);
        for (String str : yfm.o(yhpVar)) {
            if (ylh.ac(str, "room_fts_content_sync_")) {
                t(gicVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }

    public static void n(ggh gghVar, gic gicVar) {
        gghVar.a(gicVar.a);
    }

    public static Object o(yjz yjzVar) {
        Thread.interrupted();
        return ykr.n(yim.a, new dlo(yjzVar, (yih) null, 2));
    }

    public static ysx p(gex gexVar, String[] strArr, yjv yjvVar) {
        int length = strArr.length;
        geo geoVarB = gexVar.b();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, length);
        strArr2.getClass();
        gft gftVar = geoVarB.b;
        yfw yfwVarF = gftVar.f(strArr2);
        String[] strArr3 = (String[]) yfwVarF.a;
        int[] iArr = (int[]) yfwVarF.b;
        strArr3.getClass();
        iArr.getClass();
        ysq ysqVar = new ysq(new gey(gftVar, iArr, strArr3, (yih) null, 2));
        gez gezVar = geoVarB.h;
        return new gfy(vyf.G(ysqVar), gexVar, yjvVar);
    }

    public static String q(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static Object r(ges gesVar, String str, yih yihVar) {
        Object objA = gesVar.a(str, new fyh(13), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    public static void s(ghp ghpVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    ghpVar.d(i);
                } else if (obj instanceof byte[]) {
                    ghpVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    ghpVar.b(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    ghpVar.b(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    ghpVar.c(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    ghpVar.c(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    ghpVar.c(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    ghpVar.c(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    ghpVar.e(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    ghpVar.c(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }

    public static void t(gic gicVar, String str) {
        ghi ghiVarA = gicVar.a(str);
        try {
            ghiVarA.l();
            wef.r(ghiVarA, null);
        } finally {
        }
    }

    public static void u(int i, String str) {
        throw new SQLException(a.cf(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static ghe v(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            ghe gheVar = tag instanceof ghe ? (ghe) tag : null;
            if (gheVar != null) {
                return gheVar;
            }
            Object objD = cws.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    public static void w(View view, ghe gheVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, gheVar);
    }

    public static ArrayList x(Collection collection) {
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }

    public static ghd y(ghe gheVar) {
        return new ghd(new ghh(gheVar, new gem(gheVar, 5)));
    }

    public static void z(String str) {
        throw new IllegalArgumentException(a.cg(str, "No valid saved state was found for the key '", "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public gez(byte[] bArr) {
    }

    public void a(ghk ghkVar) {
    }
}
