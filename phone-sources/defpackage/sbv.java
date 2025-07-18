package defpackage;

import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbv implements Observer, iej, dvw {
    private final yjk a;

    public sbv(yjk yjkVar) {
        this.a = yjkVar;
    }

    @Override // defpackage.iej
    public final void dM() {
        this.a.a();
    }

    @Override // defpackage.dvw
    public final void dV(Object obj) {
        obj.getClass();
        this.a.a();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        this.a.a();
    }
}
