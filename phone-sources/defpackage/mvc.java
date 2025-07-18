package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvc extends mve {
    private mvd a;

    public static mvc a(mvd mvdVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("no_preferred_network_dialog_view_model", mvdVar);
        mvc mvcVar = new mvc();
        mvcVar.setArguments(bundle);
        return mvcVar;
    }

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mvd mvdVar = (mvd) getArguments().getParcelable("no_preferred_network_dialog_view_model");
        mvdVar.getClass();
        this.a = mvdVar;
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfh sfhVar = new sfh(this);
        mvh mvhVar = new mvh();
        mjo.n(this.a.a, sfhVar);
        mjo.l(this.a.b, sfhVar);
        mvhVar.b(getResources().getString(R.string.cancel), new mqw(this, 8));
        return mjo.k(mvhVar, sfhVar);
    }
}
