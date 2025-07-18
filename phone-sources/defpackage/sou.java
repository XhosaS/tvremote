package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sou extends spb {
    @Override // defpackage.spb
    public final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // defpackage.spb
    public final int b() {
        return 1;
    }

    @Override // defpackage.spb
    public final ViewPropertyAnimator c(View view, int i) {
        return view.animate().translationY(i);
    }

    @Override // defpackage.spb
    public final void d() {
    }
}
