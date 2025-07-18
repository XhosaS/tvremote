package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jnp extends eru implements jnq {
    public jnp() {
        super("com.google.android.apps.tvsearch.voice.recognition.SpeechRecognitionService");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        jnn jnnVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                jnnVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.tvsearch.voice.recognition.SpeechRecognitionCallback");
                jnnVar = iInterfaceQueryLocalInterface instanceof jnn ? (jnn) iInterfaceQueryLocalInterface : new jnn(strongBinder);
            }
            O(parcel);
            c(jnnVar);
        } else {
            if (i != 2) {
                return false;
            }
            L();
        }
        parcel2.writeNoException();
        return true;
    }
}
