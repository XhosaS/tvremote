package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class toj implements TextWatcher {
    boolean a = false;
    String b = "";
    int c;
    int d;
    final /* synthetic */ tok e;

    public toj(tok tokVar) {
        this.e = tokVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            this.a = false;
            return;
        }
        int i = this.c;
        if (i != 0) {
            this.a = true;
            editable.replace(0, i, "");
        } else if (this.d < editable.length()) {
            this.a = true;
            editable.replace(this.d, editable.length(), "");
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a) {
            return;
        }
        this.b = charSequence.subSequence(i, i2 + i).toString();
        this.c = i;
        this.d = i + i3;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (this.a) {
            return;
        }
        int i5 = 0;
        while (true) {
            i4 = i + i5;
            if (i5 >= this.b.length() || i5 >= i3 || this.b.charAt(i5) != charSequence.charAt(i4)) {
                break;
            } else {
                i5++;
            }
        }
        this.b = "";
        while (i5 < i2) {
            this.e.d.e(67);
            i5++;
        }
        this.e.d.f(charSequence.subSequence(i4, i + i3).toString());
    }
}
