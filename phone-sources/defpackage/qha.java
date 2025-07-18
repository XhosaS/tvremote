package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qha implements qgt {
    private final qhe a;
    private final qgt b;
    private final qoj c;
    private final Context d;
    private final yow e;
    private final ntp f;

    public qha(qhe qheVar, ntp ntpVar, qgt qgtVar, qoj qojVar, Context context, yow yowVar) {
        qgtVar.getClass();
        qojVar.getClass();
        this.a = qheVar;
        this.f = ntpVar;
        this.b = qgtVar;
        this.c = qojVar;
        this.d = context;
        this.e = yowVar;
    }

    private final qgw e(qgw qgwVar) {
        qgv qgvVarB = qgwVar.b();
        qgu qguVar = qgu.e;
        Set setB = ((xcs) this.f.a).b();
        setB.getClass();
        qgvVarB.c(qguVar, yfm.ax(setB, ",", null, null, null, 62));
        return qgvVarB.a();
    }

    private final qgw f(qgw qgwVar) {
        qgwVar.getClass();
        if (xgj.b().length() <= 0) {
            return qgwVar;
        }
        ContentResolver contentResolver = this.a.a.getContentResolver();
        contentResolver.getClass();
        long jB = opc.b(contentResolver, "android_id", 0L);
        if (jB == 0) {
            return qgwVar;
        }
        qgv qgvVarB = qgwVar.b();
        qgu qguVar = qgu.c;
        String string = Long.toString(jB, 16);
        string.getClass();
        qgvVarB.c(qguVar, string);
        qgu qguVar2 = qgu.d;
        vtw vtwVarM = wgd.a.m();
        vtwVarM.getClass();
        vsz vszVarS = vsz.s(xgj.b());
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wgd wgdVar = (wgd) vtwVarM.b;
        wgdVar.b |= 8;
        wgdVar.c = vszVarS;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        qgvVarB.c(qguVar2, osk.ai((wgd) vucVarR));
        return qgvVarB.a();
    }

    @Override // defpackage.qgt
    public final qgx a(qgw qgwVar) {
        qgw qgwVarE = e(f(qgwVar));
        qgt qgtVar = this.b;
        qgx qgxVarA = qgtVar.a(qgwVarE);
        int i = qgwVarE.e;
        String packageName = this.d.getPackageName();
        String path = i == 2 ? qgwVarE.a.getPath() : "";
        Integer num = qgxVarA.a;
        int iIntValue = num != null ? num.intValue() : -1;
        if (i == 0) {
            throw null;
        }
        this.c.c(packageName, qgtVar.c(), path, iIntValue, osk.ab(i));
        return qgxVarA;
    }

    @Override // defpackage.qgt
    public final uhp b(qgw qgwVar) {
        qgwVar.getClass();
        return wae.W(this.e, new pfd(this, qgwVar, (yih) null, 12));
    }

    @Override // defpackage.qgt
    public final String c() {
        return "common";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qgw r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.qgz
            if (r0 == 0) goto L13
            r0 = r8
            qgz r0 = (defpackage.qgz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qgz r0 = new qgz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qgw r7 = r0.d
            defpackage.ybn.f(r8)
            goto L4f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ybn.f(r8)
            qgw r8 = r6.f(r7)
            qgw r8 = r6.e(r8)
            qgt r2 = r6.b
            uhp r8 = r2.b(r8)
            r8.getClass()
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.wae.U(r8, r0)
            if (r8 == r1) goto L88
        L4f:
            qoj r0 = r6.c
            android.content.Context r1 = r6.d
            qgt r2 = r6.b
            int r3 = r7.e
            r4 = r8
            qgx r4 = (defpackage.qgx) r4
            java.lang.String r1 = r1.getPackageName()
            r5 = 2
            if (r3 != r5) goto L68
            java.net.URL r7 = r7.a
            java.lang.String r7 = r7.getPath()
            goto L6a
        L68:
            java.lang.String r7 = ""
        L6a:
            java.lang.Integer r4 = r4.a
            if (r4 == 0) goto L73
            int r4 = r4.intValue()
            goto L74
        L73:
            r4 = -1
        L74:
            java.lang.String r5 = defpackage.osk.ab(r3)
            if (r3 == 0) goto L86
            java.lang.String r2 = r2.c()
            r3 = r7
            r0.c(r1, r2, r3, r4, r5)
            r8.getClass()
            return r8
        L86:
            r7 = 0
            throw r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qha.d(qgw, yih):java.lang.Object");
    }
}
