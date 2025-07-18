package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.videos.R;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import j$.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lxf implements ieh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ lxf(idb idbVar, iea ieaVar, idf idfVar, Context context, int i) {
        this.e = i;
        this.a = idbVar;
        this.b = ieaVar;
        this.d = idfVar;
        this.c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r1v105, types: [idb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v107, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v117, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v118, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v120, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r1v123, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v58, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v62, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v85, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v92, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [idb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [idf, java.lang.Object] */
    @Override // defpackage.ieh
    public final Object a() throws Resources.NotFoundException {
        String strI;
        String str;
        String str2;
        ImmutableList immutableList;
        kys kysVar;
        Object obj;
        Object obj2;
        ?? r10;
        int i = 4;
        int i2 = 3;
        boolean z = false;
        switch (this.e) {
            case 0:
                int i3 = lxh.p;
                ieg iegVar = (ieg) this.a.a();
                if (iegVar.k()) {
                    if (iegVar.i() == this.b) {
                        return this.c.b((ieg) this.d.a());
                    }
                    iegVar.p();
                }
                return iegVar;
            case 1:
                lzy lzyVarAd = jwq.ad((ksn) ((ieg) this.a).g(), lkl.b, (String) this.b);
                lkm lkmVar = (lkm) this.d;
                return new lki((ieg) lkmVar.a.b(lzyVarAd), (ieg) this.c.b(lkmVar.h));
            case 2:
                ieg iegVarA = ((ldy) this.d).a();
                if (iegVarA.k()) {
                    krd.f("Returning empty movie list because account is not available");
                    return ieg.f(Collections.EMPTY_LIST);
                }
                ?? r4 = this.a;
                ?? r5 = this.c;
                Object obj3 = this.b;
                List list = (List) r5.b((ksn) iegVarA.g());
                List list2 = (List) r4.b(list);
                ImmutableList immutableList2 = (ImmutableList) Collection.EL.stream(list2).filter(new ldw((kva) ((lxh) obj3).e.a(), i2)).filter(new ldw(obj3, i)).sorted(bxy.f).collect(ImmutableList.toImmutableList());
                krd.f("Get movies: ids=" + list.size() + ", movies=" + list2.size() + ", result=" + immutableList2.size());
                return ieg.f(immutableList2);
            case 3:
                ImmutableList immutableListS = ((kvf) this.d).s();
                if (immutableListS.isEmpty()) {
                    return ieg.f(Collections.EMPTY_LIST);
                }
                return ieg.f(FluentIterable.from((List) this.c.b(FluentIterable.from(immutableListS).filter(new lsp(13)).filter(new lqh((kva) ((lxh) this.b).e.a(), i2)).toList())).filter(new lqh(this.a, i)).toList());
            case 4:
                ieg iegVarA2 = ((ldy) this.d).a();
                if (iegVarA2.k()) {
                    krd.f("Returning empty show list because account is not available");
                    return ieg.f(Collections.EMPTY_LIST);
                }
                ?? r3 = this.a;
                ?? r42 = this.c;
                Object obj4 = this.b;
                ?? B = r42.b((ksn) iegVarA2.g());
                List list3 = (List) r3.b(B);
                ImmutableList immutableList3 = (ImmutableList) Collection.EL.stream(list3).filter(new ldw(obj4, 5)).sorted(bxy.f).collect(ImmutableList.toImmutableList());
                krd.f("Get shows: ids=" + B.size() + ", shows=" + list3.size() + ", result=" + immutableList3.size());
                return ieg.f(immutableList3);
            case 5:
                ?? r1 = this.c;
                mmc mmcVarB = mmd.b();
                mmcVarB.f(((Boolean) r1.a()).booleanValue());
                mmcVarB.g((ieg) this.a.a());
                mmcVarB.c(true);
                Object obj5 = this.d;
                mmk mmkVar = (mmk) this.b;
                mmcVarB.a = mnu.C(mmkVar.f, mmkVar.G.a((ksn) ((ieg) obj5).g()), mmkVar.A.a());
                mmcVarB.j();
                return mmcVarB.a();
            case 6:
                ieg iegVar2 = (ieg) this.d.a();
                if (!iegVar2.m() || !((sei) iegVar2.g()).b()) {
                    return ieg.a;
                }
                ?? r2 = this.c;
                if (((ieg) r2.a()).m() && !kuf.b(((mxo) ((ieg) r2.a()).g()).c.a)) {
                    return ieg.a;
                }
                mym mymVar = new mym(null);
                mymVar.b(false);
                mymVar.a(true);
                mymVar.c = trk.a;
                mymVar.b(((sei) iegVar2.g()).d());
                sei seiVar = (sei) iegVar2.g();
                if (seiVar.b() && seiVar.e != null) {
                    z = true;
                }
                mymVar.a(!z);
                sei seiVar2 = (sei) iegVar2.g();
                if (seiVar2.a() && seiVar2.d == 3 && seiVar2.c == 1 && seiVar2.e == null && !((Boolean) this.a.a()).booleanValue()) {
                    mymVar.c = (tst) this.b;
                }
                if (mymVar.d == 3) {
                    return ieg.f(new myn(mymVar.a, mymVar.b, mymVar.c));
                }
                StringBuilder sb = new StringBuilder();
                if ((mymVar.d & 1) == 0) {
                    sb.append(" isShared");
                }
                if ((mymVar.d & 2) == 0) {
                    sb.append(" enableSwitch");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            case 7:
                kvc kvcVarB = ((kva) this.d.a()).b((ksy) this.b);
                if (!this.a.a()) {
                    return ieg.b;
                }
                Object obj6 = this.c;
                if (kvcVarB.f) {
                    strI = ((Resources) obj6).getString(R.string.error_preorder_not_released);
                } else {
                    long j = kvcVarB.c;
                    if (j == Long.MAX_VALUE || (strI = jwq.I(j, (Resources) obj6)) == null) {
                        strI = "";
                    }
                }
                if (TextUtils.isEmpty(strI)) {
                    return ieg.a;
                }
                qbn qbnVar = new qbn();
                qbnVar.f(false);
                qbnVar.e("");
                qbnVar.e(strI);
                qbnVar.f(kvcVarB.b);
                if (qbnVar.c == 1 && (str = qbnVar.a) != null) {
                    return ieg.f(new mze(qbnVar.b, str));
                }
                StringBuilder sb2 = new StringBuilder();
                if (qbnVar.c == 0) {
                    sb2.append(" showRentalIcon");
                }
                if (qbnVar.a == null) {
                    sb2.append(" message");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            case 8:
                ?? r12 = this.a;
                ImmutableList.Builder builder = ImmutableList.builder();
                if (!r12.a()) {
                    return Collections.EMPTY_LIST;
                }
                for (ksw kswVar : (List) this.b.a()) {
                    ?? r32 = this.d;
                    List list4 = (List) ((ieg) r32.b(kswVar)).h(Collections.EMPTY_LIST);
                    if (!list4.isEmpty()) {
                        String str3 = kswVar.a;
                        mzo mzoVar = new mzo(null);
                        nag nagVarA = mul.a();
                        nagVarA.l("");
                        mzoVar.a = nagVarA.k();
                        if (str3 == null) {
                            throw new NullPointerException("Null rowId");
                        }
                        mzoVar.b = str3;
                        trk trkVar = trk.a;
                        mzoVar.b(trkVar);
                        mzoVar.d(ImmutableList.of());
                        mzoVar.c(kys.a);
                        mzoVar.a(trkVar);
                        String str4 = kswVar.b;
                        nag nagVarA2 = mul.a();
                        nagVarA2.l(str4);
                        nagVarA2.c = (CharSequence) kswVar.c.f();
                        ImmutableList immutableList4 = kswVar.h;
                        nagVarA2.d = (immutableList4.isEmpty() || !((kuv) immutableList4.get(0)).a()) ? null : new sdk((Context) this.c, ((kuv) immutableList4.get(0)).a.toString());
                        mzoVar.a = nagVarA2.k();
                        mzoVar.c(kswVar.d);
                        mzoVar.d(list4);
                        mzoVar.b(kswVar.f);
                        mzoVar.a(kswVar.g);
                        mul mulVar = mzoVar.a;
                        if (mulVar == null || (str2 = mzoVar.b) == null || (immutableList = mzoVar.c) == null || (kysVar = mzoVar.e) == null) {
                            StringBuilder sb3 = new StringBuilder();
                            if (mzoVar.a == null) {
                                sb3.append(" header");
                            }
                            if (mzoVar.b == null) {
                                sb3.append(" rowId");
                            }
                            if (mzoVar.c == null) {
                                sb3.append(" similarAssets");
                            }
                            if (mzoVar.e == null) {
                                sb3.append(" serverCookie");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
                        }
                        builder.add((ImmutableList.Builder) new mzp(mulVar, str2, immutableList, mzoVar.d, kysVar, mzoVar.f));
                    }
                }
                return builder.build();
            default:
                mzu mzuVar = new mzu((ieh) this.d, (idw) this.a, 2);
                if (mzuVar.a().size() < 2) {
                    return ieg.a;
                }
                ?? r13 = this.b;
                ?? r22 = this.c;
                lif lifVar = new lif(liq.q("Trailers"), (lio) r13);
                ImmutableList.Builder builder2 = ImmutableList.builder();
                for (kvf kvfVar : (List) r22.b(mzuVar.a())) {
                    nag nagVar = new nag();
                    nagVar.b = "";
                    nagVar.a(Uri.EMPTY);
                    nagVar.b(lic.a);
                    nagVar.c = "";
                    nagVar.b = kvfVar.E();
                    nagVar.a(kvfVar.h());
                    nagVar.c = kvfVar.o().b;
                    nagVar.b(new lif(liq.r(kvfVar.o()), lifVar));
                    Object obj7 = nagVar.a;
                    if (obj7 == null || (obj = nagVar.b) == null || (obj2 = nagVar.c) == null || (r10 = nagVar.d) == 0) {
                        StringBuilder sb4 = new StringBuilder();
                        if (nagVar.a == null) {
                            sb4.append(" imageUrl");
                        }
                        if (nagVar.b == null) {
                            sb4.append(" title");
                        }
                        if (nagVar.c == null) {
                            sb4.append(" trailerAssetId");
                        }
                        if (nagVar.d == null) {
                            sb4.append(" uiElementNode");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb4.toString()));
                    }
                    builder2.add((ImmutableList.Builder) new nah((Uri) obj7, (String) obj, (String) obj2, r10));
                }
                nxb nxbVar = new nxb();
                nxbVar.b(Collections.EMPTY_LIST);
                nxbVar.b(builder2.build());
                ?? r14 = nxbVar.a;
                if (r14 != 0) {
                    return ieg.f(new naj(r14));
                }
                throw new IllegalStateException("Missing required properties: trailers");
        }
    }

    public /* synthetic */ lxf(iea ieaVar, idw idwVar, idf idfVar, lio lioVar, int i) {
        this.e = i;
        this.d = ieaVar;
        this.a = idwVar;
        this.c = idfVar;
        this.b = lioVar;
    }

    public /* synthetic */ lxf(iea ieaVar, Throwable th, idf idfVar, iea ieaVar2, int i) {
        this.e = i;
        this.a = ieaVar;
        this.b = th;
        this.c = idfVar;
        this.d = ieaVar2;
    }

    public /* synthetic */ lxf(ieh iehVar, iea ieaVar, iea ieaVar2, tst tstVar, int i) {
        this.e = i;
        this.d = iehVar;
        this.c = ieaVar;
        this.a = ieaVar2;
        this.b = tstVar;
    }

    public /* synthetic */ lxf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.d = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ lxf(lxh lxhVar, Object obj, idf idfVar, Object obj2, int i) {
        this.e = i;
        this.b = lxhVar;
        this.d = obj;
        this.c = idfVar;
        this.a = obj2;
    }

    public /* synthetic */ lxf(mmk mmkVar, idr idrVar, idr idrVar2, ieg iegVar, int i) {
        this.e = i;
        this.b = mmkVar;
        this.c = idrVar;
        this.a = idrVar2;
        this.d = iegVar;
    }
}
