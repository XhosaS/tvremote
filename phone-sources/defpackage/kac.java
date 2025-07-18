package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kac extends gmd {
    private final wlg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kac(by byVar, wlg wlgVar) {
        super(byVar.getSupportFragmentManager(), byVar.getLifecycle());
        wlgVar.getClass();
        this.f = wlgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gmd
    public final bv b(int i) {
        wlf wlfVar = (wlf) this.f.b.get(i);
        if (yks.e(wlfVar.e, "hot-and-new")) {
            wlfVar.getClass();
            jzq jzqVar = new jzq();
            Bundle bundle = new Bundle();
            hju.I(bundle, "destination", wlfVar);
            jzqVar.setArguments(bundle);
            return jzqVar;
        }
        if (wlfVar.c == 4) {
            wlfVar.getClass();
            kap kapVar = new kap();
            Bundle bundle2 = new Bundle();
            hju.I(bundle2, "destination_key", wlfVar);
            kapVar.setArguments(bundle2);
            return kapVar;
        }
        wlfVar.getClass();
        jzz jzzVar = new jzz();
        Bundle bundle3 = new Bundle();
        hju.I(bundle3, "destination", wlfVar);
        jzzVar.setArguments(bundle3);
        return jzzVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.b.size();
    }
}
