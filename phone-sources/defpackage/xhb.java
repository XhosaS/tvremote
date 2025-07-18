package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhb {
    public static volatile String a;
    public static final rzy b;
    private static final ryq c;

    static {
        yau yauVar = new yau((tsl) new uhe(11));
        yauVar.e(ImmutableSet.of("MDI_SYNC_COMPONENTS_VERBOSE", "MDI_SYNC_COMPONENTS_GAIA"));
        ryq ryqVarD = yauVar.d();
        c = ryqVarD;
        b = new rzy("com.google.android.libraries.mdi.sync", ryqVarD);
        a = null;
    }

    private xhb() {
    }
}
