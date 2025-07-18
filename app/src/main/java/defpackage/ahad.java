package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahad extends ahdq {
    public ahcn a;
    public final agzy b = new agzy(null, agzz.a);
    final /* synthetic */ ahaf c;
    private final ahap h;

    public ahad(ahaf ahafVar, ahap ahapVar) {
        this.c = ahafVar;
        this.h = ahapVar;
    }

    @Override // defpackage.ahdq
    public final void b(Throwable th) {
        if (th != null) {
            ahar aharVar = (ahar) this.h;
            if (aharVar.G(new ahbc(th, false), null) != null) {
                boolean z = ahbx.a;
                aharVar.y(aharVar.e);
                ahae ahaeVar = (ahae) this.b.a;
                if (ahaeVar != null) {
                    ahaeVar.a();
                    return;
                }
                return;
            }
            return;
        }
        ahaf ahafVar = this.c;
        if (agzw.a.decrementAndGet(ahafVar.b) == 0) {
            ahap ahapVar = this.h;
            ahcb[] ahcbVarArr = ahafVar.a;
            ArrayList arrayList = new ArrayList(ahcbVarArr.length);
            for (ahcb ahcbVar : ahcbVarArr) {
                arrayList.add(ahcbVar.d());
            }
            ahapVar.e(arrayList);
        }
    }

    @Override // defpackage.ahdq
    public final boolean c() {
        return false;
    }
}
