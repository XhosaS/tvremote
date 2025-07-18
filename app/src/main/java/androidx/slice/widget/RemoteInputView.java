package androidx.slice.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.katniss.R;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteInputView extends LinearLayout implements View.OnClickListener, TextWatcher {
    public RemoteEditText a;
    private ImageButton b;

    /* compiled from: PG */
    public class RemoteEditText extends EditText {
        RemoteInputView a;

        public RemoteEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            getBackground();
        }

        private final void b() {
            if (this.a != null || isTemporarilyDetached()) {
                isTemporarilyDetached();
                return;
            }
            if (isFocusable() && isEnabled()) {
                a();
                RemoteInputView remoteInputView = this.a;
                if (remoteInputView != null) {
                    remoteInputView.setVisibility(4);
                }
            }
        }

        final void a() {
            setFocusableInTouchMode(false);
            setFocusable(false);
            setCursorVisible(false);
            setBackground(null);
        }

        @Override // android.widget.TextView, android.view.View
        public final void getFocusedRect(Rect rect) {
            super.getFocusedRect(rect);
            rect.top = getScrollY();
            rect.bottom = getScrollY() + (getBottom() - getTop());
        }

        @Override // android.widget.TextView
        public final void onCommitCompletion(CompletionInfo completionInfo) {
            clearComposingText();
            setText(completionInfo.getText());
            setSelection(getText().length());
        }

        @Override // android.widget.TextView, android.view.View
        protected final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            if (z) {
                return;
            }
            b();
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyUp(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return super.onKeyUp(i, keyEvent);
            }
            b();
            return true;
        }

        @Override // android.widget.TextView, android.view.View
        protected final void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            if (isShown()) {
                return;
            }
            b();
        }
    }

    public RemoteInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.setEnabled(this.a.getText().length() != 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchFinishTemporaryDetach() {
        if (isAttachedToWindow()) {
            RemoteEditText remoteEditText = this.a;
            attachViewToParent(remoteEditText, 0, remoteEditText.getLayoutParams());
        } else {
            removeDetachedView(this.a, false);
        }
        super.dispatchFinishTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach();
        detachViewFromParent(this.a);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.b) {
            return;
        }
        new Bundle();
        throw null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ImageButton imageButton = (ImageButton) findViewById(R.id.remote_input_send);
        this.b = imageButton;
        imageButton.setOnClickListener(this);
        RemoteEditText remoteEditText = (RemoteEditText) getChildAt(0);
        this.a = remoteEditText;
        remoteEditText.setOnEditorActionListener(new brg(this));
        this.a.addTextChangedListener(this);
        this.a.a();
        this.a.a = this;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
