package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fj extends CheckedTextView {
    private final fk a;
    private final fg b;
    private final gi c;
    private asv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        jn.a(context);
        jl.d(this, getContext());
        gi giVar = new gi(this);
        this.c = giVar;
        giVar.h(attributeSet, R.attr.checkedTextViewStyle);
        giVar.e();
        fg fgVar = new fg(this);
        this.b = fgVar;
        fgVar.b(attributeSet, R.attr.checkedTextViewStyle);
        fk fkVar = new fk(this);
        this.a = fkVar;
        fkVar.b(attributeSet);
        a().W(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final asv a() {
        if (this.d == null) {
            this.d = new asv((Object) this, (byte[]) null);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        gi giVar = this.c;
        if (giVar != null) {
            giVar.e();
        }
        fg fgVar = this.b;
        if (fgVar != null) {
            fgVar.a();
        }
        fk fkVar = this.a;
        if (fkVar != null) {
            fkVar.a();
        }
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return se.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ii.G(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ii.J(getContext(), i));
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
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(se.c(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        gi giVar = this.c;
        if (giVar != null) {
            giVar.i(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        fk fkVar = this.a;
        if (fkVar != null) {
            if (fkVar.a) {
                fkVar.a = false;
            } else {
                fkVar.a = true;
                fkVar.a();
            }
        }
    }
}
