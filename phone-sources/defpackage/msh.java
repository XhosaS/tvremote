package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msh {
    public final Object a;
    public final /* synthetic */ Object b;

    public msh(WatchActivity watchActivity, idy idyVar) {
        this.b = watchActivity;
        this.a = idyVar;
    }

    public final boolean a(View view) {
        BingeWatchCard bingeWatchCard = (BingeWatchCard) this.b;
        return bingeWatchCard.getVisibility() == 0 && view == bingeWatchCard.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [idy, java.lang.Object] */
    public final void b() {
        msf msfVar = ((WatchActivity) this.b).y;
        if (msfVar == null) {
            return;
        }
        this.a.c(ieg.a(msfVar.e));
    }

    public final void c() {
        WatchActivity watchActivity = (WatchActivity) this.b;
        msf msfVar = watchActivity.y;
        if (msfVar == null || msfVar.c()) {
            return;
        }
        watchActivity.f(false);
    }

    public msh(BingeWatchCard bingeWatchCard) {
        this.b = bingeWatchCard;
        this.a = new Rect();
    }
}
