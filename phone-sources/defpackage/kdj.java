package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdj {
    public final Object a;
    public final Object b;
    public final Object c;

    public kdj(SharedPreferences sharedPreferences, mdw mdwVar, lkt lktVar) {
        this.a = sharedPreferences;
        this.c = mdwVar;
        this.b = lktVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object l(defpackage.kdj r10, defpackage.wwi r11, java.lang.String r12, defpackage.yih r13) {
        /*
            boolean r0 = r13 instanceof defpackage.imk
            if (r0 == 0) goto L13
            r0 = r13
            imk r0 = (defpackage.imk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            imk r0 = new imk
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r13)
            goto L4e
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.ybn.f(r13)
            java.lang.Object r13 = r10.b
            java.lang.Object r13 = r13.b()
            om r4 = new om
            r8 = 0
            r9 = 8
            r5 = r10
            r7 = r11
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.b = r3
            hfx r13 = (defpackage.hfx) r13
            java.lang.Object r13 = r13.c(r4, r0)
            if (r13 != r1) goto L4e
            return r1
        L4e:
            r13.getClass()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdj.l(kdj, wwi, java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, lfn] */
    public final synchronized void a() {
        krd.e("Attempting to dispatch QoE log requests");
        Object obj = this.b;
        SQLiteDatabase sQLiteDatabaseB = ((lyz) ((kuw) obj).a).b();
        ArrayList<mad> arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabaseB.query("pending_qoe_logs", mae.a, null, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                nwo nwoVar = new nwo();
                nwoVar.o(cursorQuery.getString(0));
                nwoVar.p(cursorQuery.getString(1));
                arrayList.add(new mad(nwoVar.n(), cursorQuery.getInt(2), cursorQuery.getLong(3), cursorQuery.getLong(4)));
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        SQLiteDatabase sQLiteDatabaseA = ((lyz) ((kuw) obj).a).a();
        try {
            sQLiteDatabaseA.delete("pending_qoe_logs", null, null);
            ((lyz) ((kuw) obj).a).e(sQLiteDatabaseA, true);
            ArrayList<mad> arrayList2 = new ArrayList();
            for (mad madVar : arrayList) {
                ?? r3 = this.c;
                if (madVar.b(r3)) {
                    if (madVar.b != 0 && madVar.c + (r3.aR() * (1 << (madVar.b - 1))) >= System.currentTimeMillis()) {
                        ((kuw) this.b).r(madVar);
                    } else {
                        arrayList2.add(madVar);
                    }
                }
            }
            for (mad madVar2 : arrayList2) {
                madVar2.c = System.currentTimeMillis();
                ieg iegVarA = (ieg) this.a.b(madVar2);
                if (!iegVarA.m() || !((mfq) iegVarA.g()).c()) {
                    if (iegVarA.m()) {
                        iegVarA = ((mfq) iegVarA.g()).a();
                    }
                    Throwable thI = iegVarA.i();
                    if (thI instanceof mfr) {
                        int i = ((mfr) thI).a;
                        if (i != 400 && i != 403) {
                            madVar2.a();
                            ((kuw) this.b).r(madVar2);
                        }
                    } else {
                        madVar2.a();
                        ((kuw) this.b).r(madVar2);
                    }
                }
            }
        } catch (Throwable th) {
            ((lyz) ((kuw) obj).a).e(sQLiteDatabaseA, false);
            throw th;
        }
    }

    public final void b(wjf wjfVar) {
        Iterator<E> it = wjfVar.d.iterator();
        while (it.hasNext()) {
            b((wjf) it.next());
        }
        vtw vtwVar = (vtw) wjfVar.a(5, null);
        vtwVar.x(wjfVar);
        if (vtwVar.a.A()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        vtwVar.b = vtwVar.q();
        ((nug) this.b).a((wjf) vtwVar.r());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r3v0, types: [itk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [itk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [itk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [itk, java.lang.Object] */
    public final int c(Context context, wll wllVar, String str, wpm wpmVar, boolean z) {
        if ((wpmVar.b & 1) != 0) {
            if (!hju.u(wllVar)) {
                ((isn) this.c).b(wllVar, str);
            }
            wld wldVar = wpmVar.e;
            if (wldVar == null) {
                wldVar = wld.a;
            }
            String str2 = wldVar.c;
            str2.getClass();
            wld wldVar2 = wpmVar.e;
            if (wldVar2 == null) {
                wldVar2 = wld.a;
            }
            String str3 = wldVar2.b;
            str3.getClass();
            try {
                Intent intentPutExtra = Intent.parseUri(str2, 0).addFlags(335544320).setPackage(str3).putExtra("android.intent.extra.START_PLAYBACK", true).putExtra("source", "play-guide");
                intentPutExtra.getClass();
                context.startActivity(intentPutExtra);
                this.b.am(hju.s(wllVar, null), str3, str, null, null, z ? this.a.d() : this.a.e());
            } catch (Exception e) {
                krd.d("Failed to start deeplink intent, URI=".concat(str2), e);
                try {
                    context.startActivity(jbr.Y(context, str3));
                    this.b.am(hju.s(wllVar, null), str3, str, str2, e, z ? this.a.d() : this.a.e());
                } catch (Exception e2) {
                    krd.d("Failed to start app launch intent, packageName=".concat(str3), e2);
                    try {
                        by byVarF = hju.F(context);
                        byVarF.getClass();
                        by byVarF2 = hju.F(context);
                        byVarF2.getClass();
                        byVarF.startActivityForResult(jbr.X(byVarF2, str3), 1007);
                    } catch (Exception e3) {
                        krd.d("Failed to start app install intent, packageName=".concat(str3), e3);
                        this.b.az(hju.s(wllVar, null), str3, str, e3);
                    }
                }
            }
            return 1;
        }
        return 2;
    }

    public final /* synthetic */ void d(int i, yka ykaVar, bao baoVar, int i2) {
        ykaVar.getClass();
        baoVar.x(1127947802);
        e(i, null, ykaVar, baoVar, (i2 & 14) | 3504);
        baoVar.p();
    }

    public final void e(int i, pjs[] pjsVarArr, yka ykaVar, bao baoVar, int i2) {
        int i3;
        ykaVar.getClass();
        bao baoVarD = baoVar.d(-1080164527);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.D(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.H(pjsVarArr) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.G(true) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != baoVarD.H(ykaVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != baoVarD.H(this) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
        } else {
            ieg iegVarG = ((ldy) this.c).a();
            iegVarG.getClass();
            pjt pjtVarZ = iegVarG.m() ? rdd.Z(((ksn) iegVarG.g()).a) : rdd.ab();
            Object obj = this.b;
            ((ntp) obj).t(i, pjsVarArr == null ? new pjs[0] : pjsVarArr, new pjt[]{pjtVarZ, plm.a}, null, bga.k(-380288921, new awh(this, ykaVar, 10), baoVarD), baoVarD, (i3 & 14) | 12582912);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new adj(this, i, pjsVarArr, ykaVar, i2, 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    public final wyn f() {
        return (wyn) this.c.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
    
        if (((defpackage.iom) r9).d(r2, r10, r0) == r1) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:18:0x0050, B:34:0x00a9, B:36:0x00be), top: B:73:0x0020, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111 A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x006b, blocks: (B:15:0x0043, B:51:0x00f6, B:58:0x0111, B:40:0x00c5, B:23:0x0064, B:18:0x0050, B:34:0x00a9, B:36:0x00be), top: B:73:0x0020, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, yvc] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6, types: [iom] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, yvc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v11, types: [iom] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.Object r9, java.lang.Object r10, defpackage.yih r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdj.g(java.lang.Object, java.lang.Object, yih):java.lang.Object");
    }

    public final boolean h(Class cls, Class cls2) {
        return ((Class) this.c).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.a);
    }

    public final boolean i(Class cls) {
        return ((Class) this.a).isAssignableFrom(cls);
    }

    public kdj(Class cls, Class cls2, hqg hqgVar) {
        this.a = cls;
        this.c = cls2;
        this.b = hqgVar;
    }

    public kdj(Class cls, Class cls2, hts htsVar) {
        this.c = cls;
        this.a = cls2;
        this.b = htsVar;
    }

    public kdj(Object obj, Object obj2, ieh iehVar) {
        this.b = obj;
        this.a = obj2;
        this.c = iehVar;
    }

    public kdj(irc ircVar) {
        this.c = ircVar;
        this.a = new iom(new cbw((yih) null, 3, (short[]) null), (yka) null);
        this.b = new AtomicLong(0L);
    }

    public kdj(isn isnVar, lie lieVar, itk itkVar) {
        isnVar.getClass();
        lieVar.getClass();
        itkVar.getClass();
        this.c = isnVar;
        this.b = lieVar;
        this.a = itkVar;
    }

    public kdj(kuw kuwVar, idf idfVar, lfn lfnVar) {
        this.b = kuwVar;
        idh idhVarD = idh.d();
        idhVarD.e(new kro(16));
        this.a = idhVarD.b(idfVar);
        this.c = lfnVar;
    }

    public kdj(lfn lfnVar, xjq xjqVar, xjn xjnVar) {
        lfnVar.getClass();
        this.c = lfnVar;
        this.b = xjqVar;
        this.a = xjnVar;
    }

    public kdj(yfo yfoVar, yfo yfoVar2, yfo yfoVar3) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
    }

    public kdj(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, char[] cArr) {
        yfoVar.getClass();
        yfoVar2.getClass();
        yfoVar3.getClass();
        this.c = yfoVar;
        this.a = yfoVar2;
        this.b = yfoVar3;
    }

    public kdj(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
    }

    public kdj() {
        this.a = new nug(wip.class, 10);
        this.c = new nug(wil.class, 10);
        this.b = new nug(wjf.class, 50);
    }

    public kdj(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, byte[] bArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
    }
}
