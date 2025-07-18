package defpackage;

import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class ikc extends ayc {
    final /* synthetic */ ikd k;

    public ikc(ikd ikdVar) {
        this.k = ikdVar;
    }

    @Override // defpackage.ayc
    public final int b() {
        return R.layout.setup_third_party_disclosures_right_panel;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        super.e(aybVar, axhVar);
        ikd ikdVar = this.k;
        if (ikdVar.ak.isTouchExplorationEnabled() && axhVar.a == 1) {
            aybVar.t.setContentDescription(ikdVar.dZ().getResources().getString(R.string.opa_third_party_disclosure_screen_continue_button_description));
        }
    }
}
