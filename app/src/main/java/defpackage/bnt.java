package defpackage;

import android.database.SQLException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnt extends agtu implements agvb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ boa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnt(boa boaVar, agsw agswVar) {
        super(2, agswVar);
        this.c = boaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bnt) c((bng) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        bng bngVar;
        agtg agtgVar = agtg.a;
        int i = this.a;
        try {
            if (i == 0) {
                agpl.b(obj);
                bngVar = (bng) this.b;
                this.b = bngVar;
                this.a = 1;
                obj = bngVar.c();
                if (obj != agtgVar) {
                }
                return agtgVar;
            }
            if (i != 1) {
                agpl.b(obj);
                return (Set) obj;
            }
            bngVar = (bng) this.b;
            agpl.b(obj);
            if (((Boolean) obj).booleanValue()) {
                return agrf.a;
            }
            bnf bnfVar = bnf.b;
            bns bnsVar = new bns(this.c, null);
            this.b = null;
            this.a = 2;
            obj = bngVar.b(bnfVar, bnsVar, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
            return (Set) obj;
        } catch (SQLException unused) {
            return agrf.a;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bnt bntVar = new bnt(this.c, agswVar);
        bntVar.b = obj;
        return bntVar;
    }
}
