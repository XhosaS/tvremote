package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vmu implements zxe {
    private final vny a;

    public vmu(vny vnyVar) {
        this.a = vnyVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        try {
            this.a.c(vmx.a(th));
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceCallbackCompletingFutureCallback", "onFailure", (char) 370, "AccountSyncServicePeer.java")).u("Exception in client failure callback");
        } catch (RuntimeException e2) {
            try {
                this.a.c(vmx.a(new vmw(th, e2)));
            } catch (RemoteException e3) {
                ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e3)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceCallbackCompletingFutureCallback", "onFailure", (char) 375, "AccountSyncServicePeer.java")).u("Exception in client failure callback after serialization failure");
            }
        }
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        try {
            this.a.d();
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceCallbackCompletingFutureCallback", "onSuccess", (char) 361, "AccountSyncServicePeer.java")).u("Exception in client in success callback");
        }
    }
}
