package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aflx implements Closeable {
    public Parcel a;

    public aflx(Parcel parcel) {
        this.a = parcel;
    }

    public static aflx b() {
        return new aflx(Parcel.obtain());
    }

    public final Parcel a() {
        yqw.M(this.a != null, "get() after close()/release()");
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
