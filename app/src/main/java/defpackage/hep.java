package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hep extends heo {
    public hep(Context context, hek hekVar) {
        super(context, hekVar);
    }

    @Override // defpackage.heo, defpackage.pq
    public final qv d(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.preview_entity_detail_action, viewGroup, false);
        viewInflate.setForeground(new jrq(this.f, this.g));
        return new hen(viewInflate, this.e);
    }
}
