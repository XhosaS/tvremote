package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmx {
    public static final zdy a = zdy.h("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer");
    public final agow b;

    public vmx(agow agowVar) {
        this.b = agowVar;
    }

    public static Bundle a(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("exception", th);
        return bundle;
    }
}
