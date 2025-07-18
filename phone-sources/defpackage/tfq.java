package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfq extends tfj {
    final /* synthetic */ IBinder a;
    final /* synthetic */ itp b;

    public tfq(itp itpVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = itpVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.IInterface, java.lang.Object] */
    @Override // defpackage.tfj
    public final void a() throws RemoteException {
        Object obj = this.b.a;
        tfs tfsVar = (tfs) obj;
        tfsVar.m = tfsVar.h.a(this.a);
        try {
            ((tfs) obj).m.asBinder().linkToDeath(((tfs) obj).j, 0);
        } catch (RemoteException e) {
            tfsVar.n.an(e, "linkToDeath failed", new Object[0]);
        }
        tfs tfsVar2 = (tfs) this.b.a;
        tfsVar2.f = false;
        List list = tfsVar2.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list.clear();
    }
}
