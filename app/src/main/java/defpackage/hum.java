package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class hum implements hlx {
    final /* synthetic */ String a;

    public hum(String str) {
        this.a = str;
    }

    @Override // defpackage.hlx
    public final Intent a() {
        Intent intent = new Intent();
        intent.setAction("com.google.android.assistant.action.VIEW_ATTRIBUTION");
        intent.putExtras(c());
        return intent;
    }

    @Override // defpackage.hlx
    public final bq b() {
        huo huoVar = new huo();
        huoVar.ae(c());
        return huoVar;
    }

    final Bundle c() {
        Bundle bundle = new Bundle(1);
        bundle.putString("page_url", this.a);
        return bundle;
    }
}
