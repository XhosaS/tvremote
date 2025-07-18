package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vqh implements zxe {
    final /* synthetic */ String a;

    public vqh(String str) {
        this.a = str;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            ((zdv) ((zdv) ((zdv) vqi.a.d()).p(th)).q("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 192, "AndroidFutures.java")).x("exceeded timeout: %s", this.a);
        }
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
    }
}
