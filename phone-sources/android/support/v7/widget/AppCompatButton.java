package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatTextHelper;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import com.google.android.videos.R;
import defpackage.cuh;
import defpackage.czu;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatButton extends Button implements EmojiCompatConfigurationView {
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private AppCompatTextHelper.FontVariationSettingsManager mFontVariationSettingsManager;
    private final AppCompatTextHelper mTextHelper;

    /* compiled from: PG */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatButton> {
        private int mAutoSizeMaxTextSizeId;
        private int mAutoSizeMinTextSizeId;
        private int mAutoSizeStepGranularityId;
        private int mAutoSizeTextTypeId;
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mAutoSizeMaxTextSizeId = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
            this.mAutoSizeMinTextSizeId = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
            this.mAutoSizeStepGranularityId = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
            this.mAutoSizeTextTypeId = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new IntFunction<String>() { // from class: android.support.v7.widget.AppCompatButton.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                public String apply(int i) {
                    return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
                }
            });
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatButton appCompatButton, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readInt(this.mAutoSizeMaxTextSizeId, appCompatButton.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.mAutoSizeMinTextSizeId, appCompatButton.getAutoSizeMinTextSize());
            propertyReader.readInt(this.mAutoSizeStepGranularityId, appCompatButton.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.mAutoSizeTextTypeId, appCompatButton.getAutoSizeTextType());
            propertyReader.readObject(this.mBackgroundTintId, appCompatButton.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatButton.getBackgroundTintMode());
            propertyReader.readObject(this.mDrawableTintId, appCompatButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.mDrawableTintModeId, appCompatButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeMaxTextSize();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeMinTextSize();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeStepGranularity();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        return appCompatTextHelper != null ? appCompatTextHelper.getAutoSizeTextAvailableSizes() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeTextType();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return czu.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().getFontVariationSettings();
    }

    public AppCompatTextHelper.FontVariationSettingsManager getFontVariationSettingsManager() {
        if (this.mFontVariationSettingsManager == null) {
            this.mFontVariationSettingsManager = new AppCompatTextHelper.FontVariationSettingsManager(this, new cuh() { // from class: android.support.v7.widget.AppCompatButton$$ExternalSyntheticLambda0
                @Override // defpackage.cuh
                public final void accept(Object obj) {
                    this.f$0.m64xdc1dcc3((Typeface) obj);
                }
            });
        }
        return this.mFontVariationSettingsManager;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintList();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintMode();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.getCompoundDrawableTintList();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.getCompoundDrawableTintMode();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().getTypeface() : super.getTypeface();
    }

    @Override // android.support.v7.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    /* renamed from: lambda$getFontVariationSettingsManager$0$android-support-v7-widget-AppCompatButton, reason: not valid java name */
    public /* synthetic */ void m64xdc1dcc3(Typeface typeface) {
        super.setTypeface(typeface);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper == null || ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || !appCompatTextHelper.isAutoSizeEnabled()) {
            return;
        }
        this.mTextHelper.autoSizeText();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().setAllCaps(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(czu.e(this, callback));
    }

    @Override // android.support.v7.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().setEnabled(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().getFilters(inputFilterArr));
    }

    @Override // android.widget.TextView
    public boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().setFontVariationSettings(str);
    }

    public void setSupportAllCaps(boolean z) {
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.setCompoundDrawableTintList(colorStateList);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.setCompoundDrawableTintMode(mode);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetTextAppearance(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i, f);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setTextSize(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            getFontVariationSettingsManager().setTypeface(typeface);
        } else {
            super.setTypeface(typeface);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.wrap(context);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.loadFromAttributes(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        appCompatTextHelper.applyCompoundDrawablesTints();
        getEmojiTextViewHelper().loadFromAttributes(attributeSet, i);
    }
}
