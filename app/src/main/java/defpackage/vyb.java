package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyb {
    public final vyl a;

    public vyb(vyl vylVar) {
        this.a = vylVar;
    }

    public static boolean c(vxn vxnVar, vyr vyrVar, Instant instant) {
        return vxnVar.b.b && vxnVar.d() && vxnVar.b().isAfter(instant.minus(vyrVar.k));
    }

    public final zwc a(vxo vxoVar, String str) {
        wvx wvxVarF = wzg.f(str, wwb.a, true);
        try {
            zwc zwcVarA = vxoVar.a();
            wvxVarF.a(zwcVarA.g());
            wvxVarF.close();
            return zwcVarA;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final zyd b(final vxo vxoVar, final vyr vyrVar) {
        wvx wvxVarF = wzg.f("getDataAsFuture", wwb.a, true);
        try {
            final Instant instantNow = Instant.now();
            zwc zwcVarA = a(vxoVar, "First load");
            zvv zvvVarD = wyo.d(new zvv() { // from class: vxv
                @Override // defpackage.zvv
                public final zwc a(zvz zvzVar, Object obj) {
                    vxn vxnVar = (vxn) obj;
                    final vyr vyrVar2 = vyrVar;
                    final Instant instant = instantNow;
                    boolean zC = vyb.c(vxnVar, vyrVar2, instant);
                    final vxo vxoVar2 = vxoVar;
                    if (zC) {
                        return new zwc(zxn.h(vxnVar.c()));
                    }
                    wvx wvxVarF2 = wzg.f("getDataAsFuture fetch", wwb.a, true);
                    try {
                        zyd zydVarB = vxoVar2.b();
                        wvxVarF2.a(zydVarB);
                        final vyb vybVar = this.a;
                        wvxVarF2.close();
                        vybVar.a.a(zydVarB, vxoVar2.c());
                        zwc zwcVar = new zwc(zydVarB);
                        zvv zvvVarD2 = wyo.d(new zvv() { // from class: vxt
                            @Override // defpackage.zvv
                            public final zwc a(zvz zvzVar2, Object obj2) {
                                return vybVar.a(vxoVar2, "Second load");
                            }
                        });
                        zwk zwkVar = zwk.a;
                        return zwcVar.e(zvvVarD2, zwkVar).d(wyo.e(new zvy() { // from class: vxu
                            @Override // defpackage.zvy
                            public final Object a(zvz zvzVar2, Object obj2) {
                                vxn vxnVar2 = (vxn) obj2;
                                if (vyb.c(vxnVar2, vyrVar2, instant)) {
                                    return vxnVar2.c();
                                }
                                throw new IllegalStateException("fetchAndStore() did not produce a cache hit");
                            }
                        }), zwkVar);
                    } catch (Throwable th) {
                        try {
                            wvxVarF2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            zwk zwkVar = zwk.a;
            zwc zwcVarE = zwcVarA.e(zvvVarD, zwkVar);
            wvxVarF.a(zwcVarE.g());
            zwx zwxVarF = zwcVarE.d(new zvy() { // from class: vxw
                @Override // defpackage.zvy
                public final Object a(zvz zvzVar, Object obj) {
                    return wyo.a(yqk.a).apply(obj);
                }
            }, zwkVar).f();
            wvxVarF.close();
            return zwxVarF;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
