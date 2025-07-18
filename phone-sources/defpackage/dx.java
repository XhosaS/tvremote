package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dx extends Binder implements dy {
    private final WeakReference a;

    public dx(ee eeVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(eeVar);
    }

    @Override // defpackage.dy
    public final void a(ey eyVar) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.a(2, eyVar, null);
        }
    }

    public void b(Bundle bundle) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.a(7, bundle, null);
        }
    }

    public void c(du duVar) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.a(3, duVar, null);
        }
    }

    public void d(List list) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.a(5, list, null);
        }
    }

    public void e(CharSequence charSequence) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.a(6, charSequence, null);
        }
    }

    public void f() {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.a(8, null, null);
        }
    }

    public void g(ev evVar) {
        ee eeVar = (ee) this.a.get();
        if (eeVar != null) {
            eeVar.a(4, evVar != null ? new eh(evVar.b) : null, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) fh.c(parcel, Bundle.CREATOR);
                ee eeVar = (ee) this.a.get();
                if (eeVar != null) {
                    eeVar.a(1, string, bundle);
                }
                return true;
            case 2:
                f();
                return true;
            case 3:
                a((ey) fh.c(parcel, ey.CREATOR));
                return true;
            case 4:
                c((du) fh.c(parcel, du.CREATOR));
                return true;
            case 5:
                d(parcel.createTypedArrayList(er.CREATOR));
                return true;
            case 6:
                e((CharSequence) fh.c(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                b((Bundle) fh.c(parcel, Bundle.CREATOR));
                return true;
            case 8:
                g((ev) fh.c(parcel, ev.CREATOR));
                return true;
            case 9:
                int i3 = parcel.readInt();
                ee eeVar2 = (ee) this.a.get();
                if (eeVar2 != null) {
                    eeVar2.a(9, Integer.valueOf(i3), null);
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                ee eeVar3 = (ee) this.a.get();
                if (eeVar3 != null) {
                    eeVar3.a(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                int i4 = parcel.readInt();
                ee eeVar4 = (ee) this.a.get();
                if (eeVar4 != null) {
                    eeVar4.a(12, Integer.valueOf(i4), null);
                }
                return true;
            case 13:
                ee eeVar5 = (ee) this.a.get();
                if (eeVar5 != null) {
                    eeVar5.a(13, null, null);
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
