package defpackage;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vno implements vln {
    private final vof a;
    private final agow b;
    private final agow c;
    private final Executor d;

    public vno(vof vofVar, agow agowVar, agow agowVar2, Executor executor) {
        this.a = vofVar;
        this.b = agowVar;
        this.c = agowVar2;
        this.d = executor;
    }

    private final zyd j(Collection collection, final boolean z) {
        final Bundle bundle = new Bundle();
        acas.e(bundle, new ArrayList(collection));
        return this.a.a(this.d, wyo.c(new zvi() { // from class: vne
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final vns vnsVar = (vns) obj;
                wum.w(false);
                final Bundle bundle2 = bundle;
                final boolean z2 = z;
                return xt.a(new xq() { // from class: vni
                    @Override // defpackage.xq
                    public final Object a(xo xoVar) {
                        vnsVar.c(bundle2, new vnm(xoVar), z2);
                        return "AccountSyncService#addAccounts";
                    }
                });
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zyd k(Collection collection, final boolean z) {
        final int[] iArr = new int[((zcg) collection).d];
        int i = 0;
        zdm zdmVarListIterator = ((yyk) collection).listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            iArr[i] = ((AccountId) zdmVarListIterator.next()).a();
            i++;
        }
        return this.a.a(this.d, wyo.c(new zvi() { // from class: vnj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final vns vnsVar = (vns) obj;
                wum.w(false);
                final int[] iArr2 = iArr;
                final boolean z2 = z;
                return xt.a(new xq() { // from class: vmz
                    @Override // defpackage.xq
                    public final Object a(xo xoVar) {
                        vnsVar.f(iArr2, new vnn(xoVar), z2);
                        return "AccountSyncService#removeAccounts";
                    }
                });
            }
        }));
    }

    @Override // defpackage.vln
    public final zyd a(Collection collection) {
        return j(collection, true);
    }

    @Override // defpackage.vln
    public final zyd b(Collection collection) {
        return j(collection, false);
    }

    @Override // defpackage.vln
    public final zyd c(final AccountId accountId) {
        return this.a.a(this.d, wyo.c(new zvi() { // from class: vnc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final vns vnsVar = (vns) obj;
                final AccountId accountId2 = accountId;
                return xt.a(new xq() { // from class: vna
                    @Override // defpackage.xq
                    public final Object a(xo xoVar) {
                        vnn vnnVar = new vnn(xoVar);
                        vnsVar.d(((AutoValue_AccountId) accountId2).a, vnnVar);
                        return "AccountSyncService#disable";
                    }
                });
            }
        }));
    }

    @Override // defpackage.vln
    public final zyd d(final AccountId accountId) {
        if (!((Boolean) ((Optional) ((aejh) this.c).b).orElse(false)).booleanValue()) {
            return i(accountId);
        }
        zyd zydVarE = ((vhb) this.b.a()).e(accountId);
        zvi zviVar = new zvi() { // from class: vnf
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return zxy.a;
                }
                return this.a.i(accountId);
            }
        };
        return zuz.h(zydVarE, wyo.c(zviVar), this.d);
    }

    @Override // defpackage.vln
    public final zyd e(Collection collection) {
        return k(collection, true);
    }

    @Override // defpackage.vln
    public final zyd f(Collection collection) {
        return k(collection, false);
    }

    @Override // defpackage.vln
    public final zyd g(Collection collection) {
        final Bundle bundle = new Bundle();
        acas.e(bundle, new ArrayList(collection));
        return this.a.a(this.d, wyo.c(new zvi() { // from class: vng
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final vns vnsVar = (vns) obj;
                wum.w(false);
                final Bundle bundle2 = bundle;
                return xt.a(new xq() { // from class: vnl
                    @Override // defpackage.xq
                    public final Object a(xo xoVar) {
                        vnsVar.g(bundle2, new vnn(xoVar));
                        return "AccountSyncService#sync";
                    }
                });
            }
        }));
    }

    @Override // defpackage.vln
    public final zyd h(Collection collection, yzq yzqVar) {
        final Bundle bundle = new Bundle();
        acas.e(bundle, new ArrayList(collection));
        bundle.putStringArrayList("account_types", new ArrayList<>(yzqVar));
        return this.a.a(this.d, wyo.c(new zvi() { // from class: vnh
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final vns vnsVar = (vns) obj;
                wum.w(false);
                final Bundle bundle2 = bundle;
                return xt.a(new xq() { // from class: vnd
                    @Override // defpackage.xq
                    public final Object a(xo xoVar) {
                        vnsVar.h(bundle2, new vnn(xoVar));
                        return "AccountSyncService#syncAccountsForTypes";
                    }
                });
            }
        }));
    }

    public final zyd i(final AccountId accountId) {
        return this.a.a(this.d, wyo.c(new zvi() { // from class: vnk
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final vns vnsVar = (vns) obj;
                wum.w(false);
                final AccountId accountId2 = accountId;
                return xt.a(new xq() { // from class: vnb
                    @Override // defpackage.xq
                    public final Object a(xo xoVar) {
                        vnn vnnVar = new vnn(xoVar);
                        vnsVar.e(((AutoValue_AccountId) accountId2).a, vnnVar);
                        return "AccountSyncService#enable";
                    }
                });
            }
        }));
    }
}
