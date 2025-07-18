package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldj implements ieh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ldj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v121, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v125, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v104, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Object, mct] */
    /* JADX WARN: Type inference failed for: r2v75, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v83, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v93, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [idf, java.lang.Object] */
    @Override // defpackage.ieh
    public final Object a() {
        switch (this.c) {
            case 0:
                return (ieg) ((mta) this.a).h.b(this.b);
            case 1:
                Object obj = this.a;
                int i = kqf.a;
                ieg iegVarA = ((ldy) obj).a();
                return iegVarA.k() ? ieg.f(kva.a) : ieg.f((kva) ((ieg) this.b.b((ksn) iegVarA.g())).h(kva.a));
            case 2:
                ieg iegVarA2 = ((ldy) this.a).a();
                return iegVarA2.k() ? kuk.a : (kuk) ((ieg) this.b.b((ksn) iegVarA2.g())).h(kuk.a);
            case 3:
                String[] strArr = (String[]) lkk.a.toArray(new String[0]);
                lkm lkmVar = (lkm) this.a;
                return new lki((ieg) lkmVar.a.b(jwq.ad((ksn) this.b, strArr, lkmVar.d)), (ieg) lkmVar.i.b(lkmVar.h));
            case 4:
                return ((lxm) this.a).e(ImmutableList.of(this.b));
            case 5:
                llm llmVar = (llm) this.b;
                ImmutableList immutableListE = ((lxm) this.a).e(ImmutableList.of(llmVar.h));
                if (immutableListE.isEmpty()) {
                    llmVar.k = ieg.b;
                } else {
                    llmVar.k = ieg.f((kst) immutableListE.get(0));
                }
                return llmVar.k;
            case 6:
                ?? r0 = this.b;
                int i2 = lxh.p;
                ieg iegVar = (ieg) r0.a();
                if (iegVar.k()) {
                    return ieg.b;
                }
                ImmutableList immutableList = ((kwl) iegVar.g()).i;
                return immutableList.isEmpty() ? ieg.b((Throwable) this.a) : ieg.f(immutableList);
            case 7:
                Object obj2 = this.a;
                ksy ksyVar = ((kwn) obj2).d;
                ?? r3 = this.b;
                int i3 = lxh.p;
                return ieg.f((kwn) ((ieg) r3.b(ksyVar)).h(obj2));
            case 8:
                Object obj3 = this.a;
                lre lreVar = (lre) this.b;
                lre lreVar2 = lreVar.c == 1 ? new lre(((ldy) ((lxh) obj3).h).a(), 1, lreVar.b) : new lre(((ldy) ((lxh) obj3).h).a(), 2, lreVar.b);
                lxh lxhVar = (lxh) obj3;
                ieg iegVar2 = (ieg) lxhVar.l.b(lreVar2);
                if (!iegVar2.m()) {
                    return krf.e(6, "GetPlaylistResponse is not present.", iegVar2.i());
                }
                tst tstVar = ((lrh) iegVar2.g()).a;
                if (!tstVar.g()) {
                    return krf.f("Empty playlist collection from GetPlaylistResponse.");
                }
                tst tstVarK = lreVar2.c == 1 ? kgu.k((lqd) tstVar.c(), lreVar2.b, 1) : kgu.k((lqd) tstVar.c(), lreVar2.b, -1);
                return !tstVarK.g() ? krf.f("Got empty CollectionAssetItem from playlist collection in GetPlaylistResponse.") : lxhVar.j.d(((lqf) tstVarK.c()).a);
            case 9:
                Object obj4 = this.a;
                ksy ksyVar2 = ((kvj) obj4).a;
                ?? r32 = this.b;
                int i4 = lxh.p;
                return ieg.f((kvj) ((ieg) r32.b(ksyVar2)).h(obj4));
            case 10:
                lxh lxhVar2 = (lxh) this.a;
                ieg iegVarA3 = ((ldy) lxhVar2.h).a();
                if (iegVarA3.k()) {
                    return ieg.a;
                }
                Object obj5 = this.b;
                lge lgeVar = lxhVar2.g;
                ksn ksnVar = (ksn) iegVarA3.g();
                if (!ksy.y((ksy) obj5)) {
                    return ieg.a;
                }
                lgf lgfVar = (lgf) lgeVar;
                lyz lyzVar = lgfVar.b;
                SQLiteDatabase sQLiteDatabaseA = lyzVar.a();
                try {
                    Cursor cursorQuery = sQLiteDatabaseA.query(true, "purchased_assets LEFT JOIN assets ON asset_type = assets_type AND asset_id = assets_id", new String[]{"asset_id", "next_episode_id"}, "account = ? AND root_asset_id = ? AND asset_type = 20 AND ifnull(last_watched_timestamp, 0) > 0", new String[]{ksnVar.a, ((ksy) obj5).b}, null, null, "last_watched_timestamp DESC", "1");
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("asset_id");
                        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("next_episode_id");
                        if (!cursorQuery.moveToFirst()) {
                            ieg iegVar3 = ieg.a;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            lyzVar.e(sQLiteDatabaseA, true);
                            return iegVar3;
                        }
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        String strJ = mei.j(cursorQuery, columnIndexOrThrow2);
                        kwr kwrVar = kwr.a;
                        ieg iegVarF = ieg.f(new kwr(string, strJ));
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        lyzVar.e(sQLiteDatabaseA, true);
                        return iegVarF;
                    } finally {
                    }
                } catch (Throwable th) {
                    lgfVar.b.e(sQLiteDatabaseA, true);
                    throw th;
                }
            case 11:
                ieg iegVarA4 = ((ldy) this.b).a();
                if (iegVarA4.k()) {
                    return Collections.EMPTY_MAP;
                }
                return ((mca) this.a).b((ksn) iegVarA4.g());
            case 12:
                ieg iegVarA5 = ((ldy) this.b).a();
                if (iegVarA5.k()) {
                    return Collections.EMPTY_MAP;
                }
                return ((mca) this.a).b((ksn) iegVarA5.g());
            case 13:
                ieg iegVarA6 = ((ldy) this.b).a();
                if (iegVarA6.k()) {
                    return kxi.a;
                }
                HashSet hashSet = new HashSet(this.a.a((ksn) iegVarA6.g()));
                kxi kxiVar = kxi.a;
                return new kxi(hashSet);
            case 14:
                return (ieg) ((lkt) this.a).e.b(this.b);
            case 15:
                return (ieg) ((lkt) this.a).e.b(this.b);
            case 16:
                mmk mmkVar = (mmk) this.a;
                if (((ldy) mmkVar.j).a().m()) {
                    ?? r2 = this.b;
                    if (((ieg) r2.a()).m()) {
                        return ieg.f(mmkVar.H.g(((ldy) mmkVar.j).a(), ((kst) ((ieg) r2.a()).g()).o()));
                    }
                }
                return ieg.a;
            case 17:
                mmp mmpVar = (mmp) this.a;
                if (((ldy) mmpVar.e).a().m()) {
                    ?? r22 = this.b;
                    if (((ieg) r22.a()).m()) {
                        return ieg.f(mmpVar.w.g(((ldy) mmpVar.e).a(), ((kst) ((ieg) r22.a()).g()).o()));
                    }
                }
                return ieg.a;
            case 18:
                ?? r02 = this.b;
                mmc mmcVarB = mmd.b();
                mmcVarB.f(((Boolean) r02.a()).booleanValue());
                mmcVarB.g((ieg) this.a.a());
                mmcVarB.c(true);
                return mmcVarB.a();
            case 19:
                mmv mmvVar = (mmv) this.a;
                if (((ldy) mmvVar.e).a().m()) {
                    ?? r23 = this.b;
                    if (((ieg) r23.a()).m()) {
                        return ieg.f(mmvVar.B.g(((ldy) mmvVar.e).a(), ((kst) ((ieg) r23.a()).g()).o()));
                    }
                }
                return ieg.a;
            default:
                msr msrVar = (msr) this.b;
                return msrVar.b.a(jwq.ad((ksn) msrVar.a.a().g(), new String[]{"(pinned IS NOT NULL AND pinned > 0)"}, (String) this.a));
        }
    }

    public /* synthetic */ ldj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
