package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izz extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ jab e;
    final /* synthetic */ jba f;
    final /* synthetic */ String g;
    final /* synthetic */ Set h;
    final /* synthetic */ jae i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izz(jab jabVar, jba jbaVar, String str, Set set, jae jaeVar, agsw agswVar) {
        super(2, agswVar);
        this.e = jabVar;
        this.f = jbaVar;
        this.g = str;
        this.h = set;
        this.i = jaeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((izz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        izz izzVar;
        Object obj2;
        Object obj3;
        ahni ahniVar;
        agtg agtgVar = agtg.a;
        int i = this.d;
        if (i == 0) {
            agpl.b(obj);
            jaf jafVar = (jaf) this.e.c.a();
            jba jbaVar = this.f;
            String str = this.g;
            boolean zD = agqq.D(this.h, jbaVar.i());
            this.d = 1;
            izzVar = this;
            obj = jafVar.a(jbaVar, str, zD, false, izzVar);
            if (obj != agtgVar) {
            }
            return agtgVar;
        }
        if (i != 1) {
            obj2 = this.c;
            Object obj4 = this.b;
            obj3 = this.a;
            agpl.b(obj);
            ahniVar = obj4;
            try {
                ((jae) obj2).b((htg) obj3);
                ahniVar.d();
                return agpu.a;
            } catch (Throwable th) {
                ahniVar.d();
                throw th;
            }
        }
        agpl.b(obj);
        izzVar = this;
        jab jabVar = izzVar.e;
        jae jaeVar = izzVar.i;
        htg htgVar = (htg) obj;
        izzVar.a = htgVar;
        ahni ahniVar2 = jabVar.e;
        izzVar.b = ahniVar2;
        izzVar.c = jaeVar;
        izzVar.d = 2;
        if (ahniVar2.b(this) != agtgVar) {
            obj2 = jaeVar;
            obj3 = htgVar;
            ahniVar = ahniVar2;
            ((jae) obj2).b((htg) obj3);
            ahniVar.d();
            return agpu.a;
        }
        return agtgVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new izz(this.e, this.f, this.g, this.h, this.i, agswVar);
    }
}
