package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mez implements rog {
    public final zyh a;
    public final zyh b;
    private final boolean c;

    public mez(zyh zyhVar, zyh zyhVar2, Optional optional) {
        boolean zBooleanValue = ((Boolean) optional.orElse(false)).booleanValue();
        this.c = zBooleanValue;
        this.a = zBooleanValue ? met.a(zyhVar) : zyhVar;
        this.b = zBooleanValue ? met.a(zyhVar2) : zyhVar2;
    }

    @Override // defpackage.rog
    public final void a() {
        aggz aggzVar = new aggz() { // from class: meu
            @Override // defpackage.aggz
            public final Object a(Object obj) {
                agfx agfxVar = agoq.a;
                return new agmq(this.a.a);
            }
        };
        boolean z = agoh.o;
        agoh.c = aggzVar;
        aggz aggzVar2 = new aggz() { // from class: mev
            @Override // defpackage.aggz
            public final Object a(Object obj) {
                agfx agfxVar = agoq.a;
                return new agmq(this.a.b);
            }
        };
        boolean z2 = agoh.o;
        agoh.e = aggzVar2;
        aggz aggzVar3 = new aggz() { // from class: mew
            @Override // defpackage.aggz
            public final Object a(Object obj) {
                zyh zyhVarA = mee.a(this.a.a);
                agfx agfxVar = agoq.a;
                return new agmq(zyhVarA);
            }
        };
        boolean z3 = agoh.o;
        agoh.d = aggzVar3;
        aggz aggzVar4 = new aggz() { // from class: mex
            @Override // defpackage.aggz
            public final Object a(Object obj) {
                agfx agfxVar = agoq.a;
                return new agmq(this.a.b);
            }
        };
        boolean z4 = agoh.o;
        agoh.f = aggzVar4;
        if (this.c) {
            return;
        }
        aggz aggzVar5 = new aggz() { // from class: mey
            @Override // defpackage.aggz
            public final Object a(Object obj) {
                return wyo.h((Runnable) obj);
            }
        };
        boolean z5 = agoh.o;
        agoh.b = aggzVar5;
    }
}
