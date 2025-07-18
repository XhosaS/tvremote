package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xkz implements xky {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;
    private final Context c;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("PlayerExperiment__enable_player_debug_view", false);
        b = rzyVar.b("PlayerExperiment__qoe_experiment_id", -1L);
    }

    public xkz(Context context) {
        this.c = context;
    }

    @Override // defpackage.xky
    public final long a() {
        return ((Long) b.et(this.c)).longValue();
    }

    @Override // defpackage.xky
    public final boolean b() {
        return ((Boolean) a.et(this.c)).booleanValue();
    }
}
