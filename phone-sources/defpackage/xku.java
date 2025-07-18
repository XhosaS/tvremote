package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xku implements xkt {

    @Deprecated
    public static final ryn a = xhf.b.d("PersistentRoomDatabaseFeature__enabled", false);
    private final Context b;

    public xku(Context context) {
        this.b = context;
    }

    @Override // defpackage.xkt
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
