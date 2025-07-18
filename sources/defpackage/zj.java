package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zj extends Handler {
    final /* synthetic */ zn a;

    public zj(zn znVar) {
        this.a = znVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            zn znVar = this.a;
            znVar.i = false;
            znVar.d(znVar.h);
            return;
        }
        zn znVar2 = this.a;
        znVar2.k = false;
        byj byjVar = znVar2.l;
        if (byjVar != null) {
            zo zoVar = znVar2.j;
            yv yvVar = (yv) byjVar.a;
            zt ztVarC = yvVar.c(znVar2);
            if (ztVarC != null) {
                yvVar.n(ztVarC, zoVar);
            }
        }
    }
}
