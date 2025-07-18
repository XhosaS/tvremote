package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.axk;
import defpackage.axl;
import defpackage.axr;
import defpackage.axt;
import defpackage.ayf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GuidedActionEditText extends EditText implements ayf, axr {
    private final Drawable a;
    private final Drawable b;
    private axl c;
    private axk d;

    public GuidedActionEditText(Context context) {
        this(context, null);
    }

    @Override // defpackage.axr
    public final void a(axk axkVar) {
        this.d = axkVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        axk axkVar = this.d;
        if (axkVar != null) {
            axkVar.a(this);
        }
    }

    @Override // defpackage.ayf
    public final void b(axl axlVar) {
        this.c = axlVar;
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setBackground(this.a);
        } else {
            setBackground(this.b);
            setFocusable(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        axl axlVar = this.c;
        if (axlVar == null || !axlVar.a(this, i, keyEvent)) {
            return super.onKeyPreIme(i, keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isInTouchMode() || isFocusableInTouchMode() || isTextSelectable()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getBackground();
        axt axtVar = new axt();
        this.b = axtVar;
        setBackground(axtVar);
    }
}
