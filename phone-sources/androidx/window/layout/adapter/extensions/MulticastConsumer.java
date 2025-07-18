package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.cuh;
import defpackage.gli;
import defpackage.gns;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MulticastConsumer implements cuh<WindowLayoutInfo> {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = new LinkedHashSet();
    private final Context c;
    private gns d;

    public MulticastConsumer(Context context) {
        this.c = context;
    }

    public final void a(cuh cuhVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            gns gnsVar = this.d;
            if (gnsVar != null) {
                cuhVar.accept(gnsVar);
            }
            this.b.add(cuhVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.cuh
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            gns gnsVarS = gli.S(this.c, windowLayoutInfo);
            this.d = gnsVarS;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((cuh) it.next()).accept(gnsVarS);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
