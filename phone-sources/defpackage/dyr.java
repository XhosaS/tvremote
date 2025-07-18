package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyr extends Binder {
    private static final int a;
    private final ImmutableList b;

    static {
        a = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public dyr(List list) {
        this.b = ImmutableList.copyOf((Collection) list);
    }

    public static ImmutableList a(IBinder iBinder) {
        int i;
        if (iBinder instanceof dyr) {
            return ((dyr) iBinder).b;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            builder.add((ImmutableList.Builder) bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        ImmutableList immutableList = this.b;
        int size = immutableList.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) immutableList.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
