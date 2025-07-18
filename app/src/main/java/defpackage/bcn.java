package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcn {
    public bcf a;
    private bcj b;

    public bcn(bck bckVar, bcf bcfVar) {
        bcj bdfVar;
        bcfVar.getClass();
        bcr bcrVar = bcr.a;
        boolean z = bckVar instanceof bcj;
        boolean z2 = bckVar instanceof bbv;
        if (z && z2) {
            bdfVar = new bbw((bbv) bckVar, (bcj) bckVar);
        } else if (z2) {
            bdfVar = new bbw((bbv) bckVar, null);
        } else if (z) {
            bdfVar = (bcj) bckVar;
        } else {
            Class<?> cls = bckVar.getClass();
            bcr bcrVar2 = bcr.a;
            if (bcrVar2.a(cls) == 2) {
                Object obj = bcr.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    bdfVar = new bea(bcrVar2.b((Constructor) list.get(0), bckVar));
                } else {
                    int size = list.size();
                    bby[] bbyVarArr = new bby[size];
                    for (int i = 0; i < size; i++) {
                        bbyVarArr[i] = bcrVar2.b((Constructor) list.get(i), bckVar);
                    }
                    bdfVar = new bbu(bbyVarArr);
                }
            } else {
                bdfVar = new bdf(bckVar);
            }
        }
        this.b = bdfVar;
        this.a = bcfVar;
    }

    public final void a(bcl bclVar, bce bceVar) {
        bcf bcfVarA = bceVar.a();
        this.a = bco.a.a(this.a, bcfVarA);
        this.b.a(bclVar, bceVar);
        this.a = bcfVarA;
    }
}
