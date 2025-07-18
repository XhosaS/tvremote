package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfb {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public dfb() {
        throw null;
    }

    public static /* synthetic */ void g(dfb dfbVar, cix cixVar, Object obj) {
        cis cisVar = new cis(cixVar);
        synchronized (dfbVar.c) {
            if (obj == null) {
                Object obj2 = dfbVar.d;
                Object obj3 = dfbVar.b;
                ((ki) obj2).j(cisVar, new cir(null));
            } else {
                ((jp) dfbVar.a).put(cisVar, new cir(obj));
            }
        }
    }

    public final ArrayList a(Object obj) {
        return (ArrayList) ((ko) this.a).get(obj);
    }

    public final void b(Object obj) {
        ko koVar = (ko) this.a;
        if (koVar.containsKey(obj)) {
            return;
        }
        koVar.put(obj, null);
    }

    public final void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((ko) this.a).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.cix r6, defpackage.yjv r7, defpackage.yih r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cit
            if (r0 == 0) goto L13
            r0 = r8
            cit r0 = (defpackage.cit) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cit r0 = new cit
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cis r6 = r0.c
            defpackage.ybn.f(r8)
            goto L66
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ybn.f(r8)
            cis r8 = new cis
            r8.<init>(r6)
            java.lang.Object r6 = r5.c
            monitor-enter(r6)
            java.lang.Object r2 = r5.a     // Catch: java.lang.Throwable -> L8b
            jp r2 = (defpackage.jp) r2     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L8b
            cir r2 = (defpackage.cir) r2     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L52
            java.lang.Object r2 = r5.d     // Catch: java.lang.Throwable -> L8b
            ki r2 = (defpackage.ki) r2     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r2.a(r8)     // Catch: java.lang.Throwable -> L8b
            cir r2 = (defpackage.cir) r2     // Catch: java.lang.Throwable -> L8b
        L52:
            if (r2 == 0) goto L58
            java.lang.Object r7 = r2.a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r6)
            return r7
        L58:
            monitor-exit(r6)
            r0.c = r8
            r0.b = r3
            java.lang.Object r6 = r7.a(r0)
            if (r6 == r1) goto L8a
            r4 = r8
            r8 = r6
            r6 = r4
        L66:
            java.lang.Object r7 = r5.c
            monitor-enter(r7)
            if (r8 != 0) goto L79
            java.lang.Object r0 = r5.d     // Catch: java.lang.Throwable -> L87
            cir r1 = new cir     // Catch: java.lang.Throwable -> L87
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            ki r0 = (defpackage.ki) r0     // Catch: java.lang.Throwable -> L87
            r0.j(r6, r1)     // Catch: java.lang.Throwable -> L87
            goto L85
        L79:
            java.lang.Object r0 = r5.a     // Catch: java.lang.Throwable -> L87
            cir r1 = new cir     // Catch: java.lang.Throwable -> L87
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L87
            jp r0 = (defpackage.jp) r0     // Catch: java.lang.Throwable -> L87
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r7)
            return r8
        L87:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L8a:
            return r1
        L8b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfb.d(cix, yjv, yih):java.lang.Object");
    }

    public final cff e() {
        cfc cfcVar = new cfc();
        return new cff((bko) this.b, false, (bys) this.c, cfcVar);
    }

    public final void f(bys bysVar, cfc cfcVar) {
        cfy cfyVar;
        cfy cfyVar2;
        kc kcVar = (kc) this.d;
        Object[] objArr = kcVar.a;
        int i = kcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            bla blaVar = (bla) objArr[i2];
            cfc cfcVarP = bysVar.p();
            int i3 = bysVar.c;
            String str = null;
            String str2 = (cfcVar == null || (cfyVar2 = (cfy) ccf.t(cfcVar, cfi.D)) == null) ? null : cfyVar2.b;
            if (cfcVarP != null && (cfyVar = (cfy) ccf.t(cfcVarP, cfi.D)) != null) {
                str = cfyVar.b;
            }
            if (str2 != str) {
                if (str2 == null) {
                    blaVar.i.f(blaVar.a, i3, true);
                } else if (str == null) {
                    blaVar.i.f(blaVar.a, i3, false);
                } else if (yks.e((bkx) ccf.t(cfcVarP, cfi.r), bld.a)) {
                    bb$$ExternalSyntheticApiModelOutline1.m69m(blaVar.i.a).notifyValueChanged(blaVar.a, i3, AutofillValue.forText(str));
                }
            }
            boolean z = cfcVar != null && bdi.w(cfcVar);
            boolean z2 = cfcVarP != null && bdi.w(cfcVarP);
            if (z != z2) {
                if (z2) {
                    blaVar.g.d(i3);
                } else {
                    blaVar.g.e(i3);
                }
            }
        }
    }

    public dfb(dgl dglVar, dgl dglVar2, Object obj) {
        this.c = dglVar;
        this.a = "";
        this.d = dglVar2;
        this.b = obj;
    }

    public dfb(bys bysVar, cew cewVar, jc jcVar) {
        this.c = bysVar;
        this.b = cewVar;
        this.a = jcVar;
        this.d = new kc(2);
    }

    public dfb(yow yowVar, yjv yjvVar, yjz yjzVar, yjz yjzVar2) {
        this.a = yowVar;
        this.d = yjzVar2;
        this.b = vyf.R(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 6);
        this.c = new cvw();
        yqe yqeVar = (yqe) ((ywq) yowVar).a.get(yqe.c);
        if (yqeVar != null) {
            yqeVar.r(new gk((Object) yjvVar, (Object) this, (Object) yjzVar, 14, (short[]) null));
        }
    }

    public dfb(char[] cArr) {
        this.b = null;
        this.a = new jp(16);
        long[] jArr = kj.a;
        this.d = new ki((byte[]) null);
        this.c = new cko();
    }

    public dfb(byte[] bArr) {
        this.d = new cuk(10);
        this.a = new ko();
        this.b = new ArrayList();
        this.c = new HashSet();
    }

    public dfb(yjz yjzVar, yol yolVar, dcq dcqVar, yil yilVar) {
        yjzVar.getClass();
        yilVar.getClass();
        this.b = yjzVar;
        this.c = yolVar;
        this.a = dcqVar;
        this.d = yilVar;
    }
}
