package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class toc implements View.OnKeyListener {
    final /* synthetic */ tof a;
    private final int b;

    public toc(tof tofVar, int i) {
        this.a = tofVar;
        this.b = i;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (i != 67 || keyEvent.getAction() != 0 || (i2 = this.b) <= 0) {
            return false;
        }
        tof tofVar = this.a;
        if (((EditText) tofVar.b.get(i2)).getSelectionEnd() != 0) {
            return false;
        }
        EditText editText = (EditText) tofVar.b.get(i2 - 1);
        editText.requestFocus();
        editText.getText().clear();
        return true;
    }
}
