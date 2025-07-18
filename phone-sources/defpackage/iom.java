package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iom {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public iom(dxc dxcVar, dwx dwxVar, dxj dxjVar) {
        this.a = dxcVar;
        this.d = dwxVar;
        this.b = dxjVar;
        this.c = new dhf(null);
    }

    public static void E(Object obj, long j, Map map) {
        if (map.containsKey(obj)) {
            Long l = (Long) map.get(obj);
            String str = edt.a;
            j = Math.max(j, l.longValue());
        }
        map.put(obj, Long.valueOf(j));
    }

    private static void G(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public final void A(int i) {
        ((eeh) this.b).c(i);
    }

    public final String B() {
        return ((String) this.a) + "/" + ((String) this.b);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final enq C(List list) {
        enq enqVar;
        List listD = D(list);
        if (listD.size() < 2) {
            return (enq) Iterables.getFirst(listD, null);
        }
        Collections.sort(listD, new ade(10));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((enq) listD.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= listD.size()) {
                break;
            }
            enq enqVar2 = (enq) listD.get(i3);
            if (i2 == enqVar2.c) {
                arrayList.add(new Pair(enqVar2.b, Integer.valueOf(enqVar2.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (enq) listD.get(0);
            }
        }
        ?? r2 = this.a;
        enq enqVar3 = (enq) r2.get(arrayList);
        if (enqVar3 != null) {
            return enqVar3;
        }
        List listSubList = listD.subList(0, arrayList.size());
        int i4 = 0;
        for (int i5 = 0; i5 < listSubList.size(); i5++) {
            i4 += ((enq) listSubList.get(i5)).d;
        }
        int iNextInt = ((Random) this.c).nextInt(i4);
        int i6 = 0;
        while (true) {
            if (i >= listSubList.size()) {
                enqVar = (enq) Iterables.getLast(listSubList);
                break;
            }
            enqVar = (enq) listSubList.get(i);
            i6 += enqVar.d;
            if (iNextInt < i6) {
                break;
            }
            i++;
        }
        r2.put(arrayList, enqVar);
        return enqVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final List D(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ?? r2 = this.d;
        G(jElapsedRealtime, r2);
        ?? r3 = this.b;
        G(jElapsedRealtime, r3);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            enq enqVar = (enq) list.get(i);
            if (!r2.containsKey(enqVar.b) && !r3.containsKey(Integer.valueOf(enqVar.c))) {
                arrayList.add(enqVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [dwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public final dwt F(ymh ymhVar, String str) {
        dwt dwtVarA;
        synchronized (this.c) {
            Object obj = this.a;
            dwtVarA = ((dxc) obj).a(str);
            if (ymhVar.d(dwtVarA)) {
                Object obj2 = this.d;
                if (obj2 instanceof dwz) {
                    dwtVarA.getClass();
                    ((dwz) obj2).e(dwtVarA);
                }
                dwtVarA.getClass();
            } else {
                dxl dxlVar = new dxl((dxj) this.b);
                dxlVar.b(dxa.a, str);
                dwtVarA = dad.c(this.d, ymhVar, dxlVar);
                dwtVarA.getClass();
                dwt dwtVar = (dwt) ((dxc) obj).a.put(str, dwtVarA);
                if (dwtVar != null) {
                    dwtVar.u();
                }
            }
        }
        return dwtVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r9, defpackage.yih r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.iok
            if (r0 == 0) goto L13
            r0 = r10
            iok r0 = (defpackage.iok) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iok r0 = new iok
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r10)
            goto L91
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r8.a
            java.lang.Object r2 = r8.b
            ldy r2 = (defpackage.ldy) r2
            ieg r2 = r2.a()
            java.lang.Object r2 = r2.g()
            ksn r2 = (defpackage.ksn) r2
            java.lang.String r2 = r2.a
            wvw r4 = defpackage.wvw.a
            vtw r4 = r4.m()
            r4.getClass()
            vuc r5 = r4.b
            wvw r5 = (defpackage.wvw) r5
            vun r5 = r5.c
            java.util.List r5 = j$.util.DesugarCollections.unmodifiableList(r5)
            r5.getClass()
            r9.getClass()
            vuc r5 = r4.b
            boolean r5 = r5.A()
            if (r5 != 0) goto L68
            r4.u()
        L68:
            vuc r5 = r4.b
            wvw r5 = (defpackage.wvw) r5
            vun r6 = r5.c
            boolean r7 = r6.c()
            if (r7 != 0) goto L7a
            vun r6 = defpackage.vuc.s(r6)
            r5.c = r6
        L7a:
            vun r5 = r5.c
            defpackage.vsf.h(r9, r5)
            defpackage.wxe.e(r4)
            wvw r9 = defpackage.wxe.d(r4)
            r0.c = r3
            kdj r10 = (defpackage.kdj) r10
            java.lang.Object r10 = defpackage.kdj.k(r10, r2, r9, r0)
            if (r10 != r1) goto L91
            return r1
        L91:
            wvx r10 = (defpackage.wvx) r10
            vun r9 = r10.b
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iom.a(java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, yow] */
    public final void b(List list, boolean z) {
        list.getClass();
        ykr.q(this.c, null, 0, new alb(this, list, z, (yih) null, 5), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ibh
            if (r0 == 0) goto L13
            r0 = r9
            ibh r0 = (defpackage.ibh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ibh r0 = new ibh
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.b
            yyk r1 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L30
            goto L77
        L30:
            r8 = move-exception
            goto L92
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            yyk r8 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r9)
            r9 = r8
            r8 = r2
            goto L58
        L44:
            defpackage.ybn.f(r9)
            java.lang.Object r9 = r7.c
            r0.a = r8
            r2 = r9
            yyk r2 = (defpackage.yyk) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L98
        L58:
            java.lang.Object r2 = r7.d     // Catch: java.lang.Throwable -> L90
            java.lang.Object r5 = r2.get(r8)     // Catch: java.lang.Throwable -> L90
            if (r5 != 0) goto L80
            java.lang.Object r5 = r7.b     // Catch: java.lang.Throwable -> L90
            r0.a = r8     // Catch: java.lang.Throwable -> L90
            r6 = r9
            yyk r6 = (defpackage.yyk) r6     // Catch: java.lang.Throwable -> L90
            r0.e = r6     // Catch: java.lang.Throwable -> L90
            r0.b = r2     // Catch: java.lang.Throwable -> L90
            r0.d = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = r5.a(r8, r0)     // Catch: java.lang.Throwable -> L90
            if (r0 == r1) goto L98
            r1 = r9
            r9 = r0
            r0 = r8
            r8 = r2
        L77:
            zlj r5 = new zlj     // Catch: java.lang.Throwable -> L30
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L30
            r8.put(r0, r5)     // Catch: java.lang.Throwable -> L30
            goto L81
        L80:
            r1 = r9
        L81:
            zlj r5 = (defpackage.zlj) r5     // Catch: java.lang.Throwable -> L30
            int r8 = r5.a     // Catch: java.lang.Throwable -> L30
            int r8 = r8 + r4
            r5.a = r8     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r5.b     // Catch: java.lang.Throwable -> L30
            yyk r1 = (defpackage.yyk) r1
            r1.d()
            return r8
        L90:
            r8 = move-exception
            r1 = r9
        L92:
            yyk r1 = (defpackage.yyk) r1
            r1.d()
            throw r8
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iom.c(java.lang.Object, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r2.a(r7, r8, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, yka] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.Object r7, java.lang.Object r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ibi
            if (r0 == 0) goto L13
            r0 = r9
            ibi r0 = (defpackage.ibi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ibi r0 = new ibi
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.a
            yyk r7 = (defpackage.yyk) r7
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L2e
            goto L88
        L2e:
            r8 = move-exception
            goto La1
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            yyk r7 = r0.e
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r9)
            r9 = r7
            r7 = r2
            goto L5b
        L45:
            defpackage.ybn.f(r9)
            java.lang.Object r9 = r6.c
            r0.a = r7
            r0.b = r8
            r2 = r9
            yyk r2 = (defpackage.yyk) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto La7
        L5b:
            java.lang.Object r2 = r6.d     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r2.get(r7)     // Catch: java.lang.Throwable -> L9e
            zlj r4 = (defpackage.zlj) r4     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto L90
            java.lang.Object r5 = r4.b     // Catch: java.lang.Throwable -> L9e
            if (r5 != r8) goto L90
            int r5 = r4.a     // Catch: java.lang.Throwable -> L9e
            int r5 = r5 + (-1)
            r4.a = r5     // Catch: java.lang.Throwable -> L9e
            if (r5 > 0) goto L87
            r2.remove(r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r6.a     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L87
            r0.a = r9     // Catch: java.lang.Throwable -> L9e
            r4 = 0
            r0.b = r4     // Catch: java.lang.Throwable -> L9e
            r0.e = r4     // Catch: java.lang.Throwable -> L9e
            r0.d = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r7 = r2.a(r7, r8, r0)     // Catch: java.lang.Throwable -> L9e
            if (r7 == r1) goto La7
        L87:
            r7 = r9
        L88:
            ygi r8 = defpackage.ygi.a     // Catch: java.lang.Throwable -> L2e
            yyk r7 = (defpackage.yyk) r7
            r7.d()
            return r8
        L90:
            java.lang.String r7 = "inconsistent release, seems like "
            java.lang.String r0 = " was leaked or never acquired"
            java.lang.String r7 = defpackage.a.cj(r8, r7, r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L9e
            throw r8     // Catch: java.lang.Throwable -> L9e
        L9e:
            r7 = move-exception
            r8 = r7
            r7 = r9
        La1:
            yyk r7 = (defpackage.yyk) r7
            r7.d()
            throw r8
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iom.d(java.lang.Object, java.lang.Object, yih):java.lang.Object");
    }

    public final ysx e(iaq iaqVar) {
        return new ipi(new ysq(new ibg(iaqVar, this, (yih) null, 0)), new akq(this, iaqVar, (yih) null, 3), 19);
    }

    public final ysx f(iaq iaqVar, yol yolVar, boolean z) {
        Object obj = iaqVar.b;
        obj.getClass();
        return new ipi((yjz) new ibb(yolVar, z, null), (ysx) new ysq(new iba((ity) this.a, obj, z, null)), 13);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final khr g() {
        return (khr) this.d.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bcb, java.lang.Object] */
    public final void h(khr khrVar) {
        this.d.b(khrVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bcb, java.lang.Object] */
    public final void i(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    public final fnw j(Object obj) {
        fnw fnwVar;
        synchronized (this.a) {
            fnwVar = (fnw) ((ko) this.b).get(obj);
        }
        return fnwVar;
    }

    public final fqv k(fnw fnwVar) {
        fnf fnfVar;
        synchronized (this.a) {
            fnfVar = (fnf) ((ko) this.d).get(fnwVar);
        }
        if (fnfVar != null) {
            return fnfVar.b;
        }
        return null;
    }

    public final ImmutableList l() {
        ImmutableList immutableListCopyOf;
        synchronized (this.a) {
            immutableListCopyOf = ImmutableList.copyOf(((ir) this.b).values());
        }
        return immutableListCopyOf;
    }

    public final void m(Object obj, fnw fnwVar, fqx fqxVar, eak eakVar) {
        synchronized (this.a) {
            fnw fnwVarJ = j(obj);
            if (fnwVarJ == null) {
                ((ko) this.b).put(obj, fnwVar);
                ((ko) this.d).put(fnwVar, new fnf(obj, new fqv(), fqxVar, eakVar));
            } else {
                fnf fnfVar = (fnf) ((ko) this.d).get(fnwVarJ);
                eci.e(fnfVar);
                fnfVar.d = fqxVar;
                fnfVar.e = eakVar;
            }
        }
    }

    public final void n(fnw fnwVar, int i, fne fneVar) {
        synchronized (this.a) {
            fnf fnfVar = (fnf) ((ko) this.d).get(fnwVar);
            if (fnfVar != null) {
                eak eakVar = fnfVar.g;
                int[] iArr = eaj.a;
                rin rinVar = new rin(null, null);
                rinVar.k(eakVar.b);
                rinVar.j(i);
                fnfVar.g = eaj.a(rinVar);
                fnfVar.c.add(fneVar);
            }
        }
    }

    public final void o(fnf fnfVar) {
        foo fooVar = (foo) ((WeakReference) this.c).get();
        if (fooVar == null) {
            return;
        }
        int i = 1;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            fne fneVar = (fne) fnfVar.c.poll();
            if (fneVar == null) {
                fnfVar.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            j(fnfVar.a);
            fnf fnfVar2 = fnfVar;
            edt.aB(fooVar.k, new foe(new fnc(this, fneVar, atomicBoolean2, fnfVar2, atomicBoolean, 0), i));
            atomicBoolean2.set(false);
            fnfVar = fnfVar2;
        }
    }

    public final void p(final fnw fnwVar) {
        synchronized (this.a) {
            fnf fnfVar = (fnf) ((ko) this.d).get(fnwVar);
            if (fnfVar == null) {
                return;
            }
            fnfVar.g = eak.a;
            fnfVar.c.add(new fne() { // from class: fnd
                @Override // defpackage.fne
                public final uhp a() {
                    foo fooVar = (foo) ((WeakReference) this.b.c).get();
                    if (fooVar != null) {
                        fooVar.x(fnwVar);
                    }
                    return uhl.a;
                }
            });
            if (fnfVar.f) {
                return;
            }
            fnfVar.f = true;
            o(fnfVar);
        }
    }

    public final void q(fnw fnwVar) {
        ArrayList arrayList;
        synchronized (this.a) {
            fnf fnfVar = (fnf) ((ko) this.d).remove(fnwVar);
            if (fnfVar == null) {
                return;
            }
            ((ko) this.b).remove(fnfVar.a);
            fqv fqvVar = fnfVar.b;
            synchronized (fqvVar.a) {
                fqvVar.c = true;
                Object obj = fqvVar.d;
                arrayList = new ArrayList(((ir) obj).values());
                ((ko) obj).clear();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fqu) arrayList.get(i)).a();
            }
            foo fooVar = (foo) ((WeakReference) this.c).get();
            if (fooVar == null || fooVar.s()) {
                return;
            }
            edt.aB(fooVar.k, new eoy(fooVar, fnwVar, 17));
        }
    }

    public final boolean r(fnw fnwVar) {
        boolean z;
        synchronized (this.a) {
            z = ((ko) this.d).get(fnwVar) != null;
        }
        return z;
    }

    public final boolean s(fnw fnwVar, int i) {
        fnf fnfVar;
        synchronized (this.a) {
            fnfVar = (fnf) ((ko) this.d).get(fnwVar);
        }
        foo fooVar = (foo) ((WeakReference) this.c).get();
        return fnfVar != null && fnfVar.e.d(i) && fooVar != null && fooVar.q.M().d(i);
    }

    public final boolean t(fnw fnwVar, int i) {
        fnf fnfVar;
        synchronized (this.a) {
            fnfVar = (fnf) ((ko) this.d).get(fnwVar);
        }
        if (fnfVar != null) {
            boolean z = i != 0;
            fqx fqxVar = fnfVar.d;
            eci.a(z, "Use contains(Command) for custom command");
            Iterator<E> it = fqxVar.b.iterator();
            while (it.hasNext()) {
                if (((fqw) it.next()).f == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u(fnw fnwVar, fqw fqwVar) {
        fnf fnfVar;
        synchronized (this.a) {
            fnfVar = (fnf) ((ko) this.d).get(fnwVar);
        }
        return fnfVar != null && fnfVar.d.b.contains(fqwVar);
    }

    public final void v(fnw fnwVar) {
        synchronized (this.a) {
            if (((fnf) ((ko) this.d).get(fnwVar)) != null) {
            }
        }
    }

    public final void w() {
        ((eeh) this.b).b();
    }

    public final void x(long j, edi ediVar) {
        ((eeh) this.b).a(j, ediVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void y(fdr fdrVar, fmr fmrVar) {
        int i = 0;
        while (true) {
            fel[] felVarArr = (fel[]) this.c;
            if (i >= felVarArr.length) {
                return;
            }
            fmrVar.c();
            fel felVarDq = fdrVar.dq(fmrVar.a(), 3);
            dze dzeVar = (dze) this.a.get(i);
            String str = dzeVar.Y;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            eci.a(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strB = dzeVar.K;
            if (strB == null) {
                strB = fmrVar.b();
            }
            dzd dzdVar = new dzd();
            dzdVar.a = strB;
            dzdVar.a((String) this.d);
            dzdVar.d(str);
            dzdVar.e = dzeVar.O;
            dzdVar.d = dzeVar.N;
            dzdVar.J = dzeVar.av;
            dzdVar.p = dzeVar.ab;
            felVarDq.b(new dze(dzdVar));
            felVarArr[i] = felVarDq;
            i++;
        }
    }

    public final void z() {
        ((eeh) this.b).b();
    }

    public iom(exi exiVar, boolean[] zArr) {
        this.a = exiVar;
        this.d = zArr;
        int i = exiVar.c;
        this.b = new boolean[i];
        this.c = new boolean[i];
    }

    public iom(hxr hxrVar, hxr hxrVar2, hxr hxrVar3, hxr hxrVar4) {
        this.a = hxrVar;
        this.c = hxrVar2;
        this.b = hxrVar3;
        this.d = hxrVar4;
    }

    public iom(String str, String str2, long[] jArr, ffu[] ffuVarArr) {
        this.a = str;
        this.b = str2;
        this.d = jArr;
        this.c = ffuVarArr;
    }

    public iom(List list, hmn hmnVar, hok hokVar, ContentResolver contentResolver) {
        this.d = hmnVar;
        this.c = hokVar;
        this.b = contentResolver;
        this.a = list;
    }

    public iom(List list) {
        this.a = list;
        this.d = "video/mp2t";
        this.c = new fel[list.size()];
        this.b = new eeh(new fml(this, 0));
    }

    public iom(List list, dwi dwiVar, dwi dwiVar2, dwi dwiVar3) {
        this.c = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
        this.b = dwiVar;
        this.d = dwiVar2;
        this.a = dwiVar3;
    }

    public iom(yow yowVar, hfx hfxVar, irc ircVar, iai iaiVar) {
        long j;
        this.b = iaiVar;
        iac iacVar = null;
        kdj kdjVar = ircVar != null ? new kdj(ircVar) : null;
        this.c = kdjVar;
        if (iaiVar != null) {
            long j2 = ynm.a;
            if (iaiVar.f) {
                long j3 = iaiVar.c;
                if (!ynm.x(j3)) {
                    throw new IllegalArgumentException("expireAfterAccess duration must be positive");
                }
                j = j3;
            } else {
                j = j2;
            }
            if (iaiVar.e) {
                j2 = iaiVar.b;
                if (!ynm.x(j2)) {
                    throw new IllegalArgumentException("expireAfterWrite duration must be positive");
                }
            }
            boolean z = iaiVar.g;
            iacVar = new iac(j2, j, iaiVar.d);
        }
        this.d = iacVar;
        this.a = new ity(yowVar, hfxVar, kdjVar, kdjVar == null);
    }

    public iom() {
        Random random = new Random();
        this.a = new HashMap();
        this.c = random;
        this.d = new HashMap();
        this.b = new HashMap();
    }

    public iom(foo fooVar) {
        this.b = new ir();
        this.d = new ir();
        this.a = new Object();
        this.c = new WeakReference(fooVar);
    }

    public iom(yjz yjzVar, yka ykaVar) {
        this.b = yjzVar;
        this.a = ykaVar;
        this.d = new LinkedHashMap();
        this.c = new yyk();
    }

    public iom(yow yowVar, ysx ysxVar, yjz yjzVar) {
        this.d = yowVar;
        this.c = ysxVar;
        this.b = yjzVar;
        this.a = ykr.q(yowVar, null, 2, new gow(this, (yih) null, 7), 1);
    }

    public iom(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4) {
        this.c = yfoVar;
        yfoVar2.getClass();
        this.d = yfoVar2;
        yfoVar3.getClass();
        this.a = yfoVar3;
        yfoVar4.getClass();
        this.b = yfoVar4;
    }

    public iom(kdj kdjVar, ieh iehVar, yow yowVar) {
        kdjVar.getClass();
        this.a = kdjVar;
        this.b = iehVar;
        this.c = yowVar;
        hfx hfxVarC = kw.C(new gew(this, 5, (boolean[]) null));
        hfxVarC.d();
        this.d = hfxVarC.i();
    }

    public iom(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
    }

    public iom(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr, char[] cArr) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.b = yfoVar4;
    }

    public iom(mdw mdwVar, ovq ovqVar, kuw kuwVar, Context context) {
        mdwVar.getClass();
        ovqVar.getClass();
        kuwVar.getClass();
        this.d = mdwVar;
        this.a = ovqVar;
        this.c = kuwVar;
        this.b = context;
    }

    public iom(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, char[] cArr) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
        yfoVar3.getClass();
        this.c = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
    }

    public iom(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
    }

    public iom(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.d = yfoVar;
        yfoVar2.getClass();
        this.c = yfoVar2;
        yfoVar3.getClass();
        this.b = yfoVar3;
        yfoVar4.getClass();
        this.a = yfoVar4;
    }

    public iom(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, byte[] bArr) {
        yfoVar.getClass();
        this.c = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
        yfoVar3.getClass();
        this.d = yfoVar3;
        yfoVar4.getClass();
        this.b = yfoVar4;
    }

    public iom(clx clxVar) {
        clxVar.getClass();
        this.b = clxVar;
        bcz bczVar = bcz.c;
        this.c = new bci(false, bczVar);
        this.a = new bci(false, bczVar);
        this.d = new bci(new khr(0, 0, clxVar, 0L, (int) clxVar.cr(48.0f), (int) clxVar.cr(16.0f)), bczVar);
    }
}
