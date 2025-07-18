package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ili implements TextWatcher {
    final /* synthetic */ ayb a;
    final /* synthetic */ ill b;

    public ili(ayb aybVar, ill illVar) {
        this.a = aybVar;
        this.b = illVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        ayb aybVar = this.a;
        TextView textView = aybVar.u;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        ill illVar = this.b;
        TextView textView2 = aybVar.t;
        if (textView2 != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        textView.setVisibility(8);
        illVar.a().setVisibility(8);
    }
}
