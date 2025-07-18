package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class aig extends aij {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new atg();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    public aig(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    static aib b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof aif) {
            return ((aif) tag).a;
        }
        return null;
    }

    static void c(View view, aik aikVar) {
        aib aibVarB = b(view);
        if (aibVarB != null) {
            aibVarB.a(aikVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), aikVar);
            }
        }
    }

    static void d(View view, aik aikVar, ajc ajcVar, boolean z) {
        aib aibVarB = b(view);
        if (aibVarB != null) {
            aibVarB.a = ajcVar;
            if (!z) {
                aibVarB.b(aikVar);
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), aikVar, ajcVar, z);
            }
        }
    }

    static void e(View view, ajc ajcVar, List list) {
        aib aibVarB = b(view);
        if (aibVarB != null) {
            aibVarB.c(ajcVar, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), ajcVar, list);
            }
        }
    }

    static void f(View view, aik aikVar, aia aiaVar) {
        aib aibVarB = b(view);
        if (aibVarB != null) {
            aibVarB.d(aikVar, aiaVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), aikVar, aiaVar);
            }
        }
    }
}
