package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvp extends cvn {
    private final Handler c;
    private final String d;
    private final boolean e;
    private final cvp f;

    public cvp() {
        throw null;
    }

    @Override // defpackage.cvn
    public final /* synthetic */ cvn b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvp)) {
            return false;
        }
        cvp cvpVar = (cvp) obj;
        return cvpVar.c == this.c && cvpVar.e == this.e;
    }

    public final int hashCode() {
        boolean z = this.e;
        return (true != z ? 1237 : 1231) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.cvn, defpackage.cvi
    public final String toString() {
        String strA = a();
        if (strA != null) {
            return strA;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? String.valueOf(string).concat(".immediate") : string;
    }

    public cvp(Handler handler, String str) {
        this(handler, str, false);
    }

    private cvp(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new cvp(handler, str, true);
    }
}
