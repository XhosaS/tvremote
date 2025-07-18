package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohz extends ocg {
    public static final Parcelable.Creator<ohz> CREATOR = new odt(12);
    public String a;
    public String b;
    public String c;
    public BluetoothDevice d;
    public byte[] e;
    public final int f;
    public ohm g;
    public oho h;

    private ohz() {
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ohz) {
            ohz ohzVar = (ohz) obj;
            if (a.Q(this.a, ohzVar.a) && a.Q(this.b, ohzVar.b) && a.Q(this.c, ohzVar.c) && a.Q(this.d, ohzVar.d) && Arrays.equals(this.e, ohzVar.e) && a.Q(Integer.valueOf(this.f), Integer.valueOf(ohzVar.f)) && a.Q(this.g, ohzVar.g) && a.Q(this.h, ohzVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, this.a);
        ocv.O(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.N(parcel, 4, this.d, i);
        ocv.F(parcel, 5, this.e);
        ocv.B(parcel, 6, this.f);
        ocv.N(parcel, 7, this.g, i);
        ocv.N(parcel, 8, this.h, i);
        ocv.x(parcel, iV);
    }

    public ohz(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr, int i, ohm ohmVar, oho ohoVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bluetoothDevice;
        this.e = bArr;
        this.f = i;
        this.g = ohmVar;
        this.h = ohoVar;
    }
}
