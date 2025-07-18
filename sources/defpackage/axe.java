package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axe implements asm {
    final /* synthetic */ cjd a;
    public final /* synthetic */ axg b;

    public axe(axg axgVar, cjd cjdVar) {
        this.a = cjdVar;
        this.b = axgVar;
    }

    @Override // defpackage.asm
    public final void i(aqe aqeVar) {
        axg axgVar = this.b;
        axgVar.d.a(3, aqeVar.a);
        axgVar.a();
        axgVar.f = this.a.b(new ame(this, aqeVar, 4, null), 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.asm
    public final void j(aqe aqeVar) {
        axg axgVar = this.b;
        axgVar.d.a(4, aqeVar.a);
        axgVar.a();
        axgVar.e = this.a.b(new ame(this, aqeVar, 5, null), 10L, TimeUnit.SECONDS);
    }
}
