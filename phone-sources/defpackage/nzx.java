package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzx {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ Object e;

    public nzx(mkr mkrVar, mke mkeVar, int i, JSONObject jSONObject, boolean z) {
        this.e = mkrVar;
        this.c = mkeVar;
        this.b = i;
        this.d = jSONObject;
        this.a = z;
    }

    public final nzr a() {
        return ((nzt) this.c).b;
    }

    public final int b() {
        int i;
        Object obj = this.e;
        mkr mkrVar = (mkr) obj;
        mkrVar.t = this;
        mjw mjwVar = (mjw) obj;
        mke mkeVarD = mjwVar.d();
        int i2 = mkrVar.n;
        Object obj2 = this.c;
        if (i2 == 3 && mkeVarD != null) {
            if (TextUtils.equals(mkeVarD.a, ((mke) obj2).a) && ((i = mjwVar.c().b) == 2 || i == 3)) {
                if (mjwVar.c == -1002) {
                    mjwVar.j();
                }
                mkrVar.t = null;
                return -1;
            }
        }
        String str = ((mke) obj2).i;
        if (TextUtils.isEmpty(str)) {
            krd.c("The cast video is empty");
            return -2;
        }
        boolean z = this.a;
        nle nleVar = new nle(str);
        nleVar.e();
        nleVar.b();
        nleVar.d(r4.f);
        nleVar.c((JSONObject) this.d);
        MediaInfo mediaInfoA = nleVar.a();
        mjwVar.k(this.b);
        mkrVar.s.execute(new uot(this, mediaInfoA, z, 1));
        return 0;
    }

    protected final void c(nwf nwfVar, kwy kwyVar) {
        ((nzy) this.e).a.a(nwfVar, kwyVar);
    }

    public nzx(nzy nzyVar, nzt nztVar, nvg[] nvgVarArr, boolean z, int i) {
        this.e = nzyVar;
        this.c = nztVar;
        this.d = nvgVarArr;
        this.a = z;
        this.b = i;
    }
}
