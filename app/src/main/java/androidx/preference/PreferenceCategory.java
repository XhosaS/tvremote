package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.katniss.R;
import defpackage.acp;
import defpackage.bjh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, acp.b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean P() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void a(bjh bjhVar) {
        super.a(bjhVar);
        bjhVar.a.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.P();
    }
}
