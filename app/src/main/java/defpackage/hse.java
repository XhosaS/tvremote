package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class hse implements hlx {
    final Bundle a;
    final /* synthetic */ hsj b;

    public hse(hsj hsjVar) {
        this.b = hsjVar;
        adwq adwqVarE = hsjVar.e();
        String strJ = hsjVar.j();
        Bundle bundle = new Bundle();
        if (strJ != null) {
            bundle.putString("image-url", strJ);
        }
        if ((adwqVarE.b & 16) != 0) {
            bundle.putString("license-information", adwqVarE.e);
        }
        if ((adwqVarE.b & 32) != 0) {
            bundle.putString("license-url", adwqVarE.f);
        }
        if ((adwqVarE.b & 1) != 0) {
            bundle.putString("source-url", adwqVarE.c);
        }
        if ((adwqVarE.b & 8) != 0) {
            bundle.putString("author-name", adwqVarE.d);
        }
        this.a = bundle;
    }

    @Override // defpackage.hlx
    public final Intent a() {
        Intent intent = new Intent();
        intent.setAction("com.google.android.assistant.action.IMAGE_ATTRIBUTION");
        intent.putExtras(this.a);
        return intent;
    }

    @Override // defpackage.hlx
    public final bq b() {
        hki hkiVar = new hki();
        hkiVar.ae(this.a);
        return hkiVar;
    }
}
