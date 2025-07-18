package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vmp implements zxe {
    private final vnv a;

    public vmp(vnv vnvVar) {
        this.a = vnvVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) vmx.a.c()).p(th)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceAddAccountsCallbackCompletingFutureCallback", "onFailure", (char) 329, "AccountSyncServicePeer.java")).u("Failure in AccountManager");
        try {
            this.a.c(vmx.a(th));
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceAddAccountsCallbackCompletingFutureCallback", "onFailure", (char) 334, "AccountSyncServicePeer.java")).u("Exception in client in failure callback");
        } catch (RuntimeException e2) {
            try {
                this.a.c(vmx.a(new vmw(th, e2)));
            } catch (RemoteException e3) {
                ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e3)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceAddAccountsCallbackCompletingFutureCallback", "onFailure", (char) 339, "AccountSyncServicePeer.java")).u("Exception in client failure callback after serialization failure");
            }
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putInt("account_ids", ((AccountId) entry.getKey()).a());
            acas.b(bundle, "account_infos", (MessageLite) entry.getValue());
            arrayList.add(bundle);
        }
        try {
            this.a.d(arrayList);
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceAddAccountsCallbackCompletingFutureCallback", "onSuccess", (char) 323, "AccountSyncServicePeer.java")).u("Exception in client in success callback");
        }
    }
}
