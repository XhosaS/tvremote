package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqa extends eqp {
    public final laz a;

    public eqa(laz lazVar) {
        super("internal.logger");
        this.a = lazVar;
        this.e.put("log", new epz(this, false, true));
        this.e.put("silent", new epx());
        ((eqp) this.e.get("silent")).q("log", new epz(this, true, true));
        this.e.put("unmonitored", new epy());
        ((eqp) this.e.get("unmonitored")).q("log", new epz(this, false, false));
    }

    @Override // defpackage.eqp
    public final eqw a(epp eppVar, List list) {
        return eqw.f;
    }
}
