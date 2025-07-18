package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shg implements sgi {
    public final sgk a;
    public final aagg b;
    public final boolean c;
    private final String d;

    public shg(String str, sgk sgkVar, aagg aaggVar, boolean z) {
        this.d = str;
        this.a = sgkVar;
        this.b = aaggVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof shg) {
            shg shgVar = (shg) obj;
            if (TextUtils.equals(this.d, shgVar.d) && this.a.equals(shgVar.a) && this.b.equals(shgVar.b) && this.c == shgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b});
    }
}
