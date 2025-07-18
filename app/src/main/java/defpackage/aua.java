package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
class aua implements TextView.OnEditorActionListener {
    final /* synthetic */ aub a;

    public aua(aub aubVar) {
        this.a = aubVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 2 && i != 3 && i != 5 && i != 4) {
            return false;
        }
        aub aubVar = this.a;
        ((InputMethodManager) aubVar.ee().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        ((EditTextPreference) aubVar.l()).i(textView.getText().toString());
        aubVar.C.G();
        return true;
    }
}
