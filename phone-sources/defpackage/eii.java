package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eii extends eah {
    public final int j;
    public final String k;
    public final int l;
    public final dze m;
    public final int n;
    public final evz o;
    final boolean p;

    public eii(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, null, false);
    }

    final eii b(evz evzVar) {
        String message = getMessage();
        String str = edt.a;
        return new eii(message, getCause(), this.g, this.j, this.k, this.l, this.m, this.n, evzVar, this.h, this.p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eii(int i, Throwable th, int i2, String str, int i3, dze dzeVar, int i4, evz evzVar, boolean z) {
        String str2;
        int i5;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            string = "Source error";
        } else if (i != 1) {
            string = "Unexpected runtime error";
            str2 = str;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(dzeVar);
            String strW = edt.W(i4);
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(strW);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str2, i5, dzeVar, i4, evzVar, SystemClock.elapsedRealtime(), z);
    }

    private eii(String str, Throwable th, int i, int i2, String str2, int i3, dze dzeVar, int i4, evz evzVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, Bundle.EMPTY, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        a.H(z2);
        a.H(th != null);
        this.j = i2;
        this.k = str2;
        this.l = i3;
        this.m = dzeVar;
        this.n = i4;
        this.o = evzVar;
        this.p = z;
    }
}
