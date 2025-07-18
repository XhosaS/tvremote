package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kgh extends kfz {
    public final wg e;
    private final kgu g;

    public kgh(khb khbVar, kgu kguVar, kcx kcxVar) {
        super(khbVar, kcxVar);
        this.e = new wg(0);
        this.g = kguVar;
        this.f.b(this);
    }

    private final void l() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.g(this);
    }

    @Override // defpackage.kfz
    protected final void e(ConnectionResult connectionResult, int i) {
        this.g.e(connectionResult, i);
    }

    @Override // defpackage.kfz
    protected final void f() {
        this.g.f();
    }

    @Override // defpackage.kha
    public final void h() {
        l();
    }

    @Override // defpackage.kha
    public final void i() {
        this.a = true;
        l();
    }

    @Override // defpackage.kha
    public final void j() {
        this.a = false;
        kgu kguVar = this.g;
        synchronized (kgu.c) {
            if (kguVar.m == this) {
                kguVar.m = null;
                kguVar.n.clear();
            }
        }
    }
}
