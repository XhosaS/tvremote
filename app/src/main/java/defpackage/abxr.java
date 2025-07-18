package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abxr extends AbstractMap {
    public final abxn a;
    private final Map b;

    public abxr(Map map, abxn abxnVar) {
        this.b = map;
        this.a = abxnVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new abxq(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a((Integer) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        abxn abxnVar = this.a;
        Object objPut = this.b.put(obj, abxnVar.b((abxf) obj2));
        if (objPut == null) {
            return null;
        }
        return abxnVar.a((Integer) objPut);
    }
}
