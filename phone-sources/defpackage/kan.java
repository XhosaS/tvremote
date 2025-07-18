package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kan extends kar {
    public jaf a;
    public jzs b;
    private final yft c;

    public kan() {
        int i = ylg.a;
        this.c = new jej(new ykl(kam.class), new bck(this, 10), this);
    }

    public final kam a() {
        return (kam) this.c.a();
    }

    @Override // defpackage.kar
    public final boolean dS() {
        int i;
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(R.id.tab_component_view) : null;
        ViewStub viewStub = viewFindViewById instanceof ViewStub ? (ViewStub) viewFindViewById : null;
        if (viewStub == null) {
            return false;
        }
        wmc wmcVar = a().a().f;
        if (wmcVar == null) {
            wmcVar = wmc.a;
        }
        if (wmcVar.c != 0) {
            wmc wmcVar2 = a().a().f;
            if (wmcVar2 == null) {
                wmcVar2 = wmc.a;
            }
            i = wmcVar2.c;
        } else {
            i = 129676;
        }
        jaf jafVar = this.a;
        if (jafVar == null) {
            yks.c("veLogger");
            jafVar = null;
        }
        wmc wmcVar3 = a().a().f;
        if (wmcVar3 == null) {
            wmcVar3 = wmc.a;
        }
        vtw vtwVar = (vtw) wmcVar3.a(5, null);
        vtwVar.x(wmcVar3);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        ((wmc) vtwVar.b).c = i;
        vuc vucVarR = vtwVar.r();
        vucVarR.getClass();
        jafVar.i(viewStub, (wmc) vucVarR);
        sfy.q(this, new jzx(this, viewStub, 2));
        return true;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.tab_fragment, viewGroup, false);
    }
}
