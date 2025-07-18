package defpackage;

import android.text.Editable;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
class mnv extends ela {
    private int b;
    private int c;
    private final ogq d;
    private final oaa e;
    private final oal f;

    public mnv(ogq ogqVar, oaa oaaVar, oal oalVar) {
        this.d = ogqVar;
        this.e = oaaVar;
        this.f = oalVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        if (editable.subSequence(this.b, this.c).toString().contains("\n")) {
            int i = this.c;
            if (!editable.subSequence(i - 1, i).toString().equals("\n") || (editText = this.a) == null) {
                return;
            }
            this.e.a(this.d.a(), mny.b(editText, ((nyx) this.f).q, 21)).k();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b = i;
        this.c = i + i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
