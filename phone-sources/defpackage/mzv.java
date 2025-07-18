package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mzv implements idf {
    public final /* synthetic */ iea a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lio c;
    public final /* synthetic */ pkg d;
    public final /* synthetic */ pjx e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ mzv(Object obj, iea ieaVar, boolean z, lio lioVar, pkg pkgVar, pjx pjxVar, int i) {
        this.g = i;
        this.f = obj;
        this.a = ieaVar;
        this.b = z;
        this.c = lioVar;
        this.d = pkgVar;
        this.e = pjxVar;
    }

    @Override // defpackage.idf
    public final Object b(Object obj) {
        int i = this.g;
        if (i == 0) {
            kvf kvfVar = (kvf) ((ieg) obj).h(this.f);
            krk krkVar = new krk(this.a, 17);
            if (TextUtils.isEmpty(kvfVar.E()) && TextUtils.isEmpty(kvfVar.A())) {
                return ieg.a;
            }
            pjx pjxVar = this.e;
            pkg pkgVar = this.d;
            lio lioVar = this.c;
            boolean z = this.b;
            mzw mzwVarA = mzx.a();
            mzwVarA.a = kvfVar.A();
            mzwVarA.b(kvfVar.q());
            mzwVarA.c(kvfVar.v());
            mzwVarA.f(kvfVar.w());
            mzwVarA.h(kvfVar.y());
            mzwVarA.e(krkVar.a());
            mzwVarA.g(true);
            mzwVarA.d(z);
            mzwVarA.b = lioVar;
            mzwVarA.c = tst.h(pkgVar);
            mzwVarA.d = tst.h(pjxVar);
            return ieg.f(mzwVarA.a());
        }
        if (i == 1) {
            kvj kvjVar = (kvj) ((ieg) obj).h(this.f);
            krk krkVar2 = new krk(this.a, 15);
            String str = kvjVar.e;
            if (TextUtils.isEmpty(str)) {
                return ieg.a;
            }
            pjx pjxVar2 = this.e;
            pkg pkgVar2 = this.d;
            lio lioVar2 = this.c;
            boolean z2 = this.b;
            mzw mzwVarA2 = mzx.a();
            mzwVarA2.a = str;
            mzwVarA2.e(krkVar2.a());
            mzwVarA2.g(true);
            mzwVarA2.d(z2);
            mzwVarA2.b = lioVar2;
            mzwVarA2.c = tst.h(pkgVar2);
            mzwVarA2.d = tst.h(pjxVar2);
            return ieg.f(mzwVarA2.a());
        }
        kwn kwnVar = (kwn) ((ieg) obj).h(this.f);
        krk krkVar3 = new krk(this.a, 16);
        if (TextUtils.isEmpty(kwnVar.g) && TextUtils.isEmpty(kwnVar.m)) {
            return ieg.a;
        }
        pjx pjxVar3 = this.e;
        pkg pkgVar3 = this.d;
        lio lioVar3 = this.c;
        boolean z3 = this.b;
        String str2 = kwnVar.m;
        mzw mzwVarA3 = mzx.a();
        mzwVarA3.a = str2;
        mzwVarA3.e(krkVar3.a());
        mzwVarA3.g(true);
        mzwVarA3.d(z3);
        mzwVarA3.b = lioVar3;
        mzwVarA3.c = tst.h(pkgVar3);
        mzwVarA3.d = tst.h(pjxVar3);
        return ieg.f(mzwVarA3.a());
    }
}
