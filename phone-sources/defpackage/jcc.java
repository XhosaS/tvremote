package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcc extends jby {
    public final ovq a;

    public jcc(ovq ovqVar) {
        ovqVar.getClass();
        this.a = ovqVar;
    }

    @Override // defpackage.jby
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.d();
    }

    @Override // defpackage.jby
    public final /* synthetic */ void d(Object obj) {
        jcm jcmVar = (jcm) obj;
        Context contextRequireContext = jcmVar.requireContext();
        ExoPlayer exoPlayer = jcmVar.m;
        exoPlayer.getClass();
        iea ieaVar = jcmVar.c;
        lfn lfnVar = null;
        if (ieaVar == null) {
            yks.c("accountRepository");
            ieaVar = null;
        }
        String str = ((ksn) ((ldy) ieaVar).a().g()).a;
        lfn lfnVar2 = jcmVar.b;
        if (lfnVar2 == null) {
            yks.c("config");
        } else {
            lfnVar = lfnVar2;
        }
        ovq ovqVar = this.a;
        String strBo = lfnVar.bo();
        strBo.getClass();
        ovqVar.f(contextRequireContext, exoPlayer, str, strBo, new owc(new ovy(ovz.b, jcmVar.requireContext().getPackageName(), jcmVar.l.c.a, 16)), jcmVar.s);
    }
}
