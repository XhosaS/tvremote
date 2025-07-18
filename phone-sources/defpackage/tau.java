package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tau extends cuo {
    final /* synthetic */ taz a;

    public tau(taz tazVar) {
        this.a = tazVar;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        cyqVar.i(1048576);
        cyqVar.y(true);
    }

    @Override // defpackage.cuo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.a.e();
        return true;
    }
}
