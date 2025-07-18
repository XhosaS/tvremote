package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gdr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, crn.i(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.d = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean S() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        gdr gdrVar;
        if (this.u != null || this.v != null || k() == 0 || (gdrVar = this.k.e) == null) {
            return;
        }
        gdrVar.h();
    }
}
