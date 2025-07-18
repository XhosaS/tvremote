package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fqd implements ecq {
    private final /* synthetic */ int a;

    public /* synthetic */ fqd(int i) {
        this.a = i;
    }

    @Override // defpackage.ecq
    public final void a(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((fqt) obj).W();
            return;
        }
        if (i == 1) {
            ((fqt) obj).ak();
            return;
        }
        if (i == 2) {
            fqt fqtVar = (fqt) obj;
            fqtVar.aC();
            ((eiz) fqtVar.a).aG();
        } else if (i != 3) {
            fqt fqtVar2 = (fqt) obj;
            fqtVar2.aC();
            ((dyq) fqtVar2.a).Y(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        } else {
            fqt fqtVar3 = (fqt) obj;
            fqtVar3.aC();
            ((eiz) fqtVar3.a).aG();
        }
    }
}
