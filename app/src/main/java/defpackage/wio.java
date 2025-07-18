package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wio extends udh implements wwo {
    protected final wua b = new wua(this);

    @Override // defpackage.udh, defpackage.bq
    public final void U(Bundle bundle) {
        this.b.f();
        try {
            super.U(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void V(int i, int i2, Intent intent) {
        wwt wwtVarA = this.b.a("Fragment:onActivityResult");
        try {
            super.V(i, i2, intent);
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void X() {
        wwt wwtVarC = this.b.c();
        try {
            super.X();
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public void Y() {
        this.b.f();
        try {
            super.Y();
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void Z() {
        wwt wwtVarC = this.b.c();
        try {
            super.Z();
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void aE(Bundle bundle) {
        super.ey(bundle);
    }

    protected final void aF() {
        super.er();
    }

    protected final void aG() {
        super.Y();
    }

    protected final void aH() {
        super.i();
    }

    protected final void aI(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.D(layoutInflater, viewGroup, bundle);
    }

    public wyt aK() {
        throw null;
    }

    public void aN(wyt wytVar, boolean z) {
        throw null;
    }

    public void aO(wyt wytVar) {
        throw null;
    }

    @Override // defpackage.udh, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        this.b.f();
        try {
            ((udh) this).a.c(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public final void af(Object obj) {
        this.b.h();
        super.eb().i = obj;
    }

    @Override // defpackage.bq
    public final void ag(Object obj) {
        this.b.h();
        super.eb().k = obj;
    }

    @Override // defpackage.bq
    public final void aj(Object obj) {
        this.b.h();
        super.eb().l = obj;
    }

    @Override // defpackage.bq
    public final void ak(Object obj) {
        this.b.h();
        super.eb().j = obj;
    }

    @Override // defpackage.bq
    public final Animator as(int i, int i2) {
        wum.h();
        if (i != 0 || i2 != 0) {
            this.b.d(wyt.b(), true);
        }
        wum.n();
        return null;
    }

    @Override // defpackage.bq
    public final void av(int i, int i2) {
        this.b.e(i, i2);
        wum.n();
    }

    @Override // defpackage.udh, defpackage.bq
    public final boolean ay() {
        wwt wwtVarA = this.b.a("Fragment:onOptionsItemSelected");
        try {
            boolean zT = ((udh) this).a.t();
            wwtVarA.close();
            return zT;
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void e() {
        wwt wwtVarC = this.b.c();
        try {
            super.e();
            wwtVarC.close();
        } catch (Throwable th) {
            try {
                wwtVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bq
    public void ex(Context context) {
        super.ex(context);
        bqs bqsVar = this.F;
        if (bqsVar instanceof wwo) {
            wua wuaVar = this.b;
            if (wuaVar.b == null) {
                wuaVar.d(((wwo) bqsVar).aK(), true);
            }
        }
        bq bqVar = this.b.a;
        de deVarEg = bqVar.eg();
        deVarEg.j.add(new wxb(((wtz) wgw.a(bqVar.s(), wtz.class)).l()));
    }

    @Override // defpackage.udh, defpackage.bq
    public void ey(Bundle bundle) {
        this.b.f();
        try {
            super.ey(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void g(Bundle bundle) {
        this.b.f();
        try {
            ((udh) this).a.i(bundle);
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public final void h() {
        this.b.f();
        try {
            super.h();
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.udh, defpackage.bq
    public void i() {
        this.b.f();
        try {
            super.i();
            wum.n();
        } catch (Throwable th) {
            try {
                wum.n();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
