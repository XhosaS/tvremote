package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjw implements rjo {
    private final AtomicBoolean f = new AtomicBoolean(false);
    public final ConcurrentMap a = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final Object c = new Object();
    public final Map d = new HashMap();
    public final Map e = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[EDGE_INSN: B:144:0x00af->B:34:0x00af BREAK  A[LOOP:2: B:26:0x008b->B:145:?]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.jzv r18, defpackage.yrp r19, defpackage.yqi r20) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjw.b(jzv, yrp, yqi):void");
    }

    private final void c(rjn rjnVar, Object obj, Map map, boolean z) {
        Map map2 = (Map) Map.EL.computeIfAbsent(map, obj, new Function() { // from class: rjp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return new HashMap();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String str = rjnVar.b;
        if (z) {
            map2.remove(str);
        }
        ((Set) Map.EL.computeIfAbsent(map2, str, new Function() { // from class: rjq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return new HashSet();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).add(rjnVar);
    }

    public final void a(abvo abvoVar, Set set, String str, String str2, boolean z, boolean z2) {
        if (!set.isEmpty() && !this.f.getAndSet(true)) {
            kae kaeVarA = kae.a();
            kaeVarA.a.add(0, new rjv(this));
        }
        byte[] bArrB = abvoVar.B();
        byte[][] bArr = ExperimentTokens.a;
        rjn rjnVar = new rjn(new ExperimentTokens(str, bArrB, bArr, bArr, bArr, bArr, null, null, null, null), str2);
        if (z) {
            this.a.put(new yqu(str2, str), rjnVar);
        } else {
            this.b.put(str2, rjnVar);
        }
        synchronized (this.c) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (z) {
                    c(rjnVar, new yqu(str3, str), this.d, z2);
                } else {
                    c(rjnVar, str3, this.e, z2);
                }
            }
        }
    }
}
