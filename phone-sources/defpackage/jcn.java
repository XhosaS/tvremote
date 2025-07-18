package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcn extends jby {
    public final ovs a;

    public jcn(ovs ovsVar) {
        ovsVar.getClass();
        this.a = ovsVar;
    }

    @Override // defpackage.jby
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.P();
    }

    @Override // defpackage.jby
    public final /* synthetic */ void d(Object obj) {
        jdd jddVar = (jdd) obj;
        ((tug) ((tug) jdd.a.g().h(tvo.a, "[GTVM-Kinetoscope]")).g(4, TimeUnit.HOURS).j("com/google/android/apps/googletv/app/player/TvodPlayerFragment", "setup", 1542, "TvodPlayerFragment.kt")).s("[Kinetoscope] setup TvodPlayerController");
        Context contextRequireContext = jddVar.requireContext();
        ExoPlayer exoPlayer = jddVar.C;
        exoPlayer.getClass();
        String str = ((ksn) ((ldy) jddVar.e()).a().g()).a;
        String strBo = jddVar.k().bo();
        strBo.getClass();
        this.a.V(contextRequireContext, exoPlayer, str, strBo, new owd(new ovy(ovz.b, jddVar.requireContext().getPackageName(), jddVar.I.c.a, jddVar.F)), jddVar.ab, jddVar.as, jddVar.G, jddVar.H);
    }
}
