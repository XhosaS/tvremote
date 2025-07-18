package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljr implements Runnable {
    private final BroadcastReceiver.PendingResult a;
    private final Context b;
    private final lie c;
    private final ksn d;
    private final String e;
    private final lgr f;
    private final boolean g;
    private final isy h;
    private final hfx i;

    public ljr(BroadcastReceiver.PendingResult pendingResult, Context context, isy isyVar, lie lieVar, hfx hfxVar, ksn ksnVar, String str, lgr lgrVar, boolean z) {
        this.a = pendingResult;
        this.b = context;
        this.h = isyVar;
        this.c = lieVar;
        this.i = hfxVar;
        this.d = ksnVar;
        this.e = str;
        this.f = lgrVar;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lie lieVar = this.c;
        String str = this.e;
        lieVar.ak(str);
        isy isyVar = this.h;
        ksn ksnVar = this.d;
        if (ktw.D(isyVar, ksnVar, str, this.g)) {
            PinBroadcastReceiver.d(this.b, this.f, this.i);
        } else {
            PinBroadcastReceiver.e(this.b, isyVar, this.f, this.i, ksnVar, str);
        }
        this.a.finish();
    }
}
