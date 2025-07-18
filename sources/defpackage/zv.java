package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zv {
    static yv a;
    final Context b;
    public final ArrayList c = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public zv(Context context) {
        this.b = context;
    }

    public static yv a() {
        yv yvVar = a;
        if (yvVar != null) {
            return yvVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static zv b(Context context) {
        c();
        if (a == null) {
            a = new yv(context.getApplicationContext());
        }
        ArrayList arrayList = a.g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                zv zvVar = new zv(context);
                arrayList.add(new WeakReference(zvVar));
                return zvVar;
            }
            zv zvVar2 = (zv) ((WeakReference) arrayList.get(size)).get();
            if (zvVar2 == null) {
                arrayList.remove(size);
            } else if (zvVar2.b == context) {
                return zvVar2;
            }
        }
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public final int d(byj byjVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zq) arrayList.get(i)).e == byjVar) {
                return i;
            }
        }
        return -1;
    }
}
