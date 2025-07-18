package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkb implements nzy {
    public final mjz a;

    public mkb(mjz mjzVar) {
        this.a = mjzVar;
    }

    @Override // defpackage.nzz
    public final abwk a() {
        return aczz.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, final nzx nzxVar) {
        final aczz aczzVar = (aczz) obj;
        return agff.g(new aggv() { // from class: mka
            @Override // defpackage.aggv
            public final void a() {
                aczz aczzVar2 = aczzVar;
                if (aczzVar2 != null) {
                    int i = aczzVar2.c;
                    if ((i & 1) != 0 && (i & 4) != 0) {
                        if (aczzVar2.e < 0.1d) {
                            throw new ocp("LoopCommand delay is too small");
                        }
                        View viewN = nzxVar.n();
                        if (viewN == null) {
                            throw new ocp("No view is available, loop has not been registered");
                        }
                        mjz mjzVar = this.a.a;
                        synchronized (mjzVar.e) {
                            mjzVar.a(aczzVar2.d);
                            mjzVar.a.put(aczzVar2.d, new mjy(aczzVar2));
                        }
                        viewN.addOnAttachStateChangeListener(new mjx(mjzVar, aczzVar2));
                        return;
                    }
                }
                throw new ocp("Invalid LoopCommand");
            }
        });
    }
}
