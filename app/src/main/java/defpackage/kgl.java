package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
class kgl implements kfs {
    final /* synthetic */ kgu a;

    public kgl(kgu kguVar) {
        this.a = kguVar;
    }

    @Override // defpackage.kfs
    public final void a(boolean z) {
        Handler handler = this.a.o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
