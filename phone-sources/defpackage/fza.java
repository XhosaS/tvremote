package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fza implements OnBackAnimationCallback {
    final /* synthetic */ fyx a;

    public fza(fyx fyxVar) {
        this.a = fyxVar;
    }

    public final void onBackCancelled() {
        this.a.b();
    }

    public final void onBackInvoked() {
        this.a.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        fyv fyvVarY = fus.y(backEvent);
        fyx fyxVar = this.a;
        List listAl = yfm.al(fyxVar.a);
        if (listAl.isEmpty()) {
            listAl = fyxVar.a();
        }
        Iterator it = listAl.iterator();
        if (it.hasNext()) {
            ((fyw) it.next()).c(fyvVarY);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        fyv fyvVarY = fus.y(backEvent);
        fyx fyxVar = this.a;
        List list = fyxVar.a;
        if (!list.isEmpty()) {
            fyxVar.b();
        }
        Iterator it = fyxVar.a().iterator();
        if (it.hasNext()) {
            fyw fywVar = (fyw) it.next();
            list.add(fywVar);
            fywVar.d(fyvVarY);
        }
    }
}
