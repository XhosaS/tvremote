package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmi extends afga {
    final wyt a;
    final String b;

    public wmi(afeq afeqVar, String str, wyt wytVar) {
        super(afeqVar);
        this.b = str;
        this.a = wytVar;
    }

    @Override // defpackage.afgb, defpackage.afeq
    public final void a(final afep afepVar, final afih afihVar) {
        wyt.d(this.a, new Runnable() { // from class: wmh
            @Override // java.lang.Runnable
            public final void run() {
                wmi wmiVar = this.a;
                wvx wvxVarF = wzg.f(wmiVar.b, wwb.a, true);
                afep afepVar2 = afepVar;
                afih afihVar2 = afihVar;
                try {
                    zyu zyuVar = new zyu();
                    wvxVarF.a(zyuVar);
                    wmiVar.c.a(new wmj(afepVar2, zyuVar), afihVar2);
                    wvxVarF.close();
                } catch (Throwable th) {
                    try {
                        wvxVarF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }).run();
    }
}
