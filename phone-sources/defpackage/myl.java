package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myl extends mve {
    public myj a;

    @Override // defpackage.sfg, defpackage.bl, defpackage.bv
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (myj) getArguments().getParcelable("family_library_show_share_dialog_share_status_update");
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sfh sfhVar = new sfh(this);
        mvh mvhVar = new mvh();
        mjo.l(getContext().getString(R.string.show_sharing_confirmation_message), sfhVar);
        mvhVar.b(getContext().getString(R.string.got_it), new mqw(this, 14));
        String string = getContext().getString(R.string.dont_show_again);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: myk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                kff.s(compoundButton, new myg(z));
            }
        };
        sfi sfiVar = new sfi();
        sfiVar.a = string;
        sfiVar.b = onCheckedChangeListener;
        sfhVar.c(sfiVar);
        return mjo.k(mvhVar, sfhVar);
    }
}
