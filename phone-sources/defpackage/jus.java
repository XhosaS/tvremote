package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jus extends ixi {
    public final Map d;
    public wok e;
    private final isi f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jus(wkx wkxVar, isi isiVar) {
        wok wokVar;
        Object next;
        vvd vvdVar = wub.e;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.f = isiVar;
        wok wokVar2 = wok.a;
        wokVar2.getClass();
        this.e = wokVar2;
        String str = isiVar.i.m;
        str.getClass();
        if (str.length() > 0) {
            Iterator it = i().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (yks.e(((wok) next).b, this.f.i.m)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            wokVar = (wok) next;
            if (wokVar == null) {
                wok wokVar3 = ((wub) this.b).d;
                wokVar2 = wokVar3 != null ? wokVar3 : wokVar2;
                wokVar2.getClass();
                wokVar = wokVar2;
            }
        } else {
            wok wokVar4 = ((wub) this.b).d;
            if (!yks.e(wokVar4 == null ? wokVar2 : wokVar4, wokVar2) || i().isEmpty()) {
                wok wokVar5 = ((wub) this.b).d;
                wokVar2 = wokVar5 != null ? wokVar5 : wokVar2;
                wokVar2.getClass();
                wokVar = wokVar2;
            } else {
                wokVar = (wok) i().get(0);
            }
        }
        j(wokVar);
        List<wok> listI = i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(listI, 10)), 16));
        for (wok wokVar6 : listI) {
            String str2 = wokVar6.b;
            str2.getClass();
            linkedHashMap.put(str2, wokVar6);
        }
        this.d = linkedHashMap;
    }

    public final List i() {
        wol wolVar = ((wub) this.b).c;
        if (wolVar == null) {
            wolVar = wol.a;
        }
        vun vunVar = wolVar.b;
        vunVar.getClass();
        return vunVar;
    }

    public final void j(wok wokVar) {
        wokVar.getClass();
        if (yks.e(this.e, wokVar)) {
            return;
        }
        this.f.e(new ill(wokVar, 17));
        this.e = wokVar;
        z();
    }
}
