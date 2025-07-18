package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myu extends mve {
    private myv a;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        myv myvVar = (myv) getArguments().getParcelable("remove_item_dialog_view_model");
        myvVar.getClass();
        this.a = myvVar;
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfh sfhVar = new sfh(this);
        mvh mvhVar = new mvh();
        mjo.m(getContext().getString(R.string.delete_from_device_dialog_title), sfhVar);
        Context context = getContext();
        myv myvVar = this.a;
        mjo.l(ksk.b(context.getString(true != myvVar.a ? R.string.delete_movie_from_device_dialog_message : R.string.delete_show_from_device_dialog_message, myvVar.b)), sfhVar);
        mvhVar.b(getContext().getString(R.string.ok), new mqw(this, 15));
        return mjo.k(mvhVar, sfhVar);
    }
}
