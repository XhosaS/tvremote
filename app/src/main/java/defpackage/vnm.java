package defpackage;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vnm extends vnu {
    private final xo a;

    public vnm(xo xoVar) {
        this.a = xoVar;
    }

    @Override // defpackage.vnv
    public final void c(Bundle bundle) {
        this.a.d((Throwable) bundle.getSerializable("exception"));
    }

    @Override // defpackage.vnv
    public final void d(List list) {
        try {
            xo xoVar = this.a;
            yyn yynVar = new yyn(4);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Bundle bundle = (Bundle) it.next();
                yynVar.c(AccountId.b(bundle.getInt("account_ids")), (vhg) acas.a(bundle, "account_infos", vhg.a, ExtensionRegistryLite.getGeneratedRegistry()));
            }
            xoVar.b(yynVar.a(true));
        } catch (abxv e) {
            this.a.d(e);
        }
    }
}
