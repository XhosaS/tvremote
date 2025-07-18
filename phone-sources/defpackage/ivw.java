package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivw extends cqv {
    final /* synthetic */ MediaDeviceFloatingActionButton a;

    public ivw(MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton) {
        this.a = mediaDeviceFloatingActionButton;
    }

    @Override // defpackage.cqv
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        view.getMeasuredHeight();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        this.a.d();
        return false;
    }

    @Override // defpackage.cqv
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        view.getClass();
        view2.getClass();
        view3.getClass();
        return i == 2;
    }

    @Override // defpackage.cqv
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int[] iArr) {
        view.getClass();
        view2.getClass();
        iArr.getClass();
        if (i > 0) {
            this.a.B(2);
            return;
        }
        if (i < 0) {
            MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton = this.a;
            float x = mediaDeviceFloatingActionButton.getX();
            mediaDeviceFloatingActionButton.getLayoutParams().getClass();
            if (x > ((ViewGroup.MarginLayoutParams) r3).leftMargin) {
                mediaDeviceFloatingActionButton.y();
            }
        }
    }
}
