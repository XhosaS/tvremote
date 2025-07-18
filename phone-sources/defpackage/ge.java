package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ge {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void a(fl flVar, yjz yjzVar) {
        View childAt = ((ViewGroup) flVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.h(null);
            composeView.b(yjzVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(flVar, null, 0, 6, null);
        composeView2.h(null);
        composeView2.b(yjzVar);
        View decorView = flVar.getWindow().getDecorView();
        if (dwf.e(decorView) == null) {
            dwf.f(decorView, flVar);
        }
        if (dwf.c(decorView) == null) {
            dwf.d(decorView, flVar);
        }
        if (gez.v(decorView) == null) {
            gez.w(decorView, flVar);
        }
        flVar.setContentView(composeView2, a);
    }
}
