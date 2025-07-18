package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfv extends sbx {
    public final jaf a;
    public final itk b;
    public final xne c;
    public final irc d;
    private final Context e;
    private final ihg f;
    private final cvw g;

    public jfv(cvw cvwVar, irc ircVar, jaf jafVar, Context context, itk itkVar, xne xneVar, ihg ihgVar) {
        ircVar.getClass();
        jafVar.getClass();
        itkVar.getClass();
        this.g = cvwVar;
        this.d = ircVar;
        this.a = jafVar;
        this.e = context;
        this.b = itkVar;
        this.c = xneVar;
        this.f = ihgVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jfy jfyVar = new jfy(this.g.a);
        jfyVar.a = new jeu(this, (jnz) obj, 3);
        jfyVar.b = new jfu(this, 0);
        return jfyVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jnz jnzVar = (jnz) obj;
        jfy jfyVar = (jfy) obj2;
        jfyVar.F(((ixi) jnzVar).a, new String[0]);
        wrx wrxVar = (wrx) jnzVar.b;
        wls wlsVar = wrxVar.c;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(jfyVar.f, wlsVar)) {
            jfyVar.f = wlsVar;
            jfyVar.G(4);
        }
        wls wlsVar2 = wrxVar.d;
        if (wlsVar2 == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(jfyVar.g, wlsVar2)) {
            jfyVar.g = wlsVar2;
            jfyVar.G(5);
        }
        String str = wrxVar.f;
        if (!yks.e(jfyVar.m, str)) {
            jfyVar.m = str;
            jfyVar.G(12);
        }
        ihg ihgVar = this.f;
        if (ihgVar.b()) {
            Integer numValueOf = Integer.valueOf(wrxVar.i);
            if (!yks.e(jfyVar.d, numValueOf)) {
                jfyVar.d = numValueOf;
                jfyVar.G(1);
            }
        } else {
            Integer numValueOf2 = Integer.valueOf(wrxVar.i);
            if (!yks.e(jfyVar.c, numValueOf2)) {
                jfyVar.c = numValueOf2;
                jfyVar.G(0);
            }
        }
        wlx wlxVar = wrxVar.b;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        wlxVar.getClass();
        byte[] bArr = null;
        if (ihz.U(wlxVar)) {
            wls wlsVar3 = wrxVar.c;
            if (wlsVar3 == null) {
                wlsVar3 = wls.a;
            }
            jfyVar.s(wlsVar3);
            jfyVar.r(null);
        } else {
            jfyVar.s(null);
            wlx wlxVar2 = wrxVar.b;
            if (wlxVar2 == null) {
                wlxVar2 = wlx.a;
            }
            jfyVar.r(wlxVar2);
        }
        jfyVar.i = new scc("R.id.image", jfyVar, new iut((sbx) this, (Object) jnzVar, 7));
        jfyVar.G(8);
        jfyVar.j = new scc("R.id.info_section", jfyVar, new iut((sbx) this, (Object) jnzVar, 8));
        jfyVar.G(9);
        iky ikyVar = new iky(this, jnzVar, 16, bArr);
        jfyVar.h = new scd("R.id.continue_watching_card_component", jfyVar, new jft(ikyVar, 1));
        jfyVar.G(7);
        jfyVar.k = new scd("R.id.image", jfyVar, new jft(ikyVar, 0));
        jfyVar.G(10);
        jfyVar.l = new scd("R.id.info_section", jfyVar, new jft(ikyVar, 2));
        jfyVar.G(11);
        Context context = this.e;
        wls wlsVar4 = wrxVar.c;
        if (wlsVar4 == null) {
            wlsVar4 = wls.a;
        }
        String string = context.getString(R.string.play_icon_content_description, wlsVar4.b);
        if (!yks.e(jfyVar.n, string)) {
            jfyVar.n = string;
            jfyVar.G(13);
        }
        kkb kkbVar = new kkb(this.b, !yks.e(wrxVar.j, "play-movies"), ihgVar.e(), 24);
        if (yks.e(jfyVar.e, kkbVar)) {
            return;
        }
        jfyVar.e = kkbVar;
        jfyVar.G(2);
    }
}
