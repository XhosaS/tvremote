package defpackage;

import android.view.View;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jst extends scf implements scl {
    public scg a;
    public sck b;
    public wkv c;
    public wls d;
    public wls e;
    public View.OnClickListener g;
    public wls h;
    public wls i;
    public wls j;
    public wls k;
    public wls l;
    public wlx m;
    public int n;
    public int o;
    private final int p;
    private final yfo q;
    public sco f = sco.a;
    private int r = 0;
    private final Set s = new HashSet();

    public jst(yfo yfoVar, int i) {
        this.q = yfoVar;
        this.p = i;
    }

    @Override // defpackage.scf
    public final int a() {
        return this.p;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.r;
    }

    @Override // defpackage.scl
    public final int c() {
        return -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jst jstVar = (jst) scfVar;
        long j = true != yks.e(this.c, jstVar.c) ? 1L : 0L;
        if (this.n != jstVar.n) {
            j |= 2;
        }
        if (!yks.e(this.d, jstVar.d)) {
            j |= 4;
        }
        if (!yks.e(this.e, jstVar.e)) {
            j |= 8;
        }
        if (!yks.e(this.f, jstVar.f)) {
            j |= 16;
        }
        if (!yks.e(this.g, jstVar.g)) {
            j |= 32;
        }
        if (this.o != jstVar.o) {
            j |= 64;
        }
        if (!yks.e(this.h, jstVar.h)) {
            j |= 128;
        }
        if (!yks.e(this.i, jstVar.i)) {
            j |= 256;
        }
        if (!yks.e(this.j, jstVar.j)) {
            j |= 512;
        }
        if (!yks.e(this.k, jstVar.k)) {
            j |= 1024;
        }
        if (!yks.e(this.l, jstVar.l)) {
            j |= 2048;
        }
        return !yks.e(this.m, jstVar.m) ? j | 4096 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.q.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.posterbanner.PosterBannerCardViewBindable";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    @Override // defpackage.scf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.sca r14, long r15) throws defpackage.scr {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jst.h(sca, long):void");
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.n), this.d, this.e, this.f, this.g, Integer.valueOf(this.o), this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // defpackage.scf
    public final void i(View view) {
        scg scgVar = this.a;
        if (scgVar != null) {
            scgVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        sck sckVar = this.b;
        if (sckVar != null) {
            sckVar.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.r = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return true;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return false;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.s.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.s.remove(sddVar);
    }

    public final String toString() {
        wkv wkvVar = this.c;
        int i = this.n;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        wls wlsVar = this.d;
        wls wlsVar2 = this.e;
        sco scoVar = this.f;
        View.OnClickListener onClickListener = this.g;
        int i2 = this.o;
        return String.format("PosterBannerCardViewModel{bannerLayoutBackgroundColor=%s, posterImagePosition=%s, bannerTitle=%s, bannerSubtitle=%s, bannerTitleButtonText=%s, bannerCardOnClickListener=%s, imageDescriptionPosition=%s, imageTagText=%s, imageDescriptionText=%s, promotionText=%s, newPrice=%s, originalPrice=%s, posterImage=%s}", wkvVar, string, wlsVar, wlsVar2, scoVar, onClickListener, i2 != 0 ? Integer.toString(i2 - 1) : "null", this.h, this.i, this.j, this.k, this.l, this.m);
    }
}
