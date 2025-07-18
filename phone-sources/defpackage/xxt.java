package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxt implements xrd {
    public final xxp a;
    public final ScheduledExecutorService b;
    public final xrb c;
    public final xqa d;
    public final boolean e;
    public final List f;
    public final xtq g;
    public final xxq h;
    public volatile List i;
    public final ttl j;
    public xze k;
    public xvv n;
    public volatile xze o;
    public xtk q;
    public volatile xpv r;
    public xwq s;
    public ulo t;
    public ulo u;
    private final xre v;
    private final String w;
    private final String x;
    private final xvp y;
    private final xva z;
    public final Collection l = new ArrayList();
    public final xxh m = new xxk(this);
    public volatile xql p = xql.a(xqk.IDLE);

    public xxt(xrm xrmVar, String str, String str2, xvp xvpVar, ScheduledExecutorService scheduledExecutorService, xtq xtqVar, xxp xxpVar, xrb xrbVar, xva xvaVar, xre xreVar, xqa xqaVar, List list) {
        Object obj;
        List list2 = xrmVar.a;
        sij.o(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.i = listUnmodifiableList;
        this.h = new xxq(listUnmodifiableList);
        this.w = str;
        this.x = str2;
        this.y = xvpVar;
        this.b = scheduledExecutorService;
        this.j = new ttl();
        this.g = xtqVar;
        this.a = xxpVar;
        this.c = xrbVar;
        this.z = xvaVar;
        this.v = xreVar;
        this.d = xqaVar;
        this.f = list;
        xrl xrlVar = xrx.c;
        int i = 0;
        while (true) {
            Object[][] objArr = xrmVar.c;
            if (i >= objArr.length) {
                obj = xrlVar.a;
                break;
            } else {
                if (xrlVar.equals(objArr[i][0])) {
                    obj = xrmVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.e = ((Boolean) obj).booleanValue();
    }

    public static void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String k(xtk xtkVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(xtkVar.n);
        String str = xtkVar.o;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        Throwable th = xtkVar.p;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    public final xvn a() {
        xze xzeVar = this.o;
        if (xzeVar != null) {
            return xzeVar;
        }
        this.g.execute(new xwf(this, 11));
        return null;
    }

    public final void b(xqk xqkVar) {
        this.g.c();
        d(xql.a(xqkVar));
    }

    @Override // defpackage.xri
    public final xre c() {
        return this.v;
    }

    public final void d(xql xqlVar) {
        this.g.c();
        xqk xqkVar = this.p.a;
        xqk xqkVar2 = xqlVar.a;
        if (xqkVar != xqkVar2) {
            sij.x(this.p.a != xqk.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(xqlVar.toString()));
            if (this.e && xqkVar2 == xqk.TRANSIENT_FAILURE) {
                this.p = xql.a(xqk.IDLE);
            } else {
                this.p = xqlVar;
            }
            xxp xxpVar = this.a;
            sij.x(true, "listener is null");
            xxpVar.a.a(xqlVar);
        }
    }

    public final void e() {
        this.g.execute(new xwf(this, 13));
    }

    public final void f(xvv xvvVar, boolean z) {
        this.g.execute(new uot(this, xvvVar, z, 2));
    }

    public final void g(xtk xtkVar) {
        this.g.execute(new xxl(this, xtkVar, 0));
    }

    public final void h() {
        xqy xqyVar;
        xtq xtqVar = this.g;
        xtqVar.c();
        sij.x(this.t == null, "Should have no reconnectTask scheduled");
        xxq xxqVar = this.h;
        if (xxqVar.a == 0 && xxqVar.b == 0) {
            ttl ttlVar = this.j;
            ttlVar.d();
            ttlVar.e();
        }
        SocketAddress socketAddressB = xxqVar.b();
        if (socketAddressB instanceof xqy) {
            xqy xqyVar2 = (xqy) socketAddressB;
            xqyVar = xqyVar2;
            socketAddressB = xqyVar2.b;
        } else {
            xqyVar = null;
        }
        xpv xpvVarA = xxqVar.a();
        String str = (String) xpvVarA.a(xqt.a);
        xvo xvoVar = new xvo();
        if (str == null) {
            str = this.w;
        }
        str.getClass();
        xvoVar.a = str;
        xvoVar.b = xpvVarA;
        xvoVar.c = this.x;
        xvoVar.d = xqyVar;
        xxs xxsVar = new xxs();
        xxsVar.a = this.v;
        xxo xxoVar = new xxo(this.y.a(socketAddressB, xvoVar, xxsVar), this.z);
        xxsVar.a = xxoVar.c();
        xrb.a(this.c.e, xxoVar);
        this.n = xxoVar;
        this.l.add(xxoVar);
        Runnable runnableB = xxoVar.b(new xxr(this, xxoVar));
        if (runnableB != null) {
            xtqVar.b(runnableB);
        }
        this.d.b(2, "Started transport {0}", xxsVar.a);
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.e("logId", this.v.a);
        tssVarH.b("addressGroups", this.i);
        return tssVarH.toString();
    }
}
