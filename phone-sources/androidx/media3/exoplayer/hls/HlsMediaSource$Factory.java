package androidx.media3.exoplayer.hls;

import defpackage.cme;
import defpackage.dxc;
import defpackage.dzt;
import defpackage.dzy;
import defpackage.eer;
import defpackage.eov;
import defpackage.epd;
import defpackage.epe;
import defpackage.eqf;
import defpackage.eql;
import defpackage.eqp;
import defpackage.eqy;
import defpackage.erb;
import defpackage.erc;
import defpackage.erq;
import defpackage.evy;
import defpackage.ewb;
import defpackage.fjg;
import defpackage.sew;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements evy {
    private eql a;
    private fjg b;
    private final dxc f;
    private final epe e = new eov();
    private final erq d = new eqy();
    private final sew h = new sew();
    private final cme g = new cme();
    private boolean c = true;

    public HlsMediaSource$Factory(eer eerVar) {
        this.f = new dxc(eerVar, (byte[]) null);
    }

    @Override // defpackage.evy
    public final /* bridge */ /* synthetic */ ewb b(dzy dzyVar) {
        dzt dztVar = dzyVar.c;
        dztVar.getClass();
        if (this.a == null) {
            this.a = new eqf();
        }
        fjg fjgVar = this.b;
        if (fjgVar != null) {
            ((eqf) this.a).b = fjgVar;
        }
        eql eqlVar = this.a;
        ((eqf) eqlVar).c = this.c;
        erq ercVar = this.d;
        List list = dztVar.m;
        if (!list.isEmpty()) {
            ercVar = new erc(list);
        }
        dxc dxcVar = this.f;
        epd epdVarA = this.e.a(dzyVar);
        sew sewVar = this.h;
        return new eqp(dzyVar, dxcVar, eqlVar, epdVarA, sewVar, new erb(dxcVar, sewVar, ercVar));
    }

    @Override // defpackage.evy
    @Deprecated
    public final /* synthetic */ void d(boolean z) {
        this.c = z;
    }

    @Override // defpackage.evy
    public final /* synthetic */ void g(fjg fjgVar) {
        this.b = fjgVar;
    }

    @Override // defpackage.evy
    public final /* synthetic */ void e() {
    }
}
