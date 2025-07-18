package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdz {
    public static volatile String a;
    public static final rzy b;
    private static final ryq c;

    static {
        yau yauVar = new yau((tsl) new uhe(7));
        yauVar.e(ImmutableSet.of("ANDROID_AUTH"));
        ryq ryqVarD = yauVar.d();
        c = ryqVarD;
        b = new rzy("com.google.android.gms.auth_account_client", ryqVarD);
        a = null;
    }

    private xdz() {
    }
}
