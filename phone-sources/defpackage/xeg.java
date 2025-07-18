package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xeg {
    public static volatile String a;
    public static final rzy b;
    private static final ryq c;

    static {
        yau yauVar = new yau((tsl) new uhe(8));
        yauVar.e(ImmutableSet.of("METALOG_COUNTERS", "CLEARCUT_LOG_LOSS", "CLEARCUT_FUNNEL", "CLEARCUT_BACKSTOP"));
        ryq ryqVarD = yauVar.d();
        c = ryqVarD;
        b = new rzy("com.google.android.gms.clearcut_client", ryqVarD);
        a = null;
    }

    private xeg() {
    }
}
