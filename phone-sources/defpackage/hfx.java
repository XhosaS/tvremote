package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.view.accessibility.CaptioningManager;
import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfx {
    public final Object a;

    public hfx(Context context) {
        this.a = new kmf(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean a(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void b(hlg hlgVar, hnn hnnVar) {
        ?? r0 = this.a;
        if (hnnVar.equals(r0.get(hlgVar))) {
            r0.remove(hlgVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ldv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.yjv r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ims
            if (r0 == 0) goto L13
            r0 = r8
            ims r0 = (defpackage.ims) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ims r0 = new ims
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            java.lang.String r3 = "Result is null"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            defpackage.ybn.f(r8)
            goto Lb3
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.a
            defpackage.ybn.f(r8)     // Catch: java.lang.Exception -> L3b
            goto L4b
        L3b:
            r8 = move-exception
            goto L54
        L3d:
            defpackage.ybn.f(r8)
            r0.a = r7     // Catch: java.lang.Exception -> L3b
            r0.c = r5     // Catch: java.lang.Exception -> L3b
            java.lang.Object r8 = r7.a(r0)     // Catch: java.lang.Exception -> L3b
            if (r8 != r1) goto L4b
            goto Lb2
        L4b:
            if (r8 == 0) goto L4e
            return r8
        L4e:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L3b
            r8.<init>(r3)     // Catch: java.lang.Exception -> L3b
            throw r8     // Catch: java.lang.Exception -> L3b
        L54:
            r8.toString()
            java.lang.String r2 = r8.toString()
            java.lang.String r5 = "Gtv FE service returned error: "
            java.lang.String r2 = r5.concat(r2)
            defpackage.krd.c(r2)
            boolean r2 = r8 instanceof defpackage.xtl
            if (r2 == 0) goto L6e
            r2 = r8
            xtl r2 = (defpackage.xtl) r2
            xtk r2 = r2.a
            goto L7a
        L6e:
            boolean r2 = r8 instanceof defpackage.xtn
            if (r2 == 0) goto L78
            r2 = r8
            xtn r2 = (defpackage.xtn) r2
            xtk r2 = r2.a
            goto L7a
        L78:
            xtk r2 = defpackage.xtk.d
        L7a:
            xtk r5 = defpackage.xtk.g
            boolean r2 = defpackage.yks.e(r2, r5)
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r6.a
            ieg r5 = r2.a()
            boolean r5 = r5.m()
            if (r5 == 0) goto Lbc
            java.lang.String r8 = "Attempting to authenticate user..."
            defpackage.krd.c(r8)
            ieg r8 = r2.a()
            java.lang.Object r8 = r8.g()
            ksn r8 = (defpackage.ksn) r8
            java.lang.String r8 = r8.a
            r2.t(r8)
            java.lang.String r8 = "Authentication successful. Fetching result one more time, with new auth token"
            defpackage.krd.c(r8)
            r8 = 0
            r0.a = r8
            r0.c = r4
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            if (r8 == 0) goto Lb6
            return r8
        Lb6:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r3)
            throw r7
        Lbc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfx.c(yjv, yih):java.lang.Object");
    }

    public final void d() {
        ((ivx) this.a).c = null;
    }

    public final Object e(Object obj, yih yihVar) {
        return hur.d((iom) this.a, obj, yihVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [hlo, java.lang.Object] */
    public final synchronized hlo f(Class cls) {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            irc ircVar = (irc) r0.get(i);
            if (((Class) ircVar.b).isAssignableFrom(cls)) {
                return ircVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void g(Class cls, hlo hloVar) {
        this.a.add(new irc(cls, hloVar));
    }

    public final ysx h(hfx hfxVar) {
        return new gxd(((iom) this.a).e((iaq) hfxVar.a), 6);
    }

    public final hfx i() {
        ivx ivxVar = (ivx) this.a;
        Object obj = ivxVar.b;
        return new hfx(new iom(ypy.a, (hfx) ivxVar.a, (irc) obj, (iai) ivxVar.c));
    }

    public final Uri j(Uri uri) {
        String string = uri.toString();
        String strK = k(string);
        return string.equals(strK) ? uri : Uri.parse(strK);
    }

    public final String k(String str) {
        return nds.b((ContentResolver) this.a).a(str).a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, lor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r10, java.util.List r11, java.util.List r12, defpackage.yih r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.mdj
            if (r0 == 0) goto L13
            r0 = r13
            mdj r0 = (defpackage.mdj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mdj r0 = new mdj
            r0.<init>(r9, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.c
            yio r0 = defpackage.yio.a
            int r1 = r6.d
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L47
            if (r1 == r8) goto L39
            if (r1 != r7) goto L31
            java.lang.Object r10 = r6.a
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.String r11 = r6.e
            defpackage.ybn.f(r13)
            goto L77
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.Object r10 = r6.b
            java.lang.Object r11 = r6.a
            r12 = r11
            java.util.List r12 = (java.util.List) r12
            java.lang.String r11 = r6.e
            defpackage.ybn.f(r13)
            r2 = r11
            goto L50
        L47:
            defpackage.ybn.f(r13)
            java.util.Iterator r11 = r11.iterator()
            r2 = r10
            r10 = r11
        L50:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L72
            java.lang.Object r11 = r10.next()
            ksy r11 = (defpackage.ksy) r11
            java.lang.Object r1 = r9.a
            java.lang.String r3 = r11.b
            int r4 = r11.a
            r6.e = r2
            r6.a = r12
            r6.b = r10
            r6.d = r8
            r5 = 1
            java.lang.Object r11 = r1.f(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L50
            goto L98
        L72:
            java.util.Iterator r10 = r12.iterator()
            r11 = r2
        L77:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L99
            java.lang.Object r12 = r10.next()
            ksy r12 = (defpackage.ksy) r12
            java.lang.Object r13 = r9.a
            java.lang.String r1 = r12.b
            int r12 = r12.a
            r6.e = r11
            r6.a = r10
            r2 = 0
            r6.b = r2
            r6.d = r7
            java.lang.Object r12 = r13.b(r11, r1, r12, r6)
            if (r12 != r0) goto L77
        L98:
            return r0
        L99:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfx.l(java.lang.String, java.util.List, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r13 != r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, lor] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.String r10, java.lang.String r11, int r12, defpackage.yih r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.mdh
            if (r0 == 0) goto L13
            r0 = r13
            mdh r0 = (defpackage.mdh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mdh r0 = new mdh
            r0.<init>(r9, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.b
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r2 = 2
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L40
            if (r1 == r8) goto L34
            if (r1 != r2) goto L2c
            defpackage.ybn.f(r13)
            goto L71
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            int r12 = r6.a
            java.lang.String r11 = r6.e
            java.lang.String r10 = r6.d
            defpackage.ybn.f(r13)
        L3d:
            r3 = r11
            r4 = r12
            goto L5a
        L40:
            defpackage.ybn.f(r13)
            java.lang.Object r13 = r9.a
            boolean r1 = defpackage.kgu.w(r13, r10, r11, r12)
            if (r1 != 0) goto L81
            r6.d = r10
            r6.e = r11
            r6.a = r12
            r6.c = r8
            java.lang.Object r13 = r13.c(r10, r11, r12)
            if (r13 != r0) goto L3d
            goto L7d
        L5a:
            java.lang.Object r1 = r9.a
            boolean r11 = defpackage.kgu.w(r1, r10, r3, r4)
            if (r11 != 0) goto L7e
            r11 = 0
            r6.d = r11
            r6.e = r11
            r6.c = r2
            r5 = 2
            r2 = r10
            java.lang.Object r13 = r1.f(r2, r3, r4, r5, r6)
            if (r13 == r0) goto L7d
        L71:
            java.lang.Number r13 = (java.lang.Number) r13
            int r10 = r13.intValue()
            if (r10 <= 0) goto L7b
            r11 = r8
            goto L7e
        L7b:
            r11 = r7
            goto L7e
        L7d:
            return r0
        L7e:
            if (r11 == 0) goto L81
            r7 = r8
        L81:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfx.m(java.lang.String, java.lang.String, int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.String r9, java.lang.String r10, int r11, defpackage.yih r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.mdi
            if (r0 == 0) goto L13
            r0 = r12
            mdi r0 = (defpackage.mdi) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mdi r0 = new mdi
            r0.<init>(r8, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.b
            r7 = 1
            if (r1 == 0) goto L30
            if (r1 != r7) goto L28
            defpackage.ybn.f(r12)
            goto L41
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.ybn.f(r12)
            java.lang.Object r1 = r8.a
            r6.b = r7
            r5 = 3
            r2 = r9
            r3 = r10
            r4 = r11
            java.lang.Object r12 = r1.f(r2, r3, r4, r5, r6)
            if (r12 == r0) goto L50
        L41:
            java.lang.Number r12 = (java.lang.Number) r12
            int r9 = r12.intValue()
            if (r9 <= 0) goto L4a
            goto L4b
        L4a:
            r7 = 0
        L4b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfx.n(java.lang.String, java.lang.String, int, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.lang.String r9, java.lang.String r10, int r11, long r12, defpackage.yih r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.mdf
            if (r0 == 0) goto L13
            r0 = r14
            mdf r0 = (defpackage.mdf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mdf r0 = new mdf
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r14)
            goto L41
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.ybn.f(r14)
            java.lang.Object r2 = r8.a
            r0.b = r3
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r14 = r2.e(r3, r4, r5, r6)
            if (r14 != r1) goto L41
            return r1
        L41:
            java.util.List r14 = (java.util.List) r14
            r9 = 0
            java.lang.Object r9 = r14.get(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfx.o(java.lang.String, java.lang.String, int, long, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x013d, code lost:
    
        if (r2 != r7) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, lor] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, lor] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, lor] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f3 -> B:42:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0115 -> B:38:0x011a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.String r21, defpackage.lul r22, defpackage.yih r23) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfx.p(java.lang.String, lul, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    public final mbs q(mfk mfkVar, String str, String str2) {
        idy idyVar = (idy) this.a.b();
        idyVar.getClass();
        mfkVar.getClass();
        return new mbs(idyVar, mfkVar, str, str2);
    }

    public final uhp r(int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gli.D("worker_name_key", "UnpinnedCleanUpWorker", linkedHashMap);
        gli.D("reason", Integer.valueOf(i), linkedHashMap);
        gox goxVarY = gli.y(linkedHashMap);
        gpo gpoVar = new gpo(MoviesWorkerWrapper.class);
        gpoVar.b("unpinned_clean_up");
        gpoVar.e(goxVarY);
        if (i2 != 0) {
            gpoVar.d(i2, TimeUnit.SECONDS);
        }
        cvi cviVarF = gpoVar.f();
        return ufn.i(((gpt) ((gpz) this.a).g("unpinned_clean_up", 1, cviVarF)).c, new ldl(cviVarF, 18), ugk.a);
    }

    public final void s(int i) {
        try {
            ((ufb) r(i, 60)).s();
        } catch (Exception unused) {
            krd.f("Unable to clean up unpinned content");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ieg t(vzg vzgVar) {
        kuv kuvVarB;
        int i;
        val valVar = vzgVar.b;
        if (valVar == null) {
            valVar = val.a;
        }
        if (!kgu.q(valVar, vak.DISTRIBUTOR)) {
            return ieg.b(new RuntimeException("Expected distributor id but got: ".concat(String.valueOf(String.valueOf(vzgVar)))));
        }
        vam vamVar = vzgVar.e;
        if (vamVar == null) {
            vamVar = vam.a;
        }
        wat watVar = vzgVar.g;
        if (watVar == null) {
            watVar = wat.a;
        }
        wap wapVar = watVar.b == 10 ? (wap) watVar.c : wap.a;
        wao waoVar = wapVar.c;
        if (waoVar == null) {
            waoVar = wao.a;
        }
        ImmutableList immutableListP = kir.p(waoVar.e);
        Object obj = this.a;
        UnmodifiableIterator it = immutableListP.iterator();
        while (true) {
            if (!it.hasNext()) {
                kuvVarB = kuv.b().b();
                break;
            }
            kuvVarB = (kuv) it.next();
            if (kuvVarB.b == kuu.TYPE_GENERIC) {
                break;
            }
        }
        float fIntValue = 1.0f;
        if (kuvVarB.e.g()) {
            if (kuvVarB.f.g()) {
                fIntValue = ((Integer) r5.c()).intValue() / ((Integer) r7.c()).intValue();
            }
        }
        vtw vtwVarM = laq.a.m();
        vtw vtwVarM2 = lar.a.m();
        val valVar2 = vzgVar.b;
        if (valVar2 == null) {
            valVar2 = val.a;
        }
        String str = valVar2.c;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        lar larVar = (lar) vtwVarM2.b;
        str.getClass();
        larVar.b = str;
        lar larVar2 = (lar) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        laq laqVar = (laq) vucVar;
        larVar2.getClass();
        laqVar.c = larVar2;
        int i2 = 1;
        laqVar.b |= 1;
        String str2 = wapVar.b;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        str2.getClass();
        ((laq) vucVar2).d = str2;
        int iBb = a.bb(waoVar.d);
        if (iBb == 0) {
            iBb = 1;
        }
        int i3 = 7;
        int i4 = 4;
        switch (iBb - 2) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            default:
                i = 2;
                break;
        }
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        ((laq) vtwVarM.b).j = a.aH(i);
        lcr lcrVarP = lbk.p(((ksz) obj).b(immutableListP));
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        laq laqVar2 = (laq) vtwVarM.b;
        lcrVarP.getClass();
        laqVar2.e = lcrVarP;
        laqVar2.b |= 2;
        lcr lcrVarP2 = lbk.p(kuvVarB.a);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar3 = vtwVarM.b;
        laq laqVar3 = (laq) vucVar3;
        lcrVarP2.getClass();
        laqVar3.f = lcrVarP2;
        laqVar3.b |= 4;
        if (!vucVar3.A()) {
            vtwVarM.u();
        }
        ((laq) vtwVarM.b).g = fIntValue;
        vtwVarM.A(FluentIterable.from(waoVar.b).filter(new lsp(i3)).transform(new lsq(0)).toList());
        vtwVarM.B(FluentIterable.from(waoVar.c).filter(new lsp(i4)).transform(new lsq(i2)).toList());
        vtwVarM.C(FluentIterable.from(vamVar.b).transform(new lsn()).toList());
        return ieg.f((laq) vtwVarM.r());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [idf, java.lang.Object] */
    public final ieg u(tst tstVar) {
        return tstVar.g() ? (ieg) this.a.b(((kuv) tstVar.c()).a) : ieg.a;
    }

    public hfx(Object obj) {
        this.a = obj;
    }

    public hfx(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public hfx(nxb nxbVar) {
        this.a = nxbVar.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public hfx(hfw hfwVar, byte[] bArr) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap((Map) hfwVar.a));
    }

    public hfx(char[] cArr) {
        this.a = new ArrayList();
    }

    public hfx(ldv ldvVar) {
        ldvVar.getClass();
        this.a = ldvVar;
    }

    public hfx(Context context, byte[] bArr) {
        this.a = (CaptioningManager) context.getSystemService("captioning");
    }

    public hfx(byte[] bArr) {
        this.a = new HashMap();
        new HashMap();
    }

    public hfx(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public hfx() {
        this.a = new ArrayDeque();
    }

    public hfx(lor lorVar, byte[] bArr, byte[] bArr2) {
        lorVar.getClass();
        this.a = lorVar;
    }

    public hfx(lor lorVar, byte[] bArr) {
        lorVar.getClass();
        this.a = lorVar;
    }

    public hfx(lor lorVar) {
        lorVar.getClass();
        this.a = lorVar;
    }

    public hfx(ContentResolver contentResolver) {
        contentResolver.getClass();
        this.a = contentResolver;
    }
}
