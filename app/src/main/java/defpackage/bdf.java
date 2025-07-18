package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
class bdf implements bcj {
    private final Object a;
    private final bbr b;

    public bdf(Object obj) {
        this.a = obj;
        this.b = bbt.a.b(obj.getClass());
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map map = this.b.a;
        List list = (List) map.get(bceVar);
        Object obj = this.a;
        bbr.a(list, bclVar, bceVar, obj);
        bbr.a((List) map.get(bce.ON_ANY), bclVar, bceVar, obj);
    }
}
