package defpackage;

import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class ika extends ayc {
    final /* synthetic */ ikb k;

    public ika(ikb ikbVar) {
        this.k = ikbVar;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        super.e(aybVar, axhVar);
        ikb ikbVar = this.k;
        if (ikbVar.ak.isTouchExplorationEnabled()) {
            long j = axhVar.a;
            if (j == 1) {
                aybVar.t.setContentDescription(ikbVar.dZ().getResources().getString(R.string.assistant_promotions_opt_in_yes_description));
            } else if (j == 2) {
                aybVar.t.setContentDescription(ikbVar.dZ().getResources().getString(R.string.assistant_promotions_opt_in_no_description));
            }
        }
    }
}
