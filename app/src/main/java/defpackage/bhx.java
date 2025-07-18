package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhx extends Preference {
    private long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhx(Context context, List list, long j) {
        super(context, null);
        CharSequence string = null;
        this.z = R.layout.expand_button;
        E(ra.e().c(this.j, R.drawable.ic_arrow_down_24dp));
        this.r = R.drawable.ic_arrow_down_24dp;
        H(R.string.expand_button_title);
        F(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.C)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.j.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        G(string);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(bjh bjhVar) {
        super.a(bjhVar);
        bjhVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long cw() {
        return this.a;
    }
}
