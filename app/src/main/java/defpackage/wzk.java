package defpackage;

import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class wzk {
    public wzj d;
    public wxc e;
    public final Object c = new Object();
    public final ServiceConnection b = new wzi(this);

    protected wzk() {
    }

    protected void a() {
        throw null;
    }

    protected abstract void b(IBinder iBinder);

    protected abstract void c();
}
