package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class os implements oy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public os(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.oy
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            dln dlnVar = (dln) obj;
            if (dlnVar == null) {
                dlnVar = new dln(-3);
            }
            ((awy) this.a).n(dlnVar);
            return;
        }
        dln dlnVar2 = (dln) obj;
        synchronized (ot.c) {
            mi miVar = ot.d;
            Object obj2 = this.a;
            ArrayList arrayList = (ArrayList) miVar.get(obj2);
            if (arrayList == null) {
                return;
            }
            miVar.remove(obj2);
            for (int i = 0; i < arrayList.size(); i++) {
                ((oy) arrayList.get(i)).a(dlnVar2);
            }
        }
    }
}
