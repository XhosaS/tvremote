package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irc {
    public final Object a;
    public final Object b;

    public irc(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public final Object a(String str) {
        vtw vtwVarM = wzb.a.m();
        vtwVarM.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((wzb) vtwVarM.b).b = str;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        Object obj = this.b;
        wzb wzbVar = (wzb) vucVarR;
        vtw vtwVarM2 = ink.a.m();
        vtwVarM2.getClass();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ink inkVar = (ink) vtwVarM2.b;
        inkVar.d = wzbVar;
        inkVar.c = 11;
        return new gxd(((hfx) obj).h(ihz.Y(ipc.p(vtwVarM2))), 10);
    }

    public final void b() {
        Object obj = this.b;
        ((pjx) this.a).b(pjw.b(), (pju) obj);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    public final void c(List list) {
        wnx wnxVarB;
        ArrayList<wnw> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wnw) obj).b == 1) {
                arrayList.add(obj);
            }
        }
        for (wnw wnwVar : arrayList) {
            ?? r2 = this.a;
            if (wnwVar.b == 1) {
                wnxVarB = wnx.b(((Integer) wnwVar.c).intValue());
                if (wnxVarB == null) {
                    wnxVarB = wnx.UNRECOGNIZED;
                }
            } else {
                wnxVarB = wnx.EVENT_TYPE_UNSPECIFIED;
            }
            Object obj2 = r2.get(wnxVarB);
            ixl ixlVar = obj2 instanceof ixl ? (ixl) obj2 : null;
            if (ixlVar != null) {
                ixlVar.dP();
            }
        }
        ArrayList<wnw> arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((wnw) obj3).b == 2) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(yfm.z(arrayList2, 10));
        for (wnw wnwVar2 : arrayList2) {
            arrayList3.add(wnwVar2.b == 2 ? (String) wnwVar2.c : "");
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        Set setKeySet = ((WeakHashMap) this.b).keySet();
        setKeySet.getClass();
        List listAl = yfm.al(setKeySet);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listAl) {
            if (!yfm.ao(((ixk) obj4).g, arrayList3).isEmpty()) {
                arrayList4.add(obj4);
            }
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            ((ixk) it.next()).eb();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final Set d() {
        Object objB = this.b.b();
        objB.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) objB).entrySet()) {
            ((ixf) entry.getValue()).b();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xbw] */
    public final void e(wkg wkgVar, Context context, String str) {
        context.getClass();
        if (!h(wkgVar)) {
            wkf wkfVarB = wkf.b(wkgVar.c);
            if (wkfVarB == null) {
                wkfVarB = wkf.TYPE_UNSPECIFIED;
            }
            krd.b(a.cj(wkfVarB, "Action ", " not supported"));
            return;
        }
        Map map = (Map) this.b.b();
        wkf wkfVarB2 = wkf.b(wkgVar.c);
        if (wkfVarB2 == null) {
            wkfVarB2 = wkf.TYPE_UNSPECIFIED;
        }
        ixf ixfVar = (ixf) map.get(wkfVarB2);
        if (ixfVar != null) {
            ixfVar.a(wkgVar, context, str, null);
        }
    }

    public final void f(wkg wkgVar, View view, pjw pjwVar) {
        view.getClass();
        if (h(wkgVar)) {
            ((pjx) this.a).a(pjwVar, view);
            Context context = view.getContext();
            context.getClass();
            e(wkgVar, context, "");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xbw] */
    public final void g(wkg wkgVar, Context context, String str, String str2) {
        if (str.length() == 0) {
            krd.c("Account name is empty, no action to be performed");
            return;
        }
        if (!h(wkgVar)) {
            wkf wkfVarB = wkf.b(wkgVar.c);
            if (wkfVarB == null) {
                wkfVarB = wkf.TYPE_UNSPECIFIED;
            }
            krd.b(a.cj(wkfVarB, "Action ", " not supported"));
            return;
        }
        Map map = (Map) this.b.b();
        wkf wkfVarB2 = wkf.b(wkgVar.c);
        if (wkfVarB2 == null) {
            wkfVarB2 = wkf.TYPE_UNSPECIFIED;
        }
        ixf ixfVar = (ixf) map.get(wkfVarB2);
        if (ixfVar != null) {
            ixfVar.a(wkgVar, context, str2, str);
        }
    }

    public final boolean h(wkg wkgVar) {
        Set setD = d();
        wkf wkfVarB = wkf.b(wkgVar.c);
        if (wkfVarB == null) {
            wkfVarB = wkf.TYPE_UNSPECIFIED;
        }
        return setD.contains(wkfVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.wni r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.iqx
            if (r0 == 0) goto L13
            r0 = r8
            iqx r0 = (defpackage.iqx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            iqx r0 = new iqx
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L79
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ybn.f(r8)
            java.lang.Object r8 = r6.a
            wwk r2 = defpackage.wwk.a
            vtw r2 = r2.m()
            r2.getClass()
            r7.getClass()
            vuc r4 = r2.b
            boolean r4 = r4.A()
            if (r4 != 0) goto L4b
            r2.u()
        L4b:
            vuc r4 = r2.b
            wwk r4 = (defpackage.wwk) r4
            r4.c = r7
            int r7 = r4.b
            r7 = r7 | r3
            r4.b = r7
            vuc r7 = r2.r()
            r7.getClass()
            wwk r7 = (defpackage.wwk) r7
            r0.b = r3
            kdj r8 = (defpackage.kdj) r8
            java.lang.Object r2 = r8.b
            java.lang.Object r2 = r2.b()
            ahk r3 = new ahk
            r4 = 0
            r5 = 17
            r3.<init>(r8, r7, r4, r5)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r8 = r2.c(r3, r0)
            if (r8 == r1) goto L85
        L79:
            wwl r8 = (defpackage.wwl) r8
            wnj r7 = r8.b
            if (r7 != 0) goto L81
            wnj r7 = defpackage.wnj.a
        L81:
            r7.getClass()
            return r7
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irc.i(wni, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, yil] */
    public final Object j(wni wniVar, vtl vtlVar, wni wniVar2, wni wniVar3, yih yihVar) throws Throwable {
        Object objL = ykr.l(this.b, new iqy(this, wniVar, vtlVar, wniVar2, wniVar3, null), yihVar);
        return objL == yio.a ? objL : ygi.a;
    }

    public irc(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public irc(gpz gpzVar, lfn lfnVar) {
        gpzVar.getClass();
        lfnVar.getClass();
        this.a = gpzVar;
        this.b = lfnVar;
    }

    public irc(xbw xbwVar, pjx pjxVar) {
        xbwVar.getClass();
        this.b = xbwVar;
        this.a = pjxVar;
    }

    public irc(yfo yfoVar, yfo yfoVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public irc(Map map) {
        map.getClass();
        this.a = map;
        this.b = new WeakHashMap();
    }

    public irc(yfo yfoVar, yfo yfoVar2, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public irc(yfo yfoVar, yfo yfoVar2, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public irc(yfo yfoVar, yfo yfoVar2, short[] sArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }

    public irc(kdj kdjVar, kw kwVar) {
        kdjVar.getClass();
        this.a = kdjVar;
        hfx hfxVarB = kwVar.B(new gew((Object) this, 10, (int[][]) null), itc.h);
        hfxVarB.d();
        this.b = hfxVarB.i();
    }

    public irc(yfo yfoVar, yfo yfoVar2) {
        yfoVar.getClass();
        this.a = yfoVar;
        yfoVar2.getClass();
        this.b = yfoVar2;
    }

    public irc(yfo yfoVar, yfo yfoVar2, byte[] bArr) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }
}
