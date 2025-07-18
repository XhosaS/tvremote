package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.frameworks.client.data.android.debug.HostnameOverrideView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usk extends RecyclerView.Adapter {
    public final bv a;
    public ImmutableList b = ImmutableList.of();

    public usk(bv bvVar) {
        this.a = bvVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        aafi aafiVar = (aafi) this.b.get(i);
        ?? r3 = aafiVar.b;
        HostnameOverrideView hostnameOverrideView = (HostnameOverrideView) ((ust) viewHolder).a;
        ((TextView) hostnameOverrideView.findViewById(R.id.prod_host_name)).setText((CharSequence) Iterables.getLast(r3));
        Object obj = aafiVar.c;
        ?? r0 = (TextView) hostnameOverrideView.findViewById(R.id.endpoint_value);
        ?? r8 = obj;
        if (obj == null) {
            r8 = "Using various endpoints";
        }
        r0.setText(r8);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) aafiVar.a).iterator();
        while (it.hasNext()) {
            sb.append(((usp) it.next()).b);
            if (it.hasNext()) {
                sb.append("\n");
            }
        }
        ((TextView) hostnameOverrideView.findViewById(R.id.services_list)).setText(sb.toString());
        hostnameOverrideView.setOnClickListener(new kaj(this, aafiVar, (Object) r3, 8, (short[]) null));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ust((HostnameOverrideView) LayoutInflater.from(this.a.getContext()).inflate(R.layout.hostname_override_view, viewGroup, false));
    }
}
