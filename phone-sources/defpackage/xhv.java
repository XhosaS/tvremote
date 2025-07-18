package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhv implements xhu {

    @Deprecated
    public static final ryn a = xhf.b.d("CastConnectFeature__enable_cast_connect_sender", true);
    private final Context b;

    public xhv(Context context) {
        this.b = context;
    }

    @Override // defpackage.xhu
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
