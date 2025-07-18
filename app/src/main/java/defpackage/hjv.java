package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjv extends huz {
    public hjv(hmc hmcVar) {
        super(hmcVar.B(), hmcVar.C(), new huu(hmcVar.B()));
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        return new hju(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.error_state, viewGroup, false));
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        super.g(azwVar, obj);
        if (obj instanceof hjw) {
            azwVar.g.findViewById(R.id.no_result_row).setVisibility(0);
        }
    }
}
