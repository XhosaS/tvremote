package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import com.google.android.katniss.R;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aug extends auh {
    Set a;
    private String ah;
    private boolean b;
    private CharSequence[] c;
    private CharSequence[] d;
    private CharSequence e;
    private CharSequence f;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        ee().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlayLeanback;
        }
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(ee(), i)).inflate(R.layout.leanback_list_preference_fragment, viewGroup, false);
        VerticalGridView verticalGridView = (VerticalGridView) viewInflate.findViewById(android.R.id.list);
        verticalGridView.setWindowAlignment(3);
        verticalGridView.setFocusScrollStrategy(0);
        verticalGridView.ag(this.b ? new auc(this, this.c, this.d, this.a) : new aud(this, this.c, this.d, this.ah));
        verticalGridView.requestFocus();
        CharSequence charSequence = this.e;
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) viewInflate.findViewById(R.id.decor_title)).setText(charSequence);
        }
        CharSequence charSequence2 = this.f;
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView = (TextView) viewInflate.findViewById(android.R.id.message);
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        return viewInflate;
    }

    @Override // defpackage.auh, defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        if (bundle != null) {
            this.e = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.title");
            this.f = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.message");
            this.b = bundle.getBoolean("LeanbackListPreferenceDialogFragment.isMulti");
            this.c = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entries");
            this.d = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues");
            if (!this.b) {
                this.ah = bundle.getString("LeanbackListPreferenceDialogFragment.initialSelection");
                return;
            }
            String[] stringArray = bundle.getStringArray("LeanbackListPreferenceDialogFragment.initialSelections");
            wg wgVar = new wg(stringArray != null ? stringArray.length : 0);
            this.a = wgVar;
            if (stringArray != null) {
                Collections.addAll(wgVar, stringArray);
                return;
            }
            return;
        }
        DialogPreference dialogPreferenceL = l();
        this.e = dialogPreferenceL.a;
        this.f = dialogPreferenceL.b;
        if (dialogPreferenceL instanceof ListPreference) {
            this.b = false;
            ListPreference listPreference = (ListPreference) dialogPreferenceL;
            this.c = listPreference.g;
            this.d = listPreference.h;
            this.ah = listPreference.i;
            return;
        }
        if (!(dialogPreferenceL instanceof MultiSelectListPreference)) {
            throw new IllegalArgumentException("Preference must be a ListPreference or MultiSelectListPreference");
        }
        this.b = true;
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) dialogPreferenceL;
        this.c = multiSelectListPreference.g;
        this.d = multiSelectListPreference.h;
        this.a = multiSelectListPreference.i;
    }

    @Override // defpackage.bq
    public final void g(Bundle bundle) {
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.title", this.e);
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.message", this.f);
        bundle.putBoolean("LeanbackListPreferenceDialogFragment.isMulti", this.b);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entries", this.c);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues", this.d);
        if (!this.b) {
            bundle.putString("LeanbackListPreferenceDialogFragment.initialSelection", this.ah);
        } else {
            Set set = this.a;
            bundle.putStringArray("LeanbackListPreferenceDialogFragment.initialSelections", (String[]) set.toArray(new String[set.size()]));
        }
    }
}
