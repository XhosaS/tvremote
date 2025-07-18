package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jdp extends eru implements jdq {
    public jdp() {
        super("com.google.android.apps.tvsearch.voice.ipc.IKatnissVoiceInteractionService");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            boolean zD = erv.d(parcel);
            O(parcel);
            e(zD);
        } else {
            if (i != 2) {
                return false;
            }
            boolean zD2 = erv.d(parcel);
            O(parcel);
            f(zD2);
        }
        parcel2.writeNoException();
        return true;
    }
}
