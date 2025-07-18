package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tcl extends sux {
    final /* synthetic */ tcn a;

    public tcl(tcn tcnVar) {
        this.a = tcnVar;
    }

    @Override // defpackage.sux, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.sux, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
