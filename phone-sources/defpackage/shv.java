package defpackage;

import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shv {
    public List a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public shv(byte[] bArr, byte[] bArr2) {
        trk trkVar = trk.a;
        this.f = trkVar;
        this.e = trkVar;
        this.h = trkVar;
        this.i = trkVar;
    }

    public final void a(lpx lpxVar) {
        if (lpxVar == null) {
            throw new NullPointerException("Null arrowPlacement");
        }
        this.b = lpxVar;
    }

    public final void b(lpy lpyVar) {
        if (lpyVar == null) {
            throw new NullPointerException("Null dismissalType");
        }
        this.c = lpyVar;
    }

    public final void c(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null images");
        }
        this.a = immutableList;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.d = str;
    }

    public final void e(lpz lpzVar) {
        if (lpzVar == null) {
            throw new NullPointerException("Null type");
        }
        this.g = lpzVar;
    }

    public shv() {
        shp shpVar = new shp();
        shpVar.a = R.color.google_white;
        shpVar.c = R.color.google_white;
        shpVar.f = R.color.google_grey900;
        shpVar.g = R.color.google_grey700;
        shpVar.h = R.color.google_white;
        shpVar.i = R.color.google_grey800;
        shpVar.j = R.color.google_black;
        shpVar.k = R.color.google_grey700;
        shpVar.l = R.color.google_white;
        shpVar.q = R.color.google_grey700;
        shpVar.d = R.color.google_grey100;
        shpVar.e = R.color.google_white;
        shpVar.m = R.color.google_grey300;
        shpVar.n = R.color.google_grey600;
        shpVar.r = R.color.google_grey600;
        shpVar.s = R.color.google_grey900;
        shpVar.o = R.color.google_black;
        shpVar.p = R.color.google_grey700;
        shpVar.t = R.color.google_blue600;
        shpVar.u = R.color.google_white;
        shpVar.v = R.color.google_blue50;
        shpVar.w = false;
        shpVar.x = false;
        this.e = shpVar.a();
        this.f = new shy(new shx());
    }
}
