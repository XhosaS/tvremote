package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class dyd {
    private static final Object f = new Object();
    private static dyd g;
    public final Context a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Handler e;

    private dyd(Context context) {
        this.a = context;
        this.e = new dyb(this, context.getMainLooper());
    }

    public static dyd a(Context context) {
        dyd dydVar;
        synchronized (f) {
            if (g == null) {
                g = new dyd(context.getApplicationContext());
            }
            dydVar = g;
        }
        return dydVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap map = this.b;
        synchronized (map) {
            dyc dycVar = new dyc(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) map.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(broadcastReceiver, arrayList);
            }
            arrayList.add(dycVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap map2 = this.c;
                ArrayList arrayList2 = (ArrayList) map2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(action, arrayList2);
                }
                arrayList2.add(dycVar);
            }
        }
    }

    public final void c(BroadcastReceiver broadcastReceiver) {
        HashMap map = this.b;
        synchronized (map) {
            ArrayList arrayList = (ArrayList) map.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                dyc dycVar = (dyc) arrayList.get(size);
                dycVar.d = true;
                int i = 0;
                while (true) {
                    IntentFilter intentFilter = dycVar.a;
                    if (i < intentFilter.countActions()) {
                        String action = intentFilter.getAction(i);
                        HashMap map2 = this.c;
                        ArrayList arrayList2 = (ArrayList) map2.get(action);
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    break;
                                }
                                dyc dycVar2 = (dyc) arrayList2.get(size2);
                                if (dycVar2.b == broadcastReceiver) {
                                    dycVar2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                map2.remove(action);
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }
}
