package defpackage;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlr {
    public static final dlm a = new dlm();
    public static final ylq b;
    public static dbd c;
    public static final dde d;
    public final Context e;
    public final AppWidgetManager f;
    private final yft g = new yga(new ddd(this, 3));

    static {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            objInvoke.getClass();
            processName = (String) objInvoke;
        }
        cjp cjpVar = new cjp(6);
        yot yotVar = ypk.a;
        b = new dcx("GlanceAppWidgetManager-".concat(String.valueOf(processName)), cjpVar, yoz.l(yya.a.plus(new yqy(null))));
        d = new dde("list::Providers");
    }

    public dlr(Context context) {
        this.e = context;
        this.f = AppWidgetManager.getInstance(context);
    }

    public final dbd a() {
        return (dbd) this.g.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Class r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dlp
            if (r0 == 0) goto L13
            r0 = r8
            dlp r0 = (defpackage.dlp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlp r0 = new dlp
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Class r7 = r0.d
            defpackage.ybn.f(r8)
            goto L3e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r6.c(r0)
            if (r8 == r1) goto L91
        L3e:
            dln r8 = (defpackage.dln) r8
            java.lang.String r7 = r7.getCanonicalName()
            if (r7 == 0) goto L89
            java.util.Map r8 = r8.a
            java.lang.Object r7 = r8.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L53
            yhb r7 = defpackage.yhb.a
            return r7
        L53:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r7.next()
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            android.appwidget.AppWidgetManager r1 = r6.f
            int[] r0 = r1.getAppWidgetIds(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            r3 = 0
        L75:
            if (r3 >= r2) goto L84
            r4 = r0[r3]
            djz r5 = new djz
            r5.<init>(r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L75
        L84:
            defpackage.yfm.I(r8, r1)
            goto L5c
        L88:
            return r8
        L89:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "no canonical provider name"
            r7.<init>(r8)
            throw r7
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlr.b(java.lang.Class, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.yih r10) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlr.c(yih):java.lang.Object");
    }
}
