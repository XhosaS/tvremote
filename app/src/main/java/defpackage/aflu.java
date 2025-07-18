package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aflu {
    public static final Logger a = Logger.getLogger(aflu.class.getName());
    public static final aflq c = new Object() { // from class: aflq
    };
    protected final IBinder b;

    protected aflu(IBinder iBinder) {
        this.b = iBinder;
    }

    public abstract void a(int i, aflx aflxVar);

    protected final boolean b(int i, Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
