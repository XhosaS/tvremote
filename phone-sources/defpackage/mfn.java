package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mfn {
    public final Object a;
    public final String b;
    public final String c;

    public mfn(Object obj, String str, String str2) {
        this.a = obj;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mfn mfnVar = (mfn) obj;
            if (a.Q(this.a, mfnVar.a) && a.Q(this.b, mfnVar.b) && a.Q(this.c, mfnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
