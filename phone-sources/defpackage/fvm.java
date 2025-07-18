package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvm implements IBinder.DeathRecipient {
    public final Messenger a;
    public final fvo b;
    public int e;
    public int f;
    public final /* synthetic */ fvs h;
    private final Messenger i;
    public int c = 1;
    public int d = 1;
    public final SparseArray g = new SparseArray();

    public fvm(fvs fvsVar, Messenger messenger) {
        this.h = fvsVar;
        this.a = messenger;
        fvo fvoVar = new fvo(this);
        this.b = fvoVar;
        this.i = new Messenger(fvoVar);
    }

    public final void a(int i) throws RemoteException {
        int i2 = this.c;
        this.c = i2 + 1;
        g(4, i2, i, null, null);
    }

    public final void b(int i) throws RemoteException {
        int i2 = this.c;
        this.c = i2 + 1;
        g(5, i2, i, null, null);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.h.m.post(new foe(this, 16, null));
    }

    public final void c(fuh fuhVar) {
        int i = this.c;
        this.c = i + 1;
        g(10, i, 0, fuhVar != null ? fuhVar.a : null, null);
    }

    public final void d(int i, int i2) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(7, i3, i, null, bundle);
    }

    public final void e(int i, int i2) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("unselectReason", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(6, i3, i, null, bundle);
    }

    public final void f(int i, int i2) throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        g(8, i3, i, null, bundle);
    }

    public final boolean g(int i, int i2, int i3, Object obj, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.i;
        try {
            this.a.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }
}
