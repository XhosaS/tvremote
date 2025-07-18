package android.support.v7.widget;

import android.content.res.TypedArray;
import android.support.v7.appcompat.R;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.dhg;
import defpackage.dhk;
import defpackage.dhm;
import defpackage.dhn;
import defpackage.dhr;

/* compiled from: PG */
/* loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {
    private final dhk mEmojiEditTextHelper;
    private final EditText mView;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new dhk(editText);
    }

    public KeyListener getKeyListener(KeyListener keyListener) {
        if (isEmojiCapableKeyListener(keyListener) && !(keyListener instanceof dhn)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new dhn(keyListener);
            }
        }
        return keyListener;
    }

    public boolean isEmojiCapableKeyListener(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean isEnabled() {
        return ((dhr) this.mEmojiEditTextHelper.b).a;
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof dhm) ? new dhm((TextView) this.mEmojiEditTextHelper.a, inputConnection) : inputConnection;
    }

    public void setEnabled(boolean z) {
        dhr dhrVar = (dhr) this.mEmojiEditTextHelper.b;
        if (dhrVar.a != z) {
            dhrVar.a = z;
            if (z) {
                dhg.a();
                throw null;
            }
        }
    }
}
