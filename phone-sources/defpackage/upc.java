package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upc {
    private static WeakReference d;
    public final Object a;
    public final Object b;
    public Object c;

    private upc(SharedPreferences sharedPreferences, Executor executor) {
        this.b = executor;
        this.a = sharedPreferences;
    }

    public static synchronized upc b(Context context, Executor executor) {
        WeakReference weakReference = d;
        upc upcVar = weakReference != null ? (upc) weakReference.get() : null;
        if (upcVar != null) {
            return upcVar;
        }
        upc upcVar2 = new upc(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
        upcVar2.h();
        d = new WeakReference(upcVar2);
        return upcVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    private final synchronized void h() {
        yyh yyhVar = new yyh((SharedPreferences) this.a, (Executor) this.b);
        Object obj = yyhVar.c;
        synchronized (obj) {
            ((ArrayDeque) obj).clear();
            String string = yyhVar.a.getString((String) yyhVar.d, "");
            if (!TextUtils.isEmpty(string)) {
                ?? r3 = yyhVar.e;
                if (string.contains(r3)) {
                    String[] strArrSplit = string.split((String) r3, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) obj).add(str);
                        }
                    }
                }
            }
        }
        this.c = yyhVar;
    }

    public final synchronized upb a() {
        String str;
        Object obj = ((yyh) this.c).c;
        synchronized (obj) {
            str = (String) ((ArrayDeque) obj).peek();
        }
        int i = upb.d;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                return new upb(strArrSplit[0], strArrSplit[1]);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized void c(upb upbVar) {
        Object obj = this.c;
        Object obj2 = ((yyh) obj).c;
        String str = upbVar.c;
        synchronized (obj2) {
            if (((ArrayDeque) obj2).remove(str)) {
                ((yyh) obj).b.execute(new ufx(obj, 9));
            }
        }
    }

    public final File d() {
        Object obj;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = ((Context) this.a).getDataDir();
            }
            obj = this.c;
        }
        return (File) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ofz] */
    public final void e(Object obj) {
        synchronized (this) {
            this.c = obj;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            this.a.a(it.next(), obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ofz] */
    public final void f(Object obj, tsl tslVar) {
        boolean zIsEmpty;
        synchronized (this) {
            ?? r0 = this.b;
            zIsEmpty = r0.isEmpty();
            r0.add(obj);
        }
        if (zIsEmpty) {
            return;
        }
        synchronized (this) {
            Object obj2 = this.c;
            if (obj2 != null) {
                this.a.a(obj, obj2);
            }
        }
        osk.r(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void g(Object obj, tsl tslVar) {
        synchronized (this) {
            ?? r0 = this.b;
            r0.remove(obj);
            if (r0.isEmpty()) {
            } else {
                osk.r(true);
            }
        }
    }

    public upc(ofz ofzVar) {
        this.b = new CopyOnWriteArrayList();
        this.a = ofzVar;
    }

    public upc(Context context, byte[] bArr) {
        this.b = new Object();
        this.a = context.getApplicationContext();
    }

    public upc(Context context) {
        this.b = new ska();
        sij.c(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }
}
