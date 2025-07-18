package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
class mmm implements TextWatcher {
    final /* synthetic */ mmo a;
    private int b;
    private int c;

    public mmm(mmo mmoVar) {
        this.a = mmoVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.subSequence(this.b, this.c).toString().contains("\n")) {
            int i = this.c;
            if (editable.subSequence(i - 1, i).toString().equals("\n")) {
                this.a.b();
            }
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
