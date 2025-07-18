package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohp extends ocg {
    public final int a;
    public final int b;
    public final byte[] c;
    private static final Charset d = Charset.forName("UTF-8");
    public static final Parcelable.Creator<ohp> CREATOR = new odt(9);

    public ohp(int i, int i2, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        this.b = i2;
    }

    public final String toString() {
        String str;
        int length;
        int i = this.a;
        String str2 = "UNKNOWN";
        switch (i) {
            case 1:
                str = new String(this.c, d);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                byte[] bArr = this.c;
                byte[] bArr2 = ohl.a;
                str = null;
                if (bArr != null && (length = bArr.length) != 0) {
                    byte[] bArr3 = new byte[length * 5];
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        byte b = bArr[i2];
                        int i3 = i2 * 5;
                        bArr3[i3] = 48;
                        bArr3[i3 + 1] = 120;
                        byte[] bArr4 = ohl.a;
                        bArr3[i3 + 2] = bArr4[(b & 255) >>> 4];
                        bArr3[i3 + 3] = bArr4[b & 15];
                        bArr3[i3 + 4] = 32;
                    }
                    str = "[ " + new String(bArr3, StandardCharsets.UTF_8) + "]";
                    break;
                }
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        switch (i) {
            case 1:
                str2 = "SESSION_ID";
                break;
            case 2:
                str2 = "DEVICE_PLATFORM";
                break;
            case 3:
                str2 = "TX_POWER";
                break;
            case 4:
                str2 = "BLE_L2_CAP_PSM";
                break;
            case 5:
                str2 = "SERVICE_ID_HASH";
                break;
            case 6:
                str2 = "SUPPORTED_SERVICES";
                break;
            case 7:
                str2 = "DEVICE_INFO";
                break;
        }
        return String.format("DctDataElement{type=%s, length=%s, value=%s}", str2, Integer.valueOf(this.b), str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.B(parcel, 2, this.b);
        ocv.F(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
