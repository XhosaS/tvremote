package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kqd implements ieh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [iea, java.lang.Object] */
    @Override // defpackage.ieh
    public final Object a() throws nvz, nwa, RemoteException {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(kwy.m((ContentResolver) ((kwy) this.a).a, "experiments_always_update", true));
            case 1:
                int i = kqf.a;
                return (kva) ((ieg) this.a.a()).h(kva.a);
            case 2:
                ArrayList arrayList = new ArrayList();
                for (Account account : ((ldy) this.a).u()) {
                    arrayList.add(ksn.b(account.name));
                }
                return arrayList;
            case 3:
                int i2 = lfu.c;
                return opc.c((ContentResolver) this.a);
            case 4:
                return this.a;
            case 5:
                lxh lxhVar = (lxh) this.a;
                ieg iegVar = (ieg) lxhVar.n.b(new lqy(((ldy) lxhVar.h).a()));
                return ieg.f(iegVar.m() ? ((lqz) iegVar.g()).a : Collections.EMPTY_LIST);
            case 6:
                return ieg.f(this.a);
            case 7:
                lze lzeVar = (lze) this.a;
                return lzeVar.c.c(lzeVar.d, lzeVar.e);
            case 8:
                return this.a;
            case 9:
                return this.a;
            case 10:
                List list = (List) ((krq) this.a.a()).a();
                if (list == null) {
                    return kxi.a;
                }
                HashSet hashSet = new HashSet(list);
                kxi kxiVar = kxi.a;
                return new kxi(hashSet);
            case 11:
                return ((bv) this.a).getActivity();
            case 12:
                return ((bv) this.a).getFragmentManager();
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                return this.a;
            case 16:
                return this.a;
            case 17:
                mmk mmkVar = (mmk) this.a;
                return ((kuk) mmkVar.m.a()).a(mmkVar.f.o());
            case 18:
                return ((bv) this.a).getView();
            case 19:
                return this.a;
            default:
                Context context = (Context) this.a;
                int i3 = context.getResources().getDisplayMetrics().widthPixels;
                int iP = mjo.p(context, 0.0f) * 3;
                if (iP > i3) {
                    iP = mjo.o(context, 0.0f) * 3;
                }
                return Integer.valueOf(iP);
        }
    }
}
