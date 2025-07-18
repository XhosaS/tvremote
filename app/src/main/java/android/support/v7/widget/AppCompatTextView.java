package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.acy;
import defpackage.adg;
import defpackage.aev;
import defpackage.afe;
import defpackage.alc;
import defpackage.arx;
import defpackage.asj;
import defpackage.le;
import defpackage.lq;
import defpackage.lr;
import defpackage.mr;
import defpackage.ms;
import defpackage.mu;
import defpackage.mv;
import defpackage.mw;
import defpackage.ra;
import defpackage.rq;
import defpackage.rs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final le a;
    private final ms b;
    private lq c;
    private boolean d;
    private mr e;
    private mu f;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private final lq a() {
        if (this.c == null) {
            this.c = new lq(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        le leVar = this.a;
        if (leVar != null) {
            leVar.c();
        }
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    public final mr f() {
        if (this.e == null) {
            this.e = new mr(this, new afe() { // from class: mt
                @Override // defpackage.afe
                public final void accept(Object obj) {
                    super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                }
            });
        }
        return this.e;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        alc.c(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return f().b;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        le leVar = this.a;
        if (leVar != null) {
            return leVar.a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        le leVar = this.a;
        if (leVar != null) {
            return leVar.b();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public aev getTextMetricsParamsCompat() {
        return new aev(getTextMetricsParams());
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return f().a;
    }

    final mu k() {
        if (this.f == null) {
            this.f = Build.VERSION.SDK_INT >= 34 ? new mw(this) : new mv(this);
        }
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ms msVar = this.b;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        msVar.e(this, inputConnectionOnCreateInputConnection, editorInfo);
        lr.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        asj asjVar = a().a;
        arx arxVar = arx.b;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        le leVar = this.a;
        if (leVar != null) {
            leVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        le leVar = this.a;
        if (leVar != null) {
            leVar.e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ra.e().c(context, i) : null, i2 != 0 ? ra.e().c(context, i2) : null, i3 != 0 ? ra.e().c(context, i3) : null, i4 != 0 ? ra.e().c(context, i4) : null);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ra.e().c(context, i) : null, i2 != 0 ? ra.e().c(context, i2) : null, i3 != 0 ? ra.e().c(context, i3) : null, i4 != 0 ? ra.e().c(context, i4) : null);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        asj asjVar = a().a;
        arx arxVar = arx.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        k().a(i);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return f().b(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        k().b(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        alc.a(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        mr mrVarF = f();
        mrVarF.a = typeface;
        mrVarF.a(typeface);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            k().c(i, f);
        } else {
            alc.b(this, i, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rs.a(context);
        this.d = false;
        this.f = null;
        rq.d(this, getContext());
        le leVar = new le(this);
        this.a = leVar;
        leVar.d(attributeSet, i);
        ms msVar = new ms(this);
        this.b = msVar;
        msVar.c(attributeSet, i);
        msVar.a();
        a().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.d) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            adg adgVar = acy.a;
            if (context != null) {
                typeface = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        this.d = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.d = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.a();
        }
    }
}
