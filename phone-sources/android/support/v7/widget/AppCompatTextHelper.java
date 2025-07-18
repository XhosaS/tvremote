package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import android.os.LocaleList;
import android.support.v7.appcompat.R;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.csm;
import defpackage.cuh;
import defpackage.cww;
import defpackage.czd;
import defpackage.czu;
import defpackage.jp;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;
    private String mFontVariationSettings = null;

    /* compiled from: PG */
    class Api21Impl {
        private Api21Impl() {
        }

        static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: PG */
    class Api24Impl {
        private Api24Impl() {
        }

        static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: PG */
    class Api26Impl {
        private static Paint sPaint;
        private static final jp<VarCacheKey, Typeface> sVariationsCache = new jp<>(30);

        /* compiled from: PG */
        class VarCacheKey {
            private final String mFontVariationSettings;
            private final Typeface mTypeface;
            private final int mWeightAdjustment;

            public VarCacheKey(Typeface typeface, String str, int i) {
                this.mTypeface = typeface;
                this.mFontVariationSettings = str;
                this.mWeightAdjustment = i;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof VarCacheKey)) {
                    return false;
                }
                VarCacheKey varCacheKey = (VarCacheKey) obj;
                return this.mWeightAdjustment == varCacheKey.mWeightAdjustment && Objects.equals(this.mTypeface, varCacheKey.mTypeface) && Objects.equals(this.mFontVariationSettings, varCacheKey.mFontVariationSettings);
            }

            public int hashCode() {
                return Objects.hash(this.mTypeface, this.mFontVariationSettings, Integer.valueOf(this.mWeightAdjustment));
            }
        }

        private Api26Impl() {
        }

        static String adjustFontVariationSettings(String str, int i) {
            FontVariationAxis[] fontVariationAxisArr;
            int length;
            if (i == 0) {
                return str;
            }
            if (TextUtils.isEmpty(str)) {
                fontVariationAxisArr = new FontVariationAxis[0];
            } else {
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                if (fontVariationAxisArrFromFontVariationSettings == null) {
                    return str;
                }
                fontVariationAxisArr = fontVariationAxisArrFromFontVariationSettings;
            }
            int i2 = 0;
            boolean z = false;
            while (true) {
                length = fontVariationAxisArr.length;
                if (i2 >= length) {
                    break;
                }
                FontVariationAxis fontVariationAxis = fontVariationAxisArr[i2];
                if ("wght".equals(fontVariationAxis.getTag())) {
                    fontVariationAxisArr[i2] = new FontVariationAxis("wght", clampWeight(fontVariationAxis.getStyleValue() + i));
                    z = true;
                }
                i2++;
            }
            if (!z) {
                FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[length + 1];
                System.arraycopy(fontVariationAxisArr, 0, fontVariationAxisArr2, 0, length);
                fontVariationAxisArr2[length] = new FontVariationAxis("wght", clampWeight(i + 400));
                fontVariationAxisArr = fontVariationAxisArr2;
            }
            return FontVariationAxis.toFontVariationSettings(fontVariationAxisArr);
        }

        private static float clampWeight(float f) {
            if (f < 1.0f) {
                return 1.0f;
            }
            return Math.min(f, 1000.0f);
        }

        static Typeface createVariationInstance(Typeface typeface, String str, int i) {
            VarCacheKey varCacheKey = new VarCacheKey(typeface, str, i);
            jp<VarCacheKey, Typeface> jpVar = sVariationsCache;
            Typeface typeface2 = jpVar.get(varCacheKey);
            if (typeface2 != null) {
                return typeface2;
            }
            Paint paint = sPaint;
            if (paint == null) {
                paint = new Paint();
                sPaint = paint;
            }
            String strAdjustFontVariationSettings = adjustFontVariationSettings(str, i);
            if (Objects.equals(paint.getFontVariationSettings(), strAdjustFontVariationSettings)) {
                paint.setFontVariationSettings(null);
            }
            paint.setTypeface(typeface);
            if (!paint.setFontVariationSettings(strAdjustFontVariationSettings)) {
                return null;
            }
            Typeface typeface3 = paint.getTypeface();
            jpVar.put(varCacheKey, typeface3);
            return typeface3;
        }

        static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static String getFontVariationSettings(TextView textView) {
            return textView.getFontVariationSettings();
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        static boolean setFontVariationSettings(TextView textView, String str) {
            if (Objects.equals(textView.getFontVariationSettings(), str)) {
                textView.setFontVariationSettings("");
            }
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: PG */
    class Api28Impl {
        private Api28Impl() {
        }

        static Typeface create(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    /* compiled from: PG */
    class FontVariationSettingsManager {
        private static final String TAG = "FontVarSettings";
        private String mFontVariationSettings;
        private int mFontWeightAdjustmentForTesting = -1;
        private Typeface mLastKnownTypefaceSetOnPaint;
        private Typeface mOriginalTypeface;
        private final TextView mTextView;
        private final cuh<Typeface> mTypefaceSetter;

        public FontVariationSettingsManager(TextView textView, cuh<Typeface> cuhVar) {
            this.mTextView = textView;
            this.mTypefaceSetter = cuhVar;
        }

        private void setTypefaceInternal(Typeface typeface) {
            this.mLastKnownTypefaceSetOnPaint = typeface;
            this.mTypefaceSetter.accept(typeface);
        }

        public String getFontVariationSettings() {
            return this.mFontVariationSettings;
        }

        public int getFontWeightAdjustment() {
            int i;
            int i2 = this.mFontWeightAdjustmentForTesting;
            if (i2 != -1) {
                return i2;
            }
            if (Build.VERSION.SDK_INT < 31 || (i = this.mTextView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
                return 0;
            }
            return i;
        }

        public Typeface getTypeface() {
            return this.mOriginalTypeface;
        }

        public boolean setFontVariationSettings(String str) {
            TextView textView = this.mTextView;
            Typeface typeface = this.mOriginalTypeface;
            TextPaint paint = textView.getPaint();
            if (this.mLastKnownTypefaceSetOnPaint != paint.getTypeface()) {
                Log.w(TAG, "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
                typeface = paint.getTypeface();
            }
            int fontWeightAdjustment = getFontWeightAdjustment();
            if (fontWeightAdjustment == Integer.MAX_VALUE) {
                fontWeightAdjustment = 0;
            }
            Typeface typefaceCreateVariationInstance = Api26Impl.createVariationInstance(typeface, str, fontWeightAdjustment);
            if (typefaceCreateVariationInstance == null) {
                return false;
            }
            setTypefaceInternal(typefaceCreateVariationInstance);
            this.mFontVariationSettings = str;
            return true;
        }

        void setFontWeightAdjustmentForTesting(int i) {
            this.mFontWeightAdjustmentForTesting = i;
        }

        public void setTypeface(Typeface typeface) {
            this.mOriginalTypeface = typeface;
            setTypefaceInternal(typeface);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private void applyFontAndVariationSettings(boolean z) {
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            if (this.mFontWeight == -1) {
                this.mView.setTypeface(typeface, this.mStyle);
            } else {
                this.mView.setTypeface(typeface);
            }
        } else if (z) {
            this.mView.setTypeface(null);
        }
        if (this.mFontVariationSettings == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        Api26Impl.setFontVariationSettings(this.mView, this.mFontVariationSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyNewTypefacePreservingVariationSettings(TextView textView, Typeface typeface, int i) {
        String str = null;
        if (Build.VERSION.SDK_INT >= 26) {
            String fontVariationSettings = Api26Impl.getFontVariationSettings(textView);
            if (!TextUtils.isEmpty(fontVariationSettings)) {
                Api26Impl.setFontVariationSettings(textView, null);
            }
            str = fontVariationSettings;
        }
        textView.setTypeface(typeface, i);
        if (Build.VERSION.SDK_INT < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        Api26Impl.setFontVariationSettings(textView, str);
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private csm makeFontCallback(final int i, final int i2) {
        final WeakReference weakReference = new WeakReference(this.mView);
        return new csm() { // from class: android.support.v7.widget.AppCompatTextHelper.1
            @Override // defpackage.csm
            /* renamed from: onFontRetrieved */
            public void m340x46c88379(Typeface typeface) {
                int i3;
                if (Build.VERSION.SDK_INT >= 28 && (i3 = i) != -1) {
                    typeface = Api28Impl.create(typeface, i3, (i2 & 2) != 0);
                }
                AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
            }

            @Override // defpackage.csm
            /* renamed from: onFontRetrievalFailed */
            public void m339xb24343b7(int i3) {
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setCompoundDrawables(android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.Drawable r10, android.graphics.drawable.Drawable r11) {
        /*
            r5 = this;
            r0 = 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r10 != 0) goto L4e
            if (r11 == 0) goto Lb
            if (r9 == 0) goto L52
            goto L50
        Lb:
            if (r6 != 0) goto L15
            if (r7 != 0) goto L15
            if (r8 != 0) goto L15
            if (r9 == 0) goto L14
            goto L15
        L14:
            return
        L15:
            android.widget.TextView r10 = r5.mView
            android.graphics.drawable.Drawable[] r10 = r10.getCompoundDrawablesRelative()
            r11 = r10[r2]
            if (r11 != 0) goto L3e
            r4 = r10[r1]
            if (r4 == 0) goto L24
            goto L3e
        L24:
            android.widget.TextView r10 = r5.mView
            android.graphics.drawable.Drawable[] r11 = r10.getCompoundDrawables()
            if (r6 != 0) goto L2e
            r6 = r11[r2]
        L2e:
            if (r7 != 0) goto L32
            r7 = r11[r3]
        L32:
            if (r8 != 0) goto L36
            r8 = r11[r1]
        L36:
            if (r9 != 0) goto L3a
            r9 = r11[r0]
        L3a:
            r10.setCompoundDrawablesWithIntrinsicBounds(r6, r7, r8, r9)
            return
        L3e:
            if (r7 != 0) goto L42
            r7 = r10[r3]
        L42:
            if (r9 != 0) goto L46
            r9 = r10[r0]
        L46:
            android.widget.TextView r6 = r5.mView
            r8 = r10[r1]
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r11, r7, r8, r9)
            return
        L4e:
            if (r9 == 0) goto L52
        L50:
            r6 = r2
            goto L53
        L52:
            r6 = r3
        L53:
            android.widget.TextView r8 = r5.mView
            android.graphics.drawable.Drawable[] r8 = r8.getCompoundDrawablesRelative()
            if (r10 != 0) goto L5d
            r10 = r8[r2]
        L5d:
            if (r7 != 0) goto L61
            r7 = r8[r3]
        L61:
            if (r11 != 0) goto L65
            r11 = r8[r1]
        L65:
            android.widget.TextView r1 = r5.mView
            if (r3 != r6) goto L6b
            r9 = r8[r0]
        L6b:
            r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r7, r11, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatTextHelper.setCompoundDrawables(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void");
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    private boolean updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        int i;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = R.styleable.ActionBar;
        this.mStyle = tintTypedArray.getInt(2, this.mStyle);
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = tintTypedArray.getInt(11, -1);
            this.mFontWeight = i2;
            if (i2 != -1) {
                this.mStyle &= 2;
            }
        }
        if (Build.VERSION.SDK_INT >= 26 && tintTypedArray.hasValue(13)) {
            this.mFontVariationSettings = tintTypedArray.getString(13);
        }
        if (!tintTypedArray.hasValue(10) && !tintTypedArray.hasValue(12)) {
            if (!tintTypedArray.hasValue(1)) {
                if (Build.VERSION.SDK_INT < 28 || (i = this.mFontWeight) == -1 || (typeface = this.mFontTypeface) == null) {
                    return false;
                }
                this.mFontTypeface = Api28Impl.create(typeface, i, (this.mStyle & 2) != 0);
                return true;
            }
            this.mAsyncFontPending = false;
            int i3 = tintTypedArray.getInt(1, 1);
            if (i3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.mFontTypeface = typeface2;
            return true;
        }
        this.mFontTypeface = null;
        int i4 = true == tintTypedArray.hasValue(12) ? 12 : 10;
        int i5 = this.mFontWeight;
        int i6 = this.mStyle;
        if (!context.isRestricted()) {
            try {
                Typeface font = tintTypedArray.getFont(i4, this.mStyle, makeFontCallback(i5, i6));
                if (font != null) {
                    if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
                        this.mFontTypeface = font;
                    } else {
                        this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    }
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface == null && (string = tintTypedArray.getString(i4)) != null) {
            if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
                this.mFontTypeface = Typeface.create(string, this.mStyle);
            } else {
                this.mFontTypeface = Api28Impl.create(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
            }
        }
        return true;
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i2;
        float dimensionPixelSize;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextHelper, i, 0);
        cww.o(this.mView, this.mView.getContext(), R.styleable.AppCompatTextHelper, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (tintTypedArrayObtainStyledAttributes.hasValue(3)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(3, 0));
        }
        boolean z3 = true;
        if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(4)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(2)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(5)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(5, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(6)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(6, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        boolean z4 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray tintTypedArrayObtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, R.styleable.TextAppearance);
            if (z4 || !tintTypedArrayObtainStyledAttributes2.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z = tintTypedArrayObtainStyledAttributes2.getBoolean(14, false);
                z2 = true;
            }
            updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes2);
            string = tintTypedArrayObtainStyledAttributes2.hasValue(15) ? tintTypedArrayObtainStyledAttributes2.getString(15) : null;
            tintTypedArrayObtainStyledAttributes2.recycle();
        } else {
            z = false;
            z2 = false;
            string = null;
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.TextAppearance, i, 0);
        if (z4 || !tintTypedArrayObtainStyledAttributes3.hasValue(14)) {
            z3 = z2;
        } else {
            z = tintTypedArrayObtainStyledAttributes3.getBoolean(14, false);
        }
        if (tintTypedArrayObtainStyledAttributes3.hasValue(15)) {
            string = tintTypedArrayObtainStyledAttributes3.getString(15);
        }
        if (Build.VERSION.SDK_INT >= 28 && tintTypedArrayObtainStyledAttributes3.hasValue(R.styleable.TextAppearance_android_textSize) && tintTypedArrayObtainStyledAttributes3.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes3);
        tintTypedArrayObtainStyledAttributes3.recycle();
        if (!z4 && z3) {
            setAllCaps(z);
        }
        applyFontAndVariationSettings(false);
        if (string != null) {
            Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(string));
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            int[] autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if (autoSizeTextAvailableSizes.length > 0) {
                if (Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                    TextView textView = this.mView;
                    AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.mAutoSizeTextHelper;
                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(textView, appCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize(), appCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize(), appCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity(), 0);
                } else {
                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextAvailableSizes, 0);
                }
            }
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.AppCompatTextView);
        int resourceId2 = tintTypedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawable4 = resourceId2 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId2) : null;
        int resourceId3 = tintTypedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawable5 = resourceId3 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId3) : null;
        int resourceId4 = tintTypedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawable6 = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
        int resourceId5 = tintTypedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawable7 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
        int resourceId6 = tintTypedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawable8 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
        int resourceId7 = tintTypedArrayObtainStyledAttributes4.getResourceId(7, -1);
        if (resourceId7 != -1) {
            drawable3 = appCompatDrawableManager.getDrawable(context, resourceId7);
            Drawable drawable9 = drawable6;
            drawable = drawable7;
            drawable2 = drawable9;
        } else {
            Drawable drawable10 = drawable6;
            drawable = drawable7;
            drawable2 = drawable10;
            drawable3 = null;
        }
        setCompoundDrawables(drawable4, drawable5, drawable2, drawable, drawable8, drawable3);
        if (tintTypedArrayObtainStyledAttributes4.hasValue(11)) {
            ColorStateList colorStateList = tintTypedArrayObtainStyledAttributes4.getColorStateList(11);
            TextView textView2 = this.mView;
            textView2.getClass();
            textView2.setCompoundDrawableTintList(colorStateList);
        }
        if (tintTypedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode tintMode = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes4.getInt(12, -1), null);
            TextView textView3 = this.mView;
            textView3.getClass();
            textView3.setCompoundDrawableTintMode(tintMode);
        }
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (tintTypedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = tintTypedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i2 = -1;
            } else {
                i2 = typedValuePeekValue.data & 15;
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
            }
        } else {
            i2 = -1;
            dimensionPixelSize = -1.0f;
        }
        tintTypedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            czu.g(this.mView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            czu.h(this.mView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i2 == -1) {
                czu.i(this.mView, (int) dimensionPixelSize);
            } else {
                czu.j(this.mView, i2, dimensionPixelSize);
            }
        }
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (!textView.isAttachedToWindow()) {
                    applyNewTypefacePreservingVariationSettings(textView, typeface, this.mStyle);
                } else {
                    final int i = this.mStyle;
                    textView.post(new Runnable() { // from class: android.support.v7.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AppCompatTextHelper.applyNewTypefacePreservingVariationSettings(textView, typeface, i);
                        }
                    });
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int i) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R.styleable.TextAppearance);
        if (tintTypedArrayObtainStyledAttributes.hasValue(14)) {
            setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R.styleable.TextAppearance_android_textSize) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        boolean zUpdateTypefaceAndStyle = updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes);
        tintTypedArrayObtainStyledAttributes.recycle();
        applyFontAndVariationSettings(zUpdateTypefaceAndStyle);
    }

    public void populateSurroundingTextIfNeeded(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        czd.b(editorInfo, textView.getText());
    }

    public void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setCompoundDrawableTintList(ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    public void setTextSize(int i, float f) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i, f);
    }
}
