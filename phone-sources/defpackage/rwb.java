package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwb {
    public final Object a;
    public final Object b;
    public final Object c;

    public rwb(String str) {
        this.c = "PLAY_MOVIES_ANDROID_PRIMES";
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(str));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(str));
    }

    public final uhp a() {
        trk trkVar = trk.a;
        uhp uhpVarC = sfy.C(trkVar);
        uhp uhpVarC2 = sfy.C(ImmutableList.of());
        uhp uhpVarC3 = sfy.C(trkVar);
        return sfy.N(uhpVarC, uhpVarC2, uhpVarC3).a(new uqy(this, uhpVarC, uhpVarC2, uhpVarC3, 1), ugk.a);
    }

    public rwb(yyh yyhVar, uht uhtVar, Executor executor, xbw xbwVar, yfo yfoVar) {
        this.a = xbwVar;
        this.c = uhtVar;
        this.b = yyhVar.f(executor, xbwVar, yfoVar);
    }
}
