package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwl implements View.OnApplyWindowInsetsListener {
    cyh a = null;
    final /* synthetic */ View b;
    final /* synthetic */ cvq c;

    public cwl(View view, cvq cvqVar) {
        this.b = view;
        this.c = cvqVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        cyh cyhVarP = cyh.p(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            cwm.g(windowInsets, this.b);
            if (cyhVarP.equals(this.a)) {
                return this.c.onApplyWindowInsets(view, cyhVarP).e();
            }
        }
        this.a = cyhVarP;
        cyh cyhVarOnApplyWindowInsets = this.c.onApplyWindowInsets(view, cyhVarP);
        if (Build.VERSION.SDK_INT >= 30) {
            return cyhVarOnApplyWindowInsets.e();
        }
        int[] iArr = cww.a;
        cwk.e(view);
        return cyhVarOnApplyWindowInsets.e();
    }
}
