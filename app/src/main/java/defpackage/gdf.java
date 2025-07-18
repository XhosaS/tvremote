package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdf implements gdb {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/led/player/LedAnimatorImpl");
    public static final yyr b;
    public final gdu d;
    public final Context f;
    private final gde h;
    public Optional c = Optional.empty();
    public final Map e = new HashMap();
    public final Handler g = new Handler(Looper.getMainLooper());

    static {
        yyn yynVar = new yyn(4);
        yynVar.c(13, 10);
        yynVar.c(12, 10);
        yynVar.c(2, 10);
        yynVar.c(9, 10);
        yynVar.c(10, 10);
        yynVar.c(11, 10);
        yynVar.c(31, 10);
        yynVar.c(33, 10);
        yynVar.c(32, 10);
        b = yynVar.a(true);
    }

    public gdf(Context context, gdu gduVar) {
        this.f = context;
        this.d = gduVar;
        gduVar.b();
        gde gdeVar = new gde(this);
        this.h = gdeVar;
        gdeVar.run();
    }

    public final void a(int i) {
        Map map = this.e;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            final gdq gdqVarB = ((gdq) map.get(numValueOf)).b();
            this.g.post(new Runnable() { // from class: gdc
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d.a(gdqVarB);
                }
            });
        } else {
            this.c = Optional.of(numValueOf);
            ((zdv) ((zdv) a.c()).q("com/google/android/apps/tvsearch/led/player/LedAnimatorImpl", "setAnimation", 199, "LedAnimatorImpl.java")).v("can't extract animation from map right now, Animation State: %d", i);
        }
    }
}
