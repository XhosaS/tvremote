package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public class my extends ToggleButton {
    private final le a;
    private final ms b;
    private lq c;

    public my(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        rq.d(this, getContext());
        le leVar = new le(this);
        this.a = leVar;
        leVar.d(attributeSet, R.attr.buttonStyleToggle);
        ms msVar = new ms(this);
        this.b = msVar;
        msVar.c(attributeSet, R.attr.buttonStyleToggle);
        a().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private final lq a() {
        if (this.c == null) {
            this.c = new lq(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        asj asjVar = a().a;
        arx arxVar = arx.b;
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setFilters(InputFilter[] inputFilterArr) {
        asj asjVar = a().a;
        arx arxVar = arx.b;
        super.setFilters(inputFilterArr);
    }
}
