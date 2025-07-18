package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jky extends ixi {
    public static final Handler d;
    public final iof e;
    public final Map f;
    public final iom g;

    static {
        Handler handlerK = crh.k(Looper.getMainLooper());
        handlerK.getClass();
        d = handlerK;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jky(iom iomVar, iof iofVar, wkx wkxVar) {
        vvd vvdVar = wuk.f;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.g = iomVar;
        this.e = iofVar;
        this.f = new LinkedHashMap();
    }

    public final wuj i(wll wllVar) {
        Object next;
        wuk wukVar = (wuk) this.b;
        vun vunVar = wukVar.c;
        vunVar.getClass();
        Iterator<E> it = vunVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            wll wllVar2 = ((wuj) next).b;
            if (wllVar2 == null) {
                wllVar2 = wll.a;
            }
            if (yks.e(wllVar2, wllVar)) {
                break;
            }
        }
        wuj wujVar = (wuj) next;
        if (wujVar != null) {
            return wujVar;
        }
        vun vunVar2 = wukVar.c;
        vunVar2.getClass();
        Object objW = yfm.W(vunVar2);
        objW.getClass();
        return (wuj) objW;
    }

    public final ArrayList j() {
        vun<wuj> vunVar = ((wuk) this.b).c;
        vunVar.getClass();
        ArrayList arrayList = new ArrayList(yfm.z(vunVar, 10));
        for (wuj wujVar : vunVar) {
            String str = wujVar.c;
            str.getClass();
            wll wllVar = wujVar.b;
            if (wllVar == null) {
                wllVar = wll.a;
            }
            String str2 = wllVar.b == 1 ? (String) wllVar.c : "";
            str2.getClass();
            arrayList.add(new kfr(str, str2, null));
        }
        return new ArrayList(arrayList);
    }
}
