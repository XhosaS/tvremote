package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uod implements uig {
    public final jyw a;
    public final String b;
    public final yrp c;
    public final yrp d;
    public final yqt e;
    public final uns f;
    public final AtomicReference g;
    private final Random h;

    public uod(uoc uocVar) {
        this.a = uocVar.a;
        new zyt(uocVar.b);
        this.b = uocVar.c;
        this.c = uocVar.d;
        this.d = uocVar.e;
        this.e = uocVar.h;
        Random random = new Random();
        this.h = random;
        final yrp yrpVar = uocVar.e;
        yrpVar.getClass();
        agum agumVar = new agum() { // from class: unt
            @Override // defpackage.agum
            public final Object a() {
                return (Integer) yrpVar.eV();
            }
        };
        final yrp yrpVar2 = uocVar.f;
        yrpVar2.getClass();
        agum agumVar2 = new agum() { // from class: unt
            @Override // defpackage.agum
            public final Object a() {
                return (Integer) yrpVar2.eV();
            }
        };
        final yrp yrpVar3 = uocVar.d;
        yrpVar3.getClass();
        agum agumVar3 = new agum() { // from class: unt
            @Override // defpackage.agum
            public final Object a() {
                return (Integer) yrpVar3.eV();
            }
        };
        final yrp yrpVar4 = uocVar.g;
        yrpVar4.getClass();
        this.f = new uns(agumVar, agumVar2, agumVar3, new agum() { // from class: unu
            @Override // defpackage.agum
            public final Object a() {
                return (Boolean) yrpVar4.eV();
            }
        }, random);
        this.g = new AtomicReference(ypv.a);
    }

    public static Object d(yrp yrpVar, Object obj) {
        Object objEV = yrpVar.eV();
        return objEV != null ? objEV : obj;
    }

    @Override // defpackage.uig
    public final void c(final int i, final String str, final int i2, final zyd zydVar, final yrn yrnVar) {
        yqt yqtVar = (yqt) this.g.get();
        if (!yqtVar.g() || ((Boolean) yqtVar.c()).booleanValue()) {
            zvi zviVar = new zvi() { // from class: unv
                /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, uon] */
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    yrnVar.f();
                    yqt yqtVar2 = this.a.e;
                    return yqtVar2.g() ? yqtVar2.c().a() : zxn.h("1");
                }
            };
            zwk zwkVar = zwk.a;
            final zyd zydVarH = zuz.h(zydVar, zviVar, zwkVar);
            zydVarH.d(wyo.h(new Runnable() { // from class: unw
                /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 610
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.unw.run():void");
                }
            }), zwkVar);
        }
    }

    @Override // defpackage.uig
    public final void a() {
    }

    @Override // defpackage.uig
    public final void b() {
    }
}
