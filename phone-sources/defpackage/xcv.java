package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcv {
    public static volatile String a;
    public static final rzy b;
    private static final ryq c;

    static {
        yau yauVar = new yau((tsl) new uhe(5));
        yauVar.e(ImmutableSet.of("GTV_MOBILE", "MOVIES", "PLAY_MOVIES_ANDROID_PRIMES"));
        ryq ryqVarD = yauVar.d();
        c = ryqVarD;
        b = new rzy("com.google.android.libraries.mediahome.providers.video", ryqVarD);
        a = null;
    }

    private xcv() {
    }
}
