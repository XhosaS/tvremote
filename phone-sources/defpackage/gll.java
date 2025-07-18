package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gll {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public Parcelable a() {
        throw null;
    }

    public Object c(ViewGroup viewGroup, int i) {
        throw null;
    }

    public abstract boolean e(View view, Object obj);

    public void f(ViewGroup viewGroup, Object obj) {
        throw null;
    }

    public abstract int j();

    public int k(Object obj) {
        return -1;
    }

    public CharSequence l(int i) {
        return null;
    }

    public final void m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void g() {
    }

    public void d(ViewGroup viewGroup) {
    }

    public void h(Parcelable parcelable) {
    }

    public void i(Object obj) {
    }
}
