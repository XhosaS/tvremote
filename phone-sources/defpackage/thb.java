package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.play.search.PlaySearchSuggestionsList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thb extends LinearLayoutManager {
    final /* synthetic */ PlaySearchSuggestionsList a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thb(PlaySearchSuggestionsList playSearchSuggestionsList, Context context) {
        super(context);
        this.a = playSearchSuggestionsList;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final View onInterceptFocusSearch(View view, int i) {
        if (i == 130 && view.getParent() == this.a.a && getPosition(view) >= getItemCount() - 1) {
            return view;
        }
        return null;
    }
}
