package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bub {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public bub() {
        throw null;
    }

    public final void a() {
        Integer num;
        lc lcVar = (lc) this.a;
        List list = lcVar.d;
        Object obj = this.b;
        if (!list.contains(obj) && (num = (Integer) lcVar.b.remove(obj)) != null) {
            lcVar.a.remove(num);
        }
        lcVar.e.remove(obj);
        Map map = lcVar.f;
        if (map.containsKey(obj)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + ((String) obj) + ": " + map.get(obj));
            map.remove(obj);
        }
        Bundle bundle = lcVar.g;
        String str = (String) obj;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((la) ii.O(bundle, str, la.class)));
            bundle.remove(str);
        }
        if (((mo) lcVar.c.get(obj)) != null) {
            throw null;
        }
    }

    public bub(buc bucVar, cmt cmtVar) {
        this.b = cmtVar;
        this.a = bucVar;
    }

    public bub(lc lcVar, String str) {
        this.a = lcVar;
        this.b = str;
    }
}
