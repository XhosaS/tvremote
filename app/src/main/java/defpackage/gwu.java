package defpackage;

import android.accounts.Account;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwu extends agtu implements agvb {
    int a;
    final /* synthetic */ gwx b;
    final /* synthetic */ Account[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwu(gwx gwxVar, Account[] accountArr, agsw agswVar) {
        super(2, agswVar);
        this.b = gwxVar;
        this.c = accountArr;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gwu) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objB;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gwx gwxVar = this.b;
            Account[] accountArr = this.c;
            accountArr.getClass();
            List listN = agqj.n(accountArr);
            this.a = 1;
            int size = gwxVar.d.n().size();
            int size2 = listN.size();
            int i2 = (size2 > size ? 1 : size2 < size ? 2 : 3) - 1;
            if (i2 == 0) {
                objB = gwxVar.b(listN, true, this);
                if (objB != agtgVar) {
                    objB = agpu.a;
                }
            } else if (i2 != 1) {
                objB = gwxVar.b(listN, false, this);
                if (objB != agtgVar) {
                    objB = agpu.a;
                }
            } else {
                objB = gwxVar.c(listN, this);
                if (objB != agtgVar) {
                    objB = agpu.a;
                }
            }
            if (objB == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gwu(this.b, this.c, agswVar);
    }
}
