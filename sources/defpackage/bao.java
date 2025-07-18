package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bao {
    public static bao a;
    public boolean b;
    public final Object c;
    public final Object d;

    public bao() {
        this.b = false;
        this.c = null;
        this.d = null;
    }

    static synchronized void a() {
        Object obj;
        bao baoVar = a;
        if (baoVar != null && (obj = baoVar.c) != null && baoVar.d != null && baoVar.b) {
            ((Context) obj).getContentResolver().unregisterContentObserver((ContentObserver) a.d);
        }
        a = null;
    }

    public bao(Context context) {
        this.b = false;
        this.c = context;
        this.d = new ban();
    }

    public bao(Executor executor) {
        executor.getClass();
        this.c = new Object();
        this.d = new ArrayList();
    }
}
