package defpackage;

import android.support.v7.widget.ActivityChooserView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdm implements gdb {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ gdo b;

    public gdm(gdo gdoVar, PreferenceGroup preferenceGroup) {
        this.b = gdoVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.gdb
    public final void ej(Preference preference) {
        this.a.R(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        this.b.c();
    }
}
