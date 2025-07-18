package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class azm implements awq {
    private Map a;

    protected static void r(View view) {
        if (view == null || !view.hasTransientState()) {
            return;
        }
        view.animate().cancel();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; view.hasTransientState() && i < childCount; i++) {
                r(viewGroup.getChildAt(i));
            }
        }
    }

    @Override // defpackage.awq
    public final Object dy(Class cls) {
        Map map = this.a;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public abstract azk q(ViewGroup viewGroup);

    public abstract void s(azk azkVar, Object obj);

    public void t(azk azkVar, Object obj, List list) {
        s(azkVar, obj);
    }

    public abstract void u(azk azkVar);

    public void w(azk azkVar) {
        r(azkVar.g);
    }

    public final void x(Class cls, Object obj) {
        if (this.a == null) {
            this.a = new we();
        }
        this.a.put(cls, obj);
    }

    public void v(azk azkVar) {
    }
}
