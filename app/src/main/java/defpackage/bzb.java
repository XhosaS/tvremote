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
public final class bzb implements Consumer2, afe {
    private final Context a;
    private final ReentrantLock b;
    private byq c;
    private final Set d;

    public bzb(Context context) {
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
            byq byqVarA = bza.a.a(this.a, windowLayoutInfo);
            this.c = byqVarA;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((afe) it.next()).accept(byqVarA);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(afe afeVar) {
        afeVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            byq byqVar = this.c;
            if (byqVar != null) {
                afeVar.accept(byqVar);
            }
            this.d.add(afeVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(afe afeVar) {
        afeVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(afeVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
