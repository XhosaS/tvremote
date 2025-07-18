package defpackage;

import android.accounts.Account;
import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtd implements gta {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/phenotype/OobeHeterodyneSyncerImpl");
    public static final Duration b;
    public final Context c;
    public final gsy d;
    public final gsz e;
    private final ahbt f;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
    }

    public gtd(Context context, ahbt ahbtVar, gsy gsyVar, gsz gszVar) {
        context.getClass();
        ahbtVar.getClass();
        gszVar.getClass();
        this.c = context;
        this.f = ahbtVar;
        this.d = gsyVar;
        this.e = gszVar;
    }

    @Override // defpackage.gta
    public final zyd a(Account account) {
        return ahkr.c(this.f, 0, new gtc(this, account, null), 3);
    }
}
