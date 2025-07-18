package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xwa extends xvx {
    final /* synthetic */ xwd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwa(xwe xweVar, xwd xwdVar) {
        super(xweVar.a);
        this.a = xwdVar;
    }

    @Override // defpackage.xvx
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            xwd xwdVar = this.a;
            synchronized (xwdVar) {
                if (xwdVar.b.isEmpty()) {
                    xwdVar.b = null;
                    xwdVar.a = true;
                    return;
                } else {
                    list = xwdVar.b;
                    xwdVar.b = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
