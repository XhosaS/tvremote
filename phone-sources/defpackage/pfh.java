package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfh implements pex {
    public static final tvn a = tvn.n("GnpSdk");
    public final owz b;
    public final String c;
    public final Map d;
    public final tst e;
    public final yfo f;
    public final xbw g;
    public final tst h;
    public final yow i;
    public final yil j;
    public final rbi k;
    public final rbi l;
    private final Context m;
    private final uhp n;
    private final pbl o;
    private final tst p;
    private final tst q;
    private final Set r;
    private final cb s;

    public pfh(Context context, uhp uhpVar, rbi rbiVar, rbi rbiVar2, pbl pblVar, owz owzVar, String str, tst tstVar, tst tstVar2, cb cbVar, osk oskVar, Map map, Set set, tst tstVar3, yfo yfoVar, xbw xbwVar, tst tstVar4, yow yowVar, yil yilVar) {
        rbiVar.getClass();
        rbiVar2.getClass();
        owzVar.getClass();
        str.getClass();
        tstVar.getClass();
        tstVar2.getClass();
        oskVar.getClass();
        map.getClass();
        yfoVar.getClass();
        xbwVar.getClass();
        this.m = context;
        this.n = uhpVar;
        this.k = rbiVar;
        this.l = rbiVar2;
        this.o = pblVar;
        this.b = owzVar;
        this.c = str;
        this.p = tstVar;
        this.q = tstVar2;
        this.s = cbVar;
        this.d = map;
        this.r = set;
        this.e = tstVar3;
        this.f = yfoVar;
        this.g = xbwVar;
        this.h = tstVar4;
        this.i = yowVar;
        this.j = yilVar;
    }

    @Override // defpackage.pex
    public final Object a(vlo vloVar, yih yihVar) {
        return ykr.l(this.j, new ito(vloVar, this, (yih) null, 3), yihVar);
    }

    public final uwd b() {
        vtw vtwVarM = uwd.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = uvy.a.m();
        vtwVarM2.getClass();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        uvy uvyVar = (uvy) vucVar;
        uvyVar.c = 6;
        uvyVar.b |= 1;
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        uvy uvyVar2 = (uvy) vtwVarM2.b;
        uvyVar2.b |= 2;
        uvyVar2.d = 770518479;
        vtw vtwVarM3 = uvv.a.m();
        vtwVarM3.getClass();
        String str = this.c;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        uvv uvvVar = (uvv) vtwVarM3.b;
        uvvVar.c = 4;
        uvvVar.d = str;
        tst tstVar = this.p;
        if (tstVar.g()) {
            String strValueOf = String.valueOf(((Number) tstVar.c()).intValue());
            strValueOf.getClass();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uvv uvvVar2 = (uvv) vtwVarM3.b;
            uvvVar2.b |= 1;
            uvvVar2.e = strValueOf;
        }
        tst tstVar2 = this.q;
        if (tstVar2.g()) {
            String str2 = (String) tstVar2.c();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            uvv uvvVar3 = (uvv) vtwVarM3.b;
            uvvVar3.b |= 2;
            uvvVar3.f = str2;
        }
        vuc vucVarR = vtwVarM3.r();
        vucVarR.getClass();
        uvv uvvVar4 = (uvv) vucVarR;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        uvy uvyVar3 = (uvy) vtwVarM2.b;
        uvyVar3.e = uvvVar4;
        uvyVar3.b |= 4;
        vuc vucVarR2 = vtwVarM2.r();
        vucVarR2.getClass();
        uvy uvyVar4 = (uvy) vucVarR2;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uwd uwdVar = (uwd) vtwVarM.b;
        uwdVar.d = uvyVar4;
        uwdVar.b |= 1;
        vtw vtwVarM4 = uwc.a.m();
        vtwVarM4.getClass();
        String strA = oyb.a(this.m);
        if (strA == null) {
            strA = "";
        }
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        vuc vucVar2 = vtwVarM4.b;
        uwc uwcVar = (uwc) vucVar2;
        uwcVar.b |= 4;
        uwcVar.f = strA;
        if (!vucVar2.A()) {
            vtwVarM4.u();
        }
        uwc uwcVar2 = (uwc) vtwVarM4.b;
        uwcVar2.g = 1;
        uwcVar2.b |= 8;
        String strValueOf2 = String.valueOf(Build.VERSION.SDK_INT);
        strValueOf2.getClass();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        uwc uwcVar3 = (uwc) vtwVarM4.b;
        uwcVar3.b |= 16;
        uwcVar3.h = strValueOf2;
        vtw vtwVarM5 = uwa.a.m();
        vtwVarM5.getClass();
        String str3 = Build.BRAND;
        str3.getClass();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        uwa uwaVar = (uwa) vtwVarM5.b;
        uwaVar.b = 1 | uwaVar.b;
        uwaVar.c = str3;
        String str4 = Build.DISPLAY;
        str4.getClass();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        uwa uwaVar2 = (uwa) vtwVarM5.b;
        uwaVar2.b |= 2;
        uwaVar2.d = str4;
        String str5 = Build.MODEL;
        str5.getClass();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        uwa uwaVar3 = (uwa) vtwVarM5.b;
        uwaVar3.b |= 4;
        uwaVar3.e = str5;
        vuc vucVarR3 = vtwVarM5.r();
        vucVarR3.getClass();
        uwa uwaVar4 = (uwa) vucVarR3;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        uwc uwcVar4 = (uwc) vtwVarM4.b;
        uwcVar4.d = uwaVar4;
        uwcVar4.c = 7;
        String strE = xgp.a.get().e();
        if (strE != null && strE.length() != 0) {
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            uwc uwcVar5 = (uwc) vtwVarM4.b;
            uwcVar5.b |= 2;
            uwcVar5.e = strE;
        }
        vuc vucVarR4 = vtwVarM4.r();
        vucVarR4.getClass();
        uwc uwcVar6 = (uwc) vucVarR4;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uwd uwdVar2 = (uwd) vtwVarM.b;
        uwdVar2.e = uwcVar6;
        uwdVar2.b |= 2;
        return sij.Y(vtwVarM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0156, code lost:
    
        if (r1 == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.uhp r19, defpackage.uwd r20, java.lang.String r21, defpackage.vlo r22, defpackage.yih r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfh.c(uhp, uwd, java.lang.String, vlo, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.vlo r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pff
            if (r0 == 0) goto L13
            r0 = r9
            pff r0 = (defpackage.pff) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pff r0 = new pff
            r0.<init>(r7, r9)
        L18:
            r6 = r0
            java.lang.Object r9 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.ybn.f(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            vlo r8 = r6.d
            defpackage.ybn.f(r9)
            goto L4c
        L39:
            defpackage.ybn.f(r9)
            cb r9 = r7.s
            uhp r9 = r9.G()
            r6.d = r8
            r6.c = r3
            java.lang.Object r9 = defpackage.wae.U(r9, r6)
            if (r9 == r0) goto Lad
        L4c:
            r5 = r8
            omv r9 = (defpackage.omv) r9
            java.lang.String r8 = r9.a
            if (r8 != 0) goto L68
            tvn r8 = defpackage.pfh.a
            tuv r8 = r8.g()
            tvk r8 = (defpackage.tvk) r8
            java.lang.String r9 = "Not syncing signed out user - token is null - can happen if device just started"
            r8.s(r9)
            qdn r8 = new qdn
            ygi r9 = defpackage.ygi.a
            r8.<init>(r9)
            return r8
        L68:
            rbi r9 = r7.k
            r1 = 0
            java.lang.Object r9 = r9.g(r1)
            pdw r9 = (defpackage.pdw) r9
            uhp r9 = r9.c()
            r9.getClass()
            uwd r3 = r7.b()
            r4 = 5
            java.lang.Object r4 = r3.a(r4, r1)
            vtw r4 = (defpackage.vtw) r4
            r4.x(r3)
            r4.getClass()
            vuc r3 = r4.b
            boolean r3 = r3.A()
            if (r3 != 0) goto L94
            r4.u()
        L94:
            vuc r3 = r4.b
            uwd r3 = (defpackage.uwd) r3
            r3.c = r8
            uwd r3 = defpackage.sij.Y(r4)
            r6.d = r1
            r6.c = r2
            r4 = 0
            r1 = r7
            r2 = r9
            java.lang.Object r8 = r1.c(r2, r3, r4, r5, r6)
            if (r8 != r0) goto Lac
            goto Lad
        Lac:
            return r8
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfh.d(vlo, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.pfg
            if (r0 == 0) goto L13
            r0 = r5
            pfg r0 = (defpackage.pfg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pfg r0 = new pfg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ybn.f(r5)
            uhp r5 = r4.n
            r0.c = r3
            java.lang.Object r5 = defpackage.wae.U(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.Context r0 = r4.m
            java.lang.String r1 = "SYNC_LANGUAGE"
            java.lang.String r0 = defpackage.oyb.a(r0)
            android.content.SharedPreferences$Editor r0 = r5.putString(r1, r0)
            j$.time.Instant r1 = j$.time.Instant.now()
            long r1 = r1.toEpochMilli()
            java.lang.String r3 = "LAST_SYNC_TIME"
            r0.putLong(r3, r1)
            r5.apply()
            qdn r5 = new qdn
            ygi r0 = defpackage.ygi.a
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfh.e(yih):java.lang.Object");
    }
}
