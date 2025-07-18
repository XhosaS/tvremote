package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yz extends zl {
    final String a;
    final yy b;

    public yz(String str, yy yyVar) {
        this.a = str;
        this.b = yyVar;
    }

    @Override // defpackage.zl
    public final void b(int i) throws RemoteException {
        yy yyVar;
        String str = this.a;
        if (str == null || (yyVar = this.b) == null) {
            return;
        }
        yyVar.d(str, i);
    }

    @Override // defpackage.zl
    public final void c(int i) throws RemoteException {
        yy yyVar;
        String str = this.a;
        if (str == null || (yyVar = this.b) == null) {
            return;
        }
        yyVar.e(str, i);
    }
}
