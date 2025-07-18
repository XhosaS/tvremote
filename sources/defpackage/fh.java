package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.tv.remote.service.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fh extends Button {
    public final fg a;
    private final gi b;
    private gh c;
    private asv d;

    public fh(Context context) {
        this(context, null);
    }

    private final asv c() {
        if (this.d == null) {
            this.d = new asv((Object) this, (byte[]) null);
        }
        return this.d;
    }

    final gh aO() {
        if (this.c == null) {
            this.c = new gh(this, new r(this, 6));
        }
        return this.c;
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
    public final String getFontVariationSettings() {
        return aO().b;
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? aO().a : super.getTypeface();
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
        gi giVar = this.b;
        if (giVar != null) {
            giVar.q();
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
        c();
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
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fg fgVar = this.a;
        if (fgVar != null) {
            fgVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(se.c(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        ue ueVar = ue.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return aO().b(str);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        gi giVar = this.b;
        if (giVar != null) {
            giVar.i(context, i);
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
            aO().a(typeface);
        } else {
            super.setTypeface(typeface);
        }
    }

    public fh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        jn.a(context);
        jl.d(this, getContext());
        fg fgVar = new fg(this);
        this.a = fgVar;
        fgVar.b(attributeSet, i);
        gi giVar = new gi(this);
        this.b = giVar;
        giVar.h(attributeSet, i);
        giVar.e();
        c().W(attributeSet, i);
    }
}
