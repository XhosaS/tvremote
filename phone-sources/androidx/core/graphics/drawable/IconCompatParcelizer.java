package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.glj;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(glj gljVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = gljVar.a(iconCompat.b, 1);
        byte[] bArr = iconCompat.d;
        if (gljVar.s(2)) {
            Parcel parcel = gljVar.d;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.d = bArr;
        iconCompat.e = gljVar.b(iconCompat.e, 3);
        iconCompat.f = gljVar.a(iconCompat.f, 4);
        iconCompat.g = gljVar.a(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) gljVar.b(iconCompat.h, 6);
        iconCompat.j = gljVar.e(iconCompat.j, 7);
        iconCompat.k = gljVar.e(iconCompat.k, 8);
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.b) {
            case -1:
                Parcelable parcelable = iconCompat.e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.c = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.e;
                if (parcelable2 != null) {
                    iconCompat.c = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.d;
                iconCompat.c = bArr3;
                iconCompat.b = 3;
                iconCompat.f = 0;
                iconCompat.g = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.c = new String(iconCompat.d, Charset.forName("UTF-16"));
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = ((String) iconCompat.c).split(":", -1)[0];
                    return iconCompat;
                }
                return iconCompat;
            case 3:
                iconCompat.c = iconCompat.d;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, glj gljVar) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case -1:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 1:
            case 5:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 2:
                iconCompat.d = ((String) iconCompat.c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.d = (byte[]) iconCompat.c;
                break;
            case 4:
            case 6:
                iconCompat.d = iconCompat.c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.b;
        if (i != -1) {
            gljVar.h(i, 1);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            gljVar.p(2);
            Parcel parcel = gljVar.d;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            gljVar.i(parcelable, 3);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            gljVar.h(i2, 4);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            gljVar.h(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            gljVar.i(colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            gljVar.j(str, 7);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            gljVar.j(str2, 8);
        }
    }
}
