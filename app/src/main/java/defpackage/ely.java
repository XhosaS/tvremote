package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ely {
    public static final Object a = new Object();
    public static final Map b = new HashMap(4);
    public static final Map c = new HashMap(4);
    public static final WeakHashMap d = new WeakHashMap();
    private static final WeakHashMap e = new WeakHashMap();
    private static elx f;

    public static Context a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static void b(Context context, Map map) {
        map.remove(context);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Context baseContext = (Context) ((Map.Entry) it.next()).getKey();
            Context baseContext2 = context;
            while (baseContext2 instanceof ContextWrapper) {
                baseContext2 = ((ContextWrapper) baseContext2).getBaseContext();
            }
            while (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (baseContext == baseContext2) {
                it.remove();
            }
        }
    }

    public static elw c(Context context, elz elzVar) {
        if (elzVar.ae()) {
            return null;
        }
        synchronized (a) {
            Map map = b;
            Map map2 = (Map) map.get(context);
            if (map2 == null) {
                if (d.containsKey(a(context))) {
                    return null;
                }
                if (!e.containsKey(context) && f == null) {
                    f = new elx();
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f);
                }
                map2 = new HashMap();
                map.put(context, map2);
            }
            Object objZ = elzVar.z();
            elw elwVarV = (elw) map2.get(objZ);
            if (elwVarV == null) {
                elwVarV = elzVar.v();
                map2.put(objZ, elwVarV);
            }
            return elwVarV;
        }
    }
}
