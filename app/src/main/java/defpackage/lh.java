package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lh extends CheckedTextView {
    private final li a;
    private final le b;
    private final ms c;
    private lq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        rs.a(context);
        rq.d(this, getContext());
        ms msVar = new ms(this);
        this.c = msVar;
        msVar.c(attributeSet, R.attr.checkedTextViewStyle);
        msVar.a();
        le leVar = new le(this);
        this.b = leVar;
        leVar.d(attributeSet, R.attr.checkedTextViewStyle);
        li liVar = new li(this);
        this.a = liVar;
        liVar.a(attributeSet);
        a().a(attributeSet, R.attr.checkedTextViewStyle);
    }

    private final lq a() {
        if (this.d == null) {
            this.d = new lq(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ms msVar = this.c;
        if (msVar != null) {
            msVar.a();
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.c();
        }
        li liVar = this.a;
        if (liVar != null) {
            liVar.a.getCheckMarkDrawable();
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

    public ColorStateList getSupportCheckMarkTintList() {
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        asj asjVar = a().a;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ra.e().c(getContext(), i));
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.c;
        if (msVar != null) {
            msVar.d(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        li liVar = this.a;
        if (liVar != null) {
            if (liVar.b) {
                liVar.b = false;
            } else {
                liVar.b = true;
                liVar.a.getCheckMarkDrawable();
            }
        }
    }
}
