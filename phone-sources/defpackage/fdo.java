package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdo {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, RecyclerView.ItemAnimator.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static edh a(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new edh(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        edh edhVar = new edh(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            edh edhVar2 = new edh(bArrCopyOf);
            while (edhVar2.a() >= 16) {
                edhVar2.n(2);
                int iD = edhVar2.d(14) & 16383;
                int iMin = Math.min(8 - edhVar.b, 14);
                int i4 = edhVar.b;
                int i5 = (8 - i4) - iMin;
                Object obj = edhVar.c;
                int i6 = edhVar.a;
                byte[] bArr2 = (byte[]) obj;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr2[i6]);
                bArr2[i6] = b5;
                int i7 = 14 - iMin;
                bArr2[i6] = (byte) (b5 | ((iD >>> i7) << i5));
                int i8 = i6 + 1;
                while (i7 > 8) {
                    i7 -= 8;
                    ((byte[]) edhVar.c)[i8] = (byte) (iD >>> i7);
                    i8++;
                }
                byte[] bArr3 = (byte[]) edhVar.c;
                byte b6 = (byte) (bArr3[i8] & ((1 << r6) - 1));
                bArr3[i8] = b6;
                bArr3[i8] = (byte) (((iD & ((1 << i7) - 1)) << (8 - i7)) | b6);
                edhVar.n(14);
                edhVar.g();
            }
        }
        edhVar.j(bArrCopyOf);
        return edhVar;
    }

    public static int b(edh edhVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && edhVar.p(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return i4 + edhVar.d(iArr[i2]);
    }
}
