package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtd {
    public Handler e;
    public qpi h;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public final Set g = new HashSet();
    public final Runnable f = new Runnable() { // from class: qta
        @Override // java.lang.Runnable
        public final void run() {
            qtd qtdVar = this.a;
            qpi qpiVar = qtdVar.h;
            qpiVar.getClass();
            if (qtdVar.b == 0) {
                qtdVar.c = true;
                Iterator it = qtdVar.g.iterator();
                while (it.hasNext()) {
                    ((qsm) it.next()).k(qpiVar);
                }
            }
            qtdVar.h.getClass();
            qtdVar.a();
        }
    };

    public qtd(Context context) {
        this.e = null;
        this.e = new Handler(context.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new qtb(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (qsm qsmVar : this.g) {
            }
            this.d = true;
        }
    }
}
