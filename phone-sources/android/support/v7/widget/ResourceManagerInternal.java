package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat;
import android.support.v7.resources.Compatibility;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.videos.R;
import defpackage.gky;
import defpackage.glh;
import defpackage.jn;
import defpackage.jp;
import defpackage.ko;
import defpackage.kp;
import defpackage.kq;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private ko<String, InflateDelegate> mDelegates;
    private final WeakHashMap<Context, jn<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private kp<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, kp<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);

    /* compiled from: PG */
    class AsldcInflateDelegate implements InflateDelegate {
        AsldcInflateDelegate() {
        }

        @Override // android.support.v7.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* compiled from: PG */
    class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        @Override // android.support.v7.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return gky.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* compiled from: PG */
    class ColorFilterLruCache extends jp<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter get(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        public PorterDuffColorFilter put(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: PG */
    class DrawableDelegate implements InflateDelegate {
        DrawableDelegate() {
        }

        @Override // android.support.v7.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    Compatibility.Api21Impl.inflate(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* compiled from: PG */
    interface InflateDelegate {
        Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: PG */
    public interface ResourceManagerHooks {
        Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i);

        ColorStateList getTintListForDrawableRes(Context context, int i);

        PorterDuff.Mode getTintModeForDrawableRes(int i);

        boolean tintDrawable(Context context, int i, Drawable drawable);

        boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable);
    }

    /* compiled from: PG */
    class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        @Override // android.support.v7.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return glh.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void addDelegate(String str, InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new ko<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private synchronized boolean addDrawableToCache(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return DEBUG;
        }
        jn<WeakReference<Drawable.ConstantState>> jnVar = this.mDrawableCaches.get(context);
        if (jnVar == null) {
            jnVar = new jn<>();
            this.mDrawableCaches.put(context, jnVar);
        }
        jnVar.j(j, new WeakReference(constantState));
        return true;
    }

    private void addTintListToCache(Context context, int i, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        kp<ColorStateList> kpVar = this.mTintLists.get(context);
        if (kpVar == null) {
            kpVar = new kp<>();
            this.mTintLists.put(context, kpVar);
        }
        kpVar.f(i, colorStateList);
    }

    private void checkVectorDrawableSetup(Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = DEBUG;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable createDrawableIfNeeded(Context context, int i) throws Resources.NotFoundException {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        Drawable drawableCreateDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i);
        if (drawableCreateDrawableFor != null) {
            drawableCreateDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, jCreateCacheKey, drawableCreateDrawableFor);
        }
        return drawableCreateDrawableFor;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized ResourceManagerInternal get() {
        if (INSTANCE == null) {
            INSTANCE = new ResourceManagerInternal();
        }
        return INSTANCE;
    }

    private synchronized Drawable getCachedDrawable(Context context, long j) {
        WeakReference weakReference;
        jn<WeakReference<Drawable.ConstantState>> jnVar = this.mDrawableCaches.get(context);
        if (jnVar != null && (weakReference = (WeakReference) jnVar.e(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            jnVar.k(j);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
        PorterDuffColorFilter porterDuffColorFilter = colorFilterLruCache.get(i, mode);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        colorFilterLruCache.put(i, mode, porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    private ColorStateList getTintListFromCache(Context context, int i) {
        kp<ColorStateList> kpVar;
        WeakHashMap<Context, kp<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (kpVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) kq.a(kpVar, i);
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        if ((drawable instanceof glh) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName())) {
            return true;
        }
        return DEBUG;
    }

    private Drawable loadDrawableFromDelegates(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        ko<String, InflateDelegate> koVar = this.mDelegates;
        if (koVar == null || koVar.isEmpty()) {
            return null;
        }
        kp<String> kpVar = this.mKnownDrawableIdTags;
        if (kpVar != null) {
            String str = (String) kq.a(kpVar, i);
            if (SKIP_DRAWABLE_TAG.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new kp<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long jCreateCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, jCreateCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        this.mKnownDrawableIdTags.f(i, name);
                        InflateDelegate inflateDelegate = this.mDelegates.get(name);
                        if (inflateDelegate != null) {
                            cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        if (cachedDrawable != null) {
                            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                            addDrawableToCache(context, jCreateCacheKey, cachedDrawable);
                        }
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (Exception e) {
                Log.e(TAG, "Exception while inflating drawable", e);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.f(i, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(tintList);
            PorterDuff.Mode tintMode = getTintMode(i);
            if (tintMode != null) {
                drawableMutate.setTintMode(tintMode);
            }
            return drawableMutate;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i, drawable)) && !tintDrawableUsingColorFilter(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public synchronized Drawable getDrawable(Context context, int i) {
        return getDrawable(context, i, DEBUG);
    }

    public synchronized ColorStateList getTintList(Context context, int i) {
        ColorStateList tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            tintListFromCache = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i);
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
                return tintListFromCache;
            }
        }
        return tintListFromCache;
    }

    public PorterDuff.Mode getTintMode(int i) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i);
    }

    public synchronized void onConfigurationChanged(Context context) {
        jn<WeakReference<Drawable.ConstantState>> jnVar = this.mDrawableCaches.get(context);
        if (jnVar != null) {
            jnVar.i();
        }
    }

    public synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        Drawable drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = vectorEnabledTintResources.getDrawableCanonical(i);
        }
        if (drawableLoadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i, DEBUG, drawableLoadDrawableFromDelegates);
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.mHooks = resourceManagerHooks;
    }

    public boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null || !resourceManagerHooks.tintDrawableUsingColorFilter(context, i, drawable)) {
            return DEBUG;
        }
        return true;
    }

    public synchronized Drawable getDrawable(Context context, int i, boolean z) {
        Drawable drawableLoadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        drawableLoadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (drawableLoadDrawableFromDelegates == null) {
            drawableLoadDrawableFromDelegates = context.getDrawable(i);
        }
        if (drawableLoadDrawableFromDelegates != null) {
            drawableLoadDrawableFromDelegates = tintDrawable(context, i, z, drawableLoadDrawableFromDelegates);
        }
        if (drawableLoadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(drawableLoadDrawableFromDelegates);
        }
        return drawableLoadDrawableFromDelegates;
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            if (tintInfo.mHasTintList) {
                colorStateList = tintInfo.mTintList;
            } else {
                if (!tintInfo.mHasTintMode) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            drawable.setColorFilter(createTintFilter(colorStateList, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
        }
    }

    private static void installDefaultInflateDelegates(ResourceManagerInternal resourceManagerInternal) {
    }
}
