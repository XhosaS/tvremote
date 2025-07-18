package defpackage;

import android.os.Bundle;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujs {
    private final Bundle a;
    private final String b;
    private uke c;
    private String d;

    public ujs() {
        this("Movie");
    }

    public final Thing a() {
        Bundle bundle = new Bundle(this.a);
        uke ukeVarA = this.c;
        if (ukeVarA == null) {
            ukeVarA = new ujr().a();
        }
        return new Thing(bundle, ukeVarA, this.d, this.b);
    }

    public final void b(String str, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] != null) {
                    int i3 = 20000;
                    if (str2.length() > 20000) {
                        String strSubstring = strArr2[i];
                        if (strSubstring.length() > 20000) {
                            if (Character.isHighSurrogate(strSubstring.charAt(19999)) && Character.isLowSurrogate(strSubstring.charAt(20000))) {
                                i3 = 19999;
                            }
                            strSubstring = strSubstring.substring(0, i3);
                        }
                        strArr2[i] = strSubstring;
                    }
                    i++;
                }
            }
            if (i > 0) {
                Object[] objArrCopyOf = (String[]) Arrays.copyOfRange(strArr2, 0, i);
                if (objArrCopyOf.length >= 100) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, 100);
                }
                this.a.putStringArray(str, (String[]) objArrCopyOf);
            }
        }
    }

    public final void c(ujr ujrVar) {
        ocv.aA(this.c == null, "setMetadata may only be called once");
        ocv.aF(ujrVar);
        this.c = ujrVar.a();
    }

    public final void d(String str) {
        ocv.aF(str);
        this.d = str;
    }

    public final void e(String str) {
        ocv.aF(str);
        b("image", str);
    }

    public final void f(String str) {
        b("name", str);
    }

    public ujs(String str) {
        ocv.aD(str);
        this.a = new Bundle();
        this.b = str;
    }
}
