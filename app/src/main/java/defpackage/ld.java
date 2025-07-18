package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ld extends AutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final le b;
    private final ms c;
    private final lp d;

    public ld(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        alc.c(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lr.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.a.a(inputConnectionOnCreateInputConnection);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ra.e().c(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.d.a(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.c;
        if (msVar != null) {
            msVar.d(context, i);
        }
    }

    public ld(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.katniss.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        rs.a(context);
        rq.d(this, getContext());
        rv rvVarF = rv.f(getContext(), attributeSet, a, i, 0);
        if (rvVarF.b.hasValue(0)) {
            setDropDownBackgroundDrawable(rvVarF.b(0));
        }
        rvVarF.b.recycle();
        le leVar = new le(this);
        this.b = leVar;
        leVar.d(attributeSet, i);
        ms msVar = new ms(this);
        this.c = msVar;
        msVar.c(attributeSet, i);
        msVar.a();
        lp lpVar = new lp(this);
        this.d = lpVar;
        lpVar.b(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (lpVar.c(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = lpVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }
}
