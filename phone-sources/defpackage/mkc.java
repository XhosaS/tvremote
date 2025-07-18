package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mkc implements mjx {
    public final Context a;
    public final mjs b;
    public final List c;
    public mjw d;
    public ieg e = ieg.a;
    public gag f;
    private final ldv g;
    private final mkb h;
    private boolean i;
    private long j;
    private hux k;
    private final lhr l;

    public mkc(lhr lhrVar, Context context, ldv ldvVar, mjl mjlVar, lfn lfnVar) {
        this.l = lhrVar;
        this.a = context;
        this.g = ldvVar;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.h = new mkb();
        eu euVar = mjlVar.c;
        arrayList.add(new mjr(this, euVar, context.getResources()));
        mjt mjtVar = new mjt(this, context, euVar, lfnVar);
        this.b = mjtVar;
        arrayList.add(mjtVar);
        mjlVar.S(new mka(this, 0));
    }

    public final mjy a() {
        krf.b();
        mjw mjwVar = this.d;
        if (mjwVar != null) {
            return mjwVar.c();
        }
        return null;
    }

    final mke b() {
        krf.b();
        mjw mjwVar = this.d;
        if (mjwVar != null) {
            return mjwVar.d();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final String c() {
        if (this.f == null) {
            return null;
        }
        for (Account account : this.g.u()) {
            gag gagVar = this.f;
            ieg iegVarA = ksn.a(account.name);
            if (iegVarA.m()) {
                if (TextUtils.equals(gagVar.b, gag.p((ksn) iegVarA.g()))) {
                    return account.name;
                }
            } else {
                if (gagVar.b == null) {
                    return account.name;
                }
            }
        }
        return null;
    }

    @Override // defpackage.mjx
    public final void e() {
        k();
        j(true);
    }

    public final String f() {
        krf.b();
        mjw mjwVar = this.d;
        if (mjwVar != null) {
            return mjwVar.e();
        }
        return null;
    }

    @Override // defpackage.mjx
    public final void g(mjy mjyVar) {
        int i;
        s();
        k();
        boolean z = this.i;
        boolean z2 = false;
        if (mjyVar != null && ((i = mjyVar.b) == 2 || i == 1)) {
            z2 = true;
        }
        this.i = z2;
        if (!z || z2) {
            return;
        }
        j(true);
    }

    final String h() {
        krf.b();
        mjw mjwVar = this.d;
        if (mjwVar != null) {
            return mjwVar.f();
        }
        return null;
    }

    @Override // defpackage.mjx
    public final void i() {
        p();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final void j(boolean z) {
        mkb mkbVar = this.h;
        if (mkbVar.d) {
            mkbVar.d = false;
            this.j = System.currentTimeMillis();
            krd.e("New resume timestamp = " + mkbVar.a);
            ksn ksnVarB = ksn.b(mkbVar.c);
            String str = mkbVar.b;
            lmy lmyVarE = this.l.e(str, mkbVar.e, ieg.f(ksnVarB), !TextUtils.isEmpty(this.f.c) ? ksy.h(str) : ksy.i(str));
            long j = mkbVar.a;
            lmyVarE.g = System.currentTimeMillis();
            lmyVarE.h = System.currentTimeMillis();
            lmyVarE.a(j, z);
        }
    }

    public final void k() {
        if (this.d != null) {
            if (System.currentTimeMillis() - this.j > 120000) {
                j(false);
            }
            mke mkeVarD = this.d.d();
            mjy mjyVarC = this.d.c();
            if (mkeVarD == null || mjyVarC == null) {
                return;
            }
            String strC = c();
            String str = mjyVarC.a;
            if (strC == null || str == null) {
                return;
            }
            mkb mkbVar = this.h;
            if (!TextUtils.equals(mkbVar.c, strC) || !TextUtils.equals(mkbVar.b, str)) {
                j(true);
            }
            mkbVar.e = mkeVarD.e;
            mkbVar.c = strC;
            mkbVar.a = mjyVarC.c;
            mkbVar.b = str;
            mkbVar.d = true;
            if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(str)) {
                return;
            }
            j(false);
        }
    }

    @Override // defpackage.mjx
    public final void m(mke mkeVar) {
        t();
    }

    public final void n() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mkf) it.next()).b();
        }
    }

    public final void o() {
        krd.e("onDisconnect() called");
        mjw mjwVar = this.d;
        if (mjwVar == null) {
            krd.c("No active remote!");
        } else {
            mjwVar.n();
        }
    }

    public final void p() {
        krf.b();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mkf) it.next()).d();
        }
    }

    public final void q() {
        krd.e("onPause() called");
        mjw mjwVar = this.d;
        if (mjwVar == null) {
            krd.c("No active remote!");
        } else {
            String str = mjwVar.c().a;
            mjwVar.w();
        }
    }

    public final void r() {
        krd.e("onPlay() called");
        mjw mjwVar = this.d;
        if (mjwVar == null) {
            krd.c("No active remote!");
        } else {
            String str = mjwVar.c().a;
            mjwVar.x();
        }
    }

    public final void s() {
        krf.b();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mkf) it.next()).a();
        }
    }

    public final void t() {
        krf.b();
        this.e = ieg.a;
        n();
        mke mkeVarB = b();
        this.f = mkeVarB != null ? new gag(Uri.parse(mkeVarB.g)) : null;
        if (mkeVarB != null) {
            hux huxVar = this.k;
            if (huxVar != null) {
                huxVar.c();
            }
            hke hkeVarE = hjr.c(this.a).b().e(mkeVarB.d);
            mjz mjzVar = new mjz(this);
            hkeVarE.l(mjzVar);
            this.k = mjzVar.a;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mkf) it.next()).f();
        }
    }

    public final void u() {
        krd.e("onSeekBy() called");
        mjw mjwVar = this.d;
        if (mjwVar == null) {
            krd.c("No active remote!");
            return;
        }
        mjy mjyVarC = mjwVar.c();
        int iMax = Math.max(0, mjwVar.c().c - 30000);
        mjw mjwVar2 = this.d;
        String str = mjyVarC.a;
        mjwVar2.y(iMax);
    }

    @Override // defpackage.mjx
    public final void x() {
        p();
    }

    @Override // defpackage.mjx
    public final void l(List list) {
    }

    @Override // defpackage.mjx
    public final void d(List list, int i) {
    }
}
