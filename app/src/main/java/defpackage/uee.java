package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uee {
    public final ueg a;
    public final uhp b;
    public final List c;
    public final List d;
    public final Uri e;
    public final Uri f;

    public uee(ued uedVar) {
        this.a = uedVar.a;
        this.b = uedVar.b;
        this.c = uedVar.c;
        this.d = uedVar.d;
        this.e = uedVar.e;
        this.f = uedVar.f;
    }

    public final List a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        List list = this.d;
        if (!list.isEmpty()) {
            Uri uri = this.e;
            int i = uec.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uhs uhsVarB = ((uht) it.next()).b(uri);
                if (uhsVarB != null) {
                    arrayList2.add(uhsVarB);
                }
            }
            uec uecVar = !arrayList2.isEmpty() ? new uec(outputStream, arrayList2) : null;
            if (uecVar != null) {
                arrayList.add(uecVar);
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((uhv) it2.next()).b(this.e, (OutputStream) zag.e(arrayList)));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }
}
