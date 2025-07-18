package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oka {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter");
    public static final yzq b = new zdd(acgd.HOME_AUTOMATION_DISCOVERY);
    public final ojh c;
    public final Map d;
    public final Geller e;
    public final ont f;
    public final String g;
    public final ExecutorService h;
    public final ExecutorService i;

    public oka(String str, Geller geller, ont ontVar, ojh ojhVar, ExecutorService executorService, ExecutorService executorService2) {
        this.c = ojhVar;
        this.e = geller;
        this.f = ontVar;
        this.g = str;
        this.h = executorService;
        this.i = executorService2;
        if (geller.h.v) {
            this.d = new ConcurrentHashMap();
        } else {
            this.d = new HashMap();
        }
    }

    public static acdl b(int i, List list) {
        acby acbyVar;
        acdl acdlVar = acdl.a;
        acdi acdiVar = new acdi();
        if (i == 1) {
            if ((acdiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdiVar.y();
            }
            acdl acdlVar2 = (acdl) acdiVar.b;
            acdlVar2.c = 1;
            acdlVar2.b |= 1;
        } else if (i == 3) {
            if ((acdiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdiVar.y();
            }
            acdl acdlVar3 = (acdl) acdiVar.b;
            acdlVar3.c = 2;
            acdlVar3.b |= 1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            omw omwVar = (omw) it.next();
            acby acbyVar2 = acby.a;
            acbx acbxVar = new acbx();
            String strB = omwVar.b();
            if ((acbxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acbxVar.y();
            }
            acby acbyVar3 = (acby) acbxVar.b;
            acbyVar3.b |= 2;
            acbyVar3.d = strB;
            if (omwVar.a().g()) {
                long jLongValue = ((Long) omwVar.a().c()).longValue();
                if ((acbxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acbxVar.y();
                }
                acby acbyVar4 = (acby) acbxVar.b;
                acbyVar4.b |= 1;
                acbyVar4.c = jLongValue;
                acbyVar = (acby) acbxVar.v();
            } else {
                acbyVar = (acby) acbxVar.v();
            }
            if ((acdiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdiVar.y();
            }
            acdl acdlVar4 = (acdl) acdiVar.b;
            acbyVar.getClass();
            abxs abxsVar = acdlVar4.d;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                acdlVar4.d = abxsVar.d(size + size);
            }
            acdlVar4.d.add(acbyVar);
        }
        return (acdl) acdiVar.v();
    }

    public final omk a(acgd acgdVar) {
        if (this.e.h.v) {
            return (omk) Map.EL.computeIfAbsent(this.d, acgdVar, new Function() { // from class: ojp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    zdy zdyVar = oka.a;
                    return new ojf();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        java.util.Map map = this.d;
        if (!map.containsKey(acgdVar)) {
            map.put(acgdVar, new ojf());
        }
        return (omk) map.get(acgdVar);
    }
}
