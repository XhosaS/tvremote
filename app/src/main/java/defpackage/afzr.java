package defpackage;

import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afzr implements Runnable {
    final /* synthetic */ afzs a;
    final /* synthetic */ afzt b;
    final /* synthetic */ Object c;
    final /* synthetic */ afzu d;

    public afzr(afzu afzuVar, afzs afzsVar, afzt afztVar, Object obj) {
        this.a = afzsVar;
        this.b = afztVar;
        this.c = obj;
        this.d = afzuVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                try {
                    this.b.b(this.c);
                    afzu afzuVar = this.d;
                    IdentityHashMap identityHashMap = afzuVar.b;
                    identityHashMap.remove(this.b);
                    if (identityHashMap.isEmpty()) {
                        afzuVar.c.shutdown();
                        afzuVar.c = null;
                    }
                } catch (Throwable th) {
                    afzu afzuVar2 = this.d;
                    IdentityHashMap identityHashMap2 = afzuVar2.b;
                    identityHashMap2.remove(this.b);
                    if (identityHashMap2.isEmpty()) {
                        afzuVar2.c.shutdown();
                        afzuVar2.c = null;
                    }
                    throw th;
                }
            }
        }
    }
}
