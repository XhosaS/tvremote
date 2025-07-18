package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzu {
    protected static final AtomicReference a = new AtomicReference();
    protected static final AtomicReference b = new AtomicReference();
    protected static final AtomicReference c = new AtomicReference();
    public final lcx d;

    public kzu(lcx lcxVar) {
        this.d = lcxVar;
    }

    private final String f(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        kkk.k(atomicReference);
        kkk.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strB);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.d.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(d(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.d.a() ? str : f(str, lcu.c, lcu.a, a);
    }

    protected final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.d.a() ? str : f(str, lcv.b, lcv.a, b);
    }

    protected final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.d.a() ? str : str.startsWith("_exp_") ? a.e(str, "experiment_id(", ")") : f(str, lcw.b, lcw.a, c);
    }
}
