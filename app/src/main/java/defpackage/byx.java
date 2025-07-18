package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class byx extends byw {
    private final ReentrantLock b;
    private final Map c;
    private final Map d;

    public byx(WindowLayoutComponent windowLayoutComponent, bxk bxkVar) {
        super(windowLayoutComponent, bxkVar);
        this.b = new ReentrantLock();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.byw, defpackage.byu, defpackage.bys
    public final void a(afe afeVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.d;
            Context context = (Context) map.get(afeVar);
            if (context == null) {
                return;
            }
            Map map2 = this.c;
            bzb bzbVar = (bzb) map2.get(context);
            if (bzbVar == null) {
                return;
            }
            bzbVar.removeListener(afeVar);
            map.remove(afeVar);
            if (bzbVar.isEmpty()) {
                map2.remove(context);
                this.a.removeWindowLayoutInfoListener(bzbVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.byw, defpackage.byu, defpackage.bys
    public final void b(Context context, afe afeVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Map map = this.c;
            bzb bzbVar = (bzb) map.get(context);
            if (bzbVar != null) {
                bzbVar.addListener(afeVar);
                this.d.put(afeVar, context);
            } else {
                bzb bzbVar2 = new bzb(context);
                map.put(context, bzbVar2);
                this.d.put(afeVar, context);
                bzbVar2.addListener(afeVar);
                this.a.addWindowLayoutInfoListener(context, bzbVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
