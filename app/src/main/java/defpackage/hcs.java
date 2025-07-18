package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcs extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ hcv e;
    final /* synthetic */ Account f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcs(hcv hcvVar, Account account, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.e = hcvVar;
        this.f = account;
        this.g = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hcs) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object ymfVar;
        Object yjoVar;
        Object obj2;
        agtg agtgVar = agtg.a;
        if (this.d != 0) {
            obj2 = this.c;
            yjoVar = this.b;
            ymfVar = this.a;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            ymg ymgVar = ymg.a;
            ymfVar = new ymf();
            yjr yjrVar = yjr.a;
            yjoVar = new yjo();
            yjq yjqVar = yjq.a;
            yjp yjpVar = new yjp();
            hcv hcvVar = this.e;
            String str = this.f.name;
            if (str == null) {
                str = "";
            }
            this.a = ymfVar;
            this.b = yjoVar;
            this.c = yjpVar;
            this.d = 1;
            Object objC = hcvVar.e.c(str, this);
            if (objC == agtgVar) {
                return agtgVar;
            }
            obj2 = yjpVar;
            obj = objC;
        }
        String str2 = (String) obj;
        abww abwwVar = (abww) obj2;
        if ((abwwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abwwVar.y();
        }
        yjp yjpVar2 = (yjp) obj2;
        yjq yjqVar2 = (yjq) yjpVar2.b;
        yjq yjqVar3 = yjq.a;
        str2.getClass();
        yjqVar2.b |= 1;
        yjqVar2.c = str2;
        boolean z = !this.g;
        if ((abwwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abwwVar.y();
        }
        yjq yjqVar4 = (yjq) yjpVar2.b;
        yjqVar4.b |= 2;
        yjqVar4.d = z;
        abww abwwVar2 = (abww) yjoVar;
        if ((abwwVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abwwVar2.y();
        }
        yjr yjrVar2 = (yjr) ((yjo) yjoVar).b;
        yjq yjqVar5 = (yjq) abwwVar.v();
        yjr yjrVar3 = yjr.a;
        yjqVar5.getClass();
        abxs abxsVar = yjrVar2.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            yjrVar2.b = abxsVar.d(size + size);
        }
        yjrVar2.b.add(yjqVar5);
        abww abwwVar3 = (abww) ymfVar;
        if ((abwwVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abwwVar3.y();
        }
        ymg ymgVar2 = (ymg) ((ymf) ymfVar).b;
        yjr yjrVar4 = (yjr) abwwVar2.v();
        ymg ymgVar3 = ymg.a;
        yjrVar4.getClass();
        ymgVar2.k = yjrVar4;
        ymgVar2.c |= 16384;
        abxd abxdVarV = abwwVar3.v();
        abxdVarV.getClass();
        hcr hcrVar = new hcr();
        hcv hcvVar2 = this.e;
        hcvVar2.b.o(this.f, (ymg) abxdVarV, hcrVar, "BroadcastDataHelper");
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hcs(this.e, this.f, this.g, agswVar);
    }
}
