package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class frj extends Binder implements frk {
    private final WeakReference a;

    public frj(frp frpVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(frpVar);
    }

    @Override // defpackage.frk
    public final void a(fsl fslVar) {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    @Override // defpackage.frk
    public final void b(int i) {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    @Override // defpackage.frk
    public final void c(int i) {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    public void d() {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    public void e(fsi fsiVar) {
        if (((frp) this.a.get()) != null) {
            if (fsiVar != null) {
                fre frgVar = Build.VERSION.SDK_INT >= 26 ? new frg() : new fre();
                frgVar.a.setLegacyStreamType(fsiVar.b);
                fus.u(frgVar);
            }
            throw null;
        }
    }

    public void f() {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    public void g() {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    public void h() {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    public void i() {
        if (((frp) this.a.get()) != null) {
            throw null;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                if (((frp) this.a.get()) != null) {
                    throw null;
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                d();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                a(parcel.readInt() != 0 ? fsl.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                    frt.CREATOR.createFromParcel(parcel);
                }
                g();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.createTypedArrayList(fsb.CREATOR);
                h();
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                i();
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (parcel.readInt() != 0) {
                }
                f();
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                e(parcel.readInt() != 0 ? fsi.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                b(parcel.readInt());
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                if (((frp) this.a.get()) != null) {
                    throw null;
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                c(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (((frp) this.a.get()) != null) {
                    throw null;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
