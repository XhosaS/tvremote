package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsz extends huw {
    public hsz() {
        this.e = null;
        this.f = false;
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.super_header, viewGroup, false);
        viewInflate.getClass();
        return new hta(viewInflate);
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        obj.getClass();
        super.g(azwVar, obj);
        ((hta) azwVar).a.setText(((hsy) obj).a);
    }

    @Override // defpackage.huw, defpackage.azx
    protected final void z(azw azwVar) {
        super.z(azwVar);
        azwVar.g.setActivated(false);
    }
}
