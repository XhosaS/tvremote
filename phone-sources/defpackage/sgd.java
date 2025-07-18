package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sgd extends sgh {
    @Override // defpackage.sgh
    protected final int a(Context context, rzy rzyVar, boolean z) {
        return (((Uri) rzyVar.b).getAuthority().lastIndexOf(64) < 0 || crn.b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
