package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myi extends mve {
    public myj a;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (myj) getArguments().getParcelable("family_library_movies_bundle_share_dialog_share_status_update");
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfh sfhVar = new sfh(this);
        mvh mvhVar = new mvh();
        Context context = getContext();
        myj myjVar = this.a;
        mjo.m(context.getString(true != myjVar.d ? R.string.unshare_bundle_title : R.string.share_bundle_title, myjVar.c), sfhVar);
        Context context2 = getContext();
        myj myjVar2 = this.a;
        mjo.l(context2.getString(true != myjVar2.d ? R.string.unshare_bundle_message : R.string.share_bundle_message, myjVar2.c), sfhVar);
        mvhVar.b(getContext().getString(R.string.continue_label), new mqw(this, 12));
        mvhVar.c(getContext().getString(R.string.cancel), new mqw(this, 13));
        return mjo.k(mvhVar, sfhVar);
    }
}
