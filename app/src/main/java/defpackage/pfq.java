package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfq {
    public final pcn a;
    public final pcw b;
    public final pas c;
    private final pbb d;

    public pfq(pcn pcnVar, pcw pcwVar, pbb pbbVar, pas pasVar) {
        this.a = pcnVar;
        this.b = pcwVar;
        this.d = pbbVar;
        this.c = pasVar;
    }

    public static void c(pcm pcmVar) {
        yqw.A(pcmVar.d());
    }

    public final pcm a(pbv pbvVar) {
        yqw.F(pbvVar.b == this.a, "%s was created from a different context to this SyntheticHost.", pbvVar);
        pcm pcmVar = pbvVar.c;
        yqw.A(pcmVar instanceof pft);
        return pcmVar;
    }

    public final void b() {
        if (this.b.c()) {
            wvx wvxVarF = wzg.f("GIL:FlushHostBatch", wwb.a, true);
            try {
                this.d.c(new pba() { // from class: pfp
                    @Override // defpackage.pba
                    public final List a() {
                        pcw pcwVar = this.a.b;
                        pcwVar.b();
                        return pcwVar.a();
                    }
                });
                wvxVarF.close();
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
}
