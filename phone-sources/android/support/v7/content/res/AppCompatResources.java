package android.support.v7.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ResourceManagerInternal;
import defpackage.czi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppCompatResources {
    private AppCompatResources() {
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return czi.c(context, i);
    }

    public static Drawable getDrawable(Context context, int i) {
        return ResourceManagerInternal.get().getDrawable(context, i);
    }
}
