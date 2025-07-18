package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xzw extends xrx {
    public static final Logger f = Logger.getLogger(xzw.class.getName());
    public final xrp g;
    public final Map h;
    public final xzr i;
    public int j;
    public boolean k;
    public xqk l;
    public xqk m;
    public boolean n;
    public xwq o;
    public ulo p;
    public ulo q;
    private final boolean r;
    private final boolean s;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xzw(defpackage.xrp r6) {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = i()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            int r0 = defpackage.yac.b
            java.lang.String r0 = "GRPC_PF_USE_HAPPY_EYEBALLS"
            boolean r0 = defpackage.xxc.h(r0, r2)
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
            xzr r3 = new xzr
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.of()
            r3.<init>(r4, r0)
            r5.i = r3
            r5.j = r2
            r5.k = r1
            r0 = 0
            r5.p = r0
            xqk r2 = defpackage.xqk.IDLE
            r5.l = r2
            r5.m = r2
            r5.n = r1
            r5.q = r0
            boolean r0 = i()
            r5.s = r0
            r5.g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzw.<init>(xrp):void");
    }

    static boolean i() {
        return xxc.h("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.SocketAddress j(defpackage.xru r3) {
        /*
            xun r3 = (defpackage.xun) r3
            xyr r0 = r3.i
            xtq r0 = r0.m
            r0.c()
            boolean r0 = r3.g
            java.lang.String r1 = "not started"
            defpackage.sij.x(r0, r1)
            java.util.List r3 = r3.e
            r0 = 0
            if (r3 == 0) goto L1d
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            defpackage.sij.z(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            xqt r3 = (defpackage.xqt) r3
            java.util.List r3 = r3.b
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzw.j(xru):java.net.SocketAddress");
    }

    private final void k() {
        if (this.r) {
            ulo uloVar = this.p;
            if (uloVar == null || !uloVar.s()) {
                xrp xrpVar = this.g;
                this.p = xrpVar.c().d(new xyp(this, 3), 250L, TimeUnit.MILLISECONDS, xrpVar.d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean l(ImmutableList immutableList) {
        Map map = this.h;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        UnmodifiableIterator it = immutableList.iterator();
        while (it.hasNext()) {
            hashSet2.addAll(((xqt) it.next()).b);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((xzv) map.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.xrx
    public final xtk a(xrt xrtVar) {
        xzs xzsVar;
        Boolean bool;
        if (this.l == xqk.SHUTDOWN) {
            return xtk.i.e("Already shut down");
        }
        xpv xpvVar = xrtVar.b;
        Boolean bool2 = (Boolean) xpvVar.a(e);
        this.n = bool2 == null || !bool2.booleanValue();
        List<xqt> list = xrtVar.a;
        if (list.isEmpty()) {
            xtk xtkVarE = xtk.k.e("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + xpvVar.toString());
            b(xtkVarE);
            return xtkVarE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((xqt) it.next()) == null) {
                xtk xtkVarE2 = xtk.k.e("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list) + ", attrs=" + xpvVar.toString());
                b(xtkVarE2);
                return xtkVarE2;
            }
        }
        this.k = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (xqt xqtVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : xqtVar.b) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new xqt(arrayList2, xqtVar.c));
            }
        }
        Object obj = xrtVar.c;
        if ((obj instanceof xzs) && (bool = (xzsVar = (xzs) obj).a) != null && bool.booleanValue()) {
            Long l = xzsVar.b;
            Collections.shuffle(arrayList, new Random());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable) arrayList);
        ImmutableList immutableListBuild = builder.build();
        xqk xqkVar = this.l;
        xqk xqkVar2 = xqk.READY;
        if (xqkVar == xqkVar2 || xqkVar == xqk.CONNECTING) {
            xzr xzrVar = this.i;
            SocketAddress socketAddressB = xzrVar.b();
            xzrVar.d(immutableListBuild);
            if (xzrVar.g(socketAddressB)) {
                xru xruVar = ((xzv) this.h.get(socketAddressB)).a;
                if (!xzrVar.f()) {
                    throw new IllegalStateException("Index is past the end of the address group list");
                }
                ulo uloVar = (ulo) xzrVar.a.get(xzrVar.b);
                xruVar.d(Collections.singletonList(new xqt((SocketAddress) uloVar.a, (xpv) uloVar.b)));
                l(immutableListBuild);
                return xtk.b;
            }
        } else {
            this.i.d(immutableListBuild);
        }
        if (l(immutableListBuild)) {
            xqk xqkVar3 = xqk.CONNECTING;
            this.l = xqkVar3;
            g(xqkVar3, new xzt(xrr.a));
        }
        xqk xqkVar4 = this.l;
        if (xqkVar4 == xqkVar2) {
            xqk xqkVar5 = xqk.IDLE;
            this.l = xqkVar5;
            g(xqkVar5, new xzu(this, this));
        } else if (xqkVar4 == xqk.CONNECTING || xqkVar4 == xqk.TRANSIENT_FAILURE) {
            e();
            c();
        }
        return xtk.b;
    }

    @Override // defpackage.xrx
    public final void b(xtk xtkVar) {
        if (this.l == xqk.SHUTDOWN) {
            return;
        }
        Map map = this.h;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((xzv) it.next()).a.b();
        }
        map.clear();
        this.i.d(ImmutableList.of());
        xqk xqkVar = xqk.TRANSIENT_FAILURE;
        this.l = xqkVar;
        g(xqkVar, new xzt(xrr.b(xtkVar)));
    }

    @Override // defpackage.xrx
    public final void c() {
        xzr xzrVar = this.i;
        if (!xzrVar.f() || this.l == xqk.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressB = xzrVar.b();
        Map map = this.h;
        xzv xzvVar = (xzv) map.get(socketAddressB);
        if (xzvVar == null) {
            if (!xzrVar.f()) {
                throw new IllegalStateException("Index is off the end of the address group list");
            }
            Object obj = ((ulo) xzrVar.a.get(xzrVar.b)).b;
            xzq xzqVar = new xzq(this);
            xrp xrpVar = this.g;
            xrk xrkVar = new xrk();
            int i = 1;
            xrkVar.c(Lists.newArrayList(new xqt(socketAddressB, (xpv) obj)));
            xrkVar.b(b, xzqVar);
            xrkVar.b(xrx.c, Boolean.valueOf(this.s));
            xru xruVarB = xrpVar.b(xrkVar.a());
            xzv xzvVar2 = new xzv(xruVarB, xqk.IDLE);
            xzqVar.a = xzvVar2;
            map.put(socketAddressB, xzvVar2);
            xrm xrmVar = ((xun) xruVarB).a;
            if (this.n || xrmVar.b.a(xrx.d) == null) {
                xzvVar2.d = xql.a(xqk.READY);
            }
            xruVarB.c(new xzx(this, xzvVar2, i));
            xzvVar = xzvVar2;
        }
        int iOrdinal = xzvVar.b.ordinal();
        if (iOrdinal == 0) {
            k();
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            xzvVar.a.a();
            xzvVar.b(xqk.CONNECTING);
            k();
            return;
        }
        if (!this.s) {
            xzrVar.e();
            c();
        } else if (!xzrVar.f()) {
            f();
        } else {
            xzvVar.a.a();
            xzvVar.b(xqk.CONNECTING);
        }
    }

    @Override // defpackage.xrx
    public final void d() {
        Logger logger = f;
        Level level = Level.FINE;
        Map map = this.h;
        logger.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        xqk xqkVar = xqk.SHUTDOWN;
        this.l = xqkVar;
        this.m = xqkVar;
        e();
        ulo uloVar = this.q;
        if (uloVar != null) {
            uloVar.r();
            this.q = null;
        }
        this.o = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((xzv) it.next()).a.b();
        }
        map.clear();
    }

    public final void e() {
        ulo uloVar = this.p;
        if (uloVar != null) {
            uloVar.r();
            this.p = null;
        }
    }

    public final void f() {
        if (this.s && this.q == null) {
            if (this.o == null) {
                this.o = new xwq();
            }
            long jA = this.o.a();
            xrp xrpVar = this.g;
            this.q = xrpVar.c().d(new xyp(this, 2), jA, TimeUnit.NANOSECONDS, xrpVar.d());
        }
    }

    public final void g(xqk xqkVar, xrv xrvVar) {
        if (xqkVar == this.m && (xqkVar == xqk.IDLE || xqkVar == xqk.CONNECTING)) {
            return;
        }
        this.m = xqkVar;
        this.g.f(xqkVar, xrvVar);
    }

    public final void h(xzv xzvVar) {
        xqk xqkVar = xzvVar.b;
        xqk xqkVar2 = xqk.READY;
        if (xqkVar != xqkVar2) {
            return;
        }
        if (this.n || xzvVar.a() == xqkVar2) {
            g(xqkVar2, new xro(xrr.c(xzvVar.a)));
            return;
        }
        xqk xqkVarA = xzvVar.a();
        xqk xqkVar3 = xqk.TRANSIENT_FAILURE;
        if (xqkVarA == xqkVar3) {
            g(xqkVar3, new xzt(xrr.b(xzvVar.d.b)));
        } else if (this.m != xqkVar3) {
            g(xzvVar.a(), new xzt(xrr.a));
        }
    }
}
