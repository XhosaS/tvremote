package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfq extends cuo {
    final /* synthetic */ sfs a;

    public sfq(sfs sfsVar) {
        this.a = sfsVar;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        if (!this.a.c) {
            cyqVar.y(false);
        } else {
            cyqVar.i(1048576);
            cyqVar.y(true);
        }
    }

    @Override // defpackage.cuo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            sfs sfsVar = this.a;
            if (sfsVar.c) {
                sfsVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
