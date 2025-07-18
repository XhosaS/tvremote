package defpackage;

import android.accounts.Account;
import android.os.Build;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izd extends agtu implements agvb {
    int a;
    final /* synthetic */ ize b;
    final /* synthetic */ zxe c;
    final /* synthetic */ Optional d;
    final /* synthetic */ Optional e;
    final /* synthetic */ Optional f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(ize izeVar, zxe zxeVar, Optional optional, Optional optional2, Optional optional3, int i, agsw agswVar) {
        super(2, agswVar);
        this.b = izeVar;
        this.c = zxeVar;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((izd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        try {
        } catch (Exception e) {
            this.c.a(e);
        }
        if (i == 0) {
            agpl.b(obj);
            ize izeVar = this.b;
            this.a = 1;
            obj = izeVar.b.j(this);
            if (obj != agtgVar) {
            }
            return agtgVar;
        }
        if (i != 1) {
            agpl.b(obj);
            this.c.b((xuy) obj);
            return agpu.a;
        }
        agpl.b(obj);
        Account account = (Account) obj;
        String str = account != null ? account.name : null;
        ize izeVar2 = this.b;
        izf izfVar = izeVar2.c;
        Optional optional = this.d;
        Optional optional2 = this.e;
        Optional optional3 = this.f;
        int i2 = this.g;
        xvg xvgVar = xvg.a;
        final xve xveVar = new xve(new xvf());
        xveVar.c(xtv.OPA_TV_SUGGESTED_QUERIES);
        String str2 = Build.MANUFACTURER;
        str2.getClass();
        xvf xvfVar = xveVar.a;
        if ((xvfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xvfVar.y();
        }
        xvg xvgVar2 = (xvg) xvfVar.b;
        xvgVar2.b |= 16384;
        xvgVar2.h = str2;
        final agux aguxVar = new agux() { // from class: iyx
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                xds xdsVar = (xds) obj2;
                xdsVar.getClass();
                xvf xvfVar2 = xveVar.a;
                if ((xvfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xvfVar2.y();
                }
                xvg xvgVar3 = (xvg) xvfVar2.b;
                xvg xvgVar4 = xvg.a;
                xvgVar3.f = xdsVar;
                xvgVar3.b |= 32;
                return agpu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: iyy
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                aguxVar.a(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final agux aguxVar2 = new agux() { // from class: iyz
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                xfp xfpVar = (xfp) obj2;
                xfpVar.getClass();
                xvf xvfVar2 = xveVar.a;
                if ((xvfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xvfVar2.y();
                }
                xvg xvgVar3 = (xvg) xvfVar2.b;
                xvg xvgVar4 = xvg.a;
                xvgVar3.e = xfpVar;
                xvgVar3.b |= 8;
                return agpu.a;
            }
        };
        optional2.ifPresent(new Consumer() { // from class: iza
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                aguxVar2.a(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final agux aguxVar3 = new agux() { // from class: izb
            @Override // defpackage.agux
            public final Object a(Object obj2) {
                xdl xdlVar = (xdl) obj2;
                xdlVar.getClass();
                xvf xvfVar2 = xveVar.a;
                if ((xvfVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xvfVar2.y();
                }
                xvg xvgVar3 = (xvg) xvfVar2.b;
                xvg xvgVar4 = xvg.a;
                xvgVar3.d = xdlVar;
                xvgVar3.b |= 4;
                return agpu.a;
            }
        };
        optional3.ifPresent(new Consumer() { // from class: izc
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                aguxVar3.a(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        xveVar.d(izeVar2.d);
        xvn xvnVar = xvn.a;
        xvm xvmVar = new xvm();
        if ((xvmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xvmVar.y();
        }
        xvn xvnVar2 = (xvn) xvmVar.b;
        xvnVar2.b |= 16;
        xvnVar2.e = i2;
        xvn xvnVarA = xtw.a(xvmVar);
        if ((xvfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xvfVar.y();
        }
        xvg xvgVar3 = (xvg) xvfVar.b;
        xvgVar3.i = xvnVarA;
        xvgVar3.b |= 131072;
        xvg xvgVarA = xveVar.a();
        this.a = 2;
        if (str == null) {
            str = "";
        }
        obj = izfVar.d(str, xvgVarA, this);
        if (obj == agtgVar) {
            return agtgVar;
        }
        this.c.b((xuy) obj);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new izd(this.b, this.c, this.d, this.e, this.f, this.g, agswVar);
    }
}
