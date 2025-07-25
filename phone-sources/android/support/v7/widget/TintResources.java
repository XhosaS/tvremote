package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class TintResources extends ResourcesWrapper {
    private final WeakReference<Context> mContextRef;

    public TintResources(Context context, Resources resources) {
        super(resources);
        this.mContextRef = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i) {
        WeakReference<Context> weakReference = this.mContextRef;
        Drawable drawableCanonical = getDrawableCanonical(i);
        Context context = weakReference.get();
        if (drawableCanonical != null && context != null) {
            ResourceManagerInternal.get().tintDrawableUsingColorFilter(context, i, drawableCanonical);
        }
        return drawableCanonical;
    }
}
