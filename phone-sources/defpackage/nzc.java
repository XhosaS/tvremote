package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nzc implements nxp {
    final /* synthetic */ nzg a;

    public nzc(nzg nzgVar) {
        this.a = nzgVar;
    }

    @Override // defpackage.nxp
    public final void a(boolean z) {
        Handler handler = this.a.o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
