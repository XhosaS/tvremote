package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ews extends euv {
    public etw a;
    private final eer b;
    private final epd c;
    private final dze d;
    private boolean e = true;
    private long f = -9223372036854775807L;
    private boolean g;
    private boolean h;
    private efy i;
    private dzy j;
    private final sew k;
    private final pku l;

    public ews(dzy dzyVar, eer eerVar, pku pkuVar, epd epdVar, sew sewVar, dze dzeVar) {
        this.j = dzyVar;
        this.b = eerVar;
        this.l = pkuVar;
        this.c = epdVar;
        this.k = sewVar;
        this.d = dzeVar;
    }

    private final dzt d() {
        dzt dztVar = a().c;
        dztVar.getClass();
        return dztVar;
    }

    private final void e() {
        eay exaVar = new exa(this.f, this.g, this.h, a());
        if (this.e) {
            exaVar = new ewq(exaVar);
        }
        y(exaVar);
    }

    @Override // defpackage.ewb
    public final synchronized dzy a() {
        return this.j;
    }

    public final void b(long j, fef fefVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f;
        }
        boolean z2 = fefVar.z();
        if (!this.e && this.f == j && this.g == z2 && this.h == z) {
            return;
        }
        this.f = j;
        this.g = z2;
        this.h = z;
        this.e = false;
        e();
        etw etwVar = this.a;
        if (etwVar != null) {
            etwVar.d = fefVar;
        }
    }

    @Override // defpackage.euv
    protected final void g(efy efyVar) {
        this.i = efyVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        epd epdVar = this.c;
        epdVar.eo(looperMyLooper, q());
        epdVar.em();
        e();
    }

    @Override // defpackage.ewb
    public final void i(evx evxVar) {
        ewp ewpVar = (ewp) evxVar;
        if (ewpVar.j) {
            for (eww ewwVar : ewpVar.i) {
                ewwVar.y();
            }
        }
        ewpVar.d.f(ewpVar);
        ewpVar.f.removeCallbacksAndMessages(null);
        ewpVar.g = null;
        ewpVar.n = true;
    }

    @Override // defpackage.euv
    protected final void j() {
        this.c.en();
    }

    @Override // defpackage.euv, defpackage.ewb
    public final synchronized void n(dzy dzyVar) {
        this.j = dzyVar;
    }

    @Override // defpackage.euv, defpackage.ewb
    public final boolean o(dzy dzyVar) {
        dzt dztVarD = d();
        dzt dztVar = dzyVar.c;
        if (dztVar != null) {
            return dztVar.i.equals(dztVarD.i) && dztVar.q == dztVarD.q && Objects.equals(dztVar.n, dztVarD.n);
        }
        return false;
    }

    @Override // defpackage.ewb
    public final evx p(evz evzVar, ezp ezpVar, long j) {
        efa efaVarA = ((eez) this.b).a();
        efy efyVar = this.i;
        if (efyVar != null) {
            efaVarA.f(efyVar);
        }
        dzt dztVarD = d();
        Uri uri = dztVarD.i;
        pku pkuVar = this.l;
        q();
        return new ewp(uri, efaVarA, new eux(pkuVar.a), this.c, F(evzVar), this.k, E(evzVar), this, ezpVar, dztVarD.n, this.d, edt.y(dztVarD.q));
    }

    @Override // defpackage.ewb
    public final void c() {
    }
}
