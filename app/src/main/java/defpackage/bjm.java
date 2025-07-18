package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bjm implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreference a;

    public bjm(SwitchPreference switchPreference) {
        this.a = switchPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreference switchPreference = this.a;
        if (switchPreference.M(Boolean.valueOf(z))) {
            switchPreference.k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
