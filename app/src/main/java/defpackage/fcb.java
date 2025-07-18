package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcb {
    public final Cursor a;
    public final int b;
    public final String c;
    public final fwx d;
    public final fws e;

    public fcb(Cursor cursor, int i, String str, fwx fwxVar, fws fwsVar) {
        fwxVar.getClass();
        this.a = cursor;
        this.b = i;
        this.c = str;
        this.d = fwxVar;
        this.e = fwsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcb)) {
            return false;
        }
        fcb fcbVar = (fcb) obj;
        return agvy.c(this.a, fcbVar.a) && this.b == fcbVar.b && agvy.c(this.c, fcbVar.c) && this.d == fcbVar.d && this.e == fcbVar.e;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        fws fwsVar = this.e;
        return (iHashCode * 31) + (fwsVar == null ? 0 : fwsVar.hashCode());
    }

    public final String toString() {
        return "LauncherxAccountData(cursor=" + this.a + ", modeCode=" + this.b + ", accountName=" + this.c + ", profileLock=" + this.d + ", networkState=" + this.e + ")";
    }
}
