package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fua extends fun {
    final String a;
    final ftz b;

    public fua(String str, ftz ftzVar) {
        this.a = str;
        this.b = ftzVar;
    }

    @Override // defpackage.fun
    public final void d(int i) throws RemoteException {
        ftz ftzVar;
        String str = this.a;
        if (str == null || (ftzVar = this.b) == null) {
            return;
        }
        ftzVar.g(str, i);
    }

    @Override // defpackage.fun
    public final void f(int i) throws RemoteException {
        ftz ftzVar;
        String str = this.a;
        if (str == null || (ftzVar = this.b) == null) {
            return;
        }
        ftzVar.h(str, i);
    }
}
