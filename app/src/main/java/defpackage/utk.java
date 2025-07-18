package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utk {
    static {
        new uti();
    }

    public static float a(Resources resources, Resources.Theme theme) {
        TypedValue typedValue = new TypedValue();
        return ((theme == null || !theme.resolveAttribute(R.attr.cardRoundCornerRadius, typedValue, true)) ? resources.getDimension(R.dimen.card_rounded_corner_radius) : typedValue.getDimension(resources.getDisplayMetrics())) * 0.9f;
    }

    public static void b(View view) {
        Context context = view.getContext();
        view.setOutlineProvider(new utj(a(context.getResources(), context.getTheme())));
        view.setClipToOutline(true);
    }
}
