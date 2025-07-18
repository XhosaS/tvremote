package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.downloads.RatioBar;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mnq extends RecyclerView.ViewHolder {
    public final RatioBar a;
    public final TextView b;
    final /* synthetic */ mnr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnq(mnr mnrVar, View view) {
        super(view);
        this.c = mnrVar;
        this.a = (RatioBar) view.findViewById(R.id.storage_bar);
        this.b = (TextView) view.findViewById(R.id.free_space_text);
    }
}
