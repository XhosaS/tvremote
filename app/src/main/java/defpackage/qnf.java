package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qnf implements zxe {
    @Override // defpackage.zxe
    public final void a(Throwable th) {
        if (th instanceof qna) {
            return;
        }
        Log.w("OneGoogle", String.format("Failed to load owner avatar. exception type: %s", th.getClass().getName()));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
