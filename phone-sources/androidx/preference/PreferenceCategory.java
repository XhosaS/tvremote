package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.crn;
import defpackage.gdw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, crn.i(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), null);
    }

    @Override // androidx.preference.Preference
    public final boolean L() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(gdw gdwVar) {
        super.a(gdwVar);
        if (Build.VERSION.SDK_INT >= 28) {
            gdwVar.itemView.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.L();
    }
}
