package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnz {
    public static volatile String a;
    public static final rzy b;
    private static final ryq c;

    static {
        yau yauVar = new yau((tsl) new uhe(16));
        yauVar.e(ImmutableSet.of("CLIENT_LOGGING_PROD"));
        a.ab(true);
        a.ab(true);
        yauVar.b = true;
        ryq ryqVarD = yauVar.d();
        c = ryqVarD;
        b = new rzy("com.google.android.libraries.performance.primes", ryqVarD);
        a = null;
    }

    private xnz() {
    }
}
