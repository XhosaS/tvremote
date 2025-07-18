package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqn {
    private static WeakReference a;
    private final SharedPreferences b;
    private aaqh c;
    private final Executor d;

    private aaqn(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    public static synchronized aaqn b(Context context, Executor executor) {
        WeakReference weakReference = a;
        aaqn aaqnVar = weakReference != null ? (aaqn) weakReference.get() : null;
        if (aaqnVar != null) {
            return aaqnVar;
        }
        aaqn aaqnVar2 = new aaqn(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
        aaqnVar2.d();
        a = new WeakReference(aaqnVar2);
        return aaqnVar2;
    }

    private final synchronized void d() {
        aaqh aaqhVar = new aaqh(this.b, this.d);
        ArrayDeque arrayDeque = aaqhVar.d;
        synchronized (arrayDeque) {
            arrayDeque.clear();
            String string = aaqhVar.a.getString(aaqhVar.b, "");
            if (!TextUtils.isEmpty(string)) {
                String str = aaqhVar.c;
                if (string.contains(str)) {
                    String[] strArrSplit = string.split(str, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str2 : strArrSplit) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayDeque.add(str2);
                        }
                    }
                }
            }
        }
        this.c = aaqhVar;
    }

    final synchronized aaqm a() {
        String str;
        ArrayDeque arrayDeque = this.c.d;
        synchronized (arrayDeque) {
            str = (String) arrayDeque.peek();
        }
        int i = aaqm.d;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                return new aaqm(strArrSplit[0], strArrSplit[1]);
            }
        }
        return null;
    }

    final synchronized void c(aaqm aaqmVar) {
        final aaqh aaqhVar = this.c;
        ArrayDeque arrayDeque = aaqhVar.d;
        String str = aaqmVar.c;
        synchronized (arrayDeque) {
            if (arrayDeque.remove(str)) {
                aaqhVar.e.execute(new Runnable() { // from class: aaqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        aaqh aaqhVar2 = aaqhVar;
                        ArrayDeque arrayDeque2 = aaqhVar2.d;
                        synchronized (arrayDeque2) {
                            SharedPreferences.Editor editorEdit = aaqhVar2.a.edit();
                            String str2 = aaqhVar2.b;
                            StringBuilder sb = new StringBuilder();
                            Iterator it = arrayDeque2.iterator();
                            while (it.hasNext()) {
                                sb.append((String) it.next());
                                sb.append(aaqhVar2.c);
                            }
                            editorEdit.putString(str2, sb.toString()).commit();
                        }
                    }
                });
            }
        }
    }
}
