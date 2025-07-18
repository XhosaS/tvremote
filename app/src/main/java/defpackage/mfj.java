package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfj implements ThreadFactory {
    public final Object a = new Object();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Set c = new wg(0);
    private final int d;

    public mfj(int i) {
        this.d = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        final mfg mfgVar;
        synchronized (this.a) {
            mfgVar = new mfg(this.d, runnable);
            this.b.add(mfgVar);
            mfgVar.a = new Runnable() { // from class: mfh
                @Override // java.lang.Runnable
                public final void run() {
                    mfj mfjVar = this.a;
                    Object obj = mfjVar.a;
                    mfg mfgVar2 = mfgVar;
                    synchronized (obj) {
                        mfjVar.b.remove(mfgVar2);
                        mfjVar.c.add(mfgVar2);
                    }
                }
            };
            mfgVar.b = new Runnable() { // from class: mfi
                @Override // java.lang.Runnable
                public final void run() {
                    mfj mfjVar = this.a;
                    Object obj = mfjVar.a;
                    mfg mfgVar2 = mfgVar;
                    synchronized (obj) {
                        mfjVar.c.remove(mfgVar2);
                    }
                }
            };
        }
        return mfgVar;
    }
}
