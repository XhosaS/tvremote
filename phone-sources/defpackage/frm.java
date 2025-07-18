package defpackage;

import android.os.Binder;
import android.os.IBinder;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frm extends Binder implements frn {
    public final WeakReference a;

    public frm() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // defpackage.frn
    public final void a(frk frkVar) {
        frx frxVar = (frx) this.a.get();
        if (frxVar == null || frkVar == null) {
            return;
        }
        frxVar.e.register(frkVar, new fsf("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (frxVar.c) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024b  */
    /* JADX WARN: Type inference failed for: r8v8, types: [frk] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTransact(int r20, android.os.Parcel r21, android.os.Parcel r22, int r23) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frm.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public frm(frx frxVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(frxVar);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
