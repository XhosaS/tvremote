package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhi implements uef {
    public boolean a = false;

    @Override // defpackage.uef
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InputStream a(uee ueeVar) {
        InputStream inputStreamD = ueeVar.b.d(ueeVar.f);
        if (this.a) {
            inputStreamD = new BufferedInputStream(inputStreamD);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamD);
        List list = ueeVar.d;
        if (!list.isEmpty()) {
            int i = ueb.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((uht) it.next()).f();
            }
            ueb uebVar = !arrayList2.isEmpty() ? new ueb(inputStreamD, arrayList2) : null;
            if (uebVar != null) {
                arrayList.add(uebVar);
            }
        }
        Iterator it2 = ueeVar.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((uhv) it2.next()).a(ueeVar.e, (InputStream) zag.e(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
