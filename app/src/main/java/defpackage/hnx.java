package defpackage;

import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class hnx extends afn {
    final /* synthetic */ hny a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hnx(hny hnyVar) {
        super(afn.c);
        this.a = hnyVar;
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        ajrVar.c(new ajo(null, 16, this.a.b.getString(R.string.entity_foreground_image_attribution_action_description), null, null));
    }
}
