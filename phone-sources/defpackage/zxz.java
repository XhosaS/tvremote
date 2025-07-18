package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxz {
    public static final short[] a = new short[128];
    public static final byte[] b;

    static {
        byte[] bArr = new byte[R.styleable.AppCompatTheme_toolbarNavigationButtonStyle];
        b = bArr;
        byte[] bArr2 = new byte[128];
        a(bArr2, 0, 15, (byte) 1);
        a(bArr2, 16, 31, (byte) 2);
        a(bArr2, 32, 63, (byte) 3);
        a(bArr2, 64, 65, (byte) 0);
        a(bArr2, 66, 95, (byte) 4);
        a(bArr2, 96, 96, (byte) 5);
        a(bArr2, 97, 108, (byte) 6);
        a(bArr2, 109, 109, (byte) 7);
        a(bArr2, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textColorSearchUrl, (byte) 6);
        a(bArr2, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, (byte) 8);
        a(bArr2, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipFrameBackground, (byte) 9);
        a(bArr2, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_viewInflaterClass, (byte) 10);
        a(bArr2, R.styleable.AppCompatTheme_windowActionBar, 127, (byte) 0);
        a(bArr, 0, R.styleable.AppCompatTheme_textColorSearchUrl, (byte) -2);
        a(bArr, 8, 11, (byte) -1);
        a(bArr, 24, 27, (byte) 0);
        a(bArr, 40, 43, (byte) 16);
        a(bArr, 58, 59, (byte) 0);
        a(bArr, 72, 73, (byte) 0);
        a(bArr, 89, 91, (byte) 16);
        a(bArr, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b2 = bArr2[i];
            a[i] = (short) (bArr4[b2] | ((bArr3[b2] & i) << 8));
        }
    }

    private static void a(byte[] bArr, int i, int i2, byte b2) {
        while (i <= i2) {
            bArr[i] = b2;
            i++;
        }
    }
}
