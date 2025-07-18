package defpackage;

import com.google.android.play.search.PlaySearchSuggestionsList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thc extends the {
    final /* synthetic */ PlaySearchSuggestionsList a;

    public thc(PlaySearchSuggestionsList playSearchSuggestionsList) {
        this.a = playSearchSuggestionsList;
    }

    @Override // defpackage.the, android.support.v7.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.a.c();
    }
}
