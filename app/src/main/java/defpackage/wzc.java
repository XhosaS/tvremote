package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzc implements ahek {
    public static final wzb a = new wzb();
    public final boolean b;
    public final wwn c;
    private final wza d;

    public wzc(wwn wwnVar, boolean z, boolean z2) {
        this.c = wwnVar;
        this.b = z2;
        this.d = new wza(z);
    }

    @Override // defpackage.ahek
    public final /* bridge */ /* synthetic */ Object a(agte agteVar) {
        agteVar.getClass();
        wwl wwlVarC = wum.c();
        wza wzaVar = wwlVarC.e;
        wwq wwqVar = wwlVarC.c;
        wza wzaVar2 = this.d;
        wwlVarC.e = wzaVar2;
        wum.v(wwlVarC, wzaVar2.a, 1);
        return new wyz(wwqVar, wzaVar);
    }

    @Override // defpackage.ahek
    public final /* bridge */ /* synthetic */ void b(agte agteVar, Object obj) {
        wyz wyzVar = (wyz) obj;
        agteVar.getClass();
        wyzVar.getClass();
        wwq wwqVar = wyzVar.a;
        wwl wwlVarC = wum.c();
        wum.v(wwlVarC, wwqVar, 3);
        wwlVarC.e = wyzVar.b;
    }

    public final wzc c() {
        boolean z = true;
        if (!this.b && !wum.a) {
            z = false;
        }
        return new wzc(this.c, z, false);
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return agtb.a(this, obj, agvbVar);
    }

    @Override // defpackage.agtc, defpackage.agte
    public final agtc get(agtd agtdVar) {
        return agtb.b(this, agtdVar);
    }

    @Override // defpackage.agtc
    public final agtd getKey() {
        return a;
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        return agtb.c(this, agtdVar);
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        agteVar.getClass();
        return agta.a(this, agteVar);
    }
}
