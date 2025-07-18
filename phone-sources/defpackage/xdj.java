package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdj {
    public static final ryn a;
    public static volatile String b;
    public static final rzy c;
    private static final ryq d;

    static {
        yau yauVar = new yau((tsl) new uhe(6));
        yauVar.e(ImmutableSet.of("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES"));
        ryq ryqVarD = yauVar.d();
        d = ryqVarD;
        rzy rzyVar = new rzy("com.google.android.libraries.notifications", ryqVarD);
        c = rzyVar;
        a = rzyVar.c("__phenotype_server_token", "");
        b = null;
    }

    private xdj() {
    }
}
