package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xie implements xid {

    @Deprecated
    public static final ryn a = xhf.b.d("ChimeUiNotificationsFeature__enabled", true);
    private final Context b;

    public xie(Context context) {
        this.b = context;
    }

    @Override // defpackage.xid
    public final boolean a() {
        return ((Boolean) a.et(this.b)).booleanValue();
    }
}
