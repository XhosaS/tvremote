package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mut extends mve {
    public muu a;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        muu muuVar = (muu) getArguments().getParcelable("cancel_download_dialog_view_model");
        muuVar.getClass();
        this.a = muuVar;
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfh sfhVar = new sfh(this);
        mvh mvhVar = new mvh();
        mjo.n(this.a.b, sfhVar);
        mjo.l(this.a.c, sfhVar);
        mvhVar.b(getResources().getString(R.string.delete_now), new mqw(this, 4));
        mvhVar.c(getResources().getString(R.string.cancel), new mqw(this, 5));
        return mjo.k(mvhVar, sfhVar);
    }
}
