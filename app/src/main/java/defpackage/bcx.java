package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bcx extends bcw {
    public bcx() {
    }

    @Override // defpackage.bcw
    public void g(Object obj) {
        bcw.a("setValue");
        this.h++;
        this.f = obj;
        b(null);
    }

    public final void h(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.g;
            obj3 = bcw.a;
            this.g = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        Runnable runnable = this.i;
        vj vjVar = vg.a().b;
        vi viVar = (vi) vjVar;
        if (viVar.c == null) {
            synchronized (viVar.a) {
                if (((vi) vjVar).c == null) {
                    ((vi) vjVar).c = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        viVar.c.post(runnable);
    }

    public bcx(Object obj) {
        super(obj);
    }
}
