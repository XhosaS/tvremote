package defpackage;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgj implements vgh, bbv {
    private static final zdy d = zdy.h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked");
    public int a;
    public vhg b;
    public int c;
    private final wit e;
    private final vgd f;

    public vgj(wit witVar, vgd vgdVar) {
        new ArrayList();
        this.a = -1;
        this.b = vhg.a;
        this.c = 0;
        this.e = witVar;
        this.f = vgdVar;
        Boolean bool = false;
        bool.getClass();
        witVar.ek().b(this);
        witVar.en().a("tiktok_activity_account_state_saved_instance_state", new bqn() { // from class: vgi
            @Override // defpackage.bqn
            public final Bundle a() {
                Bundle bundle = new Bundle();
                vgj vgjVar = this.a;
                bundle.putInt("state_account_id", vgjVar.a);
                acas.b(bundle, "state_account_info", vgjVar.b);
                bundle.putInt("state_account_state", vgjVar.c);
                bundle.putBoolean("tiktok_accounts_disabled", false);
                return bundle;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void h(de deVar) {
        try {
            deVar.ad(null);
            List<bq> listI = deVar.b.i();
            if (listI == null || listI.isEmpty()) {
                return;
            }
            ab abVar = new ab(deVar);
            for (bq bqVar : listI) {
                if ((bqVar instanceof aeiz) && (((aeiz) bqVar).dN() instanceof vgg)) {
                    abVar.k(bqVar);
                } else {
                    de deVarEg = bqVar.eg();
                    deVarEg.ac();
                    h(deVarEg);
                }
            }
            if (abVar.d.isEmpty()) {
                return;
            }
            abVar.s = true;
            abVar.e();
        } catch (IllegalStateException e) {
            StringWriter stringWriter = new StringWriter();
            deVar.A("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((zdv) ((zdv) ((zdv) d.c()).p(e)).q("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked", "clearFragments", 333, "ActivityAccountStateActivityBacked.java")).x("popBackStackImmediate failure, fragment state %s", new aawt(aaws.NO_USER_DATA, stringWriter.toString()));
            throw e;
        }
    }

    @Override // defpackage.bbv
    public final void eY(bcl bclVar) {
        wit witVar = this.e;
        Bundle bundleA = witVar.en().a.c ? witVar.en().a.a("tiktok_activity_account_state_saved_instance_state") : null;
        if (bundleA != null) {
            if (bundleA.getBoolean("tiktok_accounts_disabled")) {
                h(this.e.eE());
                return;
            }
            this.a = bundleA.getInt("state_account_id", -1);
            try {
                this.b = (vhg) acas.a(bundleA, "state_account_info", vhg.a, ExtensionRegistryLite.getGeneratedRegistry());
                int i = bundleA.getInt("state_account_state", 0);
                this.c = i;
                if (i != 0) {
                    if (i == 1) {
                        this.f.c();
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                        }
                        this.f.b();
                    } else {
                        vgd vgdVar = this.f;
                        AccountId.b(this.a);
                        vgdVar.a(this.b);
                    }
                }
            } catch (abxv e) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
            }
        }
    }

    @Override // defpackage.vgh
    public final int g() {
        uea.c();
        return this.a;
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void b(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void c(bcl bclVar) {
    }

    @Override // defpackage.bbv
    public final /* synthetic */ void d(bcl bclVar) {
    }
}
