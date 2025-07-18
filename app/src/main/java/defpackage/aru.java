package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aru implements TextWatcher {
    private final EditText c;
    private aqu d;
    public int a = Integer.MAX_VALUE;
    private int e = 0;
    private int f = 0;
    public int b = 0;

    public aru(EditText editText) {
        this.c = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.c;
        if (editText.isInEditMode()) {
            return;
        }
        int i = this.e;
        int i2 = this.f;
        if (i2 > 0) {
            int iA = aqy.b().a();
            if (iA != 0) {
                if (iA == 1) {
                    aqy.b().c(editable, i, i + i2, this.a, this.b);
                    return;
                } else if (iA != 3) {
                    return;
                }
            }
            aqy aqyVarB = aqy.b();
            if (this.d == null) {
                this.d = new art(editText);
            }
            aqyVarB.d(this.d);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.e = i;
        if (i2 > i3) {
            i3 = 0;
        }
        this.f = i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
