package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lqt {
    public static final lqt a = new lqt();
    private Pattern[] b = new Pattern[0];
    private String[] c = new String[0];

    private lqt() {
    }

    public final synchronized String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        while (true) {
            Pattern[] patternArr = this.b;
            if (i >= patternArr.length) {
                return str;
            }
            str = patternArr[i].matcher(str).replaceAll(this.c[i]);
            i++;
        }
    }

    public final synchronized void b(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        kkk.a(length == strArr2.length);
        this.b = new Pattern[length];
        this.c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.b[i] = Pattern.compile(strArr[i]);
        }
    }
}
