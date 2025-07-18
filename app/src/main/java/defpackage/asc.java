package defpackage;

import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asc {
    public final ask a;
    private final EditText b;

    public asc(EditText editText) {
        this.b = editText;
        ask askVar = new ask(editText);
        this.a = askVar;
        editText.addTextChangedListener(askVar);
        editText.setEditableFactory(asd.a());
    }

    public final InputConnection a(InputConnection inputConnection) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof ase ? inputConnection : new ase(this.b, inputConnection);
    }
}
