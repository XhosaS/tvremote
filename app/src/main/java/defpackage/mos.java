package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mos implements aggi {
    public final oco a;
    public final oca b;
    public final obk c;
    public aggh d;
    public mor e;
    public volatile agfo f;
    public volatile oal g;
    private agou h = new agot();

    public mos(oco ocoVar, oca ocaVar, oal oalVar, obk obkVar, aggh agghVar) {
        this.a = ocoVar;
        this.b = ocaVar;
        this.g = oalVar;
        this.c = obkVar;
        this.d = agghVar;
    }

    final synchronized drq a() {
        mor morVar;
        drq drqVar;
        if (f() || (morVar = this.e) == null) {
            return null;
        }
        synchronized (morVar.b) {
            drqVar = morVar.c;
        }
        return drqVar;
    }

    final synchronized void b() {
        mor morVar;
        if (f() || (morVar = this.e) == null) {
            return;
        }
        synchronized (morVar.b) {
            morVar.d = true;
        }
    }

    public final synchronized void c(agfx agfxVar) {
        final mor morVar = this.e;
        if (morVar != null) {
            agfxVar.b(new Runnable() { // from class: moq
                @Override // java.lang.Runnable
                public final void run() {
                    aghd.e(morVar.e);
                }
            });
        }
        this.f = null;
        this.e = null;
        this.h.a();
        this.g = null;
    }

    public final synchronized void d(aggh agghVar) {
        if (this.d == agghVar) {
            return;
        }
        this.d = agghVar;
    }

    @Override // defpackage.aggi
    public final synchronized void dispose() {
        mor morVar = this.e;
        if (morVar != null) {
            aghd.e(morVar.e);
        }
        this.f = null;
        this.e = null;
        this.h.a();
        this.g = null;
    }

    public final synchronized void e(dru druVar) {
        if (f() || this.g == null) {
            return;
        }
        this.h.c(druVar);
    }

    @Override // defpackage.aggi
    public final synchronized boolean f() {
        mor morVar = this.e;
        if (morVar != null) {
            if (!morVar.f()) {
                return false;
            }
        }
        return true;
    }

    final synchronized void g(agfo agfoVar, agfo agfoVar2, oal oalVar, dru druVar, mmc mmcVar) {
        if (((agot) this.h).c.get() == agob.a) {
            this.h = new agot();
        }
        this.h.c(druVar);
        this.g = oalVar;
        this.f = agfoVar;
        mor morVar = new mor(mmcVar);
        this.e = morVar;
        aglt agltVar = new aglt(agfoVar2, new mop(this), this.h.g(new aggw() { // from class: moo
            @Override // defpackage.aggw
            public final boolean a(Object obj, Object obj2) {
                return ((dru) obj) == ((dru) obj2);
            }
        }));
        aggz aggzVar = agoh.k;
        agltVar.m(morVar);
    }
}
