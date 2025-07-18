package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class byw extends byu {
    public final WindowLayoutComponent a;
    private final bxk b;
    private final ReentrantLock c = new ReentrantLock();
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private final Map f = new LinkedHashMap();

    public byw(WindowLayoutComponent windowLayoutComponent, bxk bxkVar) {
        this.a = windowLayoutComponent;
        this.b = bxkVar;
    }

    @Override // defpackage.byu, defpackage.bys
    public void a(afe afeVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(afeVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                ReentrantLock reentrantLock2 = multicastConsumer.a;
                reentrantLock2.lock();
                try {
                    multicastConsumer.b.remove(afeVar);
                    reentrantLock2.unlock();
                    this.e.remove(afeVar);
                    if (multicastConsumer.b.isEmpty()) {
                        this.d.remove(context);
                        bxj bxjVar = (bxj) this.f.remove(multicastConsumer);
                        if (bxjVar != null) {
                            bxjVar.a.invoke(bxjVar.b, bxjVar.c);
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

    @Override // defpackage.byu, defpackage.bys
    public void b(Context context, afe afeVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Map map = this.d;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(afeVar);
                this.e.put(afeVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.e.put(afeVar, context);
                multicastConsumer2.a(afeVar);
                bxk bxkVar = this.b;
                WindowLayoutComponent windowLayoutComponent = this.a;
                agwj agwjVar = agwi.a;
                Object objNewProxyInstance = Proxy.newProxyInstance(bxkVar.a, new Class[]{bxkVar.a()}, new bxi(new agvq(WindowLayoutInfo.class), new byv(multicastConsumer2)));
                objNewProxyInstance.getClass();
                windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, bxkVar.a()).invoke(windowLayoutComponent, context, objNewProxyInstance);
                this.f.put(multicastConsumer2, new bxj(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", bxkVar.a()), windowLayoutComponent, objNewProxyInstance));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
