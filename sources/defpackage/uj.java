package defpackage;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uj extends InputConnectionWrapper {
    private final TextView a;

    public uj(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = textView;
        ue ueVar = ue.b;
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return qk.m(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return qk.m(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
