package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afmv extends afmz {
    private boolean a;
    private boolean b;
    private Runnable c;
    private boolean d;
    public final afzw j;
    public afog k;
    public affw l;
    public volatile boolean m;
    public boolean n;

    protected afmv(int i, afzw afzwVar, agae agaeVar) {
        super(i, afzwVar, agaeVar);
        this.l = affw.b;
        this.b = false;
        this.j = afzwVar;
    }

    @Override // defpackage.afmz
    protected final /* synthetic */ afzz g() {
        return this.k;
    }

    public final void h(Status status, afof afofVar, afih afihVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.j.i();
        agae agaeVar = this.q;
        if (status.e()) {
            agaeVar.d++;
        } else {
            agaeVar.e++;
        }
        this.k.a(status, afofVar, afihVar);
    }

    @Override // defpackage.afvd
    public void i(boolean z) {
        yqw.M(this.n, "status should have been reported on deframer closed");
        this.b = true;
        if (this.d && z) {
            j(Status.k.withDescription("Encountered end-of-stream mid-frame"), afof.PROCESSED, true, new afih());
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            this.c = null;
        }
    }

    public final void j(Status status, afof afofVar, boolean z, afih afihVar) {
        status.getClass();
        afihVar.getClass();
        if (this.n) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.n = true;
        this.d = status.e();
        synchronized (this.p) {
            this.s = true;
        }
        if (this.b) {
            this.c = null;
            h(status, afofVar, afihVar);
            return;
        }
        this.c = new afmu(this, status, afofVar, afihVar);
        if (z) {
            this.o.close();
            return;
        }
        afvg afvgVar = (afvg) this.o;
        if (afvgVar.b()) {
            return;
        }
        if (afvgVar.c()) {
            afvgVar.close();
        } else {
            afvgVar.f = true;
        }
    }
}
