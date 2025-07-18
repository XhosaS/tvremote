package com.google.android.tv.remote.service;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.erv;
import defpackage.vee;
import defpackage.vej;
import defpackage.zdv;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class AudioStream implements Parcelable {
    private static final zdy a = zdy.h("com/google/android/tv/remote/service/AudioStream");
    public static final Parcelable.Creator CREATOR = new vee();

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ParcelFileDescriptor e() {
        ParcelFileDescriptor parcelFileDescriptorF = f();
        if (parcelFileDescriptorF == null) {
            try {
                vej vejVarG = g();
                Parcel parcelB = vejVarG.b(1, vejVarG.a());
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) erv.a(parcelB, ParcelFileDescriptor.CREATOR);
                parcelB.recycle();
                return parcelFileDescriptor;
            } catch (RemoteException | SecurityException e) {
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/tv/remote/service/AudioStream", "getAudioStream", '{', "AudioStream.java")).u("Unable to get audio stream");
            }
        }
        return parcelFileDescriptorF;
    }

    public abstract ParcelFileDescriptor f();

    public abstract vej g();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptorF = f();
        parcel.writeTypedObject(parcelFileDescriptorF, i);
        parcel.writeInt(b());
        parcel.writeInt(a());
        parcel.writeInt(d());
        parcel.writeInt(0);
        if (parcelFileDescriptorF == null) {
            parcel.writeStrongInterface(g());
            parcel.writeInt(c());
        }
    }
}
