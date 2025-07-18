package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehx {
    public final String a;
    public final dze b;
    public final dze c;
    public final int d;
    public final int e;

    public ehx(String str, dze dzeVar, dze dzeVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        a.H(z);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        dzeVar.getClass();
        this.b = dzeVar;
        dzeVar2.getClass();
        this.c = dzeVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ehx ehxVar = (ehx) obj;
            if (this.d == ehxVar.d && this.e == ehxVar.e && this.a.equals(ehxVar.a) && this.b.equals(ehxVar.b) && this.c.equals(ehxVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
