package defpackage;

import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrd implements iej {
    public final /* synthetic */ InlineLocalWatchFragment a;

    public mrd(InlineLocalWatchFragment inlineLocalWatchFragment) {
        this.a = inlineLocalWatchFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.iej
    public final void dM() {
        InlineLocalWatchFragment inlineLocalWatchFragment = this.a;
        ieg iegVar = (ieg) inlineLocalWatchFragment.currentPlayerErrorRepository.a();
        boolean zM = iegVar.m();
        inlineLocalWatchFragment.playerView.setVisibility(true != zM ? 0 : 8);
        inlineLocalWatchFragment.errorView.setVisibility(true != zM ? 8 : 0);
        if (!zM) {
            inlineLocalWatchFragment.director.c(true);
            return;
        }
        llt lltVar = (llt) iegVar.g();
        TextView textView = (TextView) inlineLocalWatchFragment.errorView.findViewById(R.id.error_text);
        Button button = (Button) inlineLocalWatchFragment.errorView.findViewById(R.id.error_retry_button);
        Button button2 = (Button) inlineLocalWatchFragment.errorView.findViewById(R.id.error_got_it_button);
        Button button3 = (Button) inlineLocalWatchFragment.errorView.findViewById(R.id.error_troubleshoot_button);
        textView.setText((CharSequence) new llu(inlineLocalWatchFragment.getResources()).b(lltVar));
        button.setVisibility(true != lltVar.c() ? 8 : 0);
        button2.setVisibility(true != lltVar.d() ? 8 : 0);
        button3.setVisibility((lltVar.b().m() && inlineLocalWatchFragment.networkStatus.d() && !jwq.M(inlineLocalWatchFragment.getActivity())) ? 0 : 8);
        button.setOnClickListener(new mqw(this, 2));
        button2.setOnClickListener(new mqw(this, 3));
        button3.setOnClickListener(new iuy(this, lltVar, 12));
    }
}
