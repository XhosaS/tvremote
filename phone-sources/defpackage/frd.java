package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frd implements frb {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);
    public static final String f = edt.Z(5);
    public static final String g = edt.Z(6);
    public static final String h = edt.Z(7);
    public static final String i = edt.Z(8);
    public static final String j = edt.Z(9);
    public final int k;
    public final String l;
    public final String m;
    public final IBinder n;
    public final Bundle o;
    public final MediaSession.Token p;
    private final int q;
    private final int r;
    private final int s;
    private final ComponentName t;

    public frd(int i2, String str, fnl fnlVar, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        this.k = i2;
        this.q = 0;
        this.r = 1008000001;
        this.s = 4;
        this.l = str;
        this.m = "";
        this.t = null;
        this.n = fnlVar;
        this.o = bundle;
        this.p = token;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof frd)) {
            return false;
        }
        frd frdVar = (frd) obj;
        if (this.k == frdVar.k) {
            int i2 = frdVar.q;
            int i3 = frdVar.r;
            int i4 = frdVar.s;
            if (TextUtils.equals(this.l, frdVar.l) && TextUtils.equals(this.m, frdVar.m)) {
                ComponentName componentName = frdVar.t;
                if (Objects.equals(null, null) && Objects.equals(this.n, frdVar.n) && Objects.equals(this.p, frdVar.p)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.k), 0, 1008000001, 4, this.l, this.m, null, this.n, this.p);
    }

    public final String toString() {
        Bundle bundle = this.o;
        return "SessionToken {pkg=" + this.l + " type=0 libraryVersion=1008000001 interfaceVersion=4 service=" + this.m + " IMediaSession=" + this.n.toString() + " extras=" + bundle.toString() + "}";
    }
}
