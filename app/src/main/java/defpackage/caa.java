package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caa implements bzy {
    public static final caa a = new caa();

    private caa() {
    }

    @Override // defpackage.bzy
    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
