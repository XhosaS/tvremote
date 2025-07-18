package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnx extends gnw {
    private final ReentrantLock b;
    private final Map c;
    private final Map d;

    public gnx(WindowLayoutComponent windowLayoutComponent, gna gnaVar) {
        super(windowLayoutComponent, gnaVar);
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.gnw, defpackage.gnv, defpackage.gnu
    public final void a(Context context, Executor executor, cuh cuhVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.c;
            gny gnyVar = (gny) map.get(context);
            if (gnyVar != null) {
                gnyVar.addListener(cuhVar);
                this.d.put(cuhVar, context);
            } else {
                gny gnyVar2 = new gny(context);
                map.put(context, gnyVar2);
                this.d.put(cuhVar, context);
                gnyVar2.addListener(cuhVar);
                this.a.addWindowLayoutInfoListener(context, gnyVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.gnw, defpackage.gnv, defpackage.gnu
    public final void b(cuh cuhVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.d;
            Context context = (Context) map.get(cuhVar);
            if (context == null) {
                return;
            }
            Map map2 = this.c;
            gny gnyVar = (gny) map2.get(context);
            if (gnyVar == null) {
                return;
            }
            gnyVar.removeListener(cuhVar);
            map.remove(cuhVar);
            if (gnyVar.isEmpty()) {
                map2.remove(context);
                this.a.removeWindowLayoutInfoListener(gnyVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
