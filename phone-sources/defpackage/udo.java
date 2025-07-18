package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udo {
    public static final int[] a = {1, 1, 2, 6, 24, R.styleable.AppCompatTheme_windowFixedHeightMajor, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static final int[] b = {ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 65536, 2345, 477, 193, R.styleable.AppCompatTheme_textColorAlertDialogListItem, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int i, int i2) {
        sfy.al("n", i);
        sfy.al("k", i2);
        int i3 = 0;
        sij.t(i2 <= i, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        if (i2 >= 17 || i > b[i2]) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return i;
        }
        long j = 1;
        while (i3 < i2) {
            long j2 = j * (i - i3);
            i3++;
            j = j2 / i3;
        }
        return (int) j;
    }

    public static int b(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        sfy.ai(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    public static int c(int i, int i2) {
        long j = i * i2;
        int i3 = (int) j;
        sfy.ai(j == ((long) i3), "checkedMultiply", i, i2);
        return i3;
    }

    public static int d(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (udn.a[roundingMode.ordinal()]) {
            case 1:
                sfy.ak(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int e(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.cd(i, "x (", ") must be > 0"));
        }
        switch (udn.a[roundingMode.ordinal()]) {
            case 1:
                sfy.ak(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int f(int i, int i2) {
        return sfy.ab(i + i2);
    }

    public static int g(int i, int i2) {
        return sfy.ab(i * i2);
    }
}
