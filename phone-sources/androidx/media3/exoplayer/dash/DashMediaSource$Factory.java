package androidx.media3.exoplayer.dash;

import android.net.Uri;
import defpackage.a;
import defpackage.cme;
import defpackage.dzl;
import defpackage.dzt;
import defpackage.dzy;
import defpackage.eci;
import defpackage.eer;
import defpackage.emu;
import defpackage.enf;
import defpackage.eni;
import defpackage.enr;
import defpackage.ent;
import defpackage.eov;
import defpackage.epe;
import defpackage.eun;
import defpackage.evy;
import defpackage.ewb;
import defpackage.ezz;
import defpackage.fjg;
import defpackage.sew;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements evy {
    public sew a;
    private final emu b;
    private final eer c;
    private epe d;
    private long e;
    private long f;
    private cme g;

    public DashMediaSource$Factory(eer eerVar) {
        this(new eni(eerVar), eerVar);
    }

    public final enf a(enr enrVar) {
        dzl dzlVar = new dzl();
        dzlVar.a = Uri.EMPTY;
        dzlVar.b("DashMediaSource");
        dzlVar.c();
        dzy dzyVarA = dzlVar.a();
        a.H(!enrVar.d);
        dzl dzlVar2 = new dzl(dzyVarA);
        dzlVar2.c();
        if (dzyVarA.c == null) {
            dzlVar2.a = Uri.EMPTY;
        }
        dzy dzyVarA2 = dzlVar2.a();
        return new enf(dzyVarA2, enrVar, null, null, this.b, this.d.a(dzyVarA2), this.a, this.e, this.f);
    }

    @Override // defpackage.evy
    public final /* bridge */ /* synthetic */ ewb b(dzy dzyVar) {
        dzt dztVar = dzyVar.c;
        dztVar.getClass();
        ezz entVar = new ent();
        List list = dztVar.m;
        return new enf(dzyVar, null, this.c, !list.isEmpty() ? new eun(entVar, list) : entVar, this.b, this.d.a(dzyVar), this.a, this.e, this.f);
    }

    @Override // defpackage.evy
    @Deprecated
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(boolean z) {
        this.b.b(z);
    }

    public final void f(epe epeVar) {
        eci.d(epeVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = epeVar;
    }

    @Override // defpackage.evy
    public final /* bridge */ /* synthetic */ void g(fjg fjgVar) {
        fjgVar.getClass();
        this.b.c(fjgVar);
    }

    public DashMediaSource$Factory(emu emuVar, eer eerVar) {
        this.b = emuVar;
        this.c = eerVar;
        this.d = new eov();
        this.a = new sew();
        this.e = 30000L;
        this.f = 5000000L;
        this.g = new cme();
        d(true);
    }

    @Override // defpackage.evy
    public final /* bridge */ /* synthetic */ void e() {
    }
}
