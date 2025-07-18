package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v7.appcompat.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ea extends Binder implements eb {
    public final AtomicReference a;

    public ea() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // defpackage.eb
    public final ey a() {
        int i;
        en enVar = (en) this.a.get();
        if (enVar == null) {
            return null;
        }
        ey eyVar = enVar.e;
        du duVar = enVar.f;
        if (eyVar != null) {
            long j = eyVar.b;
            if (j != -1) {
                int i2 = eyVar.a;
                if (i2 == 3 || i2 == 4) {
                    i = i2;
                } else if (i2 == 5) {
                    i = 5;
                }
                long j2 = eyVar.h;
                long j3 = 0;
                if (j2 > 0) {
                    float f = eyVar.d;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j4 = jElapsedRealtime - j2;
                    long jA = (duVar == null || !duVar.b.containsKey("android.media.metadata.DURATION")) ? -1L : duVar.a("android.media.metadata.DURATION");
                    long j5 = ((long) (j4 * f)) + j;
                    if (jA >= 0 && j5 > jA) {
                        j3 = jA;
                    } else if (j5 >= 0) {
                        j3 = j5;
                    }
                    ew ewVar = new ew(eyVar);
                    ewVar.c(i, j3, f, jElapsedRealtime);
                    return ewVar.a();
                }
            }
        }
        return eyVar;
    }

    @Override // defpackage.eb
    public final void b(dy dyVar) {
        en enVar = (en) this.a.get();
        if (enVar == null) {
            return;
        }
        enVar.d.register(dyVar, new dyg("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (enVar.c) {
        }
    }

    @Override // defpackage.eb
    public final void c(dy dyVar) {
        en enVar = (en) this.a.get();
        if (enVar == null) {
            return;
        }
        enVar.d.unregister(dyVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (enVar.c) {
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        dy dwVar = null;
        switch (i) {
            case 1:
                parcel.readString();
                throw new AssertionError();
            case 2:
                throw new AssertionError();
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    dwVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dy)) ? new dw(strongBinder) : (dy) iInterfaceQueryLocalInterface;
                }
                b(dwVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    dwVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof dy)) ? new dw(strongBinder2) : (dy) iInterfaceQueryLocalInterface2;
                }
                c(dwVar);
                parcel2.writeNoException();
                return true;
            case 5:
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                throw new AssertionError();
            case 10:
                throw new AssertionError();
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 13:
                throw new AssertionError();
            case 14:
                parcel.readString();
                throw new AssertionError();
            case 15:
                parcel.readString();
                throw new AssertionError();
            case 16:
                throw new AssertionError();
            case 17:
                parcel.readLong();
                throw new AssertionError();
            case 18:
                throw new AssertionError();
            case 19:
                throw new AssertionError();
            case 20:
                throw new AssertionError();
            case 21:
                throw new AssertionError();
            case 22:
                throw new AssertionError();
            case 23:
                throw new AssertionError();
            case 24:
                parcel.readLong();
                throw new AssertionError();
            case 25:
                throw new AssertionError();
            case 26:
                parcel.readString();
                throw new AssertionError();
            case 27:
                throw new AssertionError();
            case 28:
                ey eyVarA = a();
                parcel2.writeNoException();
                d.f(parcel2, eyVarA);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                throw new AssertionError();
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                throw new AssertionError();
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                throw new AssertionError();
            case 34:
                parcel.readString();
                throw new AssertionError();
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                parcel.readString();
                throw new AssertionError();
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                throw new AssertionError();
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                i3 = ((en) this.a.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                parcel.readInt();
                throw new AssertionError();
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                throw new AssertionError();
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                parcel.readInt();
                throw new AssertionError();
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                throw new AssertionError();
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                parcel.readInt();
                throw new AssertionError();
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                parcel.readInt();
                throw new AssertionError();
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                i3 = ((en) this.a.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                parcel.readInt();
                throw new AssertionError();
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                parcel.readFloat();
                throw new AssertionError();
            case 50:
                parcel2.writeNoException();
                d.f(parcel2, null);
                return true;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                throw new AssertionError();
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public ea(en enVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(enVar);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
