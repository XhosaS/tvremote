package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muv extends mve {
    public muw a;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        muw muwVar = (muw) getArguments().getParcelable("download_error_dialog_view_model");
        muwVar.getClass();
        this.a = muwVar;
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfh sfhVar = new sfh(this);
        mvh mvhVar = new mvh();
        mjo.m(getResources().getString(R.string.alert_download_failed), sfhVar);
        mjo.l(this.a.b, sfhVar);
        mvhVar.b(getResources().getString(R.string.dismiss), new mqw(this, 6));
        if (this.a.c) {
            mvhVar.c(getResources().getString(R.string.manage_downloads), new mqw(this, 7));
        }
        return mjo.k(mvhVar, sfhVar);
    }
}
