package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class xn implements xd {
    private final Object a;
    private final ws b;

    public xn(Object obj) {
        this.a = obj;
        this.b = wu.a.b(obj.getClass());
    }

    @Override // defpackage.xd
    public final void a(xf xfVar, xa xaVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map map = this.b.a;
        List list = (List) map.get(xaVar);
        Object obj = this.a;
        ws.a(list, xfVar, xaVar, obj);
        ws.a((List) map.get(xa.ON_ANY), xfVar, xaVar, obj);
    }
}
