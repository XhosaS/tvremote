package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes.dex */
class mxt extends Editable.Factory {
    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        return new mxw(charSequence);
    }
}
