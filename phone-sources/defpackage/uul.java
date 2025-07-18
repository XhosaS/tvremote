package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uul implements yfo {
    final /* synthetic */ Context a;
    final /* synthetic */ yfo b;
    private uui c = null;

    public uul(Context context, yfo yfoVar) {
        this.a = context;
        this.b = yfoVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uui b() {
        if (this.c == null) {
            this.c = new uui(this.a.getPackageName(), (String) this.b.b());
        }
        return this.c;
    }
}
