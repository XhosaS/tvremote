package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqv implements sqn {
    private static final zdy k = zdy.h("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/RefAudioSourceDataAccessor");
    public final sjp a;
    public final slb b;
    public final slb c;
    public final sqn d;
    public final boolean e;
    public final zyd f;
    public final ruo g;
    public final sds h;
    public final skz i;
    public final ahaz j;
    private final sqn l;
    private final ahbt m;
    private final agpc n;

    public sqv(sqn sqnVar, skz skzVar, ahbt ahbtVar) {
        this.l = sqnVar;
        this.i = skzVar;
        this.m = ahbtVar;
        this.a = new sjp(ahbtVar);
        ahaz ahazVar = new ahaz();
        this.j = ahazVar;
        slb slbVar = slb.a;
        sla slaVar = new sla();
        String str = String.format("%016X", Arrays.copyOf(new Object[]{Long.valueOf(skzVar.a.a.incrementAndGet())}, 1));
        str.getClass();
        if ((slaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            slaVar.y();
        }
        String strConcat = "ref-source@".concat(str);
        slb slbVar2 = (slb) slaVar.b;
        slbVar2.b = 1 | slbVar2.b;
        slbVar2.c = strConcat;
        abxd abxdVarV = slaVar.v();
        abxdVarV.getClass();
        slb slbVar3 = (slb) abxdVarV;
        this.b = slbVar3;
        agpn agpnVar = new agpn(new agum() { // from class: sqp
            @Override // defpackage.agum
            public final Object a() {
                return ypv.a;
            }
        });
        this.n = agpnVar;
        slb slbVarD = sqnVar.d();
        this.c = slbVarD != null ? slbVarD : slbVar3;
        sqn sqnVarF = sqnVar.f();
        this.d = sqnVarF;
        this.e = agvy.c(sqnVar, sqnVarF);
        this.f = ahkr.a(ahazVar);
        this.g = sqnVar.b();
        this.h = sqnVar.c();
        ahal.e(ahbtVar, null, 0, new sqr(this, null), 3);
    }

    @Override // defpackage.sqc
    public final int a() {
        return this.l.a();
    }

    @Override // defpackage.sqc
    public final ruo b() {
        return this.g;
    }

    @Override // defpackage.sqc
    public final sds c() {
        return this.h;
    }

    @Override // defpackage.sqn
    public final slb d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sqt
            if (r0 == 0) goto L13
            r0 = r6
            sqt r0 = (defpackage.sqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sqt r0 = new sqt
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ahaz r0 = r0.d
            defpackage.agpl.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.agpl.b(r6)
            ahaz r6 = r5.j
            sqn r2 = r5.d
            zyd r2 = r2.h()
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = defpackage.ahkr.b(r2, r0)
            if (r0 == r1) goto L7e
            r4 = r0
            r0 = r6
            r6 = r4
        L49:
            boolean r6 = r0.N(r6)
            if (r6 == 0) goto L7b
            zdy r6 = defpackage.sqv.k
            zeo r6 = r6.b()
            zer r0 = defpackage.zfi.a
            java.lang.String r1 = "ALT.RefSrcDataAccessor"
            zeo r6 = r6.o(r0, r1)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r1 = "RefAudioSourceDataAccessor.kt"
            java.lang.String r2 = "com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/RefAudioSourceDataAccessor"
            java.lang.String r3 = "completeStoppingAfterOrigin"
            zeo r6 = r6.q(r2, r3, r0, r1)
            zdv r6 = (defpackage.zdv) r6
            slb r0 = r5.b
            java.lang.String r1 = "#audio# source(%s) origin stopped"
            java.lang.String r2 = r0.c
            r6.x(r1, r2)
            skz r6 = r5.i
            slb r1 = r5.c
            r6.b(r1, r0)
        L7b:
            agpu r6 = defpackage.agpu.a
            return r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqv.e(agsw):java.lang.Object");
    }

    @Override // defpackage.sqn
    public final sqn f() {
        return this.d;
    }

    @Override // defpackage.sqc
    public final zyd g(rxn rxnVar) {
        return this.a.a(new sqs(this, rxnVar, null));
    }

    @Override // defpackage.sqc
    public final zyd h() {
        return this.f;
    }

    @Override // defpackage.sqc
    public final zyd n(sqb sqbVar) {
        return this.a.a(new squ(this, sqbVar, null));
    }

    @Override // defpackage.sqc
    public final zyd p(sqb sqbVar) {
        return this.l.p(sqbVar);
    }
}
