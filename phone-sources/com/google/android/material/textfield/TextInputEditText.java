package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.videos.R;
import defpackage.sil;
import defpackage.suy;
import defpackage.tcv;
import defpackage.tde;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TextInputEditText extends AppCompatEditText {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private final TextInputLayout a() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean b(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayoutA = a();
        if (!b(textInputLayoutA) || rect == null) {
            return;
        }
        Rect rect2 = this.a;
        textInputLayoutA.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayoutA = a();
        if (!b(textInputLayoutA)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayoutA.getGlobalVisibleRect(rect, point);
        if (!globalVisibleRect || point == null) {
            return globalVisibleRect;
        }
        point.offset(-getScrollX(), -getScrollY());
        return true;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout textInputLayoutA = a();
        return (textInputLayoutA == null || !textInputLayoutA.l) ? super.getHint() : textInputLayoutA.d();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutA = a();
        if (textInputLayoutA != null && textInputLayoutA.l && super.getHint() == null && sil.q()) {
            setHint("");
        }
    }

    @Override // android.support.v7.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout textInputLayoutA = a();
            editorInfo.hintText = textInputLayoutA != null ? textInputLayoutA.d() : null;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayoutA = a();
        if (!b(textInputLayoutA) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayoutA.getHeight() - getHeight();
        Rect rect2 = this.a;
        rect2.set(rect.left, rect.top, rect.right, rect.bottom + height);
        return super.requestRectangleOnScreen(rect2);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray typedArrayA = suy.a(context, attributeSet, tcv.b, i, R.style.Widget_Design_TextInputEditText, new int[0]);
        this.b = typedArrayA.getBoolean(0, false);
        typedArrayA.recycle();
    }
}
