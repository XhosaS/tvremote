package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hor extends hpx {
    private final uuu c;

    public hor(hmc hmcVar, hmb hmbVar) {
        super(hmcVar, hmbVar);
        uuu uuuVar = new uuu();
        uuuVar.a = 0.0f;
        uuuVar.b = 1.0f;
        uuuVar.c = true;
        this.c = uuuVar;
    }

    @Override // defpackage.hpx, defpackage.azu, defpackage.azm
    public final azk q(ViewGroup viewGroup) {
        return new hpy(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amati_search_row_header, viewGroup, false));
    }

    @Override // defpackage.hpx, defpackage.azu, defpackage.azm
    public final void s(azk azkVar, Object obj) {
        super.s(azkVar, obj);
        azkVar.g.addOnLayoutChangeListener(this.c);
    }

    @Override // defpackage.hpx, defpackage.azu, defpackage.azm
    public final void u(azk azkVar) {
        azkVar.g.removeOnLayoutChangeListener(this.c);
        super.u(azkVar);
    }

    @Override // defpackage.azu
    protected final void b(azt aztVar) {
    }
}
