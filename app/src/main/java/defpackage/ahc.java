package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahc {
    public static float a(View view) {
        return view.getElevation();
    }

    public static float b(View view) {
        return view.getZ();
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static ajc e(View view, ajc ajcVar, Rect rect) {
        WindowInsets windowInsetsE = ajcVar.e();
        if (windowInsetsE != null) {
            return ajc.g(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return ajcVar;
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    static void g(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f) {
        view.setElevation(f);
    }

    public static void k(View view, agk agkVar) {
        ahb ahbVar = agkVar != null ? new ahb(view, agkVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, ahbVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (ahbVar != null) {
            view.setOnApplyWindowInsetsListener(ahbVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void l(View view, String str) {
        view.setTransitionName(str);
    }

    public static void m(View view, float f) {
        view.setZ(f);
    }

    static void n(View view) {
        view.stopNestedScroll();
    }
}
