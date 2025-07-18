package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmt extends vnr {
    private final vhq a;
    private final vin b;
    private final Executor c;
    private final wtd d;

    public vmt(vhq vhqVar, vin vinVar, Executor executor, wtd wtdVar) {
        this.a = vhqVar;
        this.b = vinVar;
        this.c = executor;
        this.d = wtdVar;
    }

    private static void i(vms vmsVar, Exception exc) {
        try {
            vmsVar.a(vmx.a(exc));
        } catch (RemoteException e) {
            e.addSuppressed(exc);
            ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceBinder", "callOnFailure", (char) 287, "AccountSyncServicePeer.java")).u("Exception in client failure callback");
        } catch (RuntimeException e2) {
            try {
                vmsVar.a(vmx.a(new vmw(exc, e2)));
            } catch (RemoteException e3) {
                e3.addSuppressed(exc);
                ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e3)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceBinder", "callOnFailure", (char) 282, "AccountSyncServicePeer.java")).u("Exception in client failure callback after serialization failure");
            }
        }
    }

    private static void j(final vnv vnvVar, Exception exc) {
        vnvVar.getClass();
        i(new vms() { // from class: vmr
            @Override // defpackage.vms
            public final void a(Bundle bundle) {
                vnvVar.c(bundle);
            }
        }, exc);
    }

    private static void k(final vny vnyVar, Exception exc) {
        vnyVar.getClass();
        i(new vms() { // from class: vmq
            @Override // defpackage.vms
            public final void a(Bundle bundle) {
                vnyVar.c(bundle);
            }
        }, exc);
    }

    @Override // defpackage.vns
    public final void c(Bundle bundle, vnv vnvVar, boolean z) {
        wwt wwtVarA = this.d.a("addAccounts");
        try {
            try {
                try {
                    List listC = acas.c(bundle, vhg.a, ExtensionRegistryLite.getGeneratedRegistry());
                    zxn.p(z ? this.b.l(listC) : this.b.m(listC), wyo.f(new vmp(vnvVar)), this.c);
                } catch (abxv e) {
                    ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceBinder", "addAccounts", 233, "AccountSyncServicePeer.java")).u("Invalid AccountInfos");
                    j(vnvVar, e);
                }
            } catch (RuntimeException e2) {
                j(vnvVar, e2);
            }
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vns
    public final void d(int i, vny vnyVar) {
        wwt wwtVarA = this.d.a("disable");
        try {
            try {
                zxn.p(this.a.a(AccountId.b(i)), wyo.f(new vmu(vnyVar)), this.c);
            } catch (RuntimeException e) {
                k(vnyVar, e);
            }
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vns
    public final void e(int i, vny vnyVar) {
        wwt wwtVarA = this.d.a("enable");
        try {
            try {
                zxn.p(this.a.b(AccountId.b(i)), wyo.f(new vmu(vnyVar)), this.c);
            } catch (RuntimeException e) {
                k(vnyVar, e);
            }
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vns
    public final void f(int[] iArr, vny vnyVar, boolean z) {
        wwt wwtVarA = this.d.a("removeAccounts");
        try {
            int i = yyk.e;
            yyf yyfVar = new yyf(4);
            for (int i2 : iArr) {
                yyfVar.g(AccountId.b(i2));
            }
            zxn.p(z ? this.b.n(yyfVar.f()) : this.b.o(yyfVar.f()), wyo.f(new vmu(vnyVar)), this.c);
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vns
    public final void g(Bundle bundle, vny vnyVar) {
        wwt wwtVarA = this.d.a("sync");
        try {
            try {
                zxn.p(this.a.j(acas.c(bundle, vhg.a, ExtensionRegistryLite.getGeneratedRegistry())), wyo.f(new vmu(vnyVar)), this.c);
            } catch (abxv e) {
                ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceBinder", "sync", 164, "AccountSyncServicePeer.java")).u("Invalid AccountInfos");
                k(vnyVar, e);
            } catch (RuntimeException e2) {
                k(vnyVar, e2);
            }
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vns
    public final void h(Bundle bundle, vny vnyVar) {
        wwt wwtVarA = this.d.a("syncForTypes");
        try {
            try {
                List listC = acas.c(bundle, vhg.a, ExtensionRegistryLite.getGeneratedRegistry());
                ArrayList<String> stringArrayList = bundle.getStringArrayList("account_types");
                stringArrayList.getClass();
                zxn.p(this.a.k(listC, yzq.o(stringArrayList)), wyo.f(new vmu(vnyVar)), this.c);
            } catch (abxv e) {
                ((zdv) ((zdv) ((zdv) vmx.a.c()).p(e)).q("com/google/apps/tiktok/account/data/manager/AccountSyncServicePeer$AccountSyncServiceBinder", "syncForTypes", 197, "AccountSyncServicePeer.java")).u("Invalid AccountInfos");
                k(vnyVar, e);
            } catch (RuntimeException e2) {
                k(vnyVar, e2);
            }
            wwtVarA.close();
        } catch (Throwable th) {
            try {
                wwtVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
