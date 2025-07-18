package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.method.MovementMethod;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxx extends AppCompatTextView {
    private static final mxv f = new mxv();
    private static final mxt g = new mxt();
    public mxq a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final boolean e;

    public mxx(Context context) {
        super(context);
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public final Layout a(CharSequence charSequence) {
        return new StaticLayout(charSequence, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), 0.0f, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i) {
        addOnLayoutChangeListener(new mxr(this, i, charSequence, charSequence2));
    }

    public Editable.Factory getEditableFactory() {
        return g;
    }

    public boolean getEnableTextV2TruncationStyleFix() {
        return false;
    }

    public boolean getEnableWebSearchForSelectableText() {
        return false;
    }

    public Spannable.Factory getSpannableFactory() {
        return f;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        MovementMethod movementMethod = getMovementMethod();
        setTextIsSelectable(false);
        setTextIsSelectable(this.d);
        setMovementMethod(movementMethod);
        super.onAttachedToWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        mxq mxqVar = this.a;
        if (mxqVar == null) {
            super.onDraw(canvas);
            return;
        }
        mxqVar.d();
        this.a.a(canvas);
        super.onDraw(canvas);
        this.a.c();
        this.a.d();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.c = false;
        super.onTouchEvent(motionEvent);
        if (this.c || isTextSelectable()) {
            return true;
        }
        return performClick();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }
}
