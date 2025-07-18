package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmq implements xmp {
    public static final ryv a = new ryv(xhf.b, 15);
    public final Context b;

    public xmq(Context context) {
        this.b = context;
    }

    @Override // defpackage.xmp
    public final boolean a() {
        return ((Boolean) a.e(1, "UmpLibraryV2Feature__enable_data_sync", true).et(this.b)).booleanValue();
    }

    @Override // defpackage.xmp
    public final boolean d() {
        return ((Boolean) a.e(5, "UmpLibraryV2Feature__enabled", false).et(this.b)).booleanValue();
    }
}
