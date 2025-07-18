package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalh {
    public static final aakx a = new aakx() { // from class: aalg
        @Override // defpackage.aakt
        public final void a(Object obj, Object obj2) {
            throw new aaku("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    public static final void a(Class cls, aakx aakxVar, Map map, Map map2) {
        map.put(cls, aakxVar);
        map2.remove(cls);
    }
}
