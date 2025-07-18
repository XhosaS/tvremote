package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aub extends auh {
    private CharSequence a;
    private CharSequence b;
    private CharSequence c;
    private int d;
    private int e;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        ee().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlayLeanback;
        }
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(ee(), i)).inflate(R.layout.leanback_edit_preference_fragment, viewGroup, false);
        if (!TextUtils.isEmpty(this.a)) {
            ((TextView) viewInflate.findViewById(R.id.decor_title)).setText(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            TextView textView = (TextView) viewInflate.findViewById(android.R.id.message);
            textView.setVisibility(0);
            textView.setText(this.b);
        }
        EditText editText = (EditText) viewInflate.findViewById(android.R.id.edit);
        editText.setInputType(this.e);
        editText.setImeOptions(this.d);
        if (!TextUtils.isEmpty(this.c)) {
            editText.setText(this.c);
        }
        editText.setOnEditorActionListener(new aua(this));
        return viewInflate;
    }

    @Override // defpackage.auh, defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        if (bundle != null) {
            this.a = bundle.getCharSequence("LeanbackEditPreferenceDialog.title");
            this.b = bundle.getCharSequence("LeanbackEditPreferenceDialog.message");
            this.c = bundle.getCharSequence("LeanbackEditPreferenceDialog.text");
            this.e = bundle.getInt("LeanbackEditPreferenceDialog.inputType", 1);
            this.d = bundle.getInt("LeanbackEditPreferenceDialog.imeOptions", 2);
            return;
        }
        DialogPreference dialogPreferenceL = l();
        this.a = dialogPreferenceL.a;
        this.b = dialogPreferenceL.b;
        if (!(dialogPreferenceL instanceof EditTextPreference)) {
            throw new IllegalArgumentException("Preference must be a EditTextPreference");
        }
        this.a = dialogPreferenceL.a;
        this.b = dialogPreferenceL.b;
        this.c = ((EditTextPreference) dialogPreferenceL).g;
        this.e = dialogPreferenceL.p().getInt("input_type", 1);
        this.d = dialogPreferenceL.p().getInt("ime_option", 2);
    }

    @Override // defpackage.bq
    public final void g(Bundle bundle) {
        bundle.putCharSequence("LeanbackEditPreferenceDialog.title", this.a);
        bundle.putCharSequence("LeanbackEditPreferenceDialog.message", this.b);
        bundle.putCharSequence("LeanbackEditPreferenceDialog.text", this.c);
        bundle.putInt("LeanbackEditPreferenceDialog.inputType", this.e);
        bundle.putInt("LeanbackEditPreferenceDialog.imeOptions", this.d);
    }

    @Override // defpackage.bq
    public final void h() {
        this.P = true;
        EditText editText = (EditText) this.R.findViewById(android.R.id.edit);
        InputMethodManager inputMethodManager = (InputMethodManager) ee().getSystemService("input_method");
        editText.requestFocus();
        inputMethodManager.showSoftInput(editText, 0);
    }
}
