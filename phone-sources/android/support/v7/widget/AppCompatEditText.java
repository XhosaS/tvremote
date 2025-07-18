package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatTextHelper;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.videos.R;
import defpackage.cuh;
import defpackage.cuy;
import defpackage.cvr;
import defpackage.cww;
import defpackage.czd;
import defpackage.cze;
import defpackage.czi;
import defpackage.czu;
import defpackage.dad;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements EmojiCompatConfigurationView, cvr {
    private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final dad mDefaultOnReceiveContentListener;
    private AppCompatTextHelper.FontVariationSettingsManager mFontVariationSettingsManager;
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    /* compiled from: PG */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatEditText> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatEditText appCompatEditText, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.mBackgroundTintId, appCompatEditText.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatEditText.getBackgroundTintMode());
            propertyReader.readObject(this.mDrawableTintId, appCompatEditText.getCompoundDrawableTintList());
            propertyReader.readObject(this.mDrawableTintModeId, appCompatEditText.getCompoundDrawableTintMode());
        }
    }

    /* compiled from: PG */
    class SuperCaller {
        public SuperCaller() {
        }

        public TextClassifier getTextClassifier() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void setTextClassifier(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new SuperCaller();
        }
        return this.mSuperCaller;
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return czu.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().getFontVariationSettings();
    }

    public AppCompatTextHelper.FontVariationSettingsManager getFontVariationSettingsManager() {
        if (this.mFontVariationSettingsManager == null) {
            this.mFontVariationSettingsManager = new AppCompatTextHelper.FontVariationSettingsManager(this, new cuh() { // from class: android.support.v7.widget.AppCompatEditText$$ExternalSyntheticLambda0
                @Override // defpackage.cuh
                public final void accept(Object obj) {
                    this.f$0.m65x4645a7a8((Typeface) obj);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        return (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) ? getSuperCaller().getTextClassifier() : appCompatTextClassifierHelper.getTextClassifier();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().getTypeface() : super.getTypeface();
    }

    public void initEmojiKeyListener(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        KeyListener keyListener = getKeyListener();
        if (appCompatEmojiEditTextHelper.isEmojiCapableKeyListener(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListener2 = appCompatEmojiEditTextHelper.getKeyListener(keyListener);
            if (keyListener2 == keyListener) {
                return;
            }
            super.setKeyListener(keyListener2);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.support.v7.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.isEnabled();
    }

    /* renamed from: lambda$getFontVariationSettingsManager$0$android-support-v7-widget-AppCompatEditText, reason: not valid java name */
    public /* synthetic */ void m65x4645a7a8(Typeface typeface) {
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrW;
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        appCompatTextHelper.populateSurroundingTextIfNeeded(this, inputConnectionOnCreateInputConnection, editorInfo);
        AppCompatHintHelper.onCreateInputConnection(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrW = cww.w(this)) != null) {
            czd.a(editorInfo, strArrW);
            inputConnectionOnCreateInputConnection = czi.a(inputConnectionOnCreateInputConnection, editorInfo, new cze(this, 0));
        }
        return this.mAppCompatEmojiEditTextHelper.onCreateInputConnection(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AppCompatReceiveContentHelper.maybeHandleDragEventViaPerformReceiveContent(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // defpackage.cvr
    public cuy onReceiveContent(cuy cuyVar) {
        return dad.a(this, cuyVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (AppCompatReceiveContentHelper.maybeHandleMenuActionViaPerformReceiveContent(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetCompoundDrawables();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(czu.e(this, callback));
    }

    @Override // android.support.v7.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.setEnabled(z);
    }

    @Override // android.widget.TextView
    public boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().setFontVariationSettings(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.getKeyListener(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            getSuperCaller().setTextClassifier(textClassifier);
        } else {
            appCompatTextClassifierHelper.setTextClassifier(textClassifier);
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

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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
        this.mTextClassifierHelper = new AppCompatTextClassifierHelper(this);
        this.mDefaultOnReceiveContentListener = new dad();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this);
        this.mAppCompatEmojiEditTextHelper = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.loadFromAttributes(attributeSet, i);
        initEmojiKeyListener(appCompatEmojiEditTextHelper);
    }
}
