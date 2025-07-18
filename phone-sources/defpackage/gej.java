package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gej implements IInterface {
    public final IBinder a;

    public gej(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
