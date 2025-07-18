package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class dwb implements dvi {
    private final Object a;
    private final dus b;

    public dwb(Object obj) {
        this.a = obj;
        this.b = duu.a.b(obj.getClass());
    }

    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Map map = this.b.a;
        List list = (List) map.get(dvcVar);
        Object obj = this.a;
        dus.a(list, dvkVar, dvcVar, obj);
        dus.a((List) map.get(dvc.ON_ANY), dvkVar, dvcVar, obj);
    }
}
