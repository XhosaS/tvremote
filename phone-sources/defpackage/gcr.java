package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcr extends Preference {
    private long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcr(Context context, List list, long j) {
        super(context, null);
        CharSequence string = null;
        this.B = R.layout.expand_button;
        Drawable drawable = AppCompatResources.getDrawable(this.j, R.drawable.ic_arrow_down_24dp);
        if (this.s != drawable) {
            this.s = drawable;
            this.r = 0;
            d();
        }
        this.r = R.drawable.ic_arrow_down_24dp;
        G(this.j.getString(R.string.expand_button_title));
        E(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.D)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.j.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        n(string);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(gdw gdwVar) {
        super.a(gdwVar);
        gdwVar.c = false;
    }

    @Override // androidx.preference.Preference
    public final long dG() {
        return this.a;
    }
}
