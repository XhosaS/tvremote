package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmm implements idf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, lzz] */
    /* JADX WARN: Type inference failed for: r0v55, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, lio] */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        switch (this.b) {
            case 0:
                kvj kvjVar = (kvj) this.a;
                return kxb.b((String) obj, kvjVar.d, kvjVar.c);
            case 1:
                return ((mmk) this.a).u.b((ksy) obj);
            case 2:
                mmp mmpVar = (mmp) this.a;
                return mmpVar.w.g(((ldy) mmpVar.e).a(), (ksy) obj);
            case 3:
                kvj kvjVar2 = (kvj) obj;
                return ((kva) ((mmp) this.a).g.a()).a(kvjVar2).b ? ieg.f(kvjVar2) : ieg.a;
            case 4:
                return hjs.e(((Resources) this.a).getString(R.string.details_bundle_item_title), "count", Integer.valueOf(((List) obj).size()));
            case 5:
                return new krn(this.a, (kvf) obj, 14, null);
            case 6:
                return new lif(liq.f(500, ((kvf) obj).o()), (lio) this.a);
            case 7:
                return Boolean.valueOf(((kxi) ((mmp) this.a).i.a()).a((ksy) obj));
            case 8:
                return ((mmp) this.a).m.b((ksy) obj);
            case 9:
                return Boolean.valueOf(((kxi) ((mmv) this.a).j.a()).a((ksy) obj));
            case 10:
                return ((mmv) this.a).p.b((ksy) obj);
            case 11:
                mmv mmvVar = (mmv) this.a;
                return mmvVar.B.g(((ldy) mmvVar.e).a(), (ksy) obj);
            case 12:
                return ((lxm) this.a).d((ksy) obj);
            case 13:
                kvf kvfVar = (kvf) obj;
                ieg iegVarN = kvfVar.n();
                boolean zK = iegVarN.k();
                Object obj2 = this.a;
                if (zK && ((mnc) obj2).c) {
                    return ieg.a;
                }
                kvc kvcVarA = ((mnc) obj2).a.a(kvfVar);
                ieg iegVarL = kvfVar.l();
                return ((iegVarL.m() && ((ktz) iegVarL.g()).a() > 0) || kvcVarA.b || kvcVarA.f) ? ieg.f(kuf.a) : ieg.b;
            case 14:
                return Integer.valueOf(((mip) this.a).c((kum) obj));
            case 15:
                return this.a.a((lzy) obj);
            case 16:
                return mjo.j((View) this.a.a(), (String) obj);
            default:
                return mjo.j((View) this.a, (String) obj);
        }
    }
}
