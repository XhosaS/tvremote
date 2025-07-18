package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afpa extends afow {
    final /* synthetic */ afpm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpa(afpn afpnVar, afpm afpmVar) {
        super(afpnVar.a);
        this.a = afpmVar;
    }

    @Override // defpackage.afow
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            afpm afpmVar = this.a;
            synchronized (afpmVar) {
                if (afpmVar.c.isEmpty()) {
                    afpmVar.c = null;
                    afpmVar.b = true;
                    return;
                } else {
                    list = afpmVar.c;
                    afpmVar.c = arrayList;
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
