package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bhw extends bim {
    private EditText ah;
    private CharSequence ai;
    private final Runnable aj = new bhv(this);
    private long ak = -1;

    private final void aH(boolean z) {
        this.ak = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // defpackage.bim
    protected final void aB(View view) {
        super.aB(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ah = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ah.setText(this.ai);
        EditText editText2 = this.ah;
        editText2.setSelection(editText2.getText().length());
    }

    @Override // defpackage.bim
    public final void aC(boolean z) {
        if (z) {
            String string = this.ah.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) aG();
            if (editTextPreference.M(string)) {
                editTextPreference.i(string);
            }
        }
    }

    @Override // defpackage.bim
    protected final void aD() {
        aH(true);
        aE();
    }

    final void aE() {
        long j = this.ak;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.ah;
        if (editText == null || !editText.isFocused()) {
            aH(false);
            return;
        }
        if (((InputMethodManager) this.ah.getContext().getSystemService("input_method")).showSoftInput(this.ah, 0)) {
            aH(false);
            return;
        }
        EditText editText2 = this.ah;
        Runnable runnable = this.aj;
        editText2.removeCallbacks(runnable);
        this.ah.postDelayed(runnable, 50L);
    }

    @Override // defpackage.bim
    protected final boolean aF() {
        return true;
    }

    @Override // defpackage.bim, defpackage.bf, defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        if (bundle == null) {
            this.ai = ((EditTextPreference) aG()).g;
        } else {
            this.ai = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.bim, defpackage.bf, defpackage.bq
    public final void g(Bundle bundle) {
        super.g(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ai);
    }
}
