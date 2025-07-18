package defpackage;

import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqh extends afn {
    final /* synthetic */ Object a;
    final /* synthetic */ hqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqh(hqi hqiVar, Object obj) {
        super(afn.c);
        this.a = obj;
        this.b = hqiVar;
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        hqi hqiVar = this.b;
        Object obj = this.a;
        ajrVar.c(new ajo(null, 16, hqiVar.a.dZ().getResources().getString(hqiVar.b(obj) ? R.string.click_action_description_recent_search_button : hqiVar.a(obj) ? R.string.click_action_description_filter_active : R.string.click_action_description_filter_inactive), null, null));
    }
}
