package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzc extends mve {
    private mzd a;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mzd mzdVar = (mzd) getArguments().getParcelable("movie_extra_info_dialog_view_model");
        mzdVar.getClass();
        this.a = mzdVar;
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfh sfhVar = new sfh(this);
        mvh mvhVar = new mvh();
        mjo.m(this.a.a, sfhVar);
        mjo.l(this.a.b, sfhVar);
        return mjo.k(mvhVar, sfhVar);
    }
}
