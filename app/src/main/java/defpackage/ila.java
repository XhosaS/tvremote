package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ila implements TextWatcher {
    final /* synthetic */ ayb a;
    final /* synthetic */ ild b;

    public ila(ayb aybVar, ild ildVar) {
        this.a = aybVar;
        this.b = ildVar;
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
        ild ildVar = this.b;
        TextView textView2 = aybVar.t;
        if (textView2 != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        textView.setVisibility(8);
        ildVar.a().setVisibility(8);
    }
}
