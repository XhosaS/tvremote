package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.frameworks.client.data.android.debug.ServiceOverrideView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uss extends RecyclerView.Adapter {
    public final bv a;
    public ImmutableList b = ImmutableList.of();

    public uss(bv bvVar) {
        this.a = bvVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        usq usqVar = (usq) this.b.get(i);
        Object obj = ((ust) viewHolder).a;
        usp uspVar = usqVar.a;
        ServiceOverrideView serviceOverrideView = (ServiceOverrideView) obj;
        ((TextView) serviceOverrideView.findViewById(R.id.service_name)).setText(uspVar.b);
        ((TextView) serviceOverrideView.findViewById(R.id.system_property_name)).setText(uspVar.a());
        ((TextView) serviceOverrideView.findViewById(R.id.using_system_prop)).setText(true != usqVar.c ? "No" : "Yes");
        String str = usqVar.b;
        TextView textView = (TextView) serviceOverrideView.findViewById(R.id.endpoint_value);
        if (str == null) {
            str = "default";
        }
        textView.setText(str);
        serviceOverrideView.setOnClickListener(new nay(this, usqVar, 19, null));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ust((ServiceOverrideView) LayoutInflater.from(this.a.getContext()).inflate(R.layout.service_override_view, viewGroup, false));
    }
}
