package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlb implements xla {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;
    public final Context c;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.b("PlayerRatingOverlayFeature__display_duration_millis", 10000L);
        b = rzyVar.d("PlayerRatingOverlayFeature__enabled", false);
    }

    public xlb(Context context) {
        this.c = context;
    }
}
