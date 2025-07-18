package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcv extends gde {
    int a;
    private CharSequence[] b;
    private CharSequence[] c;

    private final ListPreference g() {
        return (ListPreference) f();
    }

    @Override // defpackage.gde
    public final void b(boolean z) {
        int i;
        if (!z || (i = this.a) < 0) {
            return;
        }
        String string = this.c[i].toString();
        ListPreference listPreferenceG = g();
        listPreferenceG.Q(string);
        listPreferenceG.o(string);
    }

    @Override // defpackage.gde
    protected final void dH(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.b, this.a, new gcu(this, 0));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // defpackage.gde, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.b = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.c = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceG = g();
        if (listPreferenceG.g == null || listPreferenceG.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.a = listPreferenceG.k(listPreferenceG.i);
        this.b = listPreferenceG.g;
        this.c = listPreferenceG.h;
    }

    @Override // defpackage.gde, defpackage.bl, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.a);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.b);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.c);
    }
}
