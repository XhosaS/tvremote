package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usv extends bv {
    public static final tvn a = tvn.n("xRPC");
    public uss b;
    private usj c;

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            usp uspVar = (usp) intent.getParcelableExtra("rpc_config_key");
            String stringExtra = intent.getStringExtra("result_extra");
            if (stringExtra == null) {
                usj usjVar = this.c;
                usjVar.b().execute(trc.f(new ukm(usjVar, uspVar, 12)));
            } else {
                usj usjVar2 = this.c;
                usjVar2.b().execute(trc.f(new rvp(usjVar2, uspVar, stringExtra, 7)));
            }
            this.b.notifyDataSetChanged();
        }
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.service_override_fragment, viewGroup, false);
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("configs_to_display");
        this.b = new uss(this);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.service_list);
        recyclerView.setAdapter(this.b);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        usj usjVar = (usj) dxb.a(this, new kfj(getContext(), 2)).a(usj.class);
        this.c = usjVar;
        usjVar.a(parcelableArrayList).d(this, new req(this, 11));
        return viewInflate;
    }
}
