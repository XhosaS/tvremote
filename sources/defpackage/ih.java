package defpackage;

import android.database.Observable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ih extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ii) this.mObservers.get(size)).n();
            }
        }
    }
}
