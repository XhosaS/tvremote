package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import defpackage.bww;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(bww bwwVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = bwwVar.b(iconCompat.b, 1);
        byte[] bArrE = iconCompat.d;
        if (bwwVar.D(2)) {
            bArrE = bwwVar.E();
        }
        iconCompat.d = bArrE;
        iconCompat.e = bwwVar.g(iconCompat.e, 3);
        iconCompat.f = bwwVar.b(iconCompat.f, 4);
        iconCompat.g = bwwVar.b(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) bwwVar.g(iconCompat.h, 6);
        iconCompat.j = bwwVar.n(iconCompat.j, 7);
        iconCompat.k = bwwVar.n(iconCompat.k, 8);
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
                byte[] bArr = iconCompat.d;
                iconCompat.c = bArr;
                iconCompat.b = 3;
                iconCompat.f = 0;
                iconCompat.g = bArr.length;
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

    public static void write(IconCompat iconCompat, bww bwwVar) {
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
            bwwVar.p(1);
            bwwVar.v(i);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            bwwVar.p(2);
            bwwVar.t(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            bwwVar.p(3);
            bwwVar.x(parcelable);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            bwwVar.p(4);
            bwwVar.v(i2);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            bwwVar.p(5);
            bwwVar.v(i3);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            bwwVar.p(6);
            bwwVar.x(colorStateList);
        }
        String str = iconCompat.j;
        if (str != null) {
            bwwVar.p(7);
            bwwVar.y(str);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            bwwVar.p(8);
            bwwVar.y(str2);
        }
    }
}
