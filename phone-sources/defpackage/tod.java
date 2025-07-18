package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tod implements TextWatcher {
    final /* synthetic */ tof a;
    private final int b;

    public tod(tof tofVar, int i) {
        this.a = tofVar;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Boolean bool;
        int i4;
        tof tofVar = this.a;
        Button button = tofVar.a;
        Iterator it = tofVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = true;
                break;
            } else if (((EditText) it.next()).getText().length() == 0) {
                bool = false;
                break;
            }
        }
        button.setEnabled(bool.booleanValue());
        if (charSequence.length() <= 0 || (i4 = this.b + 1) >= tofVar.b.size()) {
            return;
        }
        ((EditText) tofVar.b.get(i4)).requestFocus();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
