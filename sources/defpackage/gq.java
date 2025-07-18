package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gq extends ToggleButton {
    private final fg a;
    private final gi b;
    private asv c;

    public gq(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        jl.d(this, getContext());
        fg fgVar = new fg(this);
        this.a = fgVar;
        fgVar.b(attributeSet, R.attr.buttonStyleToggle);
        gi giVar = new gi(this);
        this.b = giVar;
        giVar.h(attributeSet, R.attr.buttonStyleToggle);
        a().W(attributeSet, R.attr.buttonStyleToggle);
    }

    private final asv a() {
        if (this.c == null) {
            this.c = new asv((Object) this, (byte[]) null);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        ue ueVar = ue.b;
    }

    @Override // android.widget.ToggleButton, android.view.View
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
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        ue ueVar = ue.b;
        super.setFilters(inputFilterArr);
    }
}
