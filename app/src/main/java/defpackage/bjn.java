package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bjn implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreferenceCompat a;

    public bjn(SwitchPreferenceCompat switchPreferenceCompat) {
        this.a = switchPreferenceCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = this.a;
        if (switchPreferenceCompat.M(Boolean.valueOf(z))) {
            switchPreferenceCompat.k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
