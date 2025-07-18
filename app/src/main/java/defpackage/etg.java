package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etg implements aejl {
    private final eup a;
    private final eth b;
    private final int c;

    public etg(eup eupVar, eth ethVar, int i) {
        this.a = eupVar;
        this.b = ethVar;
        this.c = i;
    }

    @Override // defpackage.agow
    public final Object a() {
        switch (this.c) {
            case 0:
                eup eupVar = this.a;
                return new pel((pbb) eupVar.pc.a(), (pas) eupVar.pd.a());
            case 1:
                eth ethVar = this.b;
                final wkm wkmVar = new wkm(new wut((wxc) ethVar.b.ii.a()));
                wkg wkgVar = (wkg) this.a.pl.a();
                final bq bqVar = ethVar.a;
                Object objEp = bqVar.ep();
                objEp.getClass();
                if (objEp instanceof Activity) {
                    final agow agowVar = new agow() { // from class: wkj
                        @Override // defpackage.agow
                        public final Object a() {
                            return (wjy) cyg.b(bqVar);
                        }
                    };
                    return new wke(new agow() { // from class: wkl
                        @Override // defpackage.agow
                        public final Object a() {
                            wwt wwtVar;
                            agow agowVar2 = agowVar;
                            if (wum.t()) {
                                wwtVar = new wwt() { // from class: wuq
                                    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                                    public final void close() {
                                    }
                                };
                            } else {
                                wum.q();
                                if (wum.t()) {
                                    wwtVar = new wwt() { // from class: wur
                                        @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                                        public final void close() {
                                            wum.n();
                                        }
                                    };
                                } else {
                                    final wvl wvlVarD = wkmVar.a.a.d("com/google/apps/tiktok/tracing/LayoutTraceCreation", "beginRootTraceOrResume", 77, "GlideApp.with", wwb.a);
                                    wwtVar = new wwt() { // from class: wus
                                        @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                                        public final void close() {
                                            wvlVarD.close();
                                            wum.n();
                                        }
                                    };
                                }
                            }
                            try {
                                wwt wwtVarI = wum.i();
                                try {
                                    czb czbVar = (czb) agowVar2.a();
                                    wwtVarI.close();
                                    wwtVar.close();
                                    return czbVar;
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }, new wkb(bqVar, wkgVar), true);
                }
                final agow agowVar2 = new agow() { // from class: wkk
                    @Override // defpackage.agow
                    public final Object a() {
                        return (wjy) cyg.b(bqVar);
                    }
                };
                return new wke(new agow() { // from class: wkl
                    @Override // defpackage.agow
                    public final Object a() {
                        wwt wwtVar;
                        agow agowVar22 = agowVar2;
                        if (wum.t()) {
                            wwtVar = new wwt() { // from class: wuq
                                @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                }
                            };
                        } else {
                            wum.q();
                            if (wum.t()) {
                                wwtVar = new wwt() { // from class: wur
                                    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                                    public final void close() {
                                        wum.n();
                                    }
                                };
                            } else {
                                final wvl wvlVarD = wkmVar.a.a.d("com/google/apps/tiktok/tracing/LayoutTraceCreation", "beginRootTraceOrResume", 77, "GlideApp.with", wwb.a);
                                wwtVar = new wwt() { // from class: wus
                                    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                                    public final void close() {
                                        wvlVarD.close();
                                        wum.n();
                                    }
                                };
                            }
                        }
                        try {
                            wwt wwtVarI = wum.i();
                            try {
                                czb czbVar = (czb) agowVar22.a();
                                wwtVarI.close();
                                wwtVar.close();
                                return czbVar;
                            } finally {
                            }
                        } finally {
                        }
                    }
                }, new wkd(bqVar), true);
            case 2:
                eup eupVar2 = this.a;
                return new hsj((Context) eupVar2.n.a(), eupVar2.k(), eupVar2.C(), eupVar2.bR());
            case 3:
                eup eupVar3 = this.a;
                return new hoh(eupVar3.k(), eupVar3.C(), eupVar3.bR());
            case 4:
                eup eupVar4 = this.a;
                return new hpu((gtu) eupVar4.bE.a(), (gnj) eupVar4.fo.a());
            case 5:
                return new hmm((Context) this.a.n.a());
            case 6:
                eup eupVar5 = this.a;
                return new hol((gtu) eupVar5.bE.a(), (gnj) eupVar5.fo.a());
            default:
                eth ethVar2 = this.b;
                return new vzb(ethVar2.a, (Executor) this.a.aR.a());
        }
    }
}
