package defpackage;

import com.google.assistant.sdk.libassistant.ActionExecutor;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agrk {
    public static final Object a(Map map, Object obj) {
        if (!(map instanceof agri)) {
            Object obj2 = map.get(obj);
            if (obj2 != null || map.containsKey(obj)) {
                return obj2;
            }
            throw new NoSuchElementException(a.c(obj, "Key ", " is missing in the map."));
        }
        Map map2 = ((agri) map).a;
        Object obj3 = map2.get(obj);
        if (obj3 != null || map2.containsKey(obj)) {
            return obj3;
        }
        jhy jhyVar = jhy.a;
        ((xju) obj).getClass();
        return ActionExecutor.Status.UNKNOWN;
    }
}
