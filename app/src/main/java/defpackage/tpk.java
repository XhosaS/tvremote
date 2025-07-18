package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tpk extends tpr {
    @Override // defpackage.tpr
    protected final int a(Context context, tpq tpqVar, boolean z) {
        return (tpqVar.a.getAuthority().lastIndexOf(64) < 0 || abw.a(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
