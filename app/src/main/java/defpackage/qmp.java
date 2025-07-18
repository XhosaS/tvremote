package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qmp implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        Log.w("OneGoogle", "Failed to grant account access to app", th);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        Log.e("OneGoogle", "Failed to grant account access to app");
    }
}
