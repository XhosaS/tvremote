package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.katniss.R;
import defpackage.afe;
import defpackage.alc;
import defpackage.arx;
import defpackage.asj;
import defpackage.le;
import defpackage.lq;
import defpackage.mr;
import defpackage.ms;
import defpackage.rq;
import defpackage.rs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatButton extends Button {
    public final le a;
    private final ms b;
    private lq c;
    private mr d;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private final lq c() {
        if (this.c == null) {
            this.c = new lq(this);
        }
        return this.c;
    }

    final mr a() {
        if (this.d == null) {
            this.d = new mr(this, new afe() { // from class: lf
                @Override // defpackage.afe
                public final void accept(Object obj) {
                    super/*android.widget.Button*/.setTypeface((Typeface) obj);
                }
            });
        }
        return this.d;
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
    public String getFontVariationSettings() {
        return a().b;
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
    public Typeface getTypeface() {
        return a().a;
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

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        asj asjVar = c().a;
        arx arxVar = arx.b;
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
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
    public final void setFilters(InputFilter[] inputFilterArr) {
        asj asjVar = c().a;
        arx arxVar = arx.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return a().b(str);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.b;
        if (msVar != null) {
            msVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        mr mrVarA = a();
        mrVarA.a = typeface;
        mrVarA.a(typeface);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rs.a(context);
        rq.d(this, getContext());
        le leVar = new le(this);
        this.a = leVar;
        leVar.d(attributeSet, i);
        ms msVar = new ms(this);
        this.b = msVar;
        msVar.c(attributeSet, i);
        msVar.a();
        c().a(attributeSet, i);
    }
}
