package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mns extends xch {
    public moa a;
    public nqq b;

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.value_proposition, viewGroup, false);
        Bundle arguments = getArguments();
        arguments.getClass();
        lid lidVar = (lid) arguments.getParcelable("parent_event_id");
        nqq nqqVar = this.b;
        if (nqqVar == null) {
            yks.c("uiEventLoggingHelper");
            nqqVar = null;
        }
        lin.m(nqqVar, 311, lidVar).g();
        by activity = getActivity();
        activity.getClass();
        sfy.q(this, new kfy(this, new mnv((ManageServicesActivity) activity), viewInflate, 5));
        return viewInflate;
    }
}
