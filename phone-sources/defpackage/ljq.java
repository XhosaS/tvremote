package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljq implements Runnable {
    private final BroadcastReceiver.PendingResult a;
    private final Context b;
    private final lie c;
    private final ksn d;
    private final String e;
    private final int f;
    private final int g;
    private final isy h;

    public ljq(BroadcastReceiver.PendingResult pendingResult, Context context, isy isyVar, lie lieVar, ksn ksnVar, String str, int i, int i2) {
        this.a = pendingResult;
        this.b = context;
        this.h = isyVar;
        this.c = lieVar;
        this.d = ksnVar;
        this.e = str;
        this.f = i;
        this.g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lie lieVar = this.c;
        String str = this.e;
        int i = this.f;
        int i2 = this.g;
        lieVar.aj(str, i, i2);
        if (ktw.C(this.h, this.d, str, true, i, i2, false)) {
            Context context = this.b;
            ksk.k(context, TransferService.a(context, true));
        }
        this.a.finish();
    }
}
