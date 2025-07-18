package defpackage;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcy extends gde {
    final Set a = new HashSet();
    boolean b;
    CharSequence[] c;
    CharSequence[] d;

    private final MultiSelectListPreference g() {
        return (MultiSelectListPreference) f();
    }

    @Override // defpackage.gde
    public final void b(boolean z) {
        if (z && this.b) {
            MultiSelectListPreference multiSelectListPreferenceG = g();
            Set set = this.a;
            multiSelectListPreferenceG.Q(set);
            multiSelectListPreferenceG.k(set);
        }
        this.b = false;
    }

    @Override // defpackage.gde
    protected final void dH(AlertDialog.Builder builder) {
        int length = this.d.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.a.contains(this.d[i].toString());
        }
        builder.setMultiChoiceItems(this.c, zArr, new gcx(this));
    }

    @Override // defpackage.gde, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle != null) {
            Set set = this.a;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.b = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.c = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.d = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceG = g();
        CharSequence[] charSequenceArr2 = multiSelectListPreferenceG.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreferenceG.h) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        Set set2 = this.a;
        set2.clear();
        set2.addAll(multiSelectListPreferenceG.i);
        this.b = false;
        this.c = charSequenceArr2;
        this.d = charSequenceArr;
    }

    @Override // defpackage.gde, defpackage.bl, defpackage.bv
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.a));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.b);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.c);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.d);
    }
}
