package defpackage;

import android.os.Parcel;
import com.google.android.apps.inputmethod.libs.tvvoice.api.KeyboardEventData;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class esg extends eru implements esh {
    public esg() {
        super("com.google.android.apps.inputmethod.libs.tvvoice.api.IKeyboardSession");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            KeyboardEventData keyboardEventData = (KeyboardEventData) erv.a(parcel, KeyboardEventData.CREATOR);
            O(parcel);
            I(keyboardEventData);
        } else {
            if (i != 2) {
                return false;
            }
            parcel.createStringArray();
            parcel.readInt();
            boolean zD = erv.d(parcel);
            O(parcel);
            c(zD);
        }
        return true;
    }
}
