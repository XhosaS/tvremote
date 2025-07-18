package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ql implements View.OnApplyWindowInsetsListener {
    sf a = null;
    final /* synthetic */ View b;
    final /* synthetic */ pw c;

    public ql(View view, pw pwVar) {
        this.b = view;
        this.c = pwVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        sf sfVarO = sf.o(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            qm.e(windowInsets, this.b);
            if (sfVarO.equals(this.a)) {
                return this.c.a(view, sfVarO).e();
            }
        }
        this.a = sfVarO;
        sf sfVarA = this.c.a(view, sfVarO);
        if (Build.VERSION.SDK_INT >= 30) {
            return sfVarA.e();
        }
        int[] iArr = qv.a;
        qk.j(view);
        return sfVarA.e();
    }
}
