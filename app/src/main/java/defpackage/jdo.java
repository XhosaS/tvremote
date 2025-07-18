package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jdo extends ert implements jdq {
    public jdo(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.tvsearch.voice.ipc.IKatnissVoiceInteractionService");
    }

    @Override // defpackage.jdq
    public final void e(boolean z) {
        Parcel parcelA = a();
        ClassLoader classLoader = erv.a;
        parcelA.writeInt(z ? 1 : 0);
        J(1, parcelA);
    }

    @Override // defpackage.jdq
    public final void f(boolean z) {
        Parcel parcelA = a();
        ClassLoader classLoader = erv.a;
        parcelA.writeInt(z ? 1 : 0);
        J(2, parcelA);
    }
}
