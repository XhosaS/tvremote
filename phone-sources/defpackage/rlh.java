package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rlh extends ViewOutlineProvider {
    final /* synthetic */ ExpandableDialogView a;

    public rlh(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ExpandableDialogView expandableDialogView = this.a;
        float fA = 1.0f - expandableDialogView.a();
        RectF rectF = expandableDialogView.c;
        outline.setRoundRect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom), expandableDialogView.b * fA);
    }
}
