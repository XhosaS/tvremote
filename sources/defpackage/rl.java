package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.tv.remote.service.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rl extends ro {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new uu();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    public rl(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    static rg b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof rk) {
            return ((rk) tag).a;
        }
        return null;
    }

    static void c(View view, sf sfVar, List list) {
        rg rgVarB = b(view);
        if (rgVarB != null) {
            rgVarB.a(sfVar, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), sfVar, list);
            }
        }
    }

    static void d(View view, apl aplVar) {
        rg rgVarB = b(view);
        if (rgVarB != null) {
            rgVarB.b(aplVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), aplVar);
            }
        }
    }

    static void e(View view, apl aplVar, sf sfVar, boolean z) {
        rg rgVarB = b(view);
        if (rgVarB != null) {
            rgVarB.a = sfVar;
            if (!z) {
                rgVarB.c(aplVar);
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), aplVar, sfVar, z);
            }
        }
    }

    static void f(View view, apl aplVar, rf rfVar) {
        rg rgVarB = b(view);
        if (rgVarB != null) {
            rgVarB.d(aplVar, rfVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), aplVar, rfVar);
            }
        }
    }
}
