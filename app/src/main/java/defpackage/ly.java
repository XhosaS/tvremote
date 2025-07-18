package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ly extends RadioButton implements ale {
    private final lj a;
    private final le b;
    private final ms c;
    private lq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        rs.a(context);
        rq.d(this, getContext());
        lj ljVar = new lj(this);
        this.a = ljVar;
        ljVar.b(attributeSet, R.attr.radioButtonStyle);
        le leVar = new le(this);
        this.b = leVar;
        leVar.d(attributeSet, R.attr.radioButtonStyle);
        ms msVar = new ms(this);
        this.c = msVar;
        msVar.c(attributeSet, R.attr.radioButtonStyle);
        c().a(attributeSet, R.attr.radioButtonStyle);
    }

    private final lq c() {
        if (this.d == null) {
            this.d = new lq(this);
        }
        return this.d;
    }

    @Override // defpackage.ale
    public final void a(PorterDuff.Mode mode) {
        throw null;
    }

    @Override // defpackage.ale
    public final void b() {
        throw null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        le leVar = this.b;
        if (leVar != null) {
            leVar.c();
        }
        ms msVar = this.c;
        if (msVar != null) {
            msVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        le leVar = this.b;
        if (leVar != null) {
            return leVar.a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        le leVar = this.b;
        if (leVar != null) {
            return leVar.b();
        }
        return null;
    }

    @Override // defpackage.ale
    public ColorStateList getSupportButtonTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        lj ljVar = this.a;
        if (ljVar != null) {
            return ljVar.a;
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
        asj asjVar = c().a;
        arx arxVar = arx.b;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        le leVar = this.b;
        if (leVar != null) {
            leVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ra.e().c(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.c;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.c;
        if (msVar != null) {
            msVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        asj asjVar = c().a;
        arx arxVar = arx.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        lj ljVar = this.a;
        if (ljVar != null) {
            ljVar.c();
        }
    }
}
