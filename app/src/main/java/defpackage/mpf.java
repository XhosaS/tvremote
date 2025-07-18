package defpackage;

import android.util.LongSparseArray;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpf extends EnvironmentDataSource {
    private final agfo e;
    private final AtomicLong b = new AtomicLong(1);
    private final Object c = new Object();
    private final LongSparseArray d = new LongSparseArray();
    public volatile byte[] a = ock.a;

    public mpf(agfo agfoVar) {
        agka agkaVar = new agka(agfoVar, new aggy() { // from class: mpd
            @Override // defpackage.aggy
            public final void a(Object obj) {
                this.a.a = (byte[]) obj;
            }
        });
        aggz aggzVar = agoh.k;
        AtomicReference atomicReference = new AtomicReference();
        agll agllVar = new agll(new aglj(atomicReference), agkaVar, atomicReference);
        aggz aggzVar2 = agoh.l;
        aglb aglbVar = new aglb(agllVar);
        aggz aggzVar3 = agoh.k;
        this.e = aglbVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final byte[] getEnvironmentData() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final long subscribeToEnvironmentData(final EnvironmentDataObserver environmentDataObserver) {
        if (environmentDataObserver == null) {
            return 0L;
        }
        AtomicLong atomicLong = this.b;
        Object obj = this.c;
        long andIncrement = atomicLong.getAndIncrement();
        synchronized (obj) {
            this.d.put(andIncrement, this.e.l(new aggy() { // from class: mpe
                @Override // defpackage.aggy
                public final void a(Object obj2) {
                    environmentDataObserver.environmentDataDidChange();
                }
            }));
        }
        return andIncrement;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final void unsubscribeFromEnvironmentData(long j) {
        synchronized (this.c) {
            LongSparseArray longSparseArray = this.d;
            aggi aggiVar = (aggi) longSparseArray.get(j);
            if (aggiVar != null) {
                aggiVar.dispose();
            }
            longSparseArray.remove(j);
        }
    }
}
