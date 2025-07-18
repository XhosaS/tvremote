package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxa extends dwt {
    public final yft a;
    public final yft b;
    public isy c;
    public irc d;
    private final yft e;
    private final yft f;
    private final yft g;
    private final yft h;
    private final yft i;
    private final yft j;
    private final yft k;

    public jxa(dwi dwiVar) {
        dwiVar.getClass();
        this.e = new yga(new jwz(dwiVar, 0));
        this.f = new yga(new jwz(this, 2));
        this.a = new yga(new jwz(this, 3));
        this.g = new yga(new jwz(this, 4));
        this.h = new yga(new jwz(this, 5));
        this.i = new yga(new jwz(this, 6));
        this.j = new yga(new gel(13));
        this.k = new yga(new gel(14));
        this.b = new yga(new jwz(dwiVar, 7));
    }

    public final bcb a() {
        return (bcb) this.k.a();
    }

    public final bcb b() {
        return (bcb) this.j.a();
    }

    public final bcb c() {
        return (bcb) this.i.a();
    }

    public final wql e() {
        return (wql) this.e.a();
    }

    public final wqp f() {
        return (wqp) this.g.a();
    }

    public final wvg g() {
        return (wvg) this.h.a();
    }

    public final List h() {
        return (List) this.f.a();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, yow] */
    public final void i(Context context) {
        context.getClass();
        wkk wkkVar = g().f;
        if (wkkVar == null) {
            wkkVar = wkk.a;
        }
        byte[] bArr = null;
        if (wkkVar.b == 2) {
            bcb bcbVarB = b();
            wkk wkkVar2 = g().f;
            if (wkkVar2 == null) {
                wkkVar2 = wkk.a;
            }
            String str = (wkkVar2.b == 2 ? (wki) wkkVar2.c : wki.a).b;
            str.getClass();
            bcbVarB.b(str);
            a().b(null);
            return;
        }
        a().b(context.getString(R.string.undo_dismissal));
        isy isyVarJ = j();
        wvg wvgVarG = g();
        boolean zBooleanValue = ((Boolean) c().a()).booleanValue();
        iky ikyVar = new iky(this, context, 20, bArr);
        wvgVarG.getClass();
        iog iogVarB = isyVarJ.b(wvgVarG);
        if ((wvgVarG.b & 1) != 0) {
            if (zBooleanValue) {
                ykr.q(isyVarJ.a, null, 0, new imw(isyVarJ, iogVarB, (yih) null, 17), 3);
                ikyVar.a(false);
            } else {
                ykr.q(isyVarJ.a, null, 0, new imw(isyVarJ, iogVarB, (yih) null, 18, (byte[]) null), 3);
                ikyVar.a(true);
            }
        }
        c().b(Boolean.valueOf(true ^ ((Boolean) c().a()).booleanValue()));
    }

    public final isy j() {
        isy isyVar = this.c;
        if (isyVar != null) {
            return isyVar;
        }
        yks.c("watchlistDataSource");
        return null;
    }

    public final irc k() {
        irc ircVar = this.d;
        if (ircVar != null) {
            return ircVar;
        }
        yks.c("actionManager");
        return null;
    }
}
