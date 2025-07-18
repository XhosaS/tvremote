package defpackage;

import java.util.Observable;
import java.util.Observer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbk extends Observable implements iej {
    public final boolean a;
    private final ids b;

    public sbk(ids idsVar, boolean z) {
        this.b = idsVar;
        this.a = z;
    }

    @Override // java.util.Observable
    public final void addObserver(Observer observer) {
        observer.getClass();
        super.addObserver(observer);
        if (countObservers() == 1) {
            this.b.ea(this);
        }
    }

    @Override // defpackage.iej
    public final void dM() {
        setChanged();
        notifyObservers();
    }

    @Override // java.util.Observable
    public final void deleteObserver(Observer observer) {
        super.deleteObserver(observer);
        if (countObservers() == 0) {
            this.b.ee(this);
        }
    }
}
