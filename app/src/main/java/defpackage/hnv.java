package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class hnv implements hlx {
    final Bundle a;
    final /* synthetic */ adwq b;
    final /* synthetic */ String c;

    public hnv(adwq adwqVar, String str) {
        this.b = adwqVar;
        this.c = str;
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("image-url", str);
        }
        if ((adwqVar.b & 16) != 0) {
            bundle.putString("license-information", adwqVar.e);
        }
        if ((adwqVar.b & 32) != 0) {
            bundle.putString("license-url", adwqVar.f);
        }
        if ((adwqVar.b & 1) != 0) {
            bundle.putString("source-url", adwqVar.c);
        }
        if ((adwqVar.b & 8) != 0) {
            bundle.putString("author-name", adwqVar.d);
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
