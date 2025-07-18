package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.play.search.PlaySearchOneSuggestion;
import com.google.frameworks.client.data.android.debug.HostnameOverrideView;
import com.google.frameworks.client.data.android.debug.ServiceOverrideView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ust extends RecyclerView.ViewHolder {
    public final Object a;

    public ust(View view, unx unxVar) {
        super(view);
        this.a = unxVar;
    }

    public ust(View view, TextView textView) {
        super(view);
        this.a = textView;
    }

    public ust(View view) {
        super(view);
        this.a = view;
    }

    public ust(PlaySearchOneSuggestion playSearchOneSuggestion) {
        super(playSearchOneSuggestion);
        this.a = playSearchOneSuggestion;
    }

    public ust(HostnameOverrideView hostnameOverrideView) {
        super(hostnameOverrideView);
        this.a = hostnameOverrideView;
    }

    public ust(ServiceOverrideView serviceOverrideView) {
        super(serviceOverrideView);
        this.a = serviceOverrideView;
    }
}
