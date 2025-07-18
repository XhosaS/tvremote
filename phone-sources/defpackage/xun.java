package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xun extends xru {
    final xrm a;
    final xre b;
    final xvb c;
    final xvc d;
    List e;
    xxt f;
    boolean g;
    boolean h;
    final /* synthetic */ xyr i;
    ulo j;

    public xun() {
        throw null;
    }

    @Override // defpackage.xru
    public final void a() {
        this.i.m.c();
        sij.x(this.g, "not started");
        this.f.a();
    }

    @Override // defpackage.xru
    public final void b() {
        ulo uloVar;
        xyr xyrVar = this.i;
        xtq xtqVar = xyrVar.m;
        xtqVar.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!xyrVar.B || (uloVar = this.j) == null) {
                return;
            }
            uloVar.r();
            this.j = null;
        }
        if (xyrVar.B) {
            this.f.g(xyr.b);
        } else {
            this.j = xtqVar.d(new xxx(new xyp(this, 0)), 5L, TimeUnit.SECONDS, xyrVar.i.c());
        }
    }

    @Override // defpackage.xru
    public final void c(xrw xrwVar) {
        xyr xyrVar = this.i;
        xtq xtqVar = xyrVar.m;
        xtqVar.c();
        sij.x(!this.g, "already started");
        sij.x(!this.h, "already shutdown");
        sij.x(!xyrVar.B, "Channel is being terminated");
        this.g = true;
        String strB = xyrVar.b();
        xvp xvpVar = xyrVar.i;
        ScheduledExecutorService scheduledExecutorServiceC = xvpVar.c();
        xxp xxpVar = new xxp(this, xrwVar);
        xrb xrbVar = xyrVar.G;
        xxt xxtVar = new xxt(this.a, strB, xyrVar.q, xvpVar, scheduledExecutorServiceC, xtqVar, xxpVar, xrbVar, xyrVar.S.b(), this.b, this.c, xyrVar.p);
        zxk zxkVar = new zxk((byte[]) null);
        zxkVar.d = "Child Subchannel started";
        zxkVar.a = xqz.CT_INFO;
        zxkVar.g(xyrVar.l.a());
        zxkVar.b = xxtVar;
        xyrVar.E.b(zxkVar.f());
        this.f = xxtVar;
        xrb.a(xrbVar.d, xxtVar);
        xyrVar.v.add(xxtVar);
    }

    @Override // defpackage.xru
    public final void d(List list) {
        this.i.m.c();
        this.e = list;
        xxt xxtVar = this.f;
        list.getClass();
        xxt.j(list);
        sij.o(!list.isEmpty(), "newAddressGroups is empty");
        xxtVar.g.execute(new xxl((Object) xxtVar, (Object) DesugarCollections.unmodifiableList(new ArrayList(list)), 1, (byte[]) null));
    }

    public final String toString() {
        return this.b.toString();
    }

    public xun(xyr xyrVar, xrm xrmVar) {
        this.i = xyrVar;
        this.e = xrmVar.a;
        this.a = xrmVar;
        xre xreVarB = xre.b("Subchannel", xyrVar.b());
        this.b = xreVarB;
        xvc xvcVar = new xvc(xreVarB, xyrVar.l.a(), "Subchannel for ".concat(xrmVar.a.toString()));
        this.d = xvcVar;
        this.c = new xvb(xvcVar, xyrVar.l);
    }
}
