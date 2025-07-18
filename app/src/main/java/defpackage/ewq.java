package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.tvsearch.app.hover.HoverWindow$HoverLayoutParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ewq implements jpk, jpl {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/app/hover/HoverActivitySystem");
    public final exa a;
    private final WindowManager c;
    private jph d;

    public ewq(Context context, WindowManager windowManager) {
        this.c = windowManager;
        this.a = new exa(context, this, this);
    }

    @Override // defpackage.jpl
    public final HoverWindow$HoverLayoutParams a() {
        HoverWindow$HoverLayoutParams hoverWindow$HoverLayoutParams = new HoverWindow$HoverLayoutParams();
        hoverWindow$HoverLayoutParams.setTitle(getClass().getName());
        return hoverWindow$HoverLayoutParams;
    }

    @Override // defpackage.jpk
    public final jph b(jpg jpgVar) {
        return new jph(jpgVar);
    }

    @Override // defpackage.jpl
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        viewGroup.setDescendantFocusability(393216);
        viewGroup.clearFocus();
    }

    @Override // defpackage.jpl
    public final void d(ViewGroup viewGroup) {
        viewGroup.getClass();
        c(viewGroup);
        viewGroup.setVisibility(8);
        viewGroup.clearDisappearingChildren();
        viewGroup.clearAnimation();
    }

    @Override // defpackage.jpl
    public final void e(ViewGroup viewGroup) {
        viewGroup.getClass();
        viewGroup.setDescendantFocusability(262144);
        viewGroup.requestFocus();
    }

    @Override // defpackage.jpl
    public final void f(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        try {
            this.c.updateViewLayout(view, layoutParams);
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) b.d()).p(e).q("com/google/android/apps/tvsearch/app/hover/HoverActivitySystem", "updateViewLayout", 109, "HoverActivitySystem.kt")).u("#updateViewLayout failed with cause");
        }
    }

    @Override // defpackage.jpl
    public final boolean g(ViewGroup viewGroup, WindowManager.LayoutParams layoutParams) {
        viewGroup.getClass();
        if (viewGroup.getParent() != null) {
            viewGroup.setVisibility(0);
            return false;
        }
        try {
            this.c.addView(viewGroup, layoutParams != null ? layoutParams : null);
            return false;
        } catch (WindowManager.BadTokenException e) {
            ((zdv) ((zdv) b.c()).p(e).q("com/google/android/apps/tvsearch/app/hover/HoverActivitySystem", "addView", 47, "HoverActivitySystem.kt")).x("hoverActivitySystem#addView failed with token=%s", layoutParams != null ? layoutParams.token : null);
            return true;
        }
    }

    @Override // defpackage.jpk
    public final jph h() {
        return this.d;
    }

    @Override // defpackage.jpk
    public final void i(jph jphVar) {
        this.d = jphVar;
    }

    @Override // defpackage.jpk
    public final void o() {
        exg exgVarEC;
        exb exbVar;
        jph jphVar = this.d;
        if (jphVar != null && (exgVarEC = jphVar.a.eC()) != null && (exbVar = exgVarEC.b) != null) {
            c(exbVar);
            if (exbVar.getParent() != null) {
                this.c.removeView(exbVar);
            }
            exbVar.clearDisappearingChildren();
            exbVar.clearAnimation();
        }
        this.d = null;
    }
}
