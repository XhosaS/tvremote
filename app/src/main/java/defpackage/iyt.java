package defpackage;

import android.accounts.Account;
import android.os.Build;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyt extends agtu implements agvb {
    int a;
    final /* synthetic */ iyu b;
    final /* synthetic */ zxe c;
    final /* synthetic */ Optional d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyt(iyu iyuVar, zxe zxeVar, Optional optional, agsw agswVar) {
        super(2, agswVar);
        this.b = iyuVar;
        this.c = zxeVar;
        this.d = optional;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iyt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        try {
        } catch (Exception e) {
            e.getMessage();
        }
        if (i == 0) {
            agpl.b(obj);
            iyu iyuVar = this.b;
            this.a = 1;
            obj = iyuVar.b.j(this);
            if (obj != agtgVar) {
            }
            return agtgVar;
        }
        if (i != 1) {
            agpl.b(obj);
            this.c.b((xui) obj);
            return agpu.a;
        }
        agpl.b(obj);
        Account account = (Account) obj;
        String str = account != null ? account.name : null;
        iyu iyuVar2 = this.b;
        izf izfVar = iyuVar2.c;
        Optional optional = this.d;
        xvg xvgVar = xvg.a;
        xve xveVar = new xve(new xvf());
        xveVar.c(xtv.OPA_TV_FALLBACK_SUGGESTIONS);
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        xvf xvfVar = xveVar.a;
        if ((xvfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xvfVar.y();
        }
        xvg xvgVar2 = (xvg) xvfVar.b;
        xvgVar2.b |= 16384;
        xvgVar2.h = str2;
        optional.isPresent();
        xfp xfpVar = xfp.a;
        xkr xkrVar = new xkr(new xfo());
        String str3 = ((xfp) optional.get()).c;
        str3.getClass();
        xfo xfoVar = xkrVar.a;
        if ((xfoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xfoVar.y();
        }
        xfp xfpVar2 = (xfp) xfoVar.b;
        xfpVar2.b |= 2;
        xfpVar2.c = str3;
        xgn xgnVar = xgn.a;
        xov xovVar = new xov(new xgm());
        xovVar.e();
        xgn xgnVar2 = ((xfp) optional.get()).h;
        if (xgnVar2 == null) {
            xgnVar2 = xgn.a;
        }
        abxs abxsVar = xgnVar2.c;
        abxsVar.getClass();
        xgm xgmVar = xovVar.a;
        if ((xgmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xgmVar.y();
        }
        xgn xgnVar3 = (xgn) xgmVar.b;
        abxs abxsVar2 = xgnVar3.c;
        if (!abxsVar2.c()) {
            int size = abxsVar2.size();
            xgnVar3.c = abxsVar2.d(size + size);
        }
        abus.m(abxsVar, xgnVar3.c);
        xkrVar.b(xovVar.a());
        xfp xfpVarA = xkrVar.a();
        if ((xvfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xvfVar.y();
        }
        xvg xvgVar3 = (xvg) xvfVar.b;
        xvgVar3.e = xfpVarA;
        xvgVar3.b |= 8;
        xveVar.d(iyuVar2.d);
        xvg xvgVarA = xveVar.a();
        this.a = 2;
        if (str == null) {
            str = "";
        }
        obj = izfVar.a(str, xvgVarA, this);
        if (obj == agtgVar) {
            return agtgVar;
        }
        this.c.b((xui) obj);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iyt(this.b, this.c, this.d, agswVar);
    }
}
