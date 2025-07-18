package defpackage;

import java.util.List;
import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlc extends Observable {
    public final kkv a;
    public List b;
    private ser c;

    public /* synthetic */ mlc(ser serVar, kkv kkvVar) {
        yhb yhbVar = yhb.a;
        this.c = serVar;
        this.a = kkvVar;
        this.b = yhbVar;
    }

    public final void a(ser serVar) {
        if (yks.e(this.c, serVar)) {
            return;
        }
        this.c = serVar;
        setChanged();
        notifyObservers();
    }
}
