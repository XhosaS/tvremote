package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctw implements cuh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ctw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cuh
    public final /* synthetic */ void accept(Object obj) {
        if (this.b != 0) {
            zuw zuwVar = (zuw) obj;
            if (zuwVar == null) {
                zuwVar = new zuw(-3);
            }
            ((dhk) this.a).h(zuwVar);
            return;
        }
        zuw zuwVar2 = (zuw) obj;
        synchronized (ctx.c) {
            ko koVar = ctx.d;
            Object obj2 = this.a;
            ArrayList arrayList = (ArrayList) koVar.get(obj2);
            if (arrayList == null) {
                return;
            }
            koVar.remove(obj2);
            for (int i = 0; i < arrayList.size(); i++) {
                ((cuh) arrayList.get(i)).accept(zuwVar2);
            }
        }
    }
}
