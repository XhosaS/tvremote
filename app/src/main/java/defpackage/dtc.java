package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtc extends dtu {
    public final List a;

    protected dtc(dtu dtuVar, dtu dtuVar2) {
        super(null, -1, null);
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(dtuVar);
        arrayList.add(dtuVar2);
    }

    @Override // defpackage.dtu, defpackage.dtn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a((dtu) obj);
    }

    @Override // defpackage.dtu
    /* renamed from: c */
    public final boolean a(dtu dtuVar) {
        if (this == dtuVar) {
            return true;
        }
        if (dtuVar == null) {
            return false;
        }
        if (dtuVar.getClass() != getClass()) {
            return false;
        }
        List list = ((dtc) dtuVar).a;
        List list2 = this.a;
        int size = list2.size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!((dtu) list2.get(i)).a((dtu) list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dtu
    public final void cC(Object obj) {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((dtu) list.get(i)).cC(obj);
        }
    }
}
