package defpackage;

import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ljt implements idf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lzz] */
    /* JADX WARN: Type inference failed for: r0v22, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lzz] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v45, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [idw, java.lang.Object] */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        ieg iegVarU;
        tst tstVarI;
        ieg iegVarU2;
        switch (this.b) {
            case 0:
                return this.a.a((lzy) obj);
            case 1:
                return ((lfx) this.a).a((ieg) obj).b;
            case 2:
                return this.a.a((lzy) obj);
            case 3:
                return WatchActionBootstrapActivity.$r8$lambda$5GLx5ZqsSnX889VPy9_1jLJicAI((WatchActionBootstrapActivity) this.a, (luj) obj);
            case 4:
                for (vxy vxyVar : ((vxx) obj).c) {
                    int i = vxyVar.b;
                    if (vyf.b(i) == 2) {
                        return ieg.f(new lqz(FluentIterable.from((i == 1 ? (vxo) vxyVar.c : vxo.a).b).transform(new ldl(((ltt) this.a).a, 11)).toList()));
                    }
                }
                return ieg.a;
            case 5:
                vyj vyjVar = (vyj) obj;
                int i2 = lqi.b;
                vat vatVar = vyjVar.c;
                if (vatVar == null) {
                    vatVar = vat.a;
                }
                tst tstVarA = lqi.a(vatVar, ((kwy) this.a).a);
                boolean zG = tstVarA.g();
                tst tstVarI2 = trk.a;
                if (zG) {
                    tstVarI2 = tst.i(tstVarA.c());
                } else {
                    vat vatVar2 = vyjVar.c;
                    if (vatVar2 == null) {
                        vatVar2 = vat.a;
                    }
                    vaz vazVar = vatVar2.c;
                    if (vazVar == null) {
                        vazVar = vaz.a;
                    }
                    krd.c("Got Nur GetPlaylistResponse with empty play list. Collection ID: ".concat(String.valueOf(vazVar.b)));
                }
                return new lrh(tstVarI2);
            case 6:
                ImmutableList immutableListL = kgu.l(((vym) obj).c, ((hfx) this.a).a);
                if (immutableListL != null) {
                    return new lrl(immutableListL);
                }
                throw new NullPointerException("Null collectionList");
            case 7:
                ArrayList arrayList = new ArrayList();
                for (vys vysVar : ((vyp) obj).c) {
                    int i3 = vysVar.b;
                    int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? 0 : 2 : 1 : 3;
                    if (i4 == 0) {
                        throw null;
                    }
                    int i5 = i4 - 1;
                    Object obj2 = this.a;
                    if (i5 == 0) {
                        vyq vyqVar = i3 == 1 ? (vyq) vysVar.c : vyq.a;
                        val valVar = vyqVar.c;
                        if (valVar == null) {
                            valVar = val.a;
                        }
                        ksy ksyVarM = kgu.m(valVar);
                        String str = vyqVar.d;
                        if ((vyqVar.b & 2) != 0) {
                            vcb vcbVar = vyqVar.e;
                            if (vcbVar == null) {
                                vcbVar = vcb.a;
                            }
                            iegVarU = ((hfx) obj2).u(kir.o(vcbVar));
                        } else {
                            iegVarU = ieg.a;
                        }
                        if (str.isEmpty()) {
                            krd.c("Empty title text for asset suggestion. AssetId: ".concat(ksyVarM.b));
                            tstVarI = trk.a;
                        } else if (ksy.v(ksyVarM)) {
                            tstVarI = tst.i(tha.a(ksyVarM.b, str, iegVarU));
                        } else if (ksy.w(ksyVarM)) {
                            tstVarI = tst.i(new tha(ieg.f(ksy.j(ksyVarM.b)), str, iegVarU));
                        } else if (ksy.y(ksyVarM)) {
                            tstVarI = tst.i(tha.c(ksyVarM.b, str, iegVarU));
                        } else {
                            krd.c("Unsupported asset suggestion asset type. AssetId: " + ksyVarM.b + " type: " + ksyVarM.a);
                            tstVarI = trk.a;
                        }
                    } else if (i5 != 1) {
                        krd.c("Unknown Nur Suggestion type.");
                        tstVarI = trk.a;
                    } else {
                        vyr vyrVar = i3 == 2 ? (vyr) vysVar.c : vyr.a;
                        if ((vyrVar.b & 1) != 0) {
                            vcb vcbVar2 = vyrVar.d;
                            if (vcbVar2 == null) {
                                vcbVar2 = vcb.a;
                            }
                            iegVarU2 = ((hfx) obj2).u(kir.o(vcbVar2));
                        } else {
                            iegVarU2 = ieg.a;
                        }
                        tstVarI = tst.i(tha.b(vyrVar.c, iegVarU2));
                    }
                    if (tstVarI.g()) {
                        arrayList.add(tstVarI.c());
                    }
                }
                return arrayList;
            case 8:
                return tst.h((vzg) ((ImmutableMap) ((mdw) this.a).e).get((val) obj));
            case 9:
                return tst.h((vzg) ((ImmutableMap) ((mdw) this.a).e).get((val) obj));
            case 10:
                return new lto(kgu.l(((vby) obj).c, ((hfx) this.a).a));
            case 11:
                return ((lgf) this.a).d(lgf.a, new String[]{((ksn) obj).a, Long.toString(System.currentTimeMillis())});
            case 12:
                int i6 = lxh.p;
                return ieg.a((kxf) this.a.get((String) obj));
            case 13:
                return ((lgf) this.a).e("NOT (ifnull(hidden,0) IN (1, 3)) AND account = ? AND purchase_status = 2 AND cast(ifnull(min(expiration_timestamp_seconds * 1000,ifnull(license_expiration_timestamp,9223372036854775807)),9223372036854775807) as integer) > ? AND asset_type = 20", new String[]{((ksn) obj).a, Long.toString(System.currentTimeMillis())});
            case 14:
                ?? r0 = this.a;
                idf idfVar = (idf) obj;
                int i7 = lxh.p;
                ieg iegVar = (ieg) r0.a();
                if (iegVar.k()) {
                    return idfVar;
                }
                List<kxf> list = (List) iegVar.g();
                HashMap map = new HashMap(list.size());
                for (kxf kxfVar : list) {
                    map.put(kxfVar.a, kxfVar);
                }
                return new ljt(map, 12);
            case 15:
                return ((lgf) this.a).d("NOT (ifnull(hidden,0) IN (1, 3)) AND NOT (ifnull(is_bonus_content OR purchase_is_bonus_content, 0)) AND purchase_status = 6 AND account = ? AND cast(ifnull(min(expiration_timestamp_seconds * 1000,ifnull(license_expiration_timestamp,9223372036854775807)),9223372036854775807) as integer) > ?", new String[]{((ksn) obj).a, Long.toString(System.currentTimeMillis())});
            case 16:
                ksy ksyVar = (ksy) obj;
                Object obj3 = this.a;
                lxk lxkVar = (lxk) obj3;
                Map map2 = (Map) lxkVar.b.get();
                if (map2 != null) {
                    ieg iegVarA = ieg.a((xax) map2.get(ksyVar));
                    if (iegVarA.m()) {
                        return iegVarA;
                    }
                }
                synchronized (obj3) {
                    ((lxk) obj3).a.add(ksyVar);
                }
                lxkVar.removeMessages(0);
                lxkVar.sendEmptyMessage(0);
                return ieg.a;
            case 17:
                return ImmutableList.copyOf((Collection) ((lye) this.a).b((ImmutableList) obj));
            case 18:
                return ((kta) this.a).b((List) obj);
            case 19:
                return ((kta) this.a).c((List) obj);
            default:
                return ((kta) this.a).b((List) obj);
        }
    }
}
