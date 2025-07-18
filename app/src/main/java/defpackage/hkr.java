package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkr extends huw {
    public final agow a;
    public final ghr b;

    public hkr(hmb hmbVar, agow agowVar) {
        agowVar.getClass();
        this.a = agowVar;
        this.e = null;
        this.f = false;
        this.b = hmbVar.q();
    }

    @Override // defpackage.azx
    protected final azw b(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(true != ((Boolean) this.a.a()).booleanValue() ? R.layout.logo_header_row : R.layout.logo_header_immersive_row, viewGroup, false);
        viewInflate.getClass();
        return new hkq(this, viewInflate);
    }

    @Override // defpackage.azx
    protected final void g(azw azwVar, Object obj) {
        obj.getClass();
        super.g(azwVar, obj);
        hkq hkqVar = (hkq) azwVar;
        hkqVar.a.setText(((hkp) obj).a);
        if (((Boolean) hkqVar.b.a.a()).booleanValue()) {
            hkqVar.g.setOnClickListener(hkqVar);
        }
    }

    @Override // defpackage.huw, defpackage.azx
    protected final void z(azw azwVar) {
        super.z(azwVar);
        azwVar.g.setActivated(false);
        if (((Boolean) this.a.a()).booleanValue()) {
            this.b.Y(3);
        }
    }
}
