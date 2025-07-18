package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrj {
    public static yyk a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            Stream map = Collection.EL.stream(list).map(new Function() { // from class: qrd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((qri) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = yyk.e;
            return (yyk) map.collect(ywk.a);
        }
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((qri) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            Stream map2 = Collection.EL.stream(list).map(new Function() { // from class: qrd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((qri) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = yyk.e;
            return (yyk) map2.collect(ywk.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        int i3 = yyk.e;
        yyf yyfVar = new yyf(4);
        int size = arrayList.size();
        long jA2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            qri qriVar = (qri) arrayList.get(i5);
            i4++;
            jA2 += qriVar.a();
            if ((j >= 0 && i4 > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            yyfVar.g(qriVar.b());
        }
        return yyfVar.f();
    }
}
