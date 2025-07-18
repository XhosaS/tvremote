package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feh {
    private final Context a;
    private final zyh b;

    public feh(Context context, zyh zyhVar) {
        this.a = context;
        this.b = zyhVar;
    }

    public final fed a(String str) {
        return new feg(str, this.a, this.b);
    }
}
