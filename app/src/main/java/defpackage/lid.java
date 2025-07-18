package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
class lid implements lin {
    final /* synthetic */ lih a;

    public lid(lih lihVar) {
        this.a = lihVar;
    }

    @Override // defpackage.lin
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.aC().h(new lic(this, str, str2, bundle));
            return;
        }
        lbk lbkVar = this.a.l;
        if (lbkVar != null) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("AppId not known when logging event", str2);
        }
    }
}
