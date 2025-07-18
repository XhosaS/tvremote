package defpackage;

import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtl implements wnu {
    public static final Duration a;
    public final Context b;
    public final gsy c;
    public final wei d;
    private final ahbt e;

    static {
        Duration durationOfHours = Duration.ofHours(4L);
        durationOfHours.getClass();
        a = durationOfHours;
    }

    public gtl(Context context, ahbt ahbtVar, gsy gsyVar, wei weiVar) {
        context.getClass();
        ahbtVar.getClass();
        this.b = context;
        this.e = ahbtVar;
        this.c = gsyVar;
        this.d = weiVar;
    }

    @Override // defpackage.wnu
    public final zyd a() {
        return ahkr.c(this.e, 0, new gtk(this, null), 3);
    }
}
