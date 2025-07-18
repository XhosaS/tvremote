package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkf {
    public final void a(String str, vhg vhgVar, Map map) {
        Object objComputeIfAbsent = Map.EL.computeIfAbsent(map, str, new Function() { // from class: vke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ((String) obj).getClass();
                return new LinkedHashMap();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        objComputeIfAbsent.getClass();
        java.util.Map map2 = (java.util.Map) objComputeIfAbsent;
        if (map2.containsKey(vhgVar.g)) {
            throw new IllegalStateException("Found 2 accounts with the same account name.");
        }
        map2.put(vhgVar.g, vhgVar);
    }
}
