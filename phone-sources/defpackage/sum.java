package defpackage;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sum extends cuo {
    final /* synthetic */ NavigationMenuItemView a;

    public sum(NavigationMenuItemView navigationMenuItemView) {
        this.a = navigationMenuItemView;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        cyqVar.r(this.a.c);
    }
}
