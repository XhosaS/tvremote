package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkf implements nzy {
    public final mjz a;

    public mkf(mjz mjzVar) {
        this.a = mjzVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return adad.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final adad adadVar = (adad) obj;
        return agff.g(new aggv() { // from class: mke
            @Override // defpackage.aggv
            public final void a() {
                final nzx nzxVar2 = nzxVar;
                final mjz mjzVar = this.a.a;
                String str = adadVar.c;
                synchronized (mjzVar.e) {
                    final mjy mjyVar = (mjy) mjzVar.a.get(str);
                    if (mjyVar == null) {
                        throw new ocp("Cannot start a loop that has not been registered yet");
                    }
                    aggi aggiVar = mjyVar.b;
                    if (aggiVar == null || aggiVar.f()) {
                        long j = (long) (mjyVar.a.e * 1000.0f);
                        mjyVar.b = agfo.i(j, j, TimeUnit.MILLISECONDS, mjzVar.c).l(new aggy() { // from class: mjw
                            @Override // defpackage.aggy
                            public final void a(Object obj2) {
                                mjz mjzVar2 = mjzVar;
                                oaa oaaVar = (oaa) mjzVar2.b.a();
                                CommandOuterClass$Command defaultInstance = mjyVar.a.f;
                                if (defaultInstance == null) {
                                    defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                                }
                                oaaVar.a(defaultInstance, nzxVar2).j(mjzVar2.d).k();
                            }
                        });
                    }
                }
            }
        });
    }
}
