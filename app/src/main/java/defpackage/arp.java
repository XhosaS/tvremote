package defpackage;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arp {
    public int a = Integer.MAX_VALUE;
    public int b = 0;
    public final aru c;
    private final EditText d;

    public arp(EditText editText) {
        this.d = editText;
        aru aruVar = new aru(editText);
        this.c = aruVar;
        editText.addTextChangedListener(aruVar);
        editText.setEditableFactory(arq.a());
    }

    public final KeyListener a(KeyListener keyListener) {
        return keyListener instanceof ars ? keyListener : new ars(keyListener);
    }

    public final InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof arr ? inputConnection : new arr(this.d, inputConnection, editorInfo);
    }
}
