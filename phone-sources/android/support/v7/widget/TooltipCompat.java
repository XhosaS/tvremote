package android.support.v7.widget;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TooltipCompat {

    /* compiled from: PG */
    class Api26Impl {
        private Api26Impl() {
        }

        static void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private TooltipCompat() {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(view, charSequence);
        } else {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }
}
