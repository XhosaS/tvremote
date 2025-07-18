package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gnw extends gnv {
    public final WindowLayoutComponent a;
    private final gna b;
    private final ReentrantLock c = new ReentrantLock();
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private final Map f = new LinkedHashMap();

    public gnw(WindowLayoutComponent windowLayoutComponent, gna gnaVar) {
        this.a = windowLayoutComponent;
        this.b = gnaVar;
    }

    @Override // defpackage.gnv, defpackage.gnu
    public void a(Context context, Executor executor, cuh cuhVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Map map = this.d;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(cuhVar);
                this.e.put(cuhVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.e.put(cuhVar, context);
                multicastConsumer2.a(cuhVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(yhb.a));
                    return;
                }
                gna gnaVar = this.b;
                WindowLayoutComponent windowLayoutComponent = this.a;
                int i = ylg.a;
                Object objNewProxyInstance = Proxy.newProxyInstance(gnaVar.a, new Class[]{gnaVar.a()}, new gmy(new ykl(WindowLayoutInfo.class), new ahf((Object) multicastConsumer2, 4, (int[]) null)));
                objNewProxyInstance.getClass();
                windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, gnaVar.a()).invoke(windowLayoutComponent, (Activity) context, objNewProxyInstance);
                this.f.put(multicastConsumer2, new gmz(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", gnaVar.a()), windowLayoutComponent, objNewProxyInstance));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.gnv, defpackage.gnu
    public void b(cuh cuhVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(cuhVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                ReentrantLock reentrantLock2 = multicastConsumer.a;
                reentrantLock2.lock();
                try {
                    multicastConsumer.b.remove(cuhVar);
                    reentrantLock2.unlock();
                    this.e.remove(cuhVar);
                    if (multicastConsumer.b.isEmpty()) {
                        this.d.remove(context);
                        gmz gmzVar = (gmz) this.f.remove(multicastConsumer);
                        if (gmzVar != null) {
                            ((Method) gmzVar.c).invoke(gmzVar.a, gmzVar.b);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
