package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class ahb implements View.OnApplyWindowInsetsListener {
    ajc a = null;
    final /* synthetic */ View b;
    final /* synthetic */ agk c;

    public ahb(View view, agk agkVar) {
        this.b = view;
        this.c = agkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ajc ajcVarG = ajc.g(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            ahc.g(windowInsets, this.b);
            if (ajcVarG.equals(this.a)) {
                return this.c.a(view, ajcVarG).e();
            }
        }
        this.a = ajcVarG;
        ajc ajcVarA = this.c.a(view, ajcVarG);
        if (Build.VERSION.SDK_INT >= 30) {
            return ajcVarA.e();
        }
        int[] iArr = ahj.a;
        aha.c(view);
        return ajcVarA.e();
    }
}
