package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class si extends bko implements byl, cae {
    public sj a;
    public boolean b = true;

    public si(sj sjVar) {
        this.a = sjVar;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        ht.h(j, this.b ? uv.a : uv.b);
        boolean z = this.b;
        int iB = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int iA = z ? Integer.MAX_VALUE : clv.a(j);
        if (z) {
            iB = clv.b(j);
        }
        bwj bwjVarU = bvsVar.u(clv.k(j, 0, iB, 0, iA, 5));
        int i = bwjVarU.a;
        int iK = ykn.k(i, clv.b(j));
        int i2 = bwjVarU.b;
        int iK2 = ykn.k(i2, clv.a(j));
        int i3 = i2 - iK2;
        int i4 = i - iK;
        if (true != this.b) {
            i3 = i4;
        }
        this.a.e(i3);
        this.a.g(true != this.b ? iK : iK2);
        return bvvVar.cz(iK, iK2, yhc.a, new aiy(this, i3, bwjVarU, 1));
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        if (true != this.b) {
            i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return buyVar.c(i);
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        if (true == this.b) {
            i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return buyVar.d(i);
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        if (true != this.b) {
            i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return buyVar.e(i);
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        if (true == this.b) {
            i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return buyVar.f(i);
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        cfk.y(cfcVar);
        cfa cfaVar = new cfa(new fg(this, 17), new fg(this, 18));
        if (this.b) {
            cfk.q(cfcVar, cfaVar);
        } else {
            cfk.h(cfcVar, cfaVar);
        }
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }
}
