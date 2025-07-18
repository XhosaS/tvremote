package defpackage;

import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghy extends agtu implements agvb {
    final /* synthetic */ View a;
    final /* synthetic */ List b;
    final /* synthetic */ boolean c;
    final /* synthetic */ hej d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghy(hej hejVar, View view, List list, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.d = hejVar;
        this.a = view;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ghy) c((xzy) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        List arrayList;
        agpl.b(obj);
        xzy xzyVar = (xzy) this.e;
        hej hejVar = this.d;
        if (hejVar != null) {
            View view = this.a;
            List<hej> list = this.b;
            ybb ybbVar = ybb.a;
            yba ybaVar = new yba();
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            ybb ybbVar2 = (ybb) ybaVar.b;
            ybbVar2.b |= 8;
            ybbVar2.h = hejVar.k;
            String str = hejVar.b;
            if (str == null) {
                str = "";
            }
            xzv.b(str, ybaVar);
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            String str2 = hejVar.e;
            ybb ybbVar3 = (ybb) ybaVar.b;
            ybbVar3.c = 6;
            ybbVar3.d = str2;
            String str3 = hejVar.p;
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            ybb ybbVar4 = (ybb) ybaVar.b;
            ybbVar4.b |= 32;
            ybbVar4.j = str3;
            int iA = gkh.a.a(view);
            if (iA != 0) {
                if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ybaVar.y();
                }
                ybb ybbVar5 = (ybb) ybaVar.b;
                ybbVar5.b |= 4;
                ybbVar5.g = iA;
            }
            DesugarCollections.unmodifiableList(((ybb) ybaVar.b).k).getClass();
            if (list != null) {
                arrayList = new ArrayList(agqq.i(list, 10));
                for (hej hejVar2 : list) {
                    ygq ygqVar = ygq.a;
                    ygp ygpVar = new ygp();
                    String str4 = hejVar2.b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    yho.b(str4, ygpVar);
                    int i = hejVar2.g;
                    if ((ygpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        ygpVar.y();
                    }
                    ygq ygqVar2 = (ygq) ygpVar.b;
                    ygqVar2.b |= 2;
                    ygqVar2.d = i;
                    yho.c(hejVar2.p, ygpVar);
                    arrayList.add(yho.a(ygpVar));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = agrd.a;
            }
            if ((ybaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ybaVar.y();
            }
            ybb ybbVar6 = (ybb) ybaVar.b;
            abxs abxsVar = ybbVar6.k;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                ybbVar6.k = abxsVar.d(size + size);
            }
            abus.m(arrayList, ybbVar6.k);
            ybb ybbVarA = xzv.a(ybaVar);
            boolean z = this.c;
            ybc ybcVar = ybc.a;
            yaz yazVar = new yaz();
            if ((yazVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yazVar.y();
            }
            ybc ybcVar2 = (ybc) yazVar.b;
            ybcVar2.b |= 2;
            ybcVar2.d = z;
            if ((yazVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                yazVar.y();
            }
            ybc ybcVar3 = (ybc) yazVar.b;
            ybcVar3.c = ybbVarA;
            ybcVar3.b |= 1;
            ybc ybcVarA = xzw.a(yazVar);
            yca ycaVar = xzyVar.a;
            if ((ycaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ycaVar.y();
            }
            ycb ycbVar = (ycb) ycaVar.b;
            ycb ycbVar2 = ycb.a;
            ycbVar.d = ybcVarA;
            ycbVar.c = 3;
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ghy ghyVar = new ghy(this.d, this.a, this.b, this.c, agswVar);
        ghyVar.e = obj;
        return ghyVar;
    }
}
