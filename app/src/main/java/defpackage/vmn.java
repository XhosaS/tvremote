package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.common.collect.Sets;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmn implements vln {
    public final vle a;
    public final zyg b;
    public final agow c;
    public final agow d;
    public final agow e;
    public final agow f;
    private final zyg g;
    private final agow h;
    private final agow i;

    public vmn(vle vleVar, zyg zygVar, zyg zygVar2, agow agowVar, agow agowVar2, agow agowVar3, agow agowVar4, agow agowVar5, agow agowVar6) {
        this.a = vleVar;
        this.g = zygVar;
        this.b = zygVar2;
        this.c = agowVar;
        this.d = agowVar2;
        this.f = agowVar5;
        this.h = agowVar3;
        this.e = agowVar4;
        this.i = agowVar6;
    }

    public static int i(voh vohVar, vom vomVar) {
        int i = ((voi) vohVar.b).c;
        int i2 = i + 1;
        if ((vohVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vohVar.y();
        }
        voi voiVar = (voi) vohVar.b;
        voiVar.b |= 1;
        voiVar.c = i2;
        if ((vomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            vomVar.y();
        }
        von vonVar = (von) vomVar.b;
        von vonVar2 = von.a;
        vonVar.b |= 1;
        vonVar.c = i;
        vohVar.a(i, (von) vomVar.v());
        return i;
    }

    public static vha j(von vonVar) {
        AccountId accountIdB = AccountId.b(vonVar.c);
        vhg vhgVar = vonVar.d;
        if (vhgVar == null) {
            vhgVar = vhg.a;
        }
        int iA = vig.a(vonVar.e);
        if (iA == 0) {
            iA = 1;
        }
        return new vik(accountIdB, vhgVar, iA);
    }

    public static yyr k(voh vohVar, Collection collection) {
        int i;
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            vhg vhgVar = (vhg) it.next();
            Iterator it2 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((voi) vohVar.b).d)).values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    von vonVar = (von) it2.next();
                    vhg vhgVar2 = vonVar.d;
                    if (vhgVar2 == null) {
                        vhgVar2 = vhg.a;
                    }
                    if (vhgVar2.j.equals(vhgVar.j) && vhgVar2.c.equals(vhgVar.c)) {
                        vom vomVar = new vom();
                        vomVar.B(vonVar);
                        if ((Integer.MIN_VALUE & vomVar.b.memoizedSerializedSize) == 0) {
                            vomVar.y();
                        }
                        von vonVar2 = (von) vomVar.b;
                        vhgVar.getClass();
                        vhg vhgVar3 = vonVar2.d;
                        if (vhgVar3 == null || vhgVar3 == vhg.a) {
                            vonVar2.d = vhgVar;
                        } else {
                            vhf vhfVar = new vhf();
                            vhfVar.B(vhgVar3);
                            vhfVar.B(vhgVar);
                            vonVar2.d = (vhg) vhfVar.w();
                        }
                        vonVar2.b |= 2;
                        vohVar.a(vonVar.c, (von) vomVar.v());
                        i = vonVar.c;
                    }
                } else {
                    von vonVar3 = von.a;
                    vom vomVar2 = new vom();
                    if ((vomVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vomVar2.y();
                    }
                    von vonVar4 = (von) vomVar2.b;
                    vhgVar.getClass();
                    vonVar4.d = vhgVar;
                    vonVar4.b |= 2;
                    if ((vomVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vomVar2.y();
                    }
                    von vonVar5 = (von) vomVar2.b;
                    vonVar5.e = 0;
                    vonVar5.b |= 4;
                    i = i(vohVar, vomVar2);
                }
            }
            map.put(AccountId.b(i), vhgVar);
        }
        return yyr.j(map);
    }

    public static yyr l(Collection collection, voh vohVar) {
        int iA;
        yyn yynVar = new yyn(4);
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((voi) vohVar.b).d));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AccountId accountId = (AccountId) it.next();
            Integer numValueOf = Integer.valueOf(accountId.a());
            if (mapUnmodifiableMap.containsKey(numValueOf) && (iA = vig.a(((von) mapUnmodifiableMap.get(numValueOf)).e)) != 0 && iA == 2) {
                yynVar.c(accountId, (von) mapUnmodifiableMap.get(numValueOf));
            }
        }
        return yynVar.a(true);
    }

    public static yyr m(Collection collection, voh vohVar) {
        voi voiVar = (voi) vohVar.v();
        yyr yyrVarK = k(vohVar, collection);
        yqw.M(yyrVarK.size() == collection.size(), "Provider had duplicate accounts.");
        yzo yzoVar = new yzo();
        Iterator it = DesugarCollections.unmodifiableMap(voiVar.d).values().iterator();
        while (it.hasNext()) {
            yzoVar.c(AccountId.b(((von) it.next()).c));
        }
        yzq yzqVarF = Sets.c(yzoVar.f(), yyrVarK.keySet()).f();
        yyr yyrVarL = l(yzqVarF, vohVar);
        s(yzqVarF, vohVar);
        return yyrVarL;
    }

    public static zxj n(vhj vhjVar, Set set) {
        zyd zydVarG;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                zydVarG = ((vhl) it.next()).a(vhjVar);
                arrayList.add(zydVarG);
            } catch (Exception e) {
                zydVarG = zxn.g(e);
            }
            vqi.d("com/google/apps/tiktok/account/data/manager/AccountDataWriterImpl", "invokeInterceptors", 335, zydVarG, "AccountEnabledInterceptor Failed", new Object[0]);
        }
        return zxn.a(arrayList);
    }

    public static void s(Collection collection, voh vohVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            vohVar.b(((AccountId) it.next()).a());
        }
    }

    private final zyd u(final Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            v((vhg) it.next());
        }
        final zyd zydVarG = zuz.g(r(this.a, new yqi() { // from class: vma
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                voh vohVar = new voh();
                vohVar.B((voi) obj);
                return new vmy(vmn.k(vohVar, collection), (voi) vohVar.v());
            }
        }), wyo.a(new yqi() { // from class: vmb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                yyr yyrVar = (yyr) obj;
                yqw.M(yyrVar.size() == collection.size(), "Provider had duplicate accounts.");
                return yyrVar;
            }
        }), zwk.a);
        return zxn.d(zydVarG, z ? zuz.h(zydVarG, wyo.c(new zvi() { // from class: vmc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return this.a.p();
            }
        }), this.b) : zxy.a).b(wyo.b(new zvh() { // from class: vmd
            @Override // defpackage.zvh
            public final zyd a() {
                return zxn.h((Map) zxn.o(zydVarG));
            }
        }), this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void v(defpackage.vhg r3) {
        /*
            int r0 = r3.b
            r0 = r0 & 256(0x100, float:3.59E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            defpackage.yqw.A(r0)
            int r0 = r3.b
            r0 = r0 & r2
            if (r2 == r0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            defpackage.yqw.A(r0)
            int r0 = r3.b
            r0 = r0 & 16
            if (r0 == 0) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            defpackage.yqw.A(r0)
            boolean r0 = r3.i
            if (r0 == 0) goto L32
            int r3 = r3.b
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L33
            r3 = r3 & r2
            if (r3 == 0) goto L33
        L32:
            r1 = r2
        L33:
            defpackage.yqw.A(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmn.v(vhg):void");
    }

    @Override // defpackage.vln
    public final zyd a(Collection collection) {
        wvx wvxVarF = wzg.f("Add Accounts", wwb.a, true);
        try {
            zyd zydVarU = u(collection, true);
            wvxVarF.a(zydVarU);
            wvxVarF.close();
            return zydVarU;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vln
    public final zyd b(Collection collection) {
        wvx wvxVarF = wzg.f("Add Accounts Without Notifying Observers", wwb.a, true);
        try {
            zyd zydVarU = u(collection, false);
            wvxVarF.a(zydVarU);
            wvxVarF.close();
            return zydVarU;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vln
    public final zyd c(final AccountId accountId) {
        return zuz.h(this.a.a(), wyo.c(new zvi() { // from class: vlo
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final AccountId accountId2 = accountId;
                final von vonVarB = vll.b((voi) obj, accountId2);
                int i = vonVarB.e;
                int iA = vig.a(i);
                if (iA != 0 && iA == 3) {
                    return zxy.a;
                }
                final vmn vmnVar = this.a;
                int iA2 = vig.a(i);
                return (iA2 == 0 || iA2 == 1) ? vmnVar.t(accountId2, 3) : zuz.h(vmnVar.a.b(new yqi() { // from class: vml
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        voi voiVar = (voi) obj2;
                        abyl abylVar = voiVar.d;
                        int i2 = ((AutoValue_AccountId) accountId2).a;
                        Integer numValueOf = Integer.valueOf(i2);
                        if (!abylVar.containsKey(numValueOf)) {
                            throw new IllegalArgumentException();
                        }
                        von vonVar = (von) abylVar.get(numValueOf);
                        voh vohVar = new voh();
                        vohVar.B(voiVar);
                        vohVar.b(i2);
                        vom vomVar = new vom();
                        vomVar.B(vonVar);
                        if ((vomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            vomVar.y();
                        }
                        von vonVar2 = (von) vomVar.b;
                        von vonVar3 = von.a;
                        vonVar2.e = 2;
                        vonVar2.b |= 4;
                        vmn.i(vohVar, vomVar);
                        return (voi) vohVar.v();
                    }
                }, zwk.a), wyo.c(new zvi() { // from class: vlp
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return vmnVar.o(accountId2, vonVarB);
                    }
                }), vmnVar.b);
            }
        }), zwk.a);
    }

    @Override // defpackage.vln
    public final zyd d(final AccountId accountId) {
        return zuz.h(this.a.a(), wyo.c(new zvi() { // from class: vmk
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final AccountId accountId2 = accountId;
                von vonVarB = vll.b((voi) obj, accountId2);
                int iA = vig.a(vonVarB.e);
                if (iA != 0 && iA == 2) {
                    return zxy.a;
                }
                final vmn vmnVar = this.a;
                final vil vilVar = new vil(accountId2, ((vik) vmn.j(vonVarB)).a);
                Set set = (Set) vmnVar.c.a();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        final vpi vpiVar = ((vpd) it.next()).a;
                        zyg zygVar = vpiVar.a;
                        final AccountId accountId3 = vilVar.a;
                        arrayList.add(zygVar.submit(new Runnable() { // from class: vph
                            @Override // java.lang.Runnable
                            public final void run() {
                                String strB = vos.b(accountId3);
                                zdl it2 = vpiVar.b.a().iterator();
                                while (it2.hasNext()) {
                                    File file = new File((File) it2.next(), strB);
                                    if (file.exists() && !file.setWritable(true, true)) {
                                        throw new RuntimeException("Could not make data dir writable.");
                                    }
                                }
                            }
                        }));
                    } catch (Exception e) {
                        arrayList.add(zxn.g(e));
                    }
                }
                zxj zxjVarC = zxn.c(arrayList);
                zvh zvhVarB = wyo.b(new zvh() { // from class: vlq
                    @Override // defpackage.zvh
                    public final zyd a() {
                        return vmnVar.t(accountId2, 2);
                    }
                });
                zwk zwkVar = zwk.a;
                return zuz.h(zxjVarC.b(zvhVarB, zwkVar), wyo.c(new zvi() { // from class: vlr
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        final vmn vmnVar2 = vmnVar;
                        Set set2 = (Set) vmnVar2.f.a();
                        final vhj vhjVar = vilVar;
                        return vmn.n(vhjVar, set2).b(wyo.b(new zvh() { // from class: vmh
                            @Override // defpackage.zvh
                            public final zyd a() {
                                return vmn.n(vhjVar, (Set) vmnVar2.d.a()).a(new Callable() { // from class: vmg
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return null;
                                    }
                                }, zwk.a);
                            }
                        }), zwk.a);
                    }
                }), zwkVar);
            }
        }), zwk.a);
    }

    @Override // defpackage.vln
    public final zyd e(Collection collection) {
        wvx wvxVarF = wzg.f("Remove Accounts", wwb.a, true);
        try {
            zyd zydVarQ = q(collection, true);
            wvxVarF.a(zydVarQ);
            wvxVarF.close();
            return zydVarQ;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vln
    public final zyd f(Collection collection) {
        wvx wvxVarF = wzg.f("Remove Accounts Without Notifying Observers", wwb.a, true);
        try {
            zyd zydVarQ = q(collection, false);
            wvxVarF.a(zydVarQ);
            wvxVarF.close();
            return zydVarQ;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vln
    public final zyd g(final Collection collection) {
        wvx wvxVarF = wzg.f("Sync Accounts", wwb.a, true);
        try {
            wzx wzxVarH = wzx.g(r(this.a, new yqi() { // from class: vlz
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    voh vohVar = new voh();
                    vohVar.B((voi) obj);
                    return new vmy(vmn.m(collection, vohVar), (voi) vohVar.v());
                }
            })).i(new vme(this), this.b).h(new yqi() { // from class: vmf
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return null;
                }
            }, zwk.a);
            wvxVarF.a(wzxVarH);
            wvxVarF.close();
            return wzxVarH;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vln
    public final zyd h(final Collection collection, final yzq yzqVar) {
        yqw.A(!yzqVar.isEmpty());
        zdl it = yzqVar.iterator();
        while (it.hasNext()) {
            ((String) it.next()).getClass();
            yqw.A(!r2.isEmpty());
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            vhg vhgVar = (vhg) it2.next();
            v(vhgVar);
            yqw.J(yzqVar.contains(vhgVar.j), "Unexpected account type provided! Accepted account types: %s, provided account type: %s", yzqVar, vhgVar.j);
        }
        wvx wvxVarF = wzg.f("Sync Accounts for Types", wwb.a, true);
        try {
            wzx wzxVarH = wzx.g(r(this.a, new yqi() { // from class: vlx
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    voi voiVar = (voi) obj;
                    yyn yynVar = new yyn(4);
                    voh vohVar = new voh();
                    vohVar.B(voiVar);
                    if ((vohVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vohVar.y();
                    }
                    voi voiVar2 = (voi) vohVar.b;
                    voi voiVar3 = voi.a;
                    abyl abylVar = voiVar2.d;
                    if (!abylVar.b) {
                        voiVar2.d = abylVar.a();
                    }
                    voiVar2.d.clear();
                    for (Map.Entry entry : DesugarCollections.unmodifiableMap(voiVar.d).entrySet()) {
                        vhg vhgVar2 = ((von) entry.getValue()).d;
                        if (vhgVar2 == null) {
                            vhgVar2 = vhg.a;
                        }
                        if (yzqVar.contains(vhgVar2.j)) {
                            vohVar.a(((Integer) entry.getKey()).intValue(), (von) entry.getValue());
                        } else {
                            yynVar.d(entry);
                        }
                    }
                    yyr yyrVarM = vmn.m(collection, vohVar);
                    yyr yyrVarA = yynVar.a(true);
                    if ((vohVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        vohVar.y();
                    }
                    voi voiVar4 = (voi) vohVar.b;
                    abyl abylVar2 = voiVar4.d;
                    if (!abylVar2.b) {
                        voiVar4.d = abylVar2.a();
                    }
                    voiVar4.d.putAll(yyrVarA);
                    return new vmy(yyrVarM, (voi) vohVar.v());
                }
            })).i(new vme(this), this.b).h(new yqi() { // from class: vly
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return null;
                }
            }, zwk.a);
            wvxVarF.a(wzxVarH);
            wvxVarF.close();
            return wzxVarH;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final zyd o(AccountId accountId, von vonVar) {
        final vil vilVar = new vil(accountId, ((vik) j(vonVar)).a);
        Set set = (Set) this.h.a();
        final ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(((vhk) it.next()).a());
            } catch (Exception e) {
                arrayList.add(zxn.g(e));
            }
        }
        return zxn.a(arrayList).b(wyo.b(new zvh() { // from class: vlv
            @Override // defpackage.zvh
            public final zyd a() {
                Set set2 = (Set) this.a.e.a();
                ArrayList arrayList2 = new ArrayList(set2.size());
                Iterator it2 = set2.iterator();
                vhj vhjVar = vilVar;
                while (it2.hasNext()) {
                    try {
                        arrayList2.add(((vhi) it2.next()).a(vhjVar));
                    } catch (Exception e2) {
                        arrayList2.add(zxn.g(e2));
                    }
                }
                List list = arrayList;
                list.addAll(arrayList2);
                return zxn.c(list).a(new zvk(), zwk.a);
            }
        }), this.b);
    }

    final zyd p() {
        Set set = (Set) this.i.a();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(((vir) it.next()).a());
            } catch (RuntimeException e) {
                arrayList.add(zxn.g(e));
            }
        }
        return zxn.c(arrayList).a(new zvk(), zwk.a);
    }

    public final zyd q(final Collection collection, boolean z) {
        zwx zwxVarU = zwx.u(r(this.a, new yqi() { // from class: vls
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                voh vohVar = new voh();
                vohVar.B((voi) obj);
                Collection collection2 = collection;
                yyr yyrVarL = vmn.l(collection2, vohVar);
                vmn.s(collection2, vohVar);
                return new vmy(yyrVarL, (voi) vohVar.v());
            }
        }));
        zvi zviVarC = wyo.c(new vme(this));
        zyg zygVar = this.b;
        zyd zydVarH = zuz.h(zwxVarU, zviVarC, zygVar);
        if (z) {
            zydVarH = zuz.h(zydVarH, wyo.c(new zvi() { // from class: vlt
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    return this.a.p();
                }
            }), zygVar);
        }
        return zuz.g(zydVarH, wyo.a(new yqi() { // from class: vlu
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return null;
            }
        }), zwk.a);
    }

    final zyd r(vle vleVar, final yqi yqiVar) {
        final AtomicReference atomicReference = new AtomicReference();
        return zuz.g(vleVar.b(wyo.a(new yqi() { // from class: vmi
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                vmm vmmVar = (vmm) yqiVar.apply((voi) obj);
                atomicReference.set(vmmVar.b());
                return vmmVar.a();
            }
        }), this.g), wyo.a(new yqi() { // from class: vmj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return atomicReference.get();
            }
        }), zwk.a);
    }

    public final zyd t(final AccountId accountId, final int i) {
        return this.a.b(new yqi() { // from class: vlw
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                voh vohVar = new voh();
                vohVar.B((voi) obj);
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((voi) vohVar.b).d);
                int i2 = ((AutoValue_AccountId) accountId).a;
                Integer numValueOf = Integer.valueOf(i2);
                if (!mapUnmodifiableMap.containsKey(numValueOf)) {
                    throw new IllegalArgumentException();
                }
                von vonVar = (von) mapUnmodifiableMap.get(numValueOf);
                vom vomVar = new vom();
                vomVar.B(vonVar);
                if ((vomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    vomVar.y();
                }
                int i3 = i;
                von vonVar2 = (von) vomVar.b;
                von vonVar3 = von.a;
                vonVar2.e = i3 - 1;
                vonVar2.b |= 4;
                vohVar.a(i2, (von) vomVar.v());
                return (voi) vohVar.v();
            }
        }, zwk.a);
    }
}
