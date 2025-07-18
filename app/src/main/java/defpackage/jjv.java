package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjv extends agtu implements agux {
    int a;
    final /* synthetic */ jkx b;
    final /* synthetic */ xjb c;
    final /* synthetic */ gez d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjv(jkx jkxVar, xjb xjbVar, gez gezVar, agsw agswVar) {
        super(1, agswVar);
        this.b = jkxVar;
        this.c = xjbVar;
        this.d = gezVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jjv(this.b, this.c, this.d, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        jkx jkxVar = this.b;
        final xjb xjbVar = this.c;
        gez gezVar = this.d;
        final grh grhVar = (grh) jkxVar.i;
        zyd zydVarA = grhVar.a(gezVar, new Runnable() { // from class: gre
            @Override // java.lang.Runnable
            public final void run() {
                zdy zdyVar = goe.a;
                ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "turnClosedCaptionOnOrOff", 161, "MediaControlExecutorImpl.kt")).u("Executing caption control");
                goe goeVar = (goe) grhVar.c;
                gtu gtuVar = goeVar.b;
                xjb xjbVar2 = xjbVar;
                if (gtuVar.a() != null) {
                    goa goaVar = goeVar.c;
                    Bundle bundle = new Bundle();
                    int iA = xja.a(xjbVar2.b);
                    if (iA == 0) {
                        iA = 1;
                    }
                    int i2 = iA - 1;
                    if (i2 == 1) {
                        bundle.putBoolean("CAPTIONING_ENABLED", true);
                    } else {
                        if (i2 != 2) {
                            ((zdv) gob.a.d().q("com/google/android/apps/tvsearch/media/control/KidsModeMediaControllerImpl", "turnClosedCaptionOnOrOff", 116, "KidsModeMediaControllerImpl.kt")).u("Unknown caption control setting.");
                            return;
                        }
                        bundle.putBoolean("CAPTIONING_ENABLED", false);
                    }
                    ((gob) goaVar).b("captioning", bundle);
                    return;
                }
                fe feVar = (fe) goeVar.d.get();
                if (feVar == null) {
                    return;
                }
                int iA2 = xja.a(xjbVar2.b);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                int i3 = iA2 - 1;
                if (i3 == 1) {
                    feVar.a(true);
                } else if (i3 != 2) {
                    ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/media/control/MediaControlExecutorImpl", "turnClosedCaptionOnOrOff", 171, "MediaControlExecutorImpl.kt")).u("Unknown caption control setting.");
                } else {
                    feVar.a(false);
                }
            }
        });
        this.a = 1;
        Object objB = ahkr.b(zydVarA, this);
        return objB == agtgVar ? agtgVar : objB;
    }
}
