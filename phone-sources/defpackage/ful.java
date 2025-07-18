package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ful extends Handler {
    final /* synthetic */ fup a;

    public ful(fup fupVar) {
        this.a = fupVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            fup fupVar = this.a;
            fupVar.h = false;
            fupVar.e(fupVar.g);
            return;
        }
        fup fupVar2 = this.a;
        fupVar2.j = false;
        pku pkuVar = fupVar2.k;
        if (pkuVar != null) {
            fuq fuqVar = fupVar2.i;
            ftw ftwVar = (ftw) pkuVar.a;
            fuw fuwVarC = ftwVar.c(fupVar2);
            if (fuwVarC != null) {
                ftwVar.p(fuwVarC, fuqVar);
            }
        }
    }
}
