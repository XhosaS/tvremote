package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.apps.tiktok.account.AccountId;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdj implements olo {
    private static final zdy e = zdy.h("com/google/android/libraries/search/geller/retry/GellerSyncRetryImpl");
    public final Context a;
    public final GellerLoggingCallback b;
    public final Object c = new Object();
    yqt d = ypv.a;
    private final vjo f;
    private final Executor g;
    private final yqt h;

    public tdj(Context context, vjo vjoVar, GellerLoggingCallback gellerLoggingCallback, yqt yqtVar, zyg zygVar) {
        this.a = context;
        this.f = vjoVar;
        this.b = gellerLoggingCallback;
        this.h = yqtVar;
        this.g = zygVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, zyd] */
    @Override // defpackage.olo
    public final zyd a(Account account) {
        synchronized (this.c) {
            if (!this.d.g()) {
                return zxy.a;
            }
            final ?? C = this.d.c();
            final zyd zydVarC = this.f.c(account.name);
            return wzz.a(zydVarC, C).a(new zvh() { // from class: tdf
                @Override // defpackage.zvh
                public final zyd a() {
                    zyd zydVarA;
                    zyd zydVar = zydVarC;
                    zyd zydVar2 = C;
                    tdj tdjVar = this.a;
                    synchronized (tdjVar.c) {
                        Context context = tdjVar.a;
                        Iterator it = ((tdi) wgv.a(context, tdi.class, (AccountId) zxn.o(zydVar))).e().a().iterator();
                        while (it.hasNext()) {
                            acgd acgdVar = (acgd) it.next();
                            GellerLoggingCallback gellerLoggingCallback = tdjVar.b;
                            String strName = acgdVar.name();
                            otg otgVar = ((ony) gellerLoggingCallback).a;
                            ((uqo) ((oth) otgVar).a.ac.eV()).a(100L, ((oth) otgVar).b, ((oth) otgVar).c, strName);
                        }
                        tdjVar.d = ypv.a;
                        zydVarA = ((tdi) wgv.a(context, tdi.class, (AccountId) zxn.o(zydVar))).j().a((AccountId) zxn.o(zydVar), (UUID) zxn.o(zydVar2));
                    }
                    return zydVarA;
                }
            }, this.g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, zyd] */
    @Override // defpackage.olo
    public final zyd b(Account account) {
        if (!this.d.g()) {
            return zxn.h(false);
        }
        final ?? C = this.d.c();
        final zyd zydVarC = this.f.c(account.name);
        wzy wzyVarA = wzz.a(C, zydVarC);
        zvh zvhVar = new zvh() { // from class: tdg
            @Override // defpackage.zvh
            public final zyd a() {
                zyd zydVar = zydVarC;
                return ((tdi) wgv.a(this.a.a, tdi.class, (AccountId) zxn.o(zydVar))).j().c((AccountId) zxn.o(zydVar), (UUID) zxn.o(C));
            }
        };
        Executor executor = this.g;
        return wzyVarA.a(zvhVar, executor).h(new yqi() { // from class: tdh
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                Boolean boolValueOf;
                ccr ccrVar = (ccr) obj;
                tdj tdjVar = this.a;
                synchronized (tdjVar.c) {
                    if (yzq.r(ccq.d, ccq.c, ccq.f).contains(ccrVar.b)) {
                        tdjVar.d = ypv.a;
                    }
                    boolValueOf = Boolean.valueOf(tdjVar.d.g());
                }
                return boolValueOf;
            }
        }, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    @Override // defpackage.olo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.accounts.Account r9, defpackage.acfr r10, java.util.Map r11, defpackage.oln r12) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdj.c(android.accounts.Account, acfr, java.util.Map, oln):void");
    }
}
