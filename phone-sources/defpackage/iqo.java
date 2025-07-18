package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqo implements ino {
    public static final ipc a = new ipc();
    public static final tui b = tui.l("com/google/android/apps/googletv/app/data/store/impl/MediaLibraryStoreImpl");
    public static final Duration c;
    private final ConcurrentHashMap A;
    private final ypc B;
    private boolean C;
    private final iyz D;
    private final lfz E;
    private final kdj F;
    public final Context d;
    public final ihi e;
    public final yow f;
    public final ijy g;
    public final ikm h;
    public final ikf i;
    public final ikq j;
    public final xbw k;
    public final ikj l;
    public final yuj m;
    public Map n;
    public boolean o;
    private final ieh p;
    private final ijq q;
    private final ikh r;
    private final idf s;
    private final ids t;
    private final ConcurrentHashMap u;
    private final ConcurrentHashMap v;
    private final yum w;
    private final ConcurrentHashMap x;
    private final List y;
    private final ConcurrentHashMap z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        c = durationOfSeconds;
    }

    public iqo(Context context, ieh iehVar, kdj kdjVar, ihi ihiVar, yow yowVar, ijq ijqVar, ijy ijyVar, ikm ikmVar, ikf ikfVar, ikq ikqVar, ikh ikhVar, iyz iyzVar, xbw xbwVar, ikj ikjVar, lfz lfzVar, idf idfVar, ids idsVar, lys lysVar) {
        kdjVar.getClass();
        ijqVar.getClass();
        ijyVar.getClass();
        ikmVar.getClass();
        ikfVar.getClass();
        ikqVar.getClass();
        ikhVar.getClass();
        iyzVar.getClass();
        xbwVar.getClass();
        ikjVar.getClass();
        lfzVar.getClass();
        idsVar.getClass();
        lysVar.getClass();
        this.d = context;
        this.p = iehVar;
        this.F = kdjVar;
        this.e = ihiVar;
        this.f = yowVar;
        this.q = ijqVar;
        this.g = ijyVar;
        this.h = ikmVar;
        this.i = ikfVar;
        this.j = ikqVar;
        this.r = ikhVar;
        this.D = iyzVar;
        this.k = xbwVar;
        this.l = ikjVar;
        this.E = lfzVar;
        this.s = idfVar;
        this.t = idsVar;
        this.u = new ConcurrentHashMap();
        this.v = new ConcurrentHashMap();
        yuj yujVarE = yuq.e(0, 0, 0, 7);
        this.m = yujVarE;
        this.w = new yuk(yujVarE);
        this.x = new ConcurrentHashMap();
        List listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        listSynchronizedList.getClass();
        this.y = listSynchronizedList;
        this.z = new ConcurrentHashMap();
        this.n = yhc.a;
        this.A = new ConcurrentHashMap();
        idsVar.ea(new itm(this, 1));
        this.B = ykr.o(yowVar, null, new gow(this, (yih) null, 13, (byte[]) null), 3);
    }

    public static final wok ai(wna wnaVar) {
        vtw vtwVarM = wok.a.m();
        vtwVarM.getClass();
        String str = wnaVar.c;
        str.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((wok) vucVar).b = str;
        int iAs = a.as(wnaVar.b);
        if (iAs == 0) {
            iAs = 1;
        }
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((wok) vtwVarM.b).c = a.aF(iAs);
        String str2 = wnaVar.c;
        str2.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((wok) vtwVarM.b).d = str2;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        return (wok) vucVarR;
    }

    public static final Instant aj(iia iiaVar, Long l, wni wniVar) {
        int iAU = a.aU(wniVar.c);
        if (iAU == 0) {
            iAU = 1;
        }
        if (a.aJ(iAU) != a.aJ(3)) {
            int iAU2 = a.aU(wniVar.c);
            if (a.aJ(iAU2 != 0 ? iAU2 : 1) != a.aJ(6)) {
                return null;
            }
        }
        wme wmeVar = iiaVar.c;
        if (wmeVar == null) {
            wmeVar = wme.a;
        }
        if (wmeVar.b != 2) {
            return null;
        }
        wme wmeVar2 = iiaVar.c;
        if (wmeVar2 == null) {
            wmeVar2 = wme.a;
        }
        vwe vweVar = (wmeVar2.b == 2 ? (wmj) wmeVar2.c : wmj.a).c;
        if (vweVar == null) {
            vweVar = vwe.a;
        }
        vweVar.getClass();
        return Instant.ofEpochMilli(l != null ? l.longValue() : vxf.b(vweVar));
    }

    private final inn ak(Map map, yjv yjvVar) {
        Map.Entry entry = (Map.Entry) yjvVar.a(map);
        wni wniVar = entry != null ? (wni) entry.getKey() : null;
        if (wniVar != null) {
            return new inn(wniVar, ((ipe) entry.getValue()).h, ((ipe) entry.getValue()).i, (wlx) this.x.get(wniVar));
        }
        return null;
    }

    private final inn al(wni wniVar, yjz yjzVar, yjv yjvVar) {
        wni wniVar2;
        ConcurrentHashMap concurrentHashMap = this.z;
        ipe ipeVar = (ipe) concurrentHashMap.get(wniVar);
        if (ipeVar == null) {
            ipeVar = (ipe) this.v.get(wniVar);
        }
        wni wniVar3 = ipeVar != null ? ipeVar.g : null;
        wni wniVar4 = ipeVar != null ? ipeVar.f : null;
        ipe ipeVar2 = (ipe) concurrentHashMap.get(wniVar4);
        if (ipeVar2 == null) {
            ipeVar2 = (ipe) this.v.get(wniVar4);
        }
        Map mapAm = wniVar4 != null ? am(wniVar4, wniVar3, yjzVar, ipeVar) : yhc.a;
        if (!mapAm.isEmpty()) {
            return ak(mapAm, yjvVar);
        }
        ConcurrentHashMap concurrentHashMap2 = this.v;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = concurrentHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            wni wniVar5 = ((ipe) entry.getValue()).f;
            if (wniVar5 != null && wniVar5.equals(wniVar3) && ((ipe) entry.getValue()).i != null && ((Boolean) yjzVar.a(entry.getValue(), ipeVar2)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        while (!linkedHashMap.isEmpty()) {
            Map.Entry entry2 = (Map.Entry) yjvVar.a(linkedHashMap);
            Map mapAm2 = (entry2 == null || (wniVar2 = (wni) entry2.getKey()) == null) ? yhc.a : am(wniVar2, wniVar3, yjzVar, null);
            if (!mapAm2.isEmpty()) {
                return ak(mapAm2, yjvVar);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                if (!yks.e(entry3.getKey(), entry2 != null ? (wni) entry2.getKey() : null)) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            linkedHashMap = linkedHashMap2;
        }
        return null;
    }

    private final Map am(wni wniVar, wni wniVar2, yjz yjzVar, ipe ipeVar) {
        wni wniVar3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.v.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hju.v(((ipe) entry.getValue()).g)) {
                wni wniVar4 = ((ipe) entry.getValue()).g;
                wniVar4.getClass();
                if (yks.e(wniVar4, wniVar2) && (wniVar3 = ((ipe) entry.getValue()).f) != null && wniVar3.equals(wniVar) && ((ipe) entry.getValue()).i != null && (ipeVar == null || ((Boolean) yjzVar.a(entry.getValue(), ipeVar)).booleanValue())) {
                    Integer num = ((ipe) entry.getValue()).i;
                    if (num != null && num.intValue() < 100) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final synchronized void an(wni wniVar) {
        this.v.remove(wniVar);
        this.z.remove(wniVar);
        ao(wniVar);
    }

    private final void ao(wni wniVar) {
        ipd ipdVar = (ipd) this.u.get(wniVar);
        if (ipdVar != null) {
            ipe ipeVarO = O(wniVar);
            synchronized (ipdVar) {
                if (!yks.e(ipeVarO, ipdVar.g)) {
                    ipdVar.g = ipeVarO;
                    ipdVar.eb();
                }
            }
        }
        ykr.q(this.f, null, 0, new imw(this, wniVar, (yih) null, 4), 3);
    }

    private final synchronized void ap(wni wniVar) {
        this.z.remove(wniVar);
        ao(wniVar);
    }

    private final synchronized void aq(wni wniVar, ipe ipeVar) {
        this.v.put(wniVar, ipeVar);
        this.z.remove(wniVar);
        ao(wniVar);
    }

    private final synchronized void ar(wni wniVar, ipe ipeVar) {
        this.z.put(wniVar, ipeVar);
        ao(wniVar);
    }

    private final Object as(Set set) {
        int iAU;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            int i = ((wni) obj).c;
            int iAU2 = a.aU(i);
            if ((iAU2 != 0 && iAU2 == 6) || ((iAU = a.aU(i)) != 0 && iAU == 3)) {
                linkedHashSet.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            int iAU3 = a.aU(((wni) obj2).c);
            if (iAU3 != 0 && iAU3 == 5) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            obj3.getClass();
            ConcurrentHashMap concurrentHashMap = this.v;
            wni wniVar = (wni) obj3;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                wni wniVar2 = ((ipe) entry.getValue()).f;
                if (yks.e(wniVar2 != null ? wniVar2.b : null, wniVar.b)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashSet.containsAll(yfm.aq(linkedHashMap.keySet()))) {
                linkedHashSet.add(wniVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set) {
            int iAU4 = a.aU(((wni) obj4).c);
            if (iAU4 != 0 && iAU4 == 4) {
                arrayList2.add(obj4);
            }
        }
        for (Object obj5 : arrayList2) {
            obj5.getClass();
            ConcurrentHashMap concurrentHashMap2 = this.v;
            wni wniVar3 = (wni) obj5;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = concurrentHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                wni wniVar4 = ((ipe) entry2.getValue()).f;
                if (yks.e(wniVar4 != null ? wniVar4.b : null, wniVar3.b)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (linkedHashSet.containsAll(yfm.aq(linkedHashMap2.keySet()))) {
                linkedHashSet.add(wniVar3);
            }
        }
        return yfm.aq(linkedHashSet);
    }

    @Override // defpackage.ino
    public final yum A() {
        return this.w;
    }

    @Override // defpackage.ino
    public final void B(ksy ksyVar, ksy ksyVar2) {
        ksyVar2.getClass();
        ConcurrentHashMap concurrentHashMap = this.A;
        wni wniVarT = hju.t(ksyVar);
        wni wniVarT2 = hju.t(ksyVar2);
        concurrentHashMap.put(wniVarT, wniVarT2);
        ao(wniVarT2);
        yot yotVar = ypk.a;
        ykr.q(yoz.l(yya.a), null, 0, new th(this, wniVarT, wniVarT2, (yih) null, 19), 3);
    }

    @Override // defpackage.ino
    public final void C(ksy ksyVar, boolean z) {
        ksyVar.getClass();
        wni wniVarT = hju.t(ksyVar);
        yot yotVar = ypk.a;
        ykr.q(yoz.l(yya.a), null, 0, new iqm(this, wniVarT, z, null), 3);
    }

    @Override // defpackage.ino
    public final void D(ksy ksyVar, boolean z) {
        int iAU;
        wni wniVar;
        int iAU2;
        if (this.e.a()) {
            ylf ylfVar = new ylf();
            ylfVar.a = hju.t(ksyVar);
            Object obj = ylfVar.a;
            wni wniVar2 = (wni) obj;
            if ((wniVar2 != null && (iAU2 = a.aU(wniVar2.c)) != 0 && iAU2 == 6) || (wniVar2 != null && (iAU = a.aU(wniVar2.c)) != 0 && iAU == 5)) {
                ipe ipeVar = (ipe) this.z.get(obj);
                if (ipeVar == null || (wniVar = ipeVar.g) == null) {
                    ipe ipeVar2 = (ipe) this.v.get(ylfVar.a);
                    wniVar = ipeVar2 != null ? ipeVar2.g : null;
                }
                ylfVar.a = wniVar;
            }
            if (ylfVar.a != null) {
                if (z) {
                    ykr.q(this.f, null, 0, new imw(this, ylfVar, (yih) null, 6), 3);
                } else {
                    ykr.q(this.f, null, 0, new imw(this, ylfVar, (yih) null, 7, (byte[]) null), 3);
                }
            }
        }
    }

    @Override // defpackage.ino
    public final boolean E(wni wniVar) {
        Collection collectionValues = this.z.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (yks.e(((ipe) obj).g, wniVar)) {
                arrayList.add(obj);
            }
        }
        Set<ipe> setAp = yfm.ap(arrayList);
        Collection collectionValues2 = this.v.values();
        collectionValues2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues2) {
            if (yks.e(((ipe) obj2).g, wniVar)) {
                arrayList2.add(obj2);
            }
        }
        setAp.addAll(arrayList2);
        if (setAp.isEmpty()) {
            return false;
        }
        for (ipe ipeVar : setAp) {
            if (ipeVar.d && !ipeVar.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ino
    public final boolean F(wni wniVar) {
        ipe ipeVarO;
        return this.C && (ipeVarO = O(wniVar)) != null && ipeVarO.d;
    }

    @Override // defpackage.ino
    public final boolean G(wni wniVar) {
        ipe ipeVarO = O(wniVar);
        if (ipeVarO != null) {
            return ipeVarO.e;
        }
        return false;
    }

    @Override // defpackage.ino
    public final boolean H(wni wniVar) {
        wniVar.getClass();
        return K(wniVar) || L(wniVar) || J(wniVar) || G(wniVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I() {
        /*
            r3 = this;
            xbw r0 = r3.k
            java.lang.Object r1 = r0.b()
            isi r1 = (defpackage.isi) r1
            iod r1 = r1.i
            wkc r1 = r1.p
            if (r1 != 0) goto L10
            wkc r1 = defpackage.wkc.a
        L10:
            wkc r2 = defpackage.wkc.a
            boolean r1 = defpackage.yks.e(r1, r2)
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.b()
            isi r1 = (defpackage.isi) r1
            iod r1 = r1.i
            wkc r1 = r1.q
            if (r1 != 0) goto L25
            r1 = r2
        L25:
            boolean r1 = defpackage.yks.e(r1, r2)
            if (r1 != 0) goto L37
        L2b:
            java.lang.Object r1 = r0.b()
            isi r1 = (defpackage.isi) r1
            iod r1 = r1.i
            boolean r1 = r1.s
            if (r1 != 0) goto L46
        L37:
            java.lang.Object r0 = r0.b()
            isi r0 = (defpackage.isi) r0
            iod r0 = r0.i
            boolean r0 = r0.t
            if (r0 == 0) goto L44
            goto L46
        L44:
            r0 = 0
            return r0
        L46:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.I():boolean");
    }

    @Override // defpackage.ino
    public final boolean J(wni wniVar) {
        wniVar.getClass();
        ipe ipeVarO = O(wniVar);
        if (ipeVarO != null) {
            return ipeVarO.a;
        }
        return false;
    }

    @Override // defpackage.ino
    public final boolean K(wni wniVar) {
        ipe ipeVarO = O(wniVar);
        if (ipeVarO != null) {
            return ipeVarO.b;
        }
        return false;
    }

    @Override // defpackage.ino
    public final boolean L(wni wniVar) {
        ipe ipeVarO = O(wniVar);
        if (ipeVarO != null) {
            return ipeVarO.c;
        }
        return false;
    }

    @Override // defpackage.ino
    public final boolean M(wni wniVar) {
        int iAU;
        wniVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.v.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (yks.e(((ipe) entry.getValue()).f, wniVar) && (iAU = a.aU(((wni) entry.getKey()).c)) != 0 && iAU == 5) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    @Override // defpackage.ino
    public final boolean N(wni wniVar) {
        if (!this.n.containsKey(wniVar)) {
            ((tug) b.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/data/store/impl/MediaLibraryStoreImpl", "shouldShowRentalWarningDialog", 402, "MediaLibraryStoreImpl.kt")).v("rentalExpiryMap does not contain key for playID: %s", wniVar);
        }
        ijt ijtVar = (ijt) this.n.get(wniVar);
        if (ijtVar == null) {
            return false;
        }
        iia iiaVar = ijtVar.d;
        wme wmeVar = iiaVar.c;
        if (wmeVar == null) {
            wmeVar = wme.a;
        }
        vtl vtlVar = (wmeVar.b == 2 ? (wmj) wmeVar.c : wmj.a).d;
        if (vtlVar == null) {
            vtlVar = vtl.a;
        }
        vtlVar.getClass();
        Long l = ijtVar.c;
        Duration durationC = vyf.c(vtlVar);
        Instant instantAj = aj(iiaVar, l, wniVar);
        if (instantAj == null) {
            return false;
        }
        Duration durationBetween = Duration.between(Instant.ofEpochMilli(System.currentTimeMillis()), instantAj);
        durationBetween.getClass();
        return durationBetween.compareTo(durationC) > 0;
    }

    public final ipe O(wni wniVar) {
        wniVar.getClass();
        ipe ipeVar = (ipe) this.z.get(wniVar);
        return ipeVar == null ? (ipe) this.v.get(wniVar) : ipeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[Catch: Exception -> 0x00f0, CancellationException -> 0x0116, xtl -> 0x0118, TryCatch #2 {CancellationException -> 0x0116, xtl -> 0x0118, Exception -> 0x00f0, blocks: (B:13:0x0032, B:27:0x008e, B:28:0x009c, B:30:0x00a2, B:32:0x00ad, B:33:0x00b1, B:35:0x00b7, B:37:0x00bd, B:51:0x00e9, B:40:0x00c4, B:41:0x00c8, B:43:0x00ce, B:45:0x00d8, B:47:0x00df, B:49:0x00e3, B:46:0x00dd, B:18:0x0042, B:24:0x0059, B:21:0x0049), top: B:61:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: Exception -> 0x00f0, CancellationException -> 0x0116, xtl -> 0x0118, TryCatch #2 {CancellationException -> 0x0116, xtl -> 0x0118, Exception -> 0x00f0, blocks: (B:13:0x0032, B:27:0x008e, B:28:0x009c, B:30:0x00a2, B:32:0x00ad, B:33:0x00b1, B:35:0x00b7, B:37:0x00bd, B:51:0x00e9, B:40:0x00c4, B:41:0x00c8, B:43:0x00ce, B:45:0x00d8, B:47:0x00df, B:49:0x00e3, B:46:0x00dd, B:18:0x0042, B:24:0x0059, B:21:0x0049), top: B:61:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[Catch: Exception -> 0x00f0, CancellationException -> 0x0116, xtl -> 0x0118, TryCatch #2 {CancellationException -> 0x0116, xtl -> 0x0118, Exception -> 0x00f0, blocks: (B:13:0x0032, B:27:0x008e, B:28:0x009c, B:30:0x00a2, B:32:0x00ad, B:33:0x00b1, B:35:0x00b7, B:37:0x00bd, B:51:0x00e9, B:40:0x00c4, B:41:0x00c8, B:43:0x00ce, B:45:0x00d8, B:47:0x00df, B:49:0x00e3, B:46:0x00dd, B:18:0x0042, B:24:0x0059, B:21:0x0049), top: B:61:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(java.util.List r11, defpackage.yih r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.P(java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (S(r2) != r3) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[Catch: Exception -> 0x0051, CancellationException -> 0x0054, xtl -> 0x0057, TryCatch #2 {CancellationException -> 0x0054, xtl -> 0x0057, Exception -> 0x0051, blocks: (B:14:0x0039, B:32:0x00b5, B:34:0x00bb, B:37:0x00d7, B:40:0x0110, B:19:0x004c, B:31:0x00ad), top: B:48:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110 A[Catch: Exception -> 0x0051, CancellationException -> 0x0054, xtl -> 0x0057, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0054, xtl -> 0x0057, Exception -> 0x0051, blocks: (B:14:0x0039, B:32:0x00b5, B:34:0x00bb, B:37:0x00d7, B:40:0x0110, B:19:0x004c, B:31:0x00ad), top: B:48:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010e -> B:32:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q(java.util.List r18, defpackage.yih r19) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.Q(java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:20:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object R(java.lang.String r5, java.util.Set r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ipl
            if (r0 == 0) goto L13
            r0 = r7
            ipl r0 = (defpackage.ipl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ipl r0 = new ipl
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            wni r5 = r0.f
            java.lang.Object r6 = r0.a
            java.lang.String r2 = r0.e
            defpackage.ybn.f(r7)
            r7 = r5
            r5 = r2
            goto L5b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.ybn.f(r7)
            java.util.Iterator r6 = r6.iterator()
        L3e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r6.next()
            wni r7 = (defpackage.wni) r7
            ijy r2 = r4.g
            r0.e = r5
            r0.a = r6
            r0.f = r7
            r0.d = r3
            java.lang.Object r2 = r2.c(r5, r7, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            java.lang.String r2 = r4.ad()
            boolean r2 = defpackage.yks.e(r2, r5)
            if (r2 == 0) goto L3e
            r4.an(r7)
            goto L3e
        L69:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.R(java.lang.String, java.util.Set, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ipm
            if (r0 == 0) goto L13
            r0 = r5
            ipm r0 = (defpackage.ipm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ipm r0 = new ipm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r5)     // Catch: java.lang.Exception -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ybn.f(r5)
            ypc r5 = r4.B     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.n(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            ygi r5 = defpackage.ygi.a
            return r5
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "[UMP_LIBRARY] Failed to initialize MediaLibraryStore"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.S(yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(java.lang.String r17, java.util.List r18, java.lang.String r19, boolean r20, defpackage.yih r21) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.T(java.lang.String, java.util.List, java.lang.String, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U(java.lang.String r11, java.util.List r12, defpackage.yih r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ipo
            if (r0 == 0) goto L13
            r0 = r13
            ipo r0 = (defpackage.ipo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ipo r0 = new ipo
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r13)
            return r13
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.Object r12 = r0.a
            java.lang.String r11 = r0.e
            defpackage.ybn.f(r13)
            goto L49
        L3a:
            defpackage.ybn.f(r13)
            r0.e = r11
            r0.a = r12
            r0.d = r4
            java.lang.Object r13 = r10.S(r0)
            if (r13 == r1) goto Laf
        L49:
            r6 = r11
            kdj r5 = r10.F
            wvk r11 = defpackage.wvk.a
            vtw r11 = r11.m()
            r11.getClass()
            vuc r13 = r11.b
            wvk r13 = (defpackage.wvk) r13
            vun r13 = r13.b
            java.util.List r13 = j$.util.DesugarCollections.unmodifiableList(r13)
            r13.getClass()
            r12.getClass()
            vuc r13 = r11.b
            boolean r13 = r13.A()
            if (r13 != 0) goto L70
            r11.u()
        L70:
            vuc r13 = r11.b
            wvk r13 = (defpackage.wvk) r13
            vun r2 = r13.b
            boolean r4 = r2.c()
            if (r4 != 0) goto L82
            vun r2 = defpackage.vuc.s(r2)
            r13.b = r2
        L82:
            vun r13 = r13.b
            defpackage.vsf.h(r12, r13)
            vuc r11 = r11.r()
            r11.getClass()
            r7 = r11
            wvk r7 = (defpackage.wvk) r7
            r11 = 0
            r0.e = r11
            r0.a = r11
            r0.d = r3
            java.lang.Object r11 = r5.b
            java.lang.Object r11 = r11.b()
            om r4 = new om
            r8 = 0
            r9 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            hfx r11 = (defpackage.hfx) r11
            java.lang.Object r11 = r11.c(r4, r0)
            if (r11 != r1) goto Lae
            goto Laf
        Lae:
            return r11
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.U(java.lang.String, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(java.lang.String r11, java.util.List r12, defpackage.yih r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ipp
            if (r0 == 0) goto L13
            r0 = r13
            ipp r0 = (defpackage.ipp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ipp r0 = new ipp
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r13)
            return r13
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.Object r12 = r0.a
            java.lang.String r11 = r0.e
            defpackage.ybn.f(r13)
            goto L49
        L3a:
            defpackage.ybn.f(r13)
            r0.e = r11
            r0.a = r12
            r0.d = r4
            java.lang.Object r13 = r10.S(r0)
            if (r13 == r1) goto Laf
        L49:
            r6 = r11
            kdj r5 = r10.F
            wvm r11 = defpackage.wvm.a
            vtw r11 = r11.m()
            r11.getClass()
            vuc r13 = r11.b
            wvm r13 = (defpackage.wvm) r13
            vun r13 = r13.b
            java.util.List r13 = j$.util.DesugarCollections.unmodifiableList(r13)
            r13.getClass()
            r12.getClass()
            vuc r13 = r11.b
            boolean r13 = r13.A()
            if (r13 != 0) goto L70
            r11.u()
        L70:
            vuc r13 = r11.b
            wvm r13 = (defpackage.wvm) r13
            vun r2 = r13.b
            boolean r4 = r2.c()
            if (r4 != 0) goto L82
            vun r2 = defpackage.vuc.s(r2)
            r13.b = r2
        L82:
            vun r13 = r13.b
            defpackage.vsf.h(r12, r13)
            vuc r11 = r11.r()
            r11.getClass()
            r7 = r11
            wvm r7 = (defpackage.wvm) r7
            r11 = 0
            r0.e = r11
            r0.a = r11
            r0.d = r3
            java.lang.Object r11 = r5.b
            java.lang.Object r11 = r11.b()
            om r4 = new om
            r8 = 0
            r9 = 5
            r4.<init>(r5, r6, r7, r8, r9)
            hfx r11 = (defpackage.hfx) r11
            java.lang.Object r11 = r11.c(r4, r0)
            if (r11 != r1) goto Lae
            goto Laf
        Lae:
            return r11
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.V(java.lang.String, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r12 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0157, code lost:
    
        if (r12 == r1) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[PHI: r12
  0x00d7: PHI (r12v29 java.lang.Object) = (r12v28 java.lang.Object), (r12v1 java.lang.Object) binds: [B:45:0x00d5, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W(defpackage.yih r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.W(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r1 != r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r1 != r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0081 -> B:25:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object X(defpackage.yih r17) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.X(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (S(r2) != r3) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c2 A[LOOP:1: B:105:0x01bc->B:107:0x01c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Y(java.util.List r21, defpackage.yih r22) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.Y(java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (S(r2) != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z(java.util.List r18, defpackage.yih r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.Z(java.util.List, yih):java.lang.Object");
    }

    @Override // defpackage.ino
    public final int a(wni wniVar) {
        Set setEntrySet = this.z.entrySet();
        setEntrySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (yks.e(((ipe) ((Map.Entry) obj).getValue()).g, wniVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((wni) ((Map.Entry) it.next()).getKey());
        }
        Set setAp = yfm.ap(arrayList2);
        Set setEntrySet2 = this.v.entrySet();
        setEntrySet2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : setEntrySet2) {
            if (yks.e(((ipe) ((Map.Entry) obj2).getValue()).g, wniVar)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(yfm.z(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object key = ((Map.Entry) it2.next()).getKey();
            key.getClass();
            arrayList4.add((wni) key);
        }
        setAp.addAll(arrayList4);
        return setAp.size();
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00e6: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:231), block:B:45:0x00e6 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00eb: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:236), block:B:47:0x00eb */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00ef: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:240), block:B:49:0x00ef */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f3: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:244), block:B:51:0x00f3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00e7: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:232), block:B:45:0x00e6 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00ec: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:237), block:B:47:0x00eb */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00f0: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:241), block:B:49:0x00ef */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00f4: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:245), block:B:51:0x00f3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x03b0 -> B:335:0x03b8). Please report as a decompilation issue!!! */
    public final java.lang.Object aa(java.lang.String r21, java.util.List r22, boolean r23, defpackage.yih r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.aa(java.lang.String, java.util.List, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (S(r0) != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [iqo] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00be -> B:24:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ab(java.util.List r9, defpackage.yih r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.ab(java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (S(r2) != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03ce, code lost:
    
        r4 = r11.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x03d0, code lost:
    
        if (r4 != null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03d2, code lost:
    
        r4 = defpackage.wni.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x03d4, code lost:
    
        r4.getClass();
        aq(r4, defpackage.ipc.a(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03e1, code lost:
    
        if ((r11.b & r8) == 0) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03e3, code lost:
    
        r1 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03e5, code lost:
    
        if (r1 != null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x03e7, code lost:
    
        r1 = defpackage.wme.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x03eb, code lost:
    
        if (r1.b != r9) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03ed, code lost:
    
        r1 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03ef, code lost:
    
        if (r1 != null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x03f1, code lost:
    
        r1 = defpackage.wme.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03f5, code lost:
    
        if (r1.b != r9) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03f7, code lost:
    
        r1 = (defpackage.wmj) r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03fc, code lost:
    
        r1 = defpackage.wmj.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0401, code lost:
    
        if ((r1.b & 1) == 0) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0403, code lost:
    
        r1 = r29.l;
        r4 = r11.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0407, code lost:
    
        if (r4 != null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0409, code lost:
    
        r4 = defpackage.wni.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x040b, code lost:
    
        r4.getClass();
        r5 = (defpackage.ime) defpackage.gez.j(r1.a, true, r32, new defpackage.ijr(r4, r14, 13));
        r4 = r11.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0421, code lost:
    
        if (r4 != null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0423, code lost:
    
        r4 = defpackage.wme.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0427, code lost:
    
        if (r4.b != r9) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0429, code lost:
    
        r4 = (defpackage.wmj) r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x042e, code lost:
    
        r4 = defpackage.wmj.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0430, code lost:
    
        r4 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0432, code lost:
    
        if (r4 != null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0434, code lost:
    
        r4 = defpackage.vwe.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0436, code lost:
    
        r4.getClass();
        r4 = defpackage.vyf.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x043d, code lost:
    
        if (r5 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x043f, code lost:
    
        r5 = r5.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0441, code lost:
    
        if (r5 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x044d, code lost:
    
        if (r5.longValue() >= r4.toEpochMilli()) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x044f, code lost:
    
        r4 = j$.time.Instant.ofEpochMilli(r5.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0457, code lost:
    
        r4.getClass();
        r5 = (defpackage.tug) defpackage.iqo.b.b().h(defpackage.tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/data/store/impl/MediaLibraryStoreImpl", "upsertMediaLibraryItems", 696, "MediaLibraryStoreImpl.kt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0478, code lost:
    
        if (r11.c != r9) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x047a, code lost:
    
        r6 = (defpackage.wmg) r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x047f, code lost:
    
        r6 = defpackage.wmg.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0481, code lost:
    
        r5.B("[RentalInfo] Updating mediaLibraryItemRentalDao with %s for movie: %s", r4, r6.b);
        r6 = r11.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x048c, code lost:
    
        if (r6 != null) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x048e, code lost:
    
        r6 = defpackage.wni.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0490, code lost:
    
        r6.getClass();
        r6 = new defpackage.ime[]{new defpackage.ime(r6, r14, new java.lang.Long(r4.toEpochMilli()))};
        r2.g = r14;
        r2.a = r12;
        r2.h = r11;
        r2.b = r4;
        r2.c = null;
        r7 = 4;
        r2.f = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x04b6, code lost:
    
        if (r1.b(r6, r2) == r3) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04ca, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:192:0x029b, B:191:0x0298], limit reached: 316 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03ce A[EDGE_INSN: B:308:0x03ce->B:251:0x03ce BREAK  A[LOOP:0: B:246:0x03a8->B:311:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /* JADX WARN: Type inference failed for: r29v0, types: [iqo] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:298:0x04b6 -> B:299:0x04b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:304:0x04ca -> B:303:0x04c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ac(java.lang.String r30, java.util.List r31, defpackage.yih r32) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.ac(java.lang.String, java.util.List, yih):java.lang.Object");
    }

    public final String ad() {
        return (String) ((ldy) this.p).a().e(new jxt(new gwp(10), 1)).h("");
    }

    public final String ae(wmd wmdVar) {
        String str;
        xbw xbwVar = this.k;
        String str2 = ((isi) xbwVar.b()).i.m;
        str2.getClass();
        if (str2.length() > 0) {
            String str3 = ((isi) xbwVar.b()).i.m;
            str3.getClass();
            return str3;
        }
        wnb wnbVar = wmdVar.e;
        if (wnbVar == null) {
            wnbVar = wnb.a;
        }
        vun vunVar = wnbVar.b;
        vunVar.getClass();
        wna wnaVar = (wna) yfm.U(vunVar);
        return (wnaVar == null || (str = wnaVar.c) == null) ? "" : str;
    }

    public final String af(wla wlaVar) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            vun vunVar = ((wnv) it.next()).c;
            vunVar.getClass();
            yfm.I(arrayList, vunVar);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (yks.e(((wnu) next).f, wlaVar != null ? wlaVar.d : null)) {
                break;
            }
        }
        wnu wnuVar = (wnu) next;
        if (wnuVar != null) {
            return wnuVar.c;
        }
        return null;
    }

    public final synchronized void ag(wni wniVar) throws Throwable {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.u.remove(wniVar);
            ykr.q(this.f, null, 0, new imw(this, wniVar, (yih) null, 5, (byte[]) null), 3);
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void ah(wni wniVar, Instant instant) {
        Map mapM = yfm.m(this.n);
        ijt ijtVar = (ijt) mapM.get(wniVar);
        if (ijtVar != null) {
            mapM.put(wniVar, new ijt(ijtVar.a, ijtVar.b, Long.valueOf(instant.toEpochMilli()), ijtVar.d, ijtVar.e));
            this.n = yfm.l(mapM);
        }
    }

    @Override // defpackage.ino
    public final synchronized ids b(wni wniVar) {
        Object ipdVar;
        Object objPutIfAbsent;
        wniVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.u;
        ipdVar = concurrentHashMap.get(wniVar);
        if (ipdVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(wniVar, (ipdVar = new ipd(this, wniVar)))) != null) {
            ipdVar = objPutIfAbsent;
        }
        return (ids) ipdVar;
    }

    @Override // defpackage.ino
    public final inm c(wni wniVar) {
        wniVar.getClass();
        ipe ipeVar = (ipe) this.v.get(wniVar);
        if (ipeVar != null) {
            return ipeVar.j;
        }
        return null;
    }

    @Override // defpackage.ino
    public final inn d(wni wniVar) {
        ipc ipcVar = a;
        return al(wniVar, new gew((Object) ipcVar, 8, (char[][]) null), new ahf(ipcVar, 5, (boolean[]) null));
    }

    @Override // defpackage.ino
    public final inn e(wni wniVar) {
        ipc ipcVar = a;
        return al(wniVar, new gew((Object) ipcVar, 9, (short[][]) null), new ahf(ipcVar, 6, (float[]) null));
    }

    @Override // defpackage.ino
    public final wni f(wni wniVar) {
        ConcurrentHashMap concurrentHashMap = this.A;
        if (concurrentHashMap.containsKey(wniVar)) {
            return (wni) concurrentHashMap.get(wniVar);
        }
        return null;
    }

    @Override // defpackage.ino
    public final wni g(wni wniVar) {
        ipe ipeVar = (ipe) this.v.get(wniVar);
        if (ipeVar != null) {
            return ipeVar.f;
        }
        return null;
    }

    @Override // defpackage.ino
    public final wni h(wni wniVar) {
        ipe ipeVar = (ipe) this.v.get(wniVar);
        if (ipeVar != null) {
            return ipeVar.g;
        }
        return null;
    }

    @Override // defpackage.ino
    public final Long i(List list) {
        ArrayList<ijt> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ijt ijtVar = (ijt) this.n.get((wni) it.next());
            if (ijtVar != null) {
                arrayList.add(ijtVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (ijt ijtVar2 : arrayList) {
            Instant instantAj = aj(ijtVar2.d, ijtVar2.c, ijtVar2.b);
            arrayList2.add(instantAj != null ? Long.valueOf(instantAj.toEpochMilli()) : null);
        }
        return (Long) yfm.U(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (aa(r0, r2, true, r3) != r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, yfo] */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.wni r19, defpackage.yjk r20, defpackage.yih r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.j(wni, yjk, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.yih r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.k(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.wni r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ipq
            if (r0 == 0) goto L13
            r0 = r8
            ipq r0 = (defpackage.ipq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ipq r0 = new ipq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            defpackage.ybn.f(r8)
            goto L56
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            wni r7 = r0.d
            defpackage.ybn.f(r8)
            goto L46
        L39:
            defpackage.ybn.f(r8)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r6.S(r0)
            if (r8 == r1) goto L89
        L46:
            ikf r8 = r6.i
            java.lang.String r2 = r6.ad()
            r0.d = r5
            r0.c = r4
            java.lang.Object r8 = r8.d(r2, r7, r0)
            if (r8 == r1) goto L89
        L56:
            wmu r8 = (defpackage.wmu) r8
            if (r8 != 0) goto L5b
            return r5
        L5b:
            int r7 = r8.b
            r0 = 4
            if (r7 != r0) goto L61
            return r5
        L61:
            r0 = 3
            if (r7 != r0) goto L6f
            java.lang.Object r7 = r8.c
            wmt r7 = (defpackage.wmt) r7
            wla r7 = r7.b
            if (r7 != 0) goto L6e
            wla r7 = defpackage.wla.a
        L6e:
            return r7
        L6f:
            if (r7 != r4) goto L7c
            java.lang.Object r7 = r8.c
            wmr r7 = (defpackage.wmr) r7
            wla r7 = r7.d
            if (r7 != 0) goto L7b
            wla r7 = defpackage.wla.a
        L7b:
            return r7
        L7c:
            r8 = 5
            if (r7 != r8) goto L88
            wmr r7 = defpackage.wmr.a
            wla r7 = r7.d
            if (r7 != 0) goto L87
            wla r7 = defpackage.wla.a
        L87:
            return r7
        L88:
            return r5
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.l(wni, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.wni r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ipr
            if (r0 == 0) goto L13
            r0 = r8
            ipr r0 = (defpackage.ipr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ipr r0 = new ipr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            upo r7 = r0.f
            vwv r1 = r0.d
            upo r0 = r0.e
            defpackage.ybn.f(r8)
            goto L5e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ybn.f(r8)
            wom r8 = defpackage.wom.a
            vtw r8 = r8.m()
            upo r8 = defpackage.vxr.O(r8)
            vwv r2 = r8.e()
            ijy r4 = r6.g
            java.lang.String r5 = r6.ad()
            r0.e = r8
            r0.d = r2
            r0.f = r8
            r0.c = r3
            java.lang.Object r7 = r4.f(r5, r7, r0)
            if (r7 == r1) goto L68
            r0 = r8
            r1 = r2
            r8 = r7
            r7 = r0
        L5e:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r7.g(r1, r8)
            wom r7 = r0.f()
            return r7
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.m(wni, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[LOOP:0: B:22:0x00ab->B:24:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.wni r19, defpackage.yih r20) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.n(wni, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.wni r7, defpackage.yih r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ipy
            if (r0 == 0) goto L13
            r0 = r8
            ipy r0 = (defpackage.ipy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ipy r0 = new ipy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            wni r7 = r0.d
            defpackage.ybn.f(r8)
            goto L45
        L38:
            defpackage.ybn.f(r8)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r6.S(r0)
            if (r8 == r1) goto L62
        L45:
            ikh r8 = r6.r
            java.lang.String r2 = r6.ad()
            r5 = 0
            r0.d = r5
            r0.c = r3
            ijr r3 = new ijr
            r5 = 11
            r3.<init>(r2, r7, r5)
            gex r7 = r8.a
            r8 = 0
            java.lang.Object r7 = defpackage.gez.l(r7, r4, r8, r3, r0)
            if (r7 != r1) goto L61
            goto L62
        L61:
            return r7
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.o(wni, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
    
        if (r9 == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.String r7, int r8, defpackage.yih r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.p(java.lang.String, int, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.String r6, java.util.List r7, boolean r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.iqg
            if (r0 == 0) goto L13
            r0 = r9
            iqg r0 = (defpackage.iqg) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            iqg r0 = new iqg
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r8 = r0.b
            java.lang.Object r7 = r0.a
            java.lang.String r6 = r0.f
            defpackage.ybn.f(r9)
            goto L4d
        L3c:
            defpackage.ybn.f(r9)
            r0.f = r6
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r5.S(r0)
            if (r9 == r1) goto L5c
        L4d:
            r9 = 0
            r0.f = r9
            r0.a = r9
            r0.e = r3
            java.lang.Object r6 = r5.aa(r6, r7, r8, r0)
            if (r6 != r1) goto L5b
            goto L5c
        L5b:
            return r6
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.q(java.lang.String, java.util.List, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        if (defpackage.gez.l(r6.a, false, true, new defpackage.ijr(r6, r12, 0), r2) == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2 A[Catch: Exception -> 0x003a, CancellationException -> 0x003d, xtl -> 0x0040, TryCatch #2 {CancellationException -> 0x003d, xtl -> 0x0040, Exception -> 0x003a, blocks: (B:13:0x0035, B:45:0x00ec, B:24:0x004d, B:37:0x0097, B:39:0x00a2, B:40:0x00a4, B:42:0x00cf, B:43:0x00d1, B:34:0x0074), top: B:53:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf A[Catch: Exception -> 0x003a, CancellationException -> 0x003d, xtl -> 0x0040, TryCatch #2 {CancellationException -> 0x003d, xtl -> 0x0040, Exception -> 0x003a, blocks: (B:13:0x0035, B:45:0x00ec, B:24:0x004d, B:37:0x0097, B:39:0x00a2, B:40:0x00a4, B:42:0x00cf, B:43:0x00d1, B:34:0x0074), top: B:53:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, yfo] */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.String r19, defpackage.yih r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.r(java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(java.lang.String r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.iqi
            if (r0 == 0) goto L13
            r0 = r9
            iqi r0 = (defpackage.iqi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iqi r0 = new iqi
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ybn.f(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.ybn.f(r9)
            goto L5d
        L39:
            java.lang.String r8 = r0.d
            defpackage.ybn.f(r9)
            goto L4c
        L3f:
            defpackage.ybn.f(r9)
            r0.d = r8
            r0.c = r5
            java.lang.Object r9 = r7.S(r0)
            if (r9 == r1) goto L69
        L4c:
            ijy r9 = r7.g
            long r5 = java.lang.System.currentTimeMillis()
            r2 = 0
            r0.d = r2
            r0.c = r4
            java.lang.Object r9 = r9.k(r8, r5, r0)
            if (r9 == r1) goto L69
        L5d:
            java.util.List r9 = (java.util.List) r9
            r0.c = r3
            java.lang.Object r8 = r7.ab(r9, r0)
            if (r8 != r1) goto L68
            goto L69
        L68:
            return r8
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.s(java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.String r10, defpackage.yih r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.iqk
            if (r0 == 0) goto L13
            r0 = r11
            iqk r0 = (defpackage.iqk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iqk r0 = new iqk
            r0.<init>(r9, r11)
        L18:
            r7 = r0
            java.lang.Object r11 = r7.a
            yio r0 = defpackage.yio.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            r8 = 3
            if (r1 == 0) goto L40
            if (r1 == r3) goto L3a
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            defpackage.ybn.f(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            defpackage.ybn.f(r11)
            goto L68
        L3a:
            java.lang.String r10 = r7.d
            defpackage.ybn.f(r11)
            goto L4d
        L40:
            defpackage.ybn.f(r11)
            r7.d = r10
            r7.c = r3
            java.lang.Object r11 = r9.S(r7)
            if (r11 == r0) goto L74
        L4d:
            ijy r1 = r9.g
            long r3 = java.lang.System.currentTimeMillis()
            int r5 = defpackage.a.aJ(r8)
            r11 = 4
            int r6 = defpackage.a.aJ(r11)
            r11 = 0
            r7.d = r11
            r7.c = r2
            r2 = r10
            java.lang.Object r11 = r1.l(r2, r3, r5, r6, r7)
            if (r11 == r0) goto L74
        L68:
            java.util.List r11 = (java.util.List) r11
            r7.c = r8
            java.lang.Object r10 = r9.Q(r11, r7)
            if (r10 != r0) goto L73
            goto L74
        L73:
            return r10
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.t(java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff A[Catch: all -> 0x006b, Exception -> 0x006e, TryCatch #1 {Exception -> 0x006e, blocks: (B:26:0x0066, B:57:0x00e4, B:61:0x00f1, B:62:0x00fb, B:64:0x00ff, B:65:0x0101), top: B:117:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2 A[Catch: all -> 0x0050, Exception -> 0x0053, TryCatch #0 {all -> 0x0050, blocks: (B:17:0x004b, B:92:0x0187, B:96:0x0194, B:97:0x019e, B:99:0x01a2, B:100:0x01a4, B:107:0x01be, B:108:0x01c8, B:81:0x013e, B:83:0x0144, B:84:0x0146, B:88:0x0167), top: B:116:0x002b }] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, yfo] */
    @Override // defpackage.ino
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(defpackage.wni r21, boolean r22, defpackage.yih r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqo.u(wni, boolean, yih):java.lang.Object");
    }

    @Override // defpackage.ino
    public final String v(wni wniVar) {
        ipe ipeVar = (ipe) this.v.get(wniVar);
        return ipeVar != null ? ipeVar.h : "";
    }

    @Override // defpackage.ino
    public final List w() {
        return this.y;
    }

    @Override // defpackage.ino
    public final ysx x(wod wodVar, String str) throws IOException {
        wmd wmdVar;
        Object next;
        vun vunVar = wodVar.c;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : vunVar) {
            if (!yks.e((String) obj, "fttag;downloaded")) {
                arrayList.add(obj);
            }
        }
        ima imaVarC = this.q.c(ad());
        if (imaVarC != null) {
            wmdVar = imaVarC.b;
        } else {
            wmdVar = wmd.a;
            wmdVar.getClass();
        }
        wmd wmdVar2 = wmdVar;
        ArrayList arrayList2 = new ArrayList();
        wos wosVar = wmdVar2.d;
        if (wosVar == null) {
            wosVar = wos.a;
        }
        vun vunVar2 = wosVar.c;
        vunVar2.getClass();
        Iterator<E> it = vunVar2.iterator();
        while (it.hasNext()) {
            vun<wor> vunVar3 = ((wov) it.next()).c;
            vunVar3.getClass();
            for (wor worVar : vunVar3) {
                if (wodVar.c.contains(worVar.b)) {
                    String str2 = worVar.f;
                    str2.getClass();
                    if (str2.length() > 0) {
                        String str3 = worVar.f;
                        str3.getClass();
                        arrayList2.add(new ijw(str3, true));
                    } else {
                        String str4 = worVar.b;
                        str4.getClass();
                        arrayList2.add(new ijw(str4, false));
                    }
                }
            }
        }
        if (wodVar.c.contains("fttag;downloaded")) {
            arrayList2.add(new ijw("fttag;downloaded", false));
        }
        if (str.length() == 0) {
            str = ae(wmdVar2);
        }
        wnb wnbVar = wmdVar2.e;
        if (wnbVar == null) {
            wnbVar = wnb.a;
        }
        vun vunVar4 = wnbVar.b;
        vunVar4.getClass();
        Iterator<E> it2 = vunVar4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (yks.e(((wna) next).c, str)) {
                break;
            }
        }
        ijy ijyVar = this.g;
        wna wnaVar = (wna) next;
        String strAd = ad();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(strAd);
        arrayList3.add(Integer.valueOf(a.aJ(3)));
        arrayList3.add(Integer.valueOf(a.aJ(4)));
        arrayList3.add(Long.valueOf(jCurrentTimeMillis));
        ArrayList<ijw> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!((ijw) obj2).b) {
                arrayList4.add(obj2);
            }
        }
        String strConcat = "Select Item.play_id as play_id, IFNULL(Metadata.component, Item.component_bytes) as component, Item.media_library_item_info, Rental.short_rental_expiration_timestamp, Metadata.media_library_item_metadata from media_library_item Item JOIN media_library_item_metadata Metadata  ON Item.account_name = Metadata.account_name AND Item.play_id = Metadata.play_id LEFT JOIN media_library_item_rental Rental\n  ON Item.play_id = Rental.play_id AND Item.account_name = Rental.account_name WHERE Item.account_name = ? AND type IN (?, ?) AND (Rental.short_rental_expiration_timestamp IS NULL OR Rental.short_rental_expiration_timestamp > ?)";
        for (ijw ijwVar : arrayList4) {
            Objects.toString(strConcat);
            strConcat = strConcat.concat("\n        AND Exists (\n            Select 1\n            From media_library_item_tag Tag\n            Where Tag.account_name = Item.ACCOUNT_NAME And Tag.play_id = Item.play_id\n            AND Tag.tag_id = ?\n        )\n        ");
            arrayList3.add(ijwVar.a);
        }
        ArrayList<ijw> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((ijw) obj3).b) {
                arrayList5.add(obj3);
            }
        }
        for (ijw ijwVar2 : arrayList5) {
            Objects.toString(strConcat);
            strConcat = strConcat.concat("\n        AND NOT Exists (\n            Select 1\n            From media_library_item_tag Tag\n            Where Tag.account_name = Item.ACCOUNT_NAME And Tag.play_id = Item.play_id\n            AND Tag.tag_id = ?\n        )\n        ");
            arrayList3.add(ijwVar2.a);
        }
        if (wnaVar != null) {
            int iAs = a.as(wnaVar.d);
            if (iAs == 0) {
                iAs = 1;
            }
            int iAF = a.aF(iAs);
            String str5 = "";
            String str6 = iAF != 1 ? iAF != 2 ? "" : "sort_column_2" : "sort_column_1";
            if (str6.length() > 0) {
                int iAs2 = a.as(wnaVar.b);
                if (iAs2 == 0) {
                    iAs2 = 1;
                }
                int i = iAs2 - 2;
                if (i == 1) {
                    str5 = "ASC";
                } else if (i == 2) {
                    str5 = "DESC";
                }
                String strR = ylh.r(a.ci(str5, str6, "\n            ORDER BY ", " ", "\n        "));
                Objects.toString(strConcat);
                strConcat = strConcat.concat(strR);
            }
        }
        return new ipi((yjz) new gad((yih) null, 3, (short[]) null), (ysx) new ipi(new ipw(ytb.a(ijyVar.o(new ghj(strConcat, arrayList3.toArray(new Object[0])))), this, wmdVar2, wodVar, 1), this, 0), 13);
    }

    @Override // defpackage.ino
    public final ysx y(wod wodVar, String str) {
        str.getClass();
        return new ipi((yjz) new gad((yih) null, 4, (int[]) null), (ysx) new ipw(ytb.a(this.q.d(ad())), str, this, wodVar, 0), 13);
    }

    @Override // defpackage.ino
    public final ysx z() {
        return new gxd(ytb.a(this.q.d(ad())), 9);
    }
}
