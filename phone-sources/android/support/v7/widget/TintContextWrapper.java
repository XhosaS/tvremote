package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TintContextWrapper extends ContextWrapper {
    private static final Object CACHE_LOCK = new Object();
    private static ArrayList<WeakReference<TintContextWrapper>> sCache;
    private final Resources mResources;
    private final Resources.Theme mTheme;

    private TintContextWrapper(Context context) {
        super(context);
        this.mResources = new TintResources(this, context.getResources());
        this.mTheme = null;
    }

    private static boolean shouldWrap(Context context) {
        if ((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources)) {
            return false;
        }
        context.getResources();
        return false;
    }

    public static Context wrap(Context context) {
        shouldWrap(context);
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.mResources.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.mResources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.mTheme;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.mTheme;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
