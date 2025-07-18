package defpackage;

import com.google.common.collect.Lists;
import io.grpc.Status;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwb extends afhm {
    public static final Logger f = Logger.getLogger(afwb.class.getName());
    public final afhe g;
    public final Map h;
    public final afvv i;
    public int j;
    public boolean k;
    public afkb l;
    public affe m;
    public affe n;
    public boolean o;
    public afkb p;
    public afqy q;
    private final boolean r;
    private final boolean s;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public afwb(defpackage.afhe r6) {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = j()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            int r0 = defpackage.afwi.b
            java.lang.String r0 = "GRPC_PF_USE_HAPPY_EYEBALLS"
            boolean r0 = defpackage.afrq.i(r0, r2)
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            r5.r = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.h = r3
            afvv r3 = new afvv
            int r4 = defpackage.yyk.e
            yyk r4 = defpackage.zcg.b
            r3.<init>(r4, r0)
            r5.i = r3
            r5.j = r2
            r5.k = r1
            r0 = 0
            r5.l = r0
            affe r2 = defpackage.affe.IDLE
            r5.m = r2
            r5.n = r2
            r5.o = r1
            r5.p = r0
            boolean r0 = j()
            r5.s = r0
            r5.g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwb.<init>(afhe):void");
    }

    static boolean j() {
        return afrq.i("GRPC_SERIALIZE_RETRIES", false);
    }

    private final void k() {
        if (this.r) {
            afkb afkbVar = this.l;
            if (afkbVar == null || !afkbVar.b()) {
                afhe afheVar = this.g;
                this.l = afheVar.b().a(new afvs(this), 250L, TimeUnit.MILLISECONDS, afheVar.c());
            }
        }
    }

    private final boolean l(yyk yykVar) {
        Map map = this.h;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < ((zcg) yykVar).d; i++) {
            hashSet2.addAll(((affy) yykVar.get(i)).b);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((afwa) map.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.afhm
    public final Status a(afhi afhiVar) {
        afvw afvwVar;
        Boolean bool;
        if (this.m == affe.SHUTDOWN) {
            return Status.i.withDescription("Already shut down");
        }
        IdentityHashMap identityHashMap = afhiVar.b.b;
        Boolean bool2 = (Boolean) identityHashMap.get(e);
        this.o = bool2 == null || !bool2.booleanValue();
        List<affy> list = afhiVar.a;
        if (list.isEmpty()) {
            Status statusWithDescription = Status.l.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + identityHashMap.toString());
            b(statusWithDescription);
            return statusWithDescription;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((affy) it.next()) == null) {
                Status statusWithDescription2 = Status.l.withDescription("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list) + ", attrs=" + identityHashMap.toString());
                b(statusWithDescription2);
                return statusWithDescription2;
            }
        }
        this.k = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (affy affyVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : affyVar.b) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new affy(arrayList2, affyVar.c));
            }
        }
        Object obj = afhiVar.c;
        if ((obj instanceof afvw) && (bool = (afvwVar = (afvw) obj).a) != null && bool.booleanValue()) {
            Long l = afvwVar.b;
            Collections.shuffle(arrayList, new Random());
        }
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        yyfVar.h(arrayList);
        yyk yykVarF = yyfVar.f();
        affe affeVar = this.m;
        affe affeVar2 = affe.READY;
        if (affeVar == affeVar2 || affeVar == affe.CONNECTING) {
            afvv afvvVar = this.i;
            SocketAddress socketAddressB = afvvVar.b();
            afvvVar.c(yykVarF);
            if (afvvVar.f(socketAddressB)) {
                afhj afhjVar = ((afwa) this.h.get(socketAddressB)).a;
                if (!afvvVar.e()) {
                    throw new IllegalStateException("Index is past the end of the address group list");
                }
                afvu afvuVar = (afvu) afvvVar.a.get(afvvVar.b);
                afhjVar.d(Collections.singletonList(new affy(Collections.singletonList(afvuVar.b), afvuVar.a)));
                l(yykVarF);
                return Status.OK;
            }
        } else {
            this.i.c(yykVarF);
        }
        if (l(yykVarF)) {
            affe affeVar3 = affe.CONNECTING;
            this.m = affeVar3;
            h(affeVar3, new afvx(afhg.a));
        }
        affe affeVar4 = this.m;
        if (affeVar4 == affeVar2) {
            affe affeVar5 = affe.IDLE;
            this.m = affeVar5;
            h(affeVar5, new afvz(this, this));
        } else if (affeVar4 == affe.CONNECTING || affeVar4 == affe.TRANSIENT_FAILURE) {
            f();
            c();
        }
        return Status.OK;
    }

    @Override // defpackage.afhm
    public final void b(Status status) {
        if (this.m == affe.SHUTDOWN) {
            return;
        }
        Map map = this.h;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((afwa) it.next()).a.b();
        }
        map.clear();
        afvv afvvVar = this.i;
        int i = yyk.e;
        afvvVar.c(zcg.b);
        affe affeVar = affe.TRANSIENT_FAILURE;
        this.m = affeVar;
        h(affeVar, new afvx(afhg.b(status)));
    }

    @Override // defpackage.afhm
    public final void c() {
        afvv afvvVar = this.i;
        if (!afvvVar.e() || this.m == affe.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressB = afvvVar.b();
        Map map = this.h;
        afwa afwaVar = (afwa) map.get(socketAddressB);
        if (afwaVar == null) {
            if (!afvvVar.e()) {
                throw new IllegalStateException("Index is off the end of the address group list");
            }
            afeh afehVar = ((afvu) afvvVar.a.get(afvvVar.b)).a;
            afvt afvtVar = new afvt(this);
            afhe afheVar = this.g;
            afgz afgzVar = new afgz();
            afgzVar.c(Lists.newArrayList(new affy(Collections.singletonList(socketAddressB), afehVar)));
            afgzVar.b(b, afvtVar);
            afgzVar.b(afhm.c, Boolean.valueOf(this.s));
            afhj afhjVarA = afheVar.a(afgzVar.a());
            final afwa afwaVar2 = new afwa(afhjVarA, affe.IDLE);
            afvtVar.a = afwaVar2;
            map.put(socketAddressB, afwaVar2);
            afhb afhbVar = ((aful) afhjVarA).a;
            if (this.o || afhbVar.b.b.get(afhm.d) == null) {
                afwaVar2.d = afff.a(affe.READY);
            }
            afhjVarA.c(new afhl() { // from class: afvq
                @Override // defpackage.afhl
                public final void a(afff afffVar) {
                    affe affeVar;
                    afwb afwbVar = this.a;
                    Map map2 = afwbVar.h;
                    afwa afwaVar3 = afwaVar2;
                    afhj afhjVar = afwaVar3.a;
                    if (afwaVar3 == map2.get(afwbVar.e(afhjVar)) && (affeVar = afffVar.a) != affe.SHUTDOWN) {
                        affe affeVar2 = affe.IDLE;
                        if (affeVar == affeVar2 && afwaVar3.b == affe.READY) {
                            afwbVar.g.d();
                        }
                        afwaVar3.a(affeVar);
                        affe affeVar3 = afwbVar.m;
                        affe affeVar4 = affe.TRANSIENT_FAILURE;
                        if (affeVar3 == affeVar4 || afwbVar.n == affeVar4) {
                            if (affeVar == affe.CONNECTING) {
                                return;
                            }
                            if (affeVar == affeVar2) {
                                afwbVar.c();
                                return;
                            }
                        }
                        int iOrdinal = affeVar.ordinal();
                        if (iOrdinal == 0) {
                            affe affeVar5 = affe.CONNECTING;
                            afwbVar.m = affeVar5;
                            afwbVar.h(affeVar5, new afvx(afhg.a));
                            return;
                        }
                        if (iOrdinal == 1) {
                            afkb afkbVar = afwbVar.p;
                            if (afkbVar != null) {
                                afkbVar.a();
                                afwbVar.p = null;
                            }
                            afwbVar.q = null;
                            afwbVar.f();
                            Iterator it = map2.values().iterator();
                            while (it.hasNext()) {
                                afhj afhjVar2 = ((afwa) it.next()).a;
                                if (!afhjVar2.equals(afhjVar)) {
                                    afhjVar2.b();
                                }
                            }
                            map2.clear();
                            affe affeVar6 = affe.READY;
                            afwaVar3.a(affeVar6);
                            map2.put(afwbVar.e(afhjVar), afwaVar3);
                            afwbVar.i.f(afwbVar.e(afhjVar));
                            afwbVar.m = affeVar6;
                            afwbVar.i(afwaVar3);
                            return;
                        }
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new IllegalArgumentException("Unsupported state:".concat(affeVar.toString()));
                            }
                            afwbVar.i.b = 0;
                            afwbVar.m = affeVar2;
                            afwbVar.h(affeVar2, new afvz(afwbVar, afwbVar));
                            return;
                        }
                        afvv afvvVar2 = afwbVar.i;
                        if (afvvVar2.e() && map2.get(afvvVar2.b()) == afwaVar3) {
                            if (afvvVar2.d()) {
                                afwbVar.f();
                                afwbVar.c();
                            } else if (map2.size() >= afvvVar2.a()) {
                                afwbVar.g();
                            } else {
                                afvvVar2.b = 0;
                                afwbVar.c();
                            }
                        }
                        if (map2.size() >= afvvVar2.a()) {
                            Iterator it2 = map2.values().iterator();
                            while (it2.hasNext()) {
                                if (!((afwa) it2.next()).c) {
                                    return;
                                }
                            }
                            afwbVar.m = affeVar4;
                            afwbVar.h(affeVar4, new afvx(afhg.b(afffVar.b)));
                            int i = afwbVar.j + 1;
                            afwbVar.j = i;
                            if (i >= afvvVar2.a() || afwbVar.k) {
                                afwbVar.k = false;
                                afwbVar.j = 0;
                                afwbVar.g.d();
                            }
                        }
                    }
                }
            });
            afwaVar = afwaVar2;
        }
        int iOrdinal = afwaVar.b.ordinal();
        if (iOrdinal == 0) {
            k();
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            afwaVar.a.a();
            afwaVar.a(affe.CONNECTING);
            k();
            return;
        }
        if (!this.s) {
            afvvVar.d();
            c();
        } else if (!afvvVar.e()) {
            g();
        } else {
            afwaVar.a.a();
            afwaVar.a(affe.CONNECTING);
        }
    }

    @Override // defpackage.afhm
    public final void d() {
        Logger logger = f;
        Level level = Level.FINE;
        Map map = this.h;
        logger.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        affe affeVar = affe.SHUTDOWN;
        this.m = affeVar;
        this.n = affeVar;
        f();
        afkb afkbVar = this.p;
        if (afkbVar != null) {
            afkbVar.a();
            this.p = null;
        }
        this.q = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((afwa) it.next()).a.b();
        }
        map.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.SocketAddress e(defpackage.afhj r4) {
        /*
            r3 = this;
            aful r4 = (defpackage.aful) r4
            afun r0 = r4.j
            afkc r0 = r0.m
            r0.d()
            boolean r0 = r4.g
            java.lang.String r1 = "not started"
            defpackage.yqw.M(r0, r1)
            java.util.List r4 = r4.e
            r0 = 0
            if (r4 == 0) goto L1d
            int r1 = r4.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            defpackage.yqw.R(r2, r1, r4)
            java.lang.Object r4 = r4.get(r0)
            affy r4 = (defpackage.affy) r4
            java.util.List r4 = r4.b
            java.lang.Object r4 = r4.get(r0)
            java.net.SocketAddress r4 = (java.net.SocketAddress) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwb.e(afhj):java.net.SocketAddress");
    }

    public final void f() {
        afkb afkbVar = this.l;
        if (afkbVar != null) {
            afkbVar.a();
            this.l = null;
        }
    }

    public final void g() {
        if (this.s && this.p == null) {
            if (this.q == null) {
                this.q = new afqy();
            }
            long jA = this.q.a();
            afhe afheVar = this.g;
            this.p = afheVar.b().a(new afvr(this), jA, TimeUnit.NANOSECONDS, afheVar.c());
        }
    }

    public final void h(affe affeVar, afhk afhkVar) {
        if (affeVar == this.n && (affeVar == affe.IDLE || affeVar == affe.CONNECTING)) {
            return;
        }
        this.n = affeVar;
        this.g.e(affeVar, afhkVar);
    }

    public final void i(afwa afwaVar) {
        afff afffVar;
        affe affeVar;
        affe affeVar2 = afwaVar.b;
        affe affeVar3 = affe.READY;
        if (affeVar2 != affeVar3) {
            return;
        }
        if (this.o || (affeVar = (afffVar = afwaVar.d).a) == affeVar3) {
            h(affeVar3, new afhd(afhg.d(afwaVar.a)));
            return;
        }
        affe affeVar4 = affe.TRANSIENT_FAILURE;
        if (affeVar == affeVar4) {
            h(affeVar4, new afvx(afhg.b(afffVar.b)));
        } else if (this.n != affeVar4) {
            h(affeVar, new afvx(afhg.a));
        }
    }
}
