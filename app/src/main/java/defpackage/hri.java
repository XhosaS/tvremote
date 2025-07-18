package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
class hri implements hlx {
    final /* synthetic */ Intent a;

    public hri(Intent intent) {
        this.a = intent;
    }

    @Override // defpackage.hlx
    public final Intent a() {
        return this.a;
    }

    @Override // defpackage.hlx
    public final bq b() {
        hij hijVar = new hij();
        hijVar.ae(this.a.getExtras());
        return hijVar;
    }
}
