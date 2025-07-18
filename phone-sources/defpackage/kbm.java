package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbm {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/presentation/pages/hotandnew/components/HotAndNewCardComposeModel");
    private static final kcf p = new kcf(bny.j(4279374868L), bny.j(4291941074L), bny.j(4294177780L));
    public final Context b;
    public final boolean c;
    public final ixm d;
    public final wsu e;
    public final yjk f;
    public final String g;
    public final kcf h;
    public final yva i;
    public final kca j;
    public final int k;
    public final pjs[] l;
    public final ioy m;
    public final ovq n;
    public final irc o;
    private final yil q;

    public kbm(iea ieaVar, wkx wkxVar, lfn lfnVar, int i, int i2, Context context, irc ircVar, ioy ioyVar, boolean z, ovq ovqVar, ixm ixmVar, xjt xjtVar, yow yowVar, yil yilVar) {
        this.b = context;
        this.o = ircVar;
        this.m = ioyVar;
        this.c = z;
        this.n = ovqVar;
        this.d = ixmVar;
        this.q = yilVar;
        vvd vvdVar = wsu.l;
        wkxVar.i(vvdVar);
        Object objK = wkxVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        objK.getClass();
        wsu wsuVar = (wsu) objK;
        this.e = wsuVar;
        this.f = new kal(this, 5);
        wlx wlxVar = wsuVar.b;
        wlxVar = wlxVar == null ? wlx.a : wlxVar;
        wlxVar.getClass();
        this.g = knh.b(wlxVar, i2, i);
        kcf kcfVar = p;
        this.h = kcfVar;
        this.i = vyf.w(new ysq(new kim(this, (yih) null, 1)), yowVar, yut.b, kcfVar);
        String str = wsuVar.e;
        str.getClass();
        wni wniVar = wsuVar.i;
        wniVar = wniVar == null ? wni.a : wniVar;
        String str2 = wniVar.b;
        str2.getClass();
        int iAU = a.aU(wniVar.c);
        out outVar = new out(str, new our(str2, qtl.au(iAU == 0 ? 1 : iAU)));
        String str3 = ((ksn) ((ldy) ieaVar).a().g()).a;
        String strBo = lfnVar.bo();
        strBo.getClass();
        this.j = new kca(outVar, str3, strBo, ((Long) xju.c.et(((xju) xjtVar).d)).longValue());
        wmc wmcVar = wkxVar.e;
        wmcVar = wmcVar == null ? wmc.a : wmcVar;
        wmcVar.getClass();
        Integer numA = jab.a(wmcVar);
        this.k = numA != null ? numA.intValue() : 263761;
        pjs[] pjsVarArr = new pjs[1];
        vvd vvdVar2 = nbu.b;
        vtw vtwVarM = nbs.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = ubz.a.m();
        vtwVarM2.getClass();
        vtw vtwVarM3 = uca.a.m();
        vtwVarM3.getClass();
        wmc wmcVar2 = wkxVar.e;
        ubt ubtVar = (wmcVar2 == null ? wmc.a : wmcVar2).d;
        ubtVar = ubtVar == null ? ubt.a : ubtVar;
        ubtVar.getClass();
        tyq.f(ubtVar, vtwVarM3);
        tyq.i(tyq.d(vtwVarM3), vtwVarM2);
        vtw vtwVarM4 = uby.a.m();
        vtwVarM4.getClass();
        vtw vtwVarM5 = ubk.a.m();
        vtw vtwVarM6 = ubd.a.m();
        vtw vtwVarM7 = ubb.a.m();
        if (!vtwVarM7.b.A()) {
            vtwVarM7.u();
        }
        ubb ubbVar = (ubb) vtwVarM7.b;
        ubbVar.b = 1 | ubbVar.b;
        ubbVar.c = z;
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        ubd ubdVar = (ubd) vtwVarM6.b;
        ubb ubbVar2 = (ubb) vtwVarM7.r();
        ubbVar2.getClass();
        ubdVar.c = ubbVar2;
        ubdVar.b = 3;
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        ubk ubkVar = (ubk) vtwVarM5.b;
        ubd ubdVar2 = (ubd) vtwVarM6.r();
        ubdVar2.getClass();
        ubkVar.d = ubdVar2;
        ubkVar.c = 3;
        vuc vucVarR = vtwVarM5.r();
        vucVarR.getClass();
        tyq.l((ubk) vucVarR, vtwVarM4);
        tyq.h(tyq.j(vtwVarM4), vtwVarM2);
        jys.Y(tyq.g(vtwVarM2), vtwVarM);
        pjsVarArr[0] = new pjs(vvdVar2, jys.X(vtwVarM));
        this.l = pjsVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r9.emit((defpackage.kcf) r10, r0) != r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ysy r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.kbk
            if (r0 == 0) goto L13
            r0 = r10
            kbk r0 = (defpackage.kbk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kbk r0 = new kbk
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ybn.f(r10)
            goto L60
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.a
            defpackage.ybn.f(r10)
            goto L53
        L39:
            defpackage.ybn.f(r10)
            java.lang.String r10 = r8.g
            if (r10 == 0) goto L60
            yil r2 = r8.q
            kbl r6 = new kbl
            r7 = 0
            r6.<init>(r8, r10, r3, r7)
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = defpackage.ykr.l(r2, r6, r0)
            if (r10 != r1) goto L53
            goto L5f
        L53:
            kcf r10 = (defpackage.kcf) r10
            r0.a = r3
            r0.d = r4
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L60
        L5f:
            return r1
        L60:
            ygi r9 = defpackage.ygi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbm.a(ysy, yih):java.lang.Object");
    }
}
