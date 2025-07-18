package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cja {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final coe e;

    protected cja(Context context, coe coeVar) {
        this.e = coeVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == null || !agvy.c(obj2, obj)) {
                this.d = obj;
                final List listX = agqq.x(this.c);
                this.e.d.execute(new Runnable() { // from class: ciz
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = listX.iterator();
                        while (it.hasNext()) {
                            ((cih) it.next()).a(this.d);
                        }
                    }
                });
            }
        }
    }
}
