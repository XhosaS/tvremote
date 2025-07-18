package defpackage;

import android.support.v7.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ixd extends yiz implements yjz {
    int a;
    final /* synthetic */ ixe b;
    final /* synthetic */ by c;
    final /* synthetic */ ksy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixd(ixe ixeVar, by byVar, ksy ksyVar, yih yihVar) {
        super(2, yihVar);
        this.b = ixeVar;
        this.c = byVar;
        this.d = ksyVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ixd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ixd(this.b, this.c, this.d, yihVar);
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object objB;
        boolean z;
        Iterator it;
        int i;
        kzq kzqVar;
        yio yioVar = yio.a;
        boolean z2 = true;
        try {
            if (this.a != 0) {
                ybn.f(obj);
                objB = obj;
            } else {
                ybn.f(obj);
                jdr jdrVar = this.b.c;
                by byVar = this.c;
                ksy ksyVar = this.d;
                this.a = 1;
                objB = jdrVar.b(byVar, ksyVar, this);
                if (objB == yioVar) {
                    return yioVar;
                }
            }
            enr enrVar = (enr) objB;
            ixe ixeVar = this.b;
            iwz iwzVar = ixeVar.d;
            by byVar2 = this.c;
            ksy ksyVar2 = this.d;
            enrVar.getClass();
            if (iwzVar.e.H(hju.t(ksyVar2))) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int iA = enrVar.a();
                int i2 = 0;
                while (i2 < iA) {
                    gsf gsfVarF = enrVar.f(i2);
                    gsfVarF.getClass();
                    ?? r14 = gsfVarF.b;
                    r14.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : r14) {
                        ksy ksyVar3 = ksyVar2;
                        if (((enp) obj2).b == 1) {
                            arrayList.add(obj2);
                        }
                        z2 = true;
                        ksyVar2 = ksyVar3;
                    }
                    ksy ksyVar4 = ksyVar2;
                    ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        dze dzeVar = ((enz) ((enp) it2.next()).c.get(0)).e;
                        int i3 = dzeVar.P;
                        String str = dzeVar.N;
                        int i4 = dzeVar.aq;
                        int i5 = i3 & 1;
                        Iterator it3 = it2;
                        kzp kzpVar = i5 != 0 ? kzp.ORIGINAL : (i3 & 16) != 0 ? kzp.DUBBED : kzp.UNKNOWN_LANGUAGE_TYPE;
                        if ((i3 & 8) != 0) {
                            kzqVar = kzq.COMMENTARY;
                            i = iA;
                        } else {
                            i = iA;
                            kzqVar = (i3 & 512) != 0 ? kzq.PRIMARY_DESCRIPTIVE : (i3 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? kzq.NARRATION : (i5 == 0 && (i3 & 16) == 0) ? kzq.UNKNOWN_TRACK_TYPE : kzq.PRIMARY;
                        }
                        arrayList2.add(new ktj(str, i4 >= 5, kzpVar, kzqVar));
                        iA = i;
                        it2 = it3;
                    }
                    linkedHashSet.addAll(arrayList2);
                    i2++;
                    ksyVar2 = ksyVar4;
                    iA = iA;
                    z2 = true;
                }
                ksy ksyVar5 = ksyVar2;
                List<kte> listAl = yfm.al(linkedHashSet);
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = listAl.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    kte kteVar = (kte) next;
                    boolean zBM = iwzVar.f.bM();
                    boolean z3 = kteVar.b;
                    if (zBM != z3) {
                        if (!z3) {
                            if (!listAl.isEmpty()) {
                                for (kte kteVar2 : listAl) {
                                    if (kteVar2.b) {
                                        it = it4;
                                        if (kteVar2.d == kteVar.d && kteVar2.c == kteVar.c && yks.e(kteVar2.a, kteVar.a)) {
                                            break;
                                        }
                                        it4 = it;
                                    }
                                }
                            }
                        }
                    }
                    it = it4;
                    arrayList3.add(next);
                    it4 = it;
                }
                ArrayList arrayList4 = new ArrayList(yfm.z(listAl, 10));
                Iterator it5 = listAl.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((kte) it5.next()).a);
                }
                ArrayList arrayList5 = new ArrayList(yfm.z(listAl, 10));
                Iterator it6 = listAl.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(((kte) it6.next()).c);
                }
                ArrayList arrayList6 = new ArrayList(yfm.z(listAl, 10));
                Iterator it7 = listAl.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(((kte) it7.next()).d);
                }
                z = false;
                ykr.q(iwzVar.g, null, 0, new iwy(iwzVar, ksyVar5, arrayList3, enrVar, arrayList4, arrayList5, arrayList6, byVar2, listAl, null), 3);
            } else {
                krd.c("Purchase not found when pinning ".concat(ksyVar2.b));
                z = false;
            }
            ixeVar.b.G(z);
        } catch (IOException e) {
            ((tug) ((tug) ixe.a.f()).i(e).j("com/google/android/apps/googletv/app/download/KinetoscopeDownloadPokerImpl$poke$1", "invokeSuspend", 35, "KinetoscopeDownloadPokerImpl.kt")).v("Failed to download manifest when poking asset: %s", this.d.b);
            iwz.c(this.c, e);
        } catch (Exception e2) {
            ((tug) ((tug) ixe.a.f()).i(e2).j("com/google/android/apps/googletv/app/download/KinetoscopeDownloadPokerImpl$poke$1", "invokeSuspend", 41, "KinetoscopeDownloadPokerImpl.kt")).v("Unexpected error when poking asset and downloading manifest: %s", this.d.b);
            iwz.c(this.c, e2);
        }
        return ygi.a;
    }
}
