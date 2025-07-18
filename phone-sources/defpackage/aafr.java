package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aafr {
    public static final /* synthetic */ int a = 0;

    static {
        new ConcurrentHashMap();
    }

    public static Object[] a(List list) {
        int size = list.size();
        if (size == 0) {
            aafn aafnVar = aafn.a;
            return new Object[]{aafnVar, aafnVar};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        aafj aafjVar = new aafj(list);
        return new Object[]{aafjVar, aafjVar};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aaft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [aafs, java.lang.Object] */
    public static aafi b(List list) {
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof aafp)) {
            aafp aafpVar = (aafp) list.get(0);
            if (aafpVar.b == null && aafpVar.a == null) {
                aafi aafiVarB = b(list.subList(2, size));
                ?? r0 = aafiVarB.a;
                ?? r5 = aafiVarB.b;
                aafpVar.a = r0;
                aafpVar.b = r5;
                return new aafi(aafpVar, aafpVar);
            }
        }
        Object[] objArrA = a(list);
        return new aafi((aaft) objArrA[0], (aafs) objArrA[1]);
    }

    public static final void c(int i, List list, aafl[] aaflVarArr) {
        aafl aaflVar = new aafl(i, aaflVarArr);
        e(aaflVar, aaflVar, list);
        aaflVarArr[i] = aaflVar;
    }

    public static final void d(String str, List list, aafl[] aaflVarArr) {
        Object obj;
        Object obj2;
        aafq aafqVar = new aafq(str);
        if (list.size() > 0) {
            obj = list.get(list.size() - 2);
            obj2 = list.get(list.size() - 1);
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj == null || obj2 == null || obj != obj2 || !(obj instanceof aafl)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        aafl aaflVar = new aafl((aafl) obj, aafqVar);
        list.set(list.size() - 2, aaflVar);
        list.set(list.size() - 1, aaflVar);
        aaflVarArr[aaflVar.a] = aaflVar;
    }

    public static final void e(aaft aaftVar, aafs aafsVar, List list) {
        list.add(aaftVar);
        list.add(aafsVar);
    }
}
