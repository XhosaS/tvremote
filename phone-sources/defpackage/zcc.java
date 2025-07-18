package defpackage;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcc implements Iterable, yli {
    private final String[] a;

    public zcc(String[] strArr) {
        this.a = strArr;
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(String str) {
        str.getClass();
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int iX = wef.x(length, 0, -2);
        if (iX <= length) {
            while (!ylh.y(str, strArr[length], true)) {
                if (length != iX) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.a[i + i];
    }

    public final String d(int i) {
        return this.a[i + i + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.text.DateFormat[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final Date e(String str) {
        String strB = b(str);
        if (strB == null) {
            return null;
        }
        zdl zdlVar = zdm.a;
        if (strB.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) zdm.a.get()).parse(strB, parsePosition);
        if (parsePosition.getIndex() == strB.length()) {
            return date;
        }
        String[] strArr = zdm.b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < 15; i++) {
                ?? r5 = zdm.c;
                ?? r6 = r5[i];
                SimpleDateFormat simpleDateFormat = r6;
                if (r6 == 0) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(strArr[i], Locale.US);
                    simpleDateFormat2.setTimeZone(zcr.d);
                    r5[i] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date date2 = simpleDateFormat.parse(strB, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zcc) && Arrays.equals(this.a, ((zcc) obj).a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final upq f() {
        upq upqVar = new upq((byte[]) null, (byte[]) null);
        yfm.J(upqVar.b, this.a);
        return upqVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<yfw<String, String>> iterator() {
        int iA = a();
        yfw[] yfwVarArr = new yfw[iA];
        for (int i = 0; i < iA; i++) {
            yfwVarArr[i] = new yfw(c(i), d(i));
        }
        return ykn.e(yfwVarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iA = a();
        for (int i = 0; i < iA; i++) {
            String strC = c(i);
            String strD = d(i);
            sb.append(strC);
            sb.append(": ");
            if (true == zcr.u(strC)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        return sb.toString();
    }
}
