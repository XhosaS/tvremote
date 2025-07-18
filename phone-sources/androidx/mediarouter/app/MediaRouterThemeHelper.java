package androidx.mediarouter.app;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.csq;

/* compiled from: PG */
/* loaded from: classes.dex */
final class MediaRouterThemeHelper {
    private MediaRouterThemeHelper() {
    }

    static float a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    static int b(Context context) {
        int iF = f(context, com.google.android.videos.R.attr.mediaRouteTheme);
        return iF == 0 ? d(context) : iF;
    }

    static int c(Context context, int i) {
        return csq.a(-1, e(context, i, com.google.android.videos.R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static int d(Context context) {
        return p(context) ? c(context, 0) == -570425344 ? com.google.android.videos.R.style.Theme_MediaRouter_Light : com.google.android.videos.R.style.Theme_MediaRouter_Light_DarkControlPanel : c(context, 0) == -570425344 ? com.google.android.videos.R.style.Theme_MediaRouter_LightControlPanel : com.google.android.videos.R.style.Theme_MediaRouter;
    }

    public static int e(Context context, int i, int i2) throws Resources.NotFoundException {
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    static int f(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    static Context g(Context context, int i, boolean z) {
        if (i == 0) {
            i = f(context, true != z ? com.google.android.videos.R.attr.dialogTheme : com.google.android.videos.R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return f(contextThemeWrapper, com.google.android.videos.R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, d(contextThemeWrapper)) : contextThemeWrapper;
    }

    static Drawable h(Context context) {
        return q(context, com.google.android.videos.R.attr.mediaRouteDefaultIconDrawable);
    }

    public static Drawable i(Context context, int i) {
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        if (p(context)) {
            drawable.setTint(context.getColor(com.google.android.videos.R.color.mr_dynamic_dialog_icon_light));
        }
        return drawable;
    }

    static Drawable j(Context context) {
        return q(context, com.google.android.videos.R.attr.mediaRouteSpeakerIconDrawable);
    }

    static Drawable k(Context context) {
        return q(context, com.google.android.videos.R.attr.mediaRouteSpeakerGroupIconDrawable);
    }

    static Drawable l(Context context) {
        return q(context, com.google.android.videos.R.attr.mediaRouteTvIconDrawable);
    }

    static void m(Context context, Dialog dialog) {
        dialog.getWindow().getDecorView().setBackgroundColor(context.getColor(true != p(context) ? com.google.android.videos.R.color.mr_dynamic_dialog_background_dark : com.google.android.videos.R.color.mr_dynamic_dialog_background_light));
    }

    static void n(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(true != p(context) ? com.google.android.videos.R.color.mr_cast_progressbar_progress_and_thumb_dark : com.google.android.videos.R.color.mr_cast_progressbar_progress_and_thumb_light), PorterDuff.Mode.SRC_IN);
        }
    }

    static void o(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int iC = c(context, 0);
        if (Color.alpha(iC) != 255) {
            iC = csq.f(iC, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.setColor(iC);
    }

    public static boolean p(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(com.google.android.videos.R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    private static Drawable q(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawable = AppCompatResources.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        if (p(context)) {
            drawable.setTint(context.getColor(com.google.android.videos.R.color.mr_dynamic_dialog_icon_light));
        }
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }
}
