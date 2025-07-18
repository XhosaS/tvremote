package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class mmq extends dxx {

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Map a;

    @eat(a = 5)
    yyk b;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicBoolean c;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicBoolean d;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    AtomicReference e;

    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Boolean f;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        aggi aggiVar;
        Object[] objArr = dxwVar.b;
        int i = dxwVar.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            dxz dxzVar = new dxz();
            dxzVar.a = this.f;
            dxz dxzVar2 = new dxz();
            dxzVar2.a = this.b;
            int iIntValue = ((Integer) objArr[0]).intValue();
            int iIntValue2 = ((Integer) objArr[1]).intValue();
            yyk yykVar = (yyk) dxzVar2.a;
            if (yykVar != null) {
                ArrayList arrayList = new ArrayList(yykVar);
                arrayList.add(iIntValue2, (String) arrayList.remove(iIntValue));
                dxzVar2.a = yyk.j(arrayList);
                dxzVar.a = true;
            }
            this.f = (Boolean) dxzVar.a;
            this.b = (yyk) dxzVar2.a;
            return;
        }
        dxz dxzVar3 = new dxz();
        dxzVar3.a = this.f;
        dxz dxzVar4 = new dxz();
        dxzVar4.a = this.b;
        dxz dxzVar5 = new dxz();
        dxzVar5.a = this.a;
        oal oalVar = (oal) objArr[0];
        oco ocoVar = (oco) objArr[1];
        nzu nzuVar = (nzu) objArr[2];
        aggh agghVar = (aggh) objArr[3];
        yxy yxyVarO = zcp.b;
        try {
            yxyVarO = yzq.o(nzuVar.identifiers());
        } catch (RuntimeException e) {
            ocoVar.d(acsw.LOG_TYPE_INTERNAL_ERROR, oalVar, e, "DDC is unable to obtain item identifiers.", new Object[0]);
        }
        yyk yykVar2 = (yyk) dxzVar4.a;
        Map map = (Map) dxzVar5.a;
        if (map != null) {
            synchronized (map) {
                if (yykVar2 != null) {
                    zdm zdmVarListIterator = yykVar2.listIterator(0);
                    while (zdmVarListIterator.hasNext()) {
                        String str = (String) zdmVarListIterator.next();
                        if (!yxyVarO.contains(str) && map.containsKey(str) && (aggiVar = (aggi) map.remove(str)) != null) {
                            agghVar.c(aggiVar);
                            aggiVar.dispose();
                        }
                    }
                }
            }
            dxzVar4.a = yxyVarO.f();
            dxzVar3.a = false;
        }
        this.f = (Boolean) dxzVar3.a;
        this.b = (yyk) dxzVar4.a;
        this.a = (Map) dxzVar5.a;
    }
}
