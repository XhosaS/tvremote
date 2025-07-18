package defpackage;

import android.database.Observable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pr extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ps) this.mObservers.get(size)).a();
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ps) this.mObservers.get(size)).e(i, i2);
            }
        }
    }

    public final void c(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ps) this.mObservers.get(size)).b(i, i2, obj);
            }
        }
    }

    public final void d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ps) this.mObservers.get(size)).c(i, i2);
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ps) this.mObservers.get(size)).d(i, i2);
            }
        }
    }

    public final boolean f() {
        return !this.mObservers.isEmpty();
    }
}
