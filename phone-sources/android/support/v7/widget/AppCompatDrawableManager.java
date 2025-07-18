package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.appcompat.R;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ResourceManagerInternal;
import defpackage.csq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    public static synchronized AppCompatDrawableManager get() {
        if (INSTANCE == null) {
            preload();
        }
        return INSTANCE;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        return ResourceManagerInternal.getPorterDuffColorFilter(i, mode);
    }

    public static synchronized void preload() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
            INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: android.support.v7.widget.AppCompatDrawableManager.1
                private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                private final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, com.google.android.videos.R.drawable.abc_seekbar_tick_mark_material, com.google.android.videos.R.drawable.abc_ic_menu_share_mtrl_alpha, com.google.android.videos.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, com.google.android.videos.R.drawable.abc_ic_menu_cut_mtrl_alpha, com.google.android.videos.R.drawable.abc_ic_menu_selectall_mtrl_alpha, com.google.android.videos.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, com.google.android.videos.R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, com.google.android.videos.R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                private final int[] TINT_COLOR_CONTROL_STATE_LIST = {com.google.android.videos.R.drawable.abc_tab_indicator_material, com.google.android.videos.R.drawable.abc_textfield_search_material};
                private final int[] TINT_CHECKABLE_BUTTON_LIST = {com.google.android.videos.R.drawable.abc_btn_check_material, com.google.android.videos.R.drawable.abc_btn_radio_material, com.google.android.videos.R.drawable.abc_btn_check_material_anim, com.google.android.videos.R.drawable.abc_btn_radio_material_anim};

                private boolean arrayContains(int[] iArr, int i) {
                    for (int i2 : iArr) {
                        if (i2 == i) {
                            return true;
                        }
                    }
                    return AppCompatDrawableManager.DEBUG;
                }

                private ColorStateList createBorderlessButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, 0);
                }

                private ColorStateList createButtonColorStateList(Context context, int i) {
                    int themeAttrColor = ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlHighlight);
                    return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, com.google.android.videos.R.attr.colorButtonNormal), csq.f(themeAttrColor, i), csq.f(themeAttrColor, i), i});
                }

                private ColorStateList createColoredButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorAccent));
                }

                private ColorStateList createDefaultButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorButtonNormal));
                }

                private ColorStateList createSwitchThumbColorStateList(Context context) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, com.google.android.videos.R.attr.colorSwitchThumbNormal);
                    if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                        iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                        iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, com.google.android.videos.R.attr.colorSwitchThumbNormal);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlActivated);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                        iArr[0] = iArr3;
                        iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlActivated);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = themeAttrColorStateList.getDefaultColor();
                    }
                    return new ColorStateList(iArr, iArr2);
                }

                private LayerDrawable getRatingBarLayerDrawable(ResourceManagerInternal resourceManagerInternal, Context context, int i) throws Resources.NotFoundException {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable bitmapDrawable2;
                    BitmapDrawable bitmapDrawable3;
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                    Drawable drawable = resourceManagerInternal.getDrawable(context, com.google.android.videos.R.drawable.abc_star_black_48dp);
                    Drawable drawable2 = resourceManagerInternal.getDrawable(context, com.google.android.videos.R.drawable.abc_star_half_black_48dp);
                    if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable = (BitmapDrawable) drawable;
                        bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawable.draw(canvas);
                        bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                        bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                    }
                    bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                    if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable3 = (BitmapDrawable) drawable2;
                    } else {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawable2.draw(canvas2);
                        bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                    }
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                    layerDrawable.setId(0, android.R.id.background);
                    layerDrawable.setId(1, android.R.id.secondaryProgress);
                    layerDrawable.setId(2, android.R.id.progress);
                    return layerDrawable;
                }

                private void setPorterDuffColorFilter(Drawable drawable, int i, PorterDuff.Mode mode) {
                    Drawable drawableMutate = drawable.mutate();
                    if (mode == null) {
                        mode = AppCompatDrawableManager.DEFAULT_MODE;
                    }
                    drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i, mode));
                }

                @Override // android.support.v7.widget.ResourceManagerInternal.ResourceManagerHooks
                public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
                    if (i == com.google.android.videos.R.drawable.abc_cab_background_top_material) {
                        return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, com.google.android.videos.R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                    }
                    if (i == com.google.android.videos.R.drawable.abc_ratingbar_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, com.google.android.videos.R.dimen.abc_star_big);
                    }
                    if (i == com.google.android.videos.R.drawable.abc_ratingbar_indicator_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, com.google.android.videos.R.dimen.abc_star_medium);
                    }
                    if (i == com.google.android.videos.R.drawable.abc_ratingbar_small_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, com.google.android.videos.R.dimen.abc_star_small);
                    }
                    return null;
                }

                @Override // android.support.v7.widget.ResourceManagerInternal.ResourceManagerHooks
                public ColorStateList getTintListForDrawableRes(Context context, int i) {
                    if (i == com.google.android.videos.R.drawable.abc_edit_text_material) {
                        return AppCompatResources.getColorStateList(context, com.google.android.videos.R.color.abc_tint_edittext);
                    }
                    if (i == 2131230897) {
                        return AppCompatResources.getColorStateList(context, com.google.android.videos.R.color.abc_tint_switch_track);
                    }
                    if (i == com.google.android.videos.R.drawable.abc_switch_thumb_material) {
                        return createSwitchThumbColorStateList(context);
                    }
                    if (i == com.google.android.videos.R.drawable.abc_btn_default_mtrl_shape) {
                        return createDefaultButtonColorStateList(context);
                    }
                    if (i == com.google.android.videos.R.drawable.abc_btn_borderless_material) {
                        return createBorderlessButtonColorStateList(context);
                    }
                    if (i == com.google.android.videos.R.drawable.abc_btn_colored_material) {
                        return createColoredButtonColorStateList(context);
                    }
                    if (i == 2131230892 || i == com.google.android.videos.R.drawable.abc_spinner_textfield_background_material) {
                        return AppCompatResources.getColorStateList(context, com.google.android.videos.R.color.abc_tint_spinner);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i)) {
                        return ThemeUtils.getThemeAttrColorStateList(context, com.google.android.videos.R.attr.colorControlNormal);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i)) {
                        return AppCompatResources.getColorStateList(context, com.google.android.videos.R.color.abc_tint_default);
                    }
                    if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i)) {
                        return AppCompatResources.getColorStateList(context, com.google.android.videos.R.color.abc_tint_btn_checkable);
                    }
                    if (i == com.google.android.videos.R.drawable.abc_seekbar_thumb_material) {
                        return AppCompatResources.getColorStateList(context, com.google.android.videos.R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }

                @Override // android.support.v7.widget.ResourceManagerInternal.ResourceManagerHooks
                public PorterDuff.Mode getTintModeForDrawableRes(int i) {
                    if (i == com.google.android.videos.R.drawable.abc_switch_thumb_material) {
                        return PorterDuff.Mode.MULTIPLY;
                    }
                    return null;
                }

                @Override // android.support.v7.widget.ResourceManagerInternal.ResourceManagerHooks
                public boolean tintDrawable(Context context, int i, Drawable drawable) {
                    if (i == com.google.android.videos.R.drawable.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawable;
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.background), ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                        return true;
                    }
                    if (i != com.google.android.videos.R.drawable.abc_ratingbar_material && i != com.google.android.videos.R.drawable.abc_ratingbar_indicator_material && i != com.google.android.videos.R.drawable.abc_ratingbar_small_material) {
                        return AppCompatDrawableManager.DEBUG;
                    }
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, com.google.android.videos.R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, com.google.android.videos.R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                    return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[RETURN] */
                @Override // android.support.v7.widget.ResourceManagerInternal.ResourceManagerHooks
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean tintDrawableUsingColorFilter(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
                    /*
                        r6 = this;
                        int[] r0 = r6.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                        android.graphics.PorterDuff$Mode r1 = android.support.v7.widget.AppCompatDrawableManager.access$000()
                        boolean r0 = r6.arrayContains(r0, r8)
                        r2 = 0
                        r3 = -1
                        r4 = 1
                        if (r0 == 0) goto L15
                        r8 = 2130969001(0x7f0401a9, float:1.7546672E38)
                    L12:
                        r0 = r3
                    L13:
                        r5 = r4
                        goto L4c
                    L15:
                        int[] r0 = r6.COLORFILTER_COLOR_CONTROL_ACTIVATED
                        boolean r0 = r6.arrayContains(r0, r8)
                        if (r0 == 0) goto L21
                        r8 = 2130968999(0x7f0401a7, float:1.7546667E38)
                        goto L12
                    L21:
                        int[] r0 = r6.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                        boolean r0 = r6.arrayContains(r0, r8)
                        r5 = 16842801(0x1010031, float:2.3693695E-38)
                        if (r0 == 0) goto L31
                        android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
                    L2e:
                        r0 = r3
                    L2f:
                        r8 = r5
                        goto L13
                    L31:
                        r0 = 2131230868(0x7f080094, float:1.80778E38)
                        if (r8 != r0) goto L43
                        r8 = 1109603123(0x42233333, float:40.8)
                        int r8 = java.lang.Math.round(r8)
                        r0 = 16842800(0x1010030, float:2.3693693E-38)
                        r5 = r0
                        r0 = r8
                        goto L2f
                    L43:
                        r0 = 2131230850(0x7f080082, float:1.8077764E38)
                        if (r8 != r0) goto L49
                        goto L2e
                    L49:
                        r8 = r2
                        r5 = r8
                        r0 = r3
                    L4c:
                        if (r5 == 0) goto L63
                        android.graphics.drawable.Drawable r9 = r9.mutate()
                        int r7 = android.support.v7.widget.ThemeUtils.getThemeAttrColor(r7, r8)
                        android.graphics.PorterDuffColorFilter r7 = android.support.v7.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r7, r1)
                        r9.setColorFilter(r7)
                        if (r0 == r3) goto L62
                        r9.setAlpha(r0)
                    L62:
                        return r4
                    L63:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                }
            });
        }
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public synchronized Drawable getDrawable(Context context, int i) {
        return this.mResourceManager.getDrawable(context, i);
    }

    public synchronized ColorStateList getTintList(Context context, int i) {
        return this.mResourceManager.getTintList(context, i);
    }

    public synchronized void onConfigurationChanged(Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i);
    }

    boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i, drawable);
    }

    public synchronized Drawable getDrawable(Context context, int i, boolean z) {
        return this.mResourceManager.getDrawable(context, i, z);
    }
}
