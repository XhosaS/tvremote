package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yq extends yr {
    public int b = 2;
    public boolean a = true;

    @Override // defpackage.yr, defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        return this.b == 1 ? buyVar.e(i) : buyVar.c(i);
    }

    @Override // defpackage.yr, defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        return this.b == 1 ? buyVar.e(i) : buyVar.c(i);
    }

    @Override // defpackage.yr
    public final boolean i() {
        return this.a;
    }

    @Override // defpackage.yr
    public final long l(bvs bvsVar, long j) {
        int iE = this.b == 1 ? bvsVar.e(clv.b(j)) : bvsVar.c(clv.b(j));
        if (iE < 0) {
            iE = 0;
        }
        return clw.g(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, iE, iE);
    }
}
