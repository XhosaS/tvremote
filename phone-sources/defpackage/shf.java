package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shf implements sgi {
    public final aagj a;
    public final aagg b;
    private final String c;

    public shf(String str, aagj aagjVar, aagg aaggVar) {
        this.c = str;
        this.a = aagjVar;
        this.b = aaggVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof shf) {
            shf shfVar = (shf) obj;
            if (TextUtils.equals(this.c, shfVar.c) && this.a.equals(shfVar.a) && this.b.equals(shfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b});
    }
}
