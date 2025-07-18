package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbn extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gbo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbn(gbo gboVar, agsw agswVar) {
        super(2, agswVar);
        this.d = gboVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gbn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object obj2;
        ahni ahniVar;
        agtg agtgVar = agtg.a;
        if (this.c != 0) {
            obj2 = this.b;
            Object obj3 = this.a;
            agpl.b(obj);
            ahniVar = obj3;
        } else {
            agpl.b(obj);
            gbo gboVar = this.d;
            ahni ahniVar2 = gboVar.t;
            this.a = ahniVar2;
            this.b = gboVar;
            this.c = 1;
            if (ahniVar2.b(this) == agtgVar) {
                return agtgVar;
            }
            obj2 = gboVar;
            ahniVar = ahniVar2;
        }
        try {
            hyi hyiVar = ((gbo) obj2).s;
            if (hyiVar != null) {
                hye hyeVar = ((gbo) obj2).r;
                if (hyeVar == null) {
                    agvy.b("keyboardSearchBar");
                    hyeVar = null;
                }
                hyeVar.f.removeTextChangedListener(hyiVar);
                hyiVar.a();
                ((gbo) obj2).s = null;
            }
            ahniVar.d();
            return agpu.a;
        } catch (Throwable th) {
            ahniVar.d();
            throw th;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gbn(this.d, agswVar);
    }
}
