package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.play.search.PlaySearchOneSuggestion;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tgz extends RecyclerView.Adapter {
    public final List a = new ArrayList();
    public tgw b;

    public int a() {
        return R.layout.play_search_one_suggestion;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj = ((ust) viewHolder).a;
        tha thaVar = (tha) this.a.get(i);
        PlaySearchOneSuggestion playSearchOneSuggestion = (PlaySearchOneSuggestion) obj;
        playSearchOneSuggestion.a(thaVar, this.b.d);
        playSearchOneSuggestion.setOnClickListener(new nay((RecyclerView.Adapter) this, (Object) thaVar, 17));
        playSearchOneSuggestion.setOnLongClickListener(new tgy(this, 0));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ust((PlaySearchOneSuggestion) LayoutInflater.from(viewGroup.getContext()).inflate(a(), viewGroup, false));
    }
}
