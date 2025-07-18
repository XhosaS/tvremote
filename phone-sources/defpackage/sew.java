package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sew {
    public final int a;

    public sew(int i) {
        this.a = i;
    }

    public static /* synthetic */ IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof nsa ? (nsa) iInterfaceQueryLocalInterface : new nsa(iBinder);
    }

    public static final long i(zuw zuwVar) {
        Object cause = zuwVar.b;
        if ((cause instanceof eaf) || (cause instanceof FileNotFoundException) || (cause instanceof efi) || (cause instanceof ezv)) {
            return -9223372036854775807L;
        }
        while (cause != null) {
            if ((cause instanceof eev) && ((eev) cause).a == 2008) {
                return -9223372036854775807L;
            }
            cause = ((Throwable) cause).getCause();
        }
        return Math.min((zuwVar.a - 1) * 1000, 5000);
    }

    public static final aacv j(fht fhtVar, zuw zuwVar) {
        Object obj = zuwVar.b;
        if (!(obj instanceof efm)) {
            return null;
        }
        int i = ((efm) obj).c;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (fhtVar.a(1)) {
            return new aacv(1, 300000L, null, null, null);
        }
        if (fhtVar.a(2)) {
            return new aacv(2, 60000L, null, null, null);
        }
        return null;
    }

    public final Object a(rzy rzyVar) {
        Object obj = ((Object[]) ((ulp) rzyVar.b).a)[0];
        obj.getClass();
        return obj;
    }

    public final void b(Object obj, rzy rzyVar) {
        ((Object[]) ((ulp) rzyVar.b).a)[0] = obj;
    }

    public final boolean c(int i) {
        return (this.a & i) == i;
    }

    public final boolean d() {
        return c(64);
    }

    public final boolean e() {
        return !(!c(32) || d() || f()) || d();
    }

    public final boolean f() {
        return c(128);
    }

    public final int h(int i) {
        int i2 = this.a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public sew(int i, byte[] bArr) {
        this.a = 0;
    }

    public sew(int i, byte[] bArr, byte[] bArr2) {
        this.a = i;
    }

    public sew(nln nlnVar) {
        this.a = nlnVar.e;
    }

    public sew() {
        this(-1);
    }
}
