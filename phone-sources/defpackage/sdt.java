package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sdt implements Parcelable {
    public final int a;
    public final int b;

    public sdt() {
        throw null;
    }

    public static sds a() {
        sds sdsVar = new sds();
        sdsVar.c(0);
        sdsVar.b(0);
        return sdsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdt) {
            sdt sdtVar = (sdt) obj;
            if (this.a == sdtVar.a && this.b == sdtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "DownloadStatusViewModel{downloadFraction=" + this.a + ", state=" + this.b + "}";
    }

    public sdt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
