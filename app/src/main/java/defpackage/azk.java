package defpackage;

import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azk implements awq {
    private Map a;
    public final View g;

    public azk(View view) {
        this.g = view;
    }

    public final void b(Class cls, Object obj) {
        if (this.a == null) {
            this.a = new we();
        }
        this.a.put(cls, obj);
    }

    @Override // defpackage.awq
    public final Object dy(Class cls) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }
}
