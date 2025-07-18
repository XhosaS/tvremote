package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbh implements day {
    public final dkq a;

    public dbh(InputStream inputStream, ddx ddxVar) {
        dkq dkqVar = new dkq(inputStream, ddxVar);
        this.a = dkqVar;
        dkqVar.mark(5242880);
    }

    @Override // defpackage.day
    public final /* synthetic */ Object a() {
        dkq dkqVar = this.a;
        dkqVar.reset();
        return dkqVar;
    }

    @Override // defpackage.day
    public final void b() {
        this.a.b();
    }
}
