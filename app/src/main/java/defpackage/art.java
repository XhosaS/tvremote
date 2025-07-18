package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class art extends aqu implements Runnable {
    private final Reference a;

    public art(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.aqu
    public final void a() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText = (EditText) this.a.get();
        if (editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        aqy.b().f(editableText, editableText == null ? 0 : editableText.length());
        if (selectionStart >= 0 && selectionEnd >= 0) {
            Selection.setSelection(editableText, selectionStart, selectionEnd);
        } else if (selectionStart >= 0) {
            Selection.setSelection(editableText, selectionStart);
        } else if (selectionEnd >= 0) {
            Selection.setSelection(editableText, selectionEnd);
        }
    }
}
