package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqc extends cuo {
    final /* synthetic */ sqg a;

    public sqc(sqg sqgVar) {
        this.a = sqgVar;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        if (!this.a.e) {
            cyqVar.y(false);
        } else {
            cyqVar.i(1048576);
            cyqVar.y(true);
        }
    }

    @Override // defpackage.cuo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            sqg sqgVar = this.a;
            if (sqgVar.e) {
                sqgVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
