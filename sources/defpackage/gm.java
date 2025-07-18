package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
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
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gm extends TextView {
    private final fg a;
    private final gi b;
    private boolean c;
    private gh d;
    private gj e;
    private final cih f;
    private asv g;

    public gm(Context context) {
        this(context, null);
    }

    private final asv a() {
        if (this.g == null) {
            this.g = new asv((Object) this, (byte[]) null);
        }
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.a();
        }
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    final gh g() {
        if (this.d == null) {
            this.d = new gh(this, new r(this, 8));
        }
        return this.d;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (kc.c) {
            return super.getAutoSizeMaxTextSize();
        }
        gi giVar = this.b;
        if (giVar != null) {
            return giVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (kc.c) {
            return super.getAutoSizeMinTextSize();
        }
        gi giVar = this.b;
        if (giVar != null) {
            return giVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (kc.c) {
            return super.getAutoSizeStepGranularity();
        }
        gi giVar = this.b;
        if (giVar != null) {
            return giVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (kc.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        gi giVar = this.b;
        return giVar != null ? giVar.p() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (kc.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        gi giVar = this.b;
        if (giVar != null) {
            return giVar.d();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return se.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return g().b;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        cih cihVar;
        return (Build.VERSION.SDK_INT >= 28 || (cihVar = this.f) == null) ? super.getTextClassifier() : cihVar.g();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? g().a : super.getTypeface();
    }

    final gj l() {
        gj gjVar;
        if (this.e == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                gjVar = new gl(this);
            } else if (Build.VERSION.SDK_INT >= 28) {
                gjVar = new gk(this);
            } else if (Build.VERSION.SDK_INT >= 26) {
                gjVar = new gj(this);
            }
            this.e = gjVar;
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        gi.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        ii.G(inputConnectionOnCreateInputConnection, editorInfo, this);
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
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.q();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        gi giVar = this.b;
        if (giVar == null || kc.c || !giVar.o()) {
            return;
        }
        giVar.g();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        ue ueVar = ue.b;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (kc.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        gi giVar = this.b;
        if (giVar != null) {
            giVar.k(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (kc.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        gi giVar = this.b;
        if (giVar != null) {
            giVar.l(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (kc.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        gi giVar = this.b;
        if (giVar != null) {
            giVar.m(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ii.J(context, i) : null, i2 != 0 ? ii.J(context, i2) : null, i3 != 0 ? ii.J(context, i3) : null, i4 != 0 ? ii.J(context, i4) : null);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ii.J(context, i) : null, i2 != 0 ? ii.J(context, i2) : null, i3 != 0 ? ii.J(context, i3) : null, i4 != 0 ? ii.J(context, i4) : null);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(se.c(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        ue ueVar = ue.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            l().a(i);
        } else {
            se.d(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return g().b(str);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            l().b(i);
        } else {
            se.e(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        se.f(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        cih cihVar;
        if (Build.VERSION.SDK_INT >= 28 || (cihVar = this.f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            cihVar.b = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (kc.c) {
            super.setTextSize(i, f);
            return;
        }
        gi giVar = this.b;
        if (giVar != null) {
            giVar.n(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            g().a(typeface);
        } else {
            super.setTypeface(typeface);
        }
    }

    public gm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            l().c(i, f);
        } else {
            se.g(this, i, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        jn.a(context);
        this.c = false;
        this.e = null;
        jl.d(this, getContext());
        fg fgVar = new fg(this);
        this.a = fgVar;
        fgVar.b(attributeSet, i);
        gi giVar = new gi(this);
        this.b = giVar;
        giVar.h(attributeSet, i);
        giVar.e();
        this.f = new cih(this);
        a().W(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.c) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            od odVar = nv.a;
            if (context != null) {
                typeface = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        this.c = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.e();
        }
    }
}
