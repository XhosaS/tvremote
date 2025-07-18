package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hig {
    public Object a;
    public Object b;

    public hig() {
    }

    public final void a() {
        this.b = null;
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [dvi, java.lang.Object] */
    public final void b(dvk dvkVar, dvc dvcVar) {
        dvd dvdVarA = dvcVar.a();
        this.a = dvz.b((dvd) this.a, dvdVarA);
        this.b.a(dvkVar, dvcVar);
        this.a = dvdVarA;
    }

    public hig(dvj dvjVar, dvd dvdVar) {
        Object dwbVar;
        dvdVar.getClass();
        dvo dvoVar = dvo.a;
        boolean z = dvjVar instanceof dvi;
        boolean z2 = dvjVar instanceof duv;
        if (z && z2) {
            dwbVar = new duw((duv) dvjVar, (dvi) dvjVar);
        } else if (z2) {
            dwbVar = new duw((duv) dvjVar, null);
        } else if (z) {
            dwbVar = (dvi) dvjVar;
        } else {
            Class<?> cls = dvjVar.getClass();
            if (dvo.a.a(cls) == 2) {
                Object obj = dvo.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    dwbVar = new dwj(dvo.b((Constructor) list.get(0), dvjVar), 2);
                } else {
                    int size = list.size();
                    duy[] duyVarArr = new duy[size];
                    for (int i = 0; i < size; i++) {
                        duyVarArr[i] = dvo.b((Constructor) list.get(i), dvjVar);
                    }
                    dwbVar = new dwj(duyVarArr, 1);
                }
            } else {
                dwbVar = new dwb(dvjVar);
            }
        }
        this.b = dwbVar;
        this.a = dvdVar;
    }
}
