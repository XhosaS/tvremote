package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afmw extends afna implements afoe, afvj {
    public static final Logger q = Logger.getLogger(afmw.class.getName());
    private final afrh a;
    private afih b;
    private volatile boolean c;
    public final agae r;
    public final boolean s;

    protected afmw(agag agagVar, afzw afzwVar, agae agaeVar, afih afihVar, afem afemVar) {
        agaeVar.getClass();
        this.r = agaeVar;
        this.s = !Boolean.TRUE.equals(afemVar.h(afrq.l));
        this.a = new afvk(this, agagVar, afzwVar);
        this.b = afihVar;
    }

    protected abstract afmt b();

    protected abstract afmv g();

    @Override // defpackage.afna, defpackage.afzx
    public final boolean i() {
        return j().o() && !this.c;
    }

    @Override // defpackage.afna
    public /* bridge */ /* synthetic */ afmz j() {
        throw null;
    }

    @Override // defpackage.afna
    protected final afrh l() {
        return this.a;
    }

    @Override // defpackage.afoe
    public final void m(afry afryVar) {
        afryVar.b("remote_addr", a().b.get(afgf.a));
    }

    @Override // defpackage.afoe
    public final void n(Status status) {
        yqw.B(!status.e(), "Should not cancel with OK status");
        this.c = true;
        b().a(status);
    }

    @Override // defpackage.afvj
    public final void o(agaf agafVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (agafVar == null && !z) {
            z3 = false;
        }
        yqw.B(z3, "null frame before EOS");
        b().b(agafVar, z, z2, i);
    }

    @Override // defpackage.afoe
    public final void p() {
        if (g().m) {
            return;
        }
        g().m = true;
        afvk afvkVar = (afvk) l();
        if (afvkVar.i) {
            return;
        }
        afvkVar.i = true;
        agaf agafVar = afvkVar.b;
        if (agafVar != null && agafVar.a() == 0 && afvkVar.b != null) {
            afvkVar.b = null;
        }
        afvkVar.a(true, true);
    }

    @Override // defpackage.afoe
    public final void q(afft afftVar) {
        afih afihVar = this.b;
        afid afidVar = afrq.a;
        afihVar.c(afidVar);
        this.b.e(afidVar, Long.valueOf(Math.max(0L, afftVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.afoe
    public final void r(affw affwVar) {
        afmv afmvVarG = g();
        yqw.M(afmvVarG.k == null, "Already called start");
        affwVar.getClass();
        afmvVarG.l = affwVar;
    }

    @Override // defpackage.afoe
    public final void s(int i) {
        ((afvg) g().o).b = i;
    }

    @Override // defpackage.afoe
    public final void t(int i) {
        afvk afvkVar = (afvk) this.a;
        yqw.M(afvkVar.a == -1, "max size already set");
        afvkVar.a = i;
    }

    @Override // defpackage.afoe
    public final void u(afog afogVar) {
        afmv afmvVarG = g();
        yqw.M(afmvVarG.k == null, "Already called setListener");
        afmvVarG.k = afogVar;
        b().c(this.b);
        this.b = null;
    }
}
