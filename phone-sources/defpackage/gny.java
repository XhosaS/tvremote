package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gny implements Consumer2, cuh {
    private final Context a;
    private final ReentrantLock b;
    private gns c;
    private final Set d;

    public gny(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            gns gnsVarS = gli.S(this.a, windowLayoutInfo);
            this.c = gnsVarS;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((cuh) it.next()).accept(gnsVarS);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(cuh<gns> cuhVar) {
        cuhVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            gns gnsVar = this.c;
            if (gnsVar != null) {
                cuhVar.accept(gnsVar);
            }
            this.d.add(cuhVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(cuh<gns> cuhVar) {
        cuhVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(cuhVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
