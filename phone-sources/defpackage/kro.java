package defpackage;

import android.net.Uri;
import com.google.common.collect.FluentIterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kro implements idf {
    private final /* synthetic */ int a;

    public /* synthetic */ kro(int i) {
        this.a = i;
    }

    @Override // defpackage.idf
    public final Object b(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (ieg iegVar : (List) obj) {
                    if (iegVar.m()) {
                        arrayList.add(iegVar.g());
                    }
                }
                return arrayList;
            case 1:
                return ((lsa) obj).a.i().c;
            case 2:
                List list = (List) obj;
                return list.isEmpty() ? ieg.a : ieg.f(list.get(0));
            case 3:
                List list2 = (List) obj;
                return list2.isEmpty() ? ieg.a : ieg.f(list2);
            case 4:
                return obj;
            case 5:
                List list3 = (List) obj;
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (!((ieg) it.next()).m()) {
                        return ieg.a;
                    }
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ieg) it2.next()).g());
                }
                return ieg.f(arrayList2);
            case 6:
                return Integer.valueOf(((xaw) obj).d);
            case 7:
                return xaw.b(((Integer) obj).intValue());
            case 8:
                return FluentIterable.from((List) obj).transform(new eyt(8)).toList();
            case 9:
                return FluentIterable.from((List) obj).transform(new eyt(9)).toList();
            case 10:
                kum kumVar = (kum) obj;
                if (kumVar instanceof kvf) {
                    return ((kvf) kumVar).E();
                }
                if (kumVar instanceof kvj) {
                    return ((kvj) kumVar).b;
                }
                if (kumVar instanceof kwn) {
                    return ((kwn) kumVar).g;
                }
                if (kumVar instanceof kuo) {
                    return ((kuo) kumVar).e;
                }
                if (kumVar instanceof kwl) {
                    return ((kwl) kumVar).e;
                }
                throw new IllegalStateException();
            case 11:
                return ((Uri) obj).toString();
            case 12:
                return ((lsa) obj).a;
            case 13:
                return ((lsa) obj).a;
            case 14:
                return ((lsa) obj).a;
            case 15:
                return ((lsa) obj).a;
            case 16:
                mad madVar = (mad) obj;
                String str = madVar.a.b;
                long j = madVar.d;
                mfp mfpVarA = mfp.a(str);
                mfpVarA.b("X-Goog-Event-Time", Long.toString(j));
                mfpVarA.b("X-Goog-Request-Time", Long.toString(madVar.c));
                return mfpVarA;
            case 17:
                return ((lrx) obj).a;
            case 18:
                int i = lqi.b;
                return kgu.m((val) obj);
            case 19:
                vdo vdoVar = ((vec) obj).b;
                return vdoVar == null ? vdo.a : vdoVar;
            default:
                vec vecVar = (vec) obj;
                ved vedVar = vecVar.c;
                if (vedVar == null) {
                    vedVar = ved.a;
                }
                int iAK = a.aK(vedVar.b);
                if (iAK == 0) {
                    iAK = 1;
                }
                int i2 = iAK - 2;
                if (i2 == 1) {
                    return ieg.f(new lqn(true));
                }
                if (i2 == 4) {
                    return ieg.f(new lqn(false));
                }
                ved vedVar2 = vecVar.c;
                if (vedVar2 == null) {
                    vedVar2 = ved.a;
                }
                return ieg.b(new RuntimeException("Unexpected status code:".concat(Integer.toString((a.aK(vedVar2.b) != 0 ? r5 : 1) - 2))));
        }
    }
}
