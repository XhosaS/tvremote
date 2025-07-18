package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pad {
    public static final zdy a = zdy.h("com/google/android/libraries/home/homegraph/foyer/storage/HomeGraphStore");
    public final Context c;
    public final String d;
    public final Executor e;
    public final zyg f;
    public zyd h;
    public final Object b = new Object();
    public final Object g = new Object();
    public final List i = new ArrayList();

    public pad(Context context, String str, Executor executor, zyg zygVar) {
        this.c = context;
        this.d = String.format("home_graph_%s.proto", Base64.encodeToString(str.getBytes(pah.a), 11));
        this.e = executor;
        this.f = zygVar;
    }

    public final void a(ozw ozwVar) {
        ArrayList arrayList;
        List list = this.i;
        synchronized (list) {
            arrayList = new ArrayList(list);
            list.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pac) arrayList.get(i)).a(ozwVar);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.h != null;
        }
        return z;
    }
}
