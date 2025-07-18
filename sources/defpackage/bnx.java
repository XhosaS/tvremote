package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnx extends btc {
    public final bug a;
    public int b;
    public boolean c;
    public final /* synthetic */ bny d;

    public bnx(bny bnyVar, bug bugVar) {
        this.d = bnyVar;
        this.a = bugVar;
    }

    @Override // defpackage.btc
    public final int a() {
        return 4;
    }

    @Override // defpackage.btc
    protected final void b(int i) {
        if (i(buy.IME, i)) {
            this.d.a(this);
        }
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
        buy buyVar = buy.IME;
        if (h(buyVar, i, i2)) {
            if (!i(buyVar, i2)) {
                bny bnyVar = this.d;
                bnyVar.b.post(new bid(this, 8));
                bnyVar.a(this);
                return;
            }
            bny bnyVar2 = this.d;
            ArrayList arrayList = bnyVar2.i;
            synchronized (arrayList) {
                arrayList.add(this);
                if (arrayList.size() == 1) {
                    bnyVar2.b.post(new bid(bnyVar2, 7));
                }
            }
            bny bnyVar3 = this.d;
            bnyVar3.b.post(new bid(this, 9));
        }
    }

    @Override // defpackage.btc
    public final boolean d(bux buxVar) {
        bny bnyVar;
        final bob bobVar;
        int iOrdinal = buv.a(buxVar.b).ordinal();
        if (iOrdinal == 5) {
            bny bnyVar2 = this.d;
            bob bobVar2 = bnyVar2.k;
            if (bobVar2 == null) {
                return true;
            }
            bnyVar2.b.post(new aze(this, bobVar2, buxVar, 4));
            return true;
        }
        if (iOrdinal == 6) {
            final bvb bvbVar = buxVar.b == 21 ? (bvb) buxVar.c : bvb.a;
            if (bvbVar.d.size() == 0 || (bobVar = (bnyVar = this.d).k) == null) {
                return true;
            }
            bnyVar.b.post(new Runnable() { // from class: bnw
                @Override // java.lang.Runnable
                public final void run() {
                    bob bobVar3 = bobVar;
                    bnx bnxVar = this.a;
                    bvb bvbVar2 = bvbVar;
                    int i = bvbVar2.b;
                    int i2 = bvbVar2.c;
                    if (i == 0) {
                        for (bve bveVar : bvbVar2.d) {
                            if (bveVar.b == 2) {
                                bvd bvdVar = (bvd) bveVar.c;
                                String str = bvdVar.d;
                                for (int i3 = bvdVar.b; i3 < bvdVar.c; i3++) {
                                    bobVar3.sendDownUpKeyEvents(67);
                                }
                                for (int i4 = 0; i4 < str.length(); i4++) {
                                    bobVar3.sendKeyChar(str.charAt(i4));
                                }
                            }
                        }
                        bnxVar.c = true;
                        bnxVar.d.d(bnxVar);
                        return;
                    }
                    bny bnyVar3 = bnxVar.d;
                    bvi bviVar = bnyVar3.d;
                    if (bviVar == null) {
                        ((cbs) bny.a.g().j("com/google/android/tv/remote/service/ImeFeature$ClientMessageHandler", "executeBatchEdit", 559, "ImeFeature.java")).r("Ignoring edit %d, the input field is not initialized", i);
                        return;
                    }
                    if (i != bviVar.c) {
                        ((cbs) bny.a.g().j("com/google/android/tv/remote/service/ImeFeature$ClientMessageHandler", "executeBatchEdit", 564, "ImeFeature.java")).w("Ignoring edit, the input field has changed from %d to %d", i, bnyVar3.d.c);
                        return;
                    }
                    if (bnyVar3.j.get() != bnxVar) {
                        bvj bvjVar = bnyVar3.e;
                        int i5 = bvjVar == null ? 0 : bvjVar.c;
                        if (i2 != i5) {
                            ((cbs) bny.a.g().j("com/google/android/tv/remote/service/ImeFeature$ClientMessageHandler", "executeBatchEdit", 573, "ImeFeature.java")).w("Ignoring edit, the input field content has changed from %d to %d", i2, i5);
                            return;
                        }
                        bnyVar3.j = new WeakReference(bnxVar);
                    }
                    boa boaVarA = bobVar3.a(i, bnyVar3.f);
                    for (bve bveVar2 : bvbVar2.d) {
                        int i6 = bveVar2.b;
                        int i7 = i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 5 ? 0 : 3 : 2 : 1 : 4;
                        if (i7 == 0) {
                            throw null;
                        }
                        int i8 = i7 - 1;
                        if (i8 == 0) {
                            bvm bvmVar = i6 == 1 ? (bvm) bveVar2.c : bvm.a;
                            boaVarA.d(bvmVar.c, bvmVar.d);
                        } else if (i8 == 1) {
                            bvd bvdVar2 = i6 == 2 ? (bvd) bveVar2.c : bvd.a;
                            boaVarA.c(bvdVar2.b, bvdVar2.c, bvdVar2.d);
                        } else if (i8 == 2) {
                            boaVarA.b((i6 == 5 ? (bvc) bveVar2.c : bvc.a).b);
                        }
                    }
                    boaVarA.a();
                }
            });
            return true;
        }
        if (iOrdinal != 7) {
            return false;
        }
        bvn bvnVar = buxVar.b == 22 ? (bvn) buxVar.c : bvn.a;
        bob bobVar3 = this.d.k;
        if (bobVar3 == null) {
            return true;
        }
        bobVar3.d(bvnVar.c, bvnVar.d);
        return true;
    }

    @Override // defpackage.btc
    public final boolean e(int i, bsw bswVar) {
        return true;
    }

    public final void g(int i, bvw bvwVar) {
        if (this.b >= i) {
            return;
        }
        this.c = false;
        this.b = i;
        this.a.d(bvwVar);
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
    }
}
