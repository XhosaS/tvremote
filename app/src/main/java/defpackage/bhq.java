package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bhq implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ CheckBoxPreference a;

    public bhq(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBoxPreference checkBoxPreference = this.a;
        if (checkBoxPreference.M(Boolean.valueOf(z))) {
            checkBoxPreference.k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
