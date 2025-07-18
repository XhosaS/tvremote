package defpackage;

import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uua extends ays implements awq {
    protected Map j;

    public uua(azd azdVar) {
        super(azdVar);
    }

    @Override // defpackage.awq
    public final Object dy(Class cls) {
        Map map = this.j;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public final void p(Class cls, Object obj) {
        if (this.j == null) {
            this.j = new ArrayMap();
        }
        if (obj == null && this.j.containsKey(cls)) {
            this.j.remove(cls);
        } else if (obj != null) {
            this.j.put(cls, obj);
        }
        if (this.j.isEmpty()) {
            this.j = null;
        }
    }
}
