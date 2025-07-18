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
public final class usm extends bv {
    public static final tvn a = tvn.n("xRPC");
    public usk b;
    private usj c;

    @Override // defpackage.bv
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("rpc_config_key");
            String stringExtra = intent.getStringExtra("result_extra");
            if (stringExtra == null) {
                usj usjVar = this.c;
                usjVar.b().execute(trc.f(new ukm(usjVar, parcelableArrayListExtra, 13)));
            } else {
                usj usjVar2 = this.c;
                usjVar2.b().execute(trc.f(new rvp(usjVar2, parcelableArrayListExtra, stringExtra, 6, (byte[]) null)));
            }
            this.b.notifyDataSetChanged();
        }
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.hostname_override_fragment, viewGroup, false);
        ArrayList parcelableArrayList = getArguments().getParcelableArrayList("configs_to_display");
        this.b = new usk(this);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.host_list);
        recyclerView.setAdapter(this.b);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        usj usjVar = (usj) dxb.a(this, new kfj(getContext(), 2)).a(usj.class);
        this.c = usjVar;
        usjVar.a(parcelableArrayList).d(this, new req(this, 10));
        return viewInflate;
    }
}
