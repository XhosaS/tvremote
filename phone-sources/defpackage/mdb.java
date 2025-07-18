package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdb implements mcq {
    private final ldv a;
    private final ltp b;
    private final kuw c;

    public mdb(kuw kuwVar, ldv ldvVar, ltp ltpVar) {
        kuwVar.getClass();
        ldvVar.getClass();
        ltpVar.getClass();
        this.c = kuwVar;
        this.a = ldvVar;
        this.b = ltpVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lor] */
    @Override // defpackage.mcq
    public final boolean a() {
        kuw kuwVar = this.c;
        ?? r1 = kuwVar.a;
        boolean z = true;
        List listG = r1.g(1);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList<ksn> arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (String str : arrayList) {
            str.getClass();
            arrayList2.add(ksn.b(str));
        }
        for (ksn ksnVar : arrayList2) {
            if (this.a.s(ksnVar)) {
                String str2 = ksnVar.a;
                List listH = r1.h(str2, 2);
                ArrayList arrayList3 = new ArrayList(yfm.z(listH, 10));
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    arrayList3.add(jwq.Y((loq) it.next()));
                }
                ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayList3);
                immutableListCopyOf.getClass();
                List listH2 = r1.h(str2, 3);
                ArrayList arrayList4 = new ArrayList(yfm.z(listH2, 10));
                Iterator it2 = listH2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(jwq.Y((loq) it2.next()));
                }
                ImmutableList immutableListCopyOf2 = ImmutableList.copyOf((Collection) arrayList4);
                immutableListCopyOf2.getClass();
                if (!immutableListCopyOf.isEmpty() || !immutableListCopyOf2.isEmpty()) {
                    ieg iegVar = (ieg) this.b.b(new lum(ksnVar, immutableListCopyOf, immutableListCopyOf2));
                    if (!iegVar.k()) {
                        lun lunVar = (lun) iegVar.g();
                        ImmutableList immutableList = lunVar.a;
                        if (!immutableList.isEmpty() || !lunVar.b.isEmpty()) {
                            krd.e("Wishlist uploaded");
                            if (!((Boolean) ykr.n(yim.a, new mdv((mdw) kuwVar.b, str2, immutableList, lunVar.b, null))).booleanValue()) {
                            }
                        }
                    }
                    z = false;
                }
            }
        }
        return z;
    }
}
