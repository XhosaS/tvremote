package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwz implements TextWatcher {
    final /* synthetic */ hxr a;

    public hwz(hxr hxrVar) {
        this.a = hxrVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        hxr hxrVar = this.a;
        hxrVar.Y();
        hxrVar.ai = true;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
