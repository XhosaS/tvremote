package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uut extends azx {
    public uut() {
        this.e = null;
    }

    @Override // defpackage.azx
    protected azw b(ViewGroup viewGroup) {
        return new uus(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.filter_row, viewGroup, false));
    }

    @Override // defpackage.azx
    protected void g(azw azwVar, Object obj) {
        uus uusVar = (uus) azwVar;
        avs avsVar = uusVar.a;
        uur uurVar = (uur) obj;
        avsVar.d(uurVar.b());
        View view = uusVar.g;
        ((ayq) ((HorizontalGridView) view).getAdapter()).s(avsVar);
        view.setContentDescription(uurVar.e());
        uusVar.e(uurVar);
    }

    @Override // defpackage.azx
    protected void k(azw azwVar) {
        ((uus) azwVar).d();
    }

    @Override // defpackage.azx
    public final boolean o() {
        return false;
    }

    @Override // defpackage.azm
    public void t(azk azkVar, Object obj, List list) {
        if (list.contains("UPDATE_FILTERS_PAYLOAD")) {
            ((uus) azkVar).e((uur) obj);
        } else {
            g(y(azkVar), obj);
        }
    }
}
