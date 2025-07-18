package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhg implements OnBackAnimationCallback {
    final /* synthetic */ bhc a;

    public bhg(bhc bhcVar) {
        this.a = bhcVar;
    }

    public final void onBackCancelled() {
        this.a.b();
    }

    public final void onBackInvoked() {
        this.a.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        bgz bgzVarA = bhd.a(backEvent);
        bhc bhcVar = this.a;
        List listX = agqq.x(bhcVar.a);
        if (listX.isEmpty()) {
            listX = bhcVar.a();
        }
        Iterator it = listX.iterator();
        if (it.hasNext()) {
            ((bha) it.next()).c(bgzVarA);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        bhd.a(backEvent);
        bhc bhcVar = this.a;
        List list = bhcVar.a;
        if (!list.isEmpty()) {
            bhcVar.b();
        }
        Iterator it = bhcVar.a().iterator();
        if (it.hasNext()) {
            bha bhaVar = (bha) it.next();
            list.add(bhaVar);
            bhaVar.d();
        }
    }
}
