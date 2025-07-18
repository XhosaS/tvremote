package defpackage;

import android.app.Activity;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msa extends fv {
    final /* synthetic */ Activity a;
    final /* synthetic */ WatchActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msa(WatchActivity watchActivity, Activity activity) {
        super(true);
        this.a = activity;
        this.d = watchActivity;
    }

    @Override // defpackage.fv
    public final void b() {
        WatchActivity watchActivity = this.d;
        Iterator it = watchActivity.f.iterator();
        while (it.hasNext()) {
            if (((mrh) it.next()).d()) {
                return;
            }
        }
        if (jwq.N(this.a)) {
            g(true);
        } else {
            g(false);
            watchActivity.getOnBackPressedDispatcher().c();
        }
    }
}
