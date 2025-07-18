package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upb {
    public static final /* synthetic */ int d = 0;
    private static final Pattern e = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public upb(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !e.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        this.a = strSubstring;
        this.b = str;
        this.c = a.cq(str2, str, "!");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof upb)) {
            return false;
        }
        upb upbVar = (upb) obj;
        return this.a.equals(upbVar.a) && this.b.equals(upbVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
