package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mkn extends mks {
    final /* synthetic */ idf a;
    final /* synthetic */ Executor b;
    final /* synthetic */ mkr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkn(mkr mkrVar, boolean z, idf idfVar, Executor executor) {
        super(z);
        this.a = idfVar;
        this.b = executor;
        this.c = mkrVar;
    }

    public final /* synthetic */ void a(long j, ieg iegVar) throws JSONException {
        if (!iegVar.m()) {
            krd.d("Failed to acquire RobotToken", iegVar.i());
            this.c.l(-1003, true);
            return;
        }
        mkr mkrVar = this.c;
        if (mkrVar.n != 3) {
            return;
        }
        try {
            nwu nwuVar = mkrVar.h;
            String[] strArr = {(String) iegVar.g()};
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(0, strArr[0]);
                jSONObject.put("cmd_id", j);
                jSONObject.put("type", "KEY_RESPONSE");
                jSONObject.put("tokens", jSONArray);
                super.e(nwuVar, jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Exception e) {
            krd.d("Failed to send key tokens to cast device", e);
            this.c.l(-1003, true);
        }
    }

    @Override // defpackage.mks
    protected final void b(List list, int i) {
        this.c.p(list, i);
    }

    @Override // defpackage.mks
    protected final void c(final long j, String str, String[] strArr) {
        mkr mkrVar = this.c;
        if (mkrVar.n == 4) {
            return;
        }
        if (!str.equals("WV-token")) {
            krd.f(String.format("Unknown key request method '%s'", str));
            return;
        }
        if (TextUtils.isEmpty(mkrVar.o)) {
            krd.f("Key requested for unknown video!");
            return;
        }
        if (mkrVar.c == -1003) {
            mkrVar.j();
        }
        try {
            mjo.e(new idy() { // from class: mkm
                @Override // defpackage.idy
                public final void c(Object obj) throws JSONException {
                    this.a.a(j, (ieg) obj);
                }
            }, new iei(this.a, new mai((ksn) mkrVar.l.g(), mkrVar.o, strArr, mkrVar.m)), this.b);
        } catch (Exception e) {
            krd.d("Exception thrown while trying to fetch RobotTokens for cast device", e);
            this.c.l(-1003, true);
        }
    }

    @Override // defpackage.mks
    protected final void d(List list, kwx kwxVar) {
        mkr mkrVar = this.c;
        mkrVar.p = list;
        mkrVar.q = kwxVar;
        mkrVar.G();
    }
}
