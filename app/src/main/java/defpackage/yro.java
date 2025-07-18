package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yro {
    public static String a(String str, Object... objArr) {
        String string;
        int length;
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    string = "null";
                } else {
                    try {
                        string = obj.toString();
                    } catch (Exception e) {
                        String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                        string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                    }
                }
                objArr[i2] = string;
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = strValueOf.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
