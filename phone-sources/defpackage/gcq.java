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
public final class gcq extends gde {
    private EditText a;
    private CharSequence b;
    private final Runnable c = new foe(this, 18, null);
    private long d = -1;

    private final EditTextPreference g() {
        return (EditTextPreference) f();
    }

    private final void h(boolean z) {
        this.d = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // defpackage.gde
    protected final void a(View view) {
        super.a(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.a = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.a.setText(this.b);
        EditText editText2 = this.a;
        editText2.setSelection(editText2.getText().length());
        g();
    }

    @Override // defpackage.gde
    public final void b(boolean z) {
        if (z) {
            String string = this.a.getText().toString();
            EditTextPreference editTextPreferenceG = g();
            editTextPreferenceG.Q(string);
            editTextPreferenceG.i(string);
        }
    }

    @Override // defpackage.gde
    protected final void c() {
        h(true);
        d();
    }

    public final void d() {
        long j = this.d;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.a;
        if (editText == null || !editText.isFocused()) {
            h(false);
            return;
        }
        if (((InputMethodManager) this.a.getContext().getSystemService("input_method")).showSoftInput(this.a, 0)) {
            h(false);
            return;
        }
        EditText editText2 = this.a;
        Runnable runnable = this.c;
        editText2.removeCallbacks(runnable);
        this.a.postDelayed(runnable, 50L);
    }

    @Override // defpackage.gde
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.gde, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.b = g().g;
        } else {
            this.b = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.gde, defpackage.bl, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.b);
    }
}
