package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.afe;
import defpackage.byq;
import defpackage.bza;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MulticastConsumer implements afe {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = new LinkedHashSet();
    private final Context c;
    private byq d;

    public MulticastConsumer(Context context) {
        this.c = context;
    }

    public final void a(afe afeVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            byq byqVar = this.d;
            if (byqVar != null) {
                afeVar.accept(byqVar);
            }
            this.b.add(afeVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.afe
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            byq byqVarA = bza.a.a(this.c, windowLayoutInfo);
            this.d = byqVarA;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((afe) it.next()).accept(byqVarA);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
