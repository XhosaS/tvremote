package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.preference.internal.OutlineOnlyWithChildrenFrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aum extends ViewOutlineProvider {
    final /* synthetic */ OutlineOnlyWithChildrenFrameLayout a;

    public aum(OutlineOnlyWithChildrenFrameLayout outlineOnlyWithChildrenFrameLayout) {
        this.a = outlineOnlyWithChildrenFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        OutlineOnlyWithChildrenFrameLayout outlineOnlyWithChildrenFrameLayout = this.a;
        if (outlineOnlyWithChildrenFrameLayout.getChildCount() > 0) {
            outlineOnlyWithChildrenFrameLayout.a.getOutline(view, outline);
        } else {
            ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
        }
    }
}
