package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afsv implements afgq, agac {
    public final afso a;
    public final ScheduledExecutorService b;
    public final afgm c;
    public final afeo d;
    public final boolean e;
    public final List f;
    public final afkc g;
    public final afsp h;
    public volatile List i;
    public final yrn j;
    public afkb k;
    public afkb l;
    public afvc m;
    public afot p;
    public volatile afvc q;
    public Status s;
    public volatile afeh t;
    public afqy u;
    private final afgr v;
    private final String w;
    private final String x;
    private final afoj y;
    private final afns z;
    public final Collection n = new ArrayList();
    public final afrx o = new afsd(this);
    public volatile afff r = afff.a(affe.IDLE);

    public afsv(afhb afhbVar, String str, String str2, afoj afojVar, ScheduledExecutorService scheduledExecutorService, afkc afkcVar, afso afsoVar, afgm afgmVar, afns afnsVar, afgr afgrVar, afeo afeoVar, List list) {
        Object obj;
        List list2 = afhbVar.a;
        yqw.B(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.i = listUnmodifiableList;
        this.h = new afsp(listUnmodifiableList);
        this.w = str;
        this.x = str2;
        this.y = afojVar;
        this.b = scheduledExecutorService;
        this.j = new yrn();
        this.g = afkcVar;
        this.a = afsoVar;
        this.c = afgmVar;
        this.z = afnsVar;
        this.v = afgrVar;
        this.d = afeoVar;
        this.f = list;
        afha afhaVar = afhm.c;
        int i = 0;
        while (true) {
            Object[][] objArr = afhbVar.c;
            if (i >= objArr.length) {
                obj = afhaVar.a;
                break;
            } else {
                if (afhaVar.equals(objArr[i][0])) {
                    obj = afhbVar.c[i][1];
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

    @Override // defpackage.agac
    public final afoh a() {
        afvc afvcVar = this.q;
        if (afvcVar != null) {
            return afvcVar;
        }
        afkc afkcVar = this.g;
        afkcVar.c(new afsf(this));
        afkcVar.b();
        return null;
    }

    public final String b(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        Throwable th = status.o;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // defpackage.afgx
    public final afgr c() {
        return this.v;
    }

    public final void d(affe affeVar) {
        this.g.d();
        e(afff.a(affeVar));
    }

    public final void e(afff afffVar) {
        this.g.d();
        affe affeVar = this.r.a;
        affe affeVar2 = afffVar.a;
        if (affeVar != affeVar2) {
            yqw.M(this.r.a != affe.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(afffVar.toString()));
            if (this.e && affeVar2 == affe.TRANSIENT_FAILURE) {
                this.r = afff.a(affe.IDLE);
            } else {
                this.r = afffVar;
            }
            afso afsoVar = this.a;
            yqw.M(true, "listener is null");
            ((afuj) afsoVar).a.a(afffVar);
        }
    }

    public final void f() {
        afsj afsjVar = new afsj(this);
        afkc afkcVar = this.g;
        afkcVar.c(afsjVar);
        afkcVar.b();
    }

    public final void g(afot afotVar, boolean z) {
        afsk afskVar = new afsk(this, afotVar, z);
        afkc afkcVar = this.g;
        afkcVar.c(afskVar);
        afkcVar.b();
    }

    public final void h(Status status) {
        afsi afsiVar = new afsi(this, status);
        afkc afkcVar = this.g;
        afkcVar.c(afsiVar);
        afkcVar.b();
    }

    public final void i() {
        afgh afghVar;
        afkc afkcVar = this.g;
        afkcVar.d();
        yqw.M(this.k == null, "Should have no reconnectTask scheduled");
        afsp afspVar = this.h;
        if (afspVar.b == 0 && afspVar.c == 0) {
            yrn yrnVar = this.j;
            yrnVar.d();
            yrnVar.e();
        }
        SocketAddress socketAddressB = afspVar.b();
        if (socketAddressB instanceof afgh) {
            afgh afghVar2 = (afgh) socketAddressB;
            afghVar = afghVar2;
            socketAddressB = afghVar2.b;
        } else {
            afghVar = null;
        }
        afeh afehVarA = afspVar.a();
        String str = (String) afehVarA.b.get(affy.a);
        afoi afoiVar = new afoi();
        if (str == null) {
            str = this.w;
        }
        str.getClass();
        afoiVar.a = str;
        afoiVar.b = afehVarA;
        afoiVar.c = this.x;
        afoiVar.d = afghVar;
        afsu afsuVar = new afsu();
        afsuVar.a = this.v;
        afsn afsnVar = new afsn(this.y.a(socketAddressB, afoiVar, afsuVar), this.z);
        afsuVar.a = afsnVar.c();
        afgm.b(this.c.f, afsnVar);
        this.p = afsnVar;
        this.n.add(afsnVar);
        Runnable runnableD = afsnVar.d(new afst(this, afsnVar));
        if (runnableD != null) {
            afkcVar.c(runnableD);
        }
        this.d.b(2, "Started transport {0}", afsuVar.a);
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.c("logId", String.valueOf(this.v.a));
        yqqVarB.b("addressGroups", this.i);
        return yqqVarB.toString();
    }
}
