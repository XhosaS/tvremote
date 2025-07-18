package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bjc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acp.b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.d = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean V() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        bjc bjcVar;
        if (this.t != null || this.u != null || k() == 0 || (bjcVar = this.k.f) == null) {
            return;
        }
        bjcVar.aI();
    }
}
