package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ft extends RadioButton {
    private final fl a;
    private final fg b;
    private final gi c;
    private asv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.radioButtonStyle);
        jn.a(context);
        jl.d(this, getContext());
        fl flVar = new fl(this);
        this.a = flVar;
        flVar.b(attributeSet, R.attr.radioButtonStyle);
        fg fgVar = new fg(this);
        this.b = fgVar;
        fgVar.b(attributeSet, R.attr.radioButtonStyle);
        gi giVar = new gi(this);
        this.c = giVar;
        giVar.h(attributeSet, R.attr.radioButtonStyle);
        a().W(attributeSet, R.attr.radioButtonStyle);
    }

    private final asv a() {
        if (this.d == null) {
            this.d = new asv((Object) this, (byte[]) null);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        fg fgVar = this.b;
        if (fgVar != null) {
            fgVar.a();
        }
        gi giVar = this.c;
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

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fg fgVar = this.b;
        if (fgVar != null) {
            fgVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fg fgVar = this.b;
        if (fgVar != null) {
            fgVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(ii.J(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.c;
        if (giVar != null) {
            giVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        gi giVar = this.c;
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

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        fl flVar = this.a;
        if (flVar != null) {
            flVar.c();
        }
    }
}
