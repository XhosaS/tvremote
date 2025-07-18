package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class di implements IInterface {
    public final IBinder a;

    public di(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
