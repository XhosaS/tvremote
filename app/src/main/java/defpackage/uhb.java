package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhb implements uef {
    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) {
        OutputStream outputStreamE = ueeVar.b.e(ueeVar.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamE);
        List list = ueeVar.d;
        if (!list.isEmpty()) {
            Uri uri = ueeVar.e;
            int i = uec.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uhs uhsVarA = ((uht) it.next()).a(uri);
                if (uhsVarA != null) {
                    arrayList2.add(uhsVarA);
                }
            }
            uec uecVar = !arrayList2.isEmpty() ? new uec(outputStreamE, arrayList2) : null;
            if (uecVar != null) {
                arrayList.add(uecVar);
            }
        }
        Iterator it2 = ueeVar.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((uhv) it2.next()).d((OutputStream) zag.e(arrayList)));
        }
        Collections.reverse(arrayList);
        return (OutputStream) arrayList.get(0);
    }
}
