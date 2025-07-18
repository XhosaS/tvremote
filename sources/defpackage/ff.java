package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ff extends AutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final fg b;
    private final gi c;
    private final awy d;

    public ff(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
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
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return se.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ii.G(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.E(inputConnectionOnCreateInputConnection);
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

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ii.J(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(awy.D(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        gi giVar = this.c;
        if (giVar != null) {
            giVar.i(context, i);
        }
    }

    public ff(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.tv.remote.service.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        jn.a(context);
        jl.d(this, getContext());
        aps apsVarR = aps.r(getContext(), attributeSet, a, i, 0);
        if (apsVarR.o(0)) {
            setDropDownBackgroundDrawable(apsVarR.i(0));
        }
        apsVarR.m();
        fg fgVar = new fg(this);
        this.b = fgVar;
        fgVar.b(attributeSet, i);
        gi giVar = new gi(this);
        this.c = giVar;
        giVar.h(attributeSet, i);
        giVar.e();
        awy awyVar = new awy((EditText) this, (byte[]) null);
        this.d = awyVar;
        awyVar.B(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (awy.C(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerD = awy.D(keyListener);
            if (keyListenerD == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerD);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }
}
