package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aget extends ages {
    final /* synthetic */ ageu a;

    protected aget(ageu ageuVar) {
        this.a = ageuVar;
    }

    @Override // defpackage.ages, defpackage.afhe
    public void e(affe affeVar, afhk afhkVar) {
        ageu ageuVar = this.a;
        if (ageuVar.c == affe.SHUTDOWN) {
            return;
        }
        ageuVar.c = affeVar;
        ageuVar.d = afhkVar;
        agew agewVar = ageuVar.e;
        if (agewVar.i) {
            return;
        }
        agewVar.f();
    }

    @Override // defpackage.ages
    protected final afhe f() {
        return this.a.e.h;
    }
}
