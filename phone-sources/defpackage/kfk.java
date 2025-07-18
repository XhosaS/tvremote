package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfk extends sfg implements xce {
    public xcd a;
    public kfn b;
    public kfw c;
    public kdh d;

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        xcd xcdVar = this.a;
        if (xcdVar != null) {
            return xcdVar;
        }
        yks.c("childFragmentInjector");
        return null;
    }

    @Override // defpackage.bl, defpackage.bv
    public final void onAttach(Context context) {
        context.getClass();
        wae.x(this);
        super.onAttach(context);
    }

    @Override // defpackage.sfg
    public final View onCreateReplayDialogView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.season_selection_bottomsheet_view_layout, viewGroup, false);
        Bundle arguments = getArguments();
        arguments.getClass();
        Serializable serializable = arguments.getSerializable("season_selection_menu_items");
        serializable.getClass();
        ArrayList arrayList = (ArrayList) serializable;
        kdh kdhVar = this.d;
        if (kdhVar == null) {
            yks.c("pageViewModelFactoryFactory");
            kdhVar = null;
        }
        Object obj = kdhVar.a;
        kfi kfiVar = (kfi) new dxa(this, new kfj(arrayList, 0)).a(kfi.class);
        if (this.c == null) {
            yks.c("seasonSelectionMenuModelFactory");
        }
        kfiVar.a = new kdh((List) arrayList);
        sfy.q(this, new kfy((Object) this, (dwt) kfiVar, (Object) viewInflate, 1));
        viewInflate.getClass();
        return viewInflate;
    }
}
