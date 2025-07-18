package defpackage;

import com.google.android.gms.cast.MediaInfo;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlp extends nlx {
    final /* synthetic */ MediaInfo a;
    final /* synthetic */ long b;
    final /* synthetic */ JSONObject c;
    final /* synthetic */ nma d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlp(nma nmaVar, nwu nwuVar, MediaInfo mediaInfo, long j, JSONObject jSONObject) {
        super(nmaVar, nwuVar);
        this.a = mediaInfo;
        this.b = j;
        this.c = jSONObject;
        this.d = nmaVar;
    }

    @Override // defpackage.nlx
    public final void d() {
        nma nmaVar = this.d;
        synchronized (nmaVar.a) {
            nmaVar.b.m(e(), new nlh(this.a, null, true, this.b, 1.0d, null, this.c, null, null, null, null, 0L));
        }
    }
}
