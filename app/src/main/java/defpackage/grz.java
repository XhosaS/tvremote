package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grz implements gru {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/performers/PlayMediaPerformerImpl");
    private static final Set d = agqj.p(new xmj[]{xmj.TRACK, xmj.ALBUM, xmj.ARTIST, xmj.PLAYLIST, xmj.MUSIC_GENRE, xmj.MUSIC_MIX, xmj.AUDIO_BOOK, xmj.RADIO_STATION});
    public final exl b;
    public final fgx c;
    private final ahbt e;
    private final agow f;
    private final gtu g;
    private final agow h;
    private final gfr i;
    private final gmd j;
    private final ghr k;
    private final jca l;
    private final irq m;

    public grz(ahbt ahbtVar, agow agowVar, exl exlVar, gtu gtuVar, agow agowVar2, gfr gfrVar, gmd gmdVar, irq irqVar, fgx fgxVar, ghr ghrVar, jca jcaVar) {
        ahbtVar.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        fgxVar.getClass();
        ghrVar.getClass();
        jcaVar.getClass();
        this.e = ahbtVar;
        this.f = agowVar;
        this.b = exlVar;
        this.g = gtuVar;
        this.h = agowVar2;
        this.i = gfrVar;
        this.j = gmdVar;
        this.m = irqVar;
        this.c = fgxVar;
        this.k = ghrVar;
        this.l = jcaVar;
    }

    private final void b() {
        this.l.b(new jby() { // from class: grx
            @Override // defpackage.jby
            public final void a(jdq jdqVar) {
                zdy zdyVar = grz.a;
                if (jdqVar != null) {
                    try {
                        jdqVar.f(true);
                    } catch (Exception e) {
                        ((zdv) ((zdv) grz.a.d()).p(e).q("com/google/android/apps/tvsearch/performers/PlayMediaPerformerImpl", "setIsAssistantTriggeredMusicPlaying$lambda$0", 153, "PlayMediaPerformerImpl.kt")).u("Error calling #setIsAssistantTriggeredMusicPlaying");
                    }
                }
            }
        });
    }

    private final void c(gez gezVar, abqb abqbVar, int i, int i2) {
        if (!((Boolean) this.f.a()).booleanValue() || gezVar == null) {
            return;
        }
        agow agowVar = this.h;
        gey geyVar = gez.a;
        geyVar.a(((gfn) agowVar.a()).a(rpm.bS()), gezVar).d(abqbVar);
        rqw rqwVarC = gfb.c(gezVar, new agow() { // from class: gfa
            @Override // defpackage.agow
            public final Object a() {
                int i3 = gfb.a;
                return false;
            }
        });
        if (rqwVarC != null) {
            geyVar.d(((gfn) agowVar.a()).c(rqwVarC), gezVar, i, i2).c(abqbVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
    @Override // defpackage.gru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd a(defpackage.xha r19, defpackage.gez r20) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grz.a(xha, gez):zyd");
    }
}
