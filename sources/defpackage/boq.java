package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boq implements bob {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/IpcImeService");
    public final Handler b;
    public boolean c;
    public final bny d;
    public final bum e;

    public boq(final bny bnyVar, final bum bumVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = handler;
        this.d = bnyVar;
        this.e = bumVar;
        handler.post(new ame(this, bnyVar, 12, null));
        e(new bop() { // from class: bof
            @Override // defpackage.bop
            public final void a() throws RemoteException {
                final boq boqVar = this.a;
                final bny bnyVar2 = bnyVar;
                bumVar.a.linkToDeath(new IBinder.DeathRecipient() { // from class: boi
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        boq boqVar2 = boqVar;
                        boqVar2.b.post(new ame(boqVar2, bnyVar2, 13, null));
                    }
                }, 0);
            }
        });
    }

    @Override // defpackage.bob
    public final boa a(int i, int i2) {
        return new bol(this, i, i2);
    }

    @Override // defpackage.bob
    public final void b() {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/IpcImeService", "disableNotifications", 78, "IpcImeService.java")).p("Disabling IME notifications");
        this.c = false;
        bum bumVar = this.e;
        bumVar.getClass();
        e(new boh(bumVar, 1));
    }

    @Override // defpackage.bob
    public final void c() {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/IpcImeService", "enableNotifications", 71, "IpcImeService.java")).p("Enabling IME notifications");
        this.c = true;
        bum bumVar = this.e;
        bumVar.getClass();
        e(new boh(bumVar, 0));
    }

    @Override // defpackage.bob
    public final void d(final boolean z, final int i) {
        e(new bop() { // from class: boe
            @Override // defpackage.bop
            public final void a() {
                bum bumVar = this.a.e;
                Parcel parcelC = bumVar.c();
                int i2 = acl.a;
                parcelC.writeInt(z ? 1 : 0);
                parcelC.writeInt(i);
                bumVar.f(6, parcelC);
            }
        });
    }

    final void e(bop bopVar) {
        try {
            bopVar.a();
        } catch (RemoteException e) {
            ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/IpcImeService", "dropRemoteException", 136, "IpcImeService.java")).p("Unable to perform remote command");
            this.d.n(this, true);
        }
    }

    @Override // defpackage.bob
    public final void sendDownUpKeyEvents(final int i) {
        e(new bop() { // from class: boj
            @Override // defpackage.bop
            public final void a() {
                bum bumVar = this.a.e;
                Parcel parcelC = bumVar.c();
                parcelC.writeInt(i);
                bumVar.f(3, parcelC);
            }
        });
    }

    @Override // defpackage.bob
    public final void sendKeyChar(final char c) {
        e(new bop() { // from class: bog
            @Override // defpackage.bop
            public final void a() {
                bum bumVar = this.a.e;
                Parcel parcelC = bumVar.c();
                parcelC.writeInt(c);
                bumVar.f(4, parcelC);
            }
        });
    }
}
