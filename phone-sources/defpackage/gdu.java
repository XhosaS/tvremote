package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdu extends cuo {
    final /* synthetic */ gdv a;

    public gdu(gdv gdvVar) {
        this.a = gdvVar;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        gdv gdvVar = this.a;
        gdvVar.b.onInitializeAccessibilityNodeInfo(view, cyqVar);
        RecyclerView recyclerView = gdvVar.a;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof gdo) {
            ((gdo) adapter).a(childAdapterPosition);
        }
    }

    @Override // defpackage.cuo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.b.performAccessibilityAction(view, i, bundle);
    }
}
